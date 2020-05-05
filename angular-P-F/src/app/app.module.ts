import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppRoutingModule, routingComponents} from './app-routing.module';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ExerciseComponent } from './components/exercise/exercise.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { WorkoutsComponent } from './components/workouts/workouts.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    routingComponents
    // ExerciseComponent,
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
    
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
