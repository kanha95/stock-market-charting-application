import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FeaturesComponent } from './features/features.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregisterComponent } from './userregister/userregister.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { LogoutComponent } from './logout/logout.component';
import { IpoComponent } from './ipo/ipo.component';
import { ComparecompanyComponent } from './comparecompany/comparecompany.component';
import { ComparesectorComponent } from './comparesector/comparesector.component';
import { ImportdataComponent } from './importdata/importdata.component';
import { ManagecompanyComponent } from './managecompany/managecompany.component';
import { ManageexchangeComponent } from './manageexchange/manageexchange.component';
import { AddipoComponent } from './addipo/addipo.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    WelcomeComponent,
    FeaturesComponent,
    UserloginComponent,
    UserregisterComponent,
    LogoutComponent,
    IpoComponent,
    ComparecompanyComponent,
    ComparesectorComponent,
    ImportdataComponent,
    ManagecompanyComponent,
    ManageexchangeComponent,
    AddipoComponent,
    AdminloginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
