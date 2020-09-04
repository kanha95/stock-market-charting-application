package com.stocks.loginservice.configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
     
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("user_password").authorities("ROLE_USER")
                .and()
                .withUser("admin").password("admin_password").authorities("ROLE_ADMIN");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().httpBasic().and().authorizeRequests()
               .antMatchers("*/admin/*").hasAuthority("ROLE_ADMIN")
               .antMatchers("/*").hasAuthority("ROLE_USER")
                .anyRequest().permitAll()
                .and().formLogin();
    }
    
}