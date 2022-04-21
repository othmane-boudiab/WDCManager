import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { UtilisateursComponent } from './pages/utilisateurs/utilisateurs.component';
import { ActivitiesComponent } from './pages/activities/activities.component';
import { ExercisesComponent } from './pages/exercises/exercises.component';
import { SettingsComponent } from './pages/settings/settings.component';
import { SideBarComponent } from './components/side-bar/side-bar.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { CardsComponent } from './components/cards/cards.component';
import { UsersTableComponent } from './components/users-table/users-table.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    UtilisateursComponent,
    ActivitiesComponent,
    ExercisesComponent,
    SettingsComponent,
    SideBarComponent,
    NavBarComponent,
    CardsComponent,
    UsersTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
