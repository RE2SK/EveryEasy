import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

import { MatCardModule } from '@angular/material/card';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { GlossaryComponent } from './components/glossary/glossary.component';
import { ElementComponent } from './components/element/element.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    GlossaryComponent,
    ElementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatCardModule,
    Observable,
    HttpClient
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
