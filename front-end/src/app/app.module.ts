import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import {MDBRootModule} from 'angular-bootstrap-md';
import { BlogsComponent } from './blogs/blogs.component';
import { NotFoundComponent } from './not-found/not-found.component';
import {Router, RouterModule, Routes} from '@angular/router';
import {FormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';

const appRoutes: Routes = [
  {
    path: 'blogs',
    component: BlogsComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    BlogsComponent,
    NotFoundComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    MDBRootModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
