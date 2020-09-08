import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FeaturesComponent } from './features/features.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';

const routes: Routes = [
{
  path : "", redirectTo : "welcome", pathMatch : "full"
}
,
{
  path : "welcome", component : WelcomeComponent
},
{
  path : "features", component : FeaturesComponent
},
{
  path : "userlogin", component : UserloginComponent
},
{
  path : "userregister", component : UserregisterComponent
},
{ 
  path: 'logout', component: LogoutComponent
},
{ 
  path: 'adminlogin', component: AdminloginComponent
},
{
  path : "**", component : WelcomeComponent
}

]
;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
