import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FeaturesComponent } from './features/features.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregisterComponent } from './userregister/userregister.component';

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
  path : "**", component : WelcomeComponent
}
]
;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
