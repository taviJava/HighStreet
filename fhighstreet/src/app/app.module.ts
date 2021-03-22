import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AddLocationComponent } from './location/components/add-location/add-location.component';
import { LocationListComponent } from './location/components/location-list/location-list.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';
import { LocationAddComponent } from './location/components/location-add/location-add.component';
import {HttpClientModule} from '@angular/common/http';
import { DistanceAddComponent } from './distance/components/distance-add/distance-add.component';
import {NgMultiSelectDropDownModule} from 'ng-multiselect-dropdown';
import { EmployeeAddComponent } from './employee/components/employee-add/employee-add.component';
import { PriceAddComponent } from './price/components/price-add/price-add.component';
import { Test1Component } from './test/components/test1/test1.component';
import {IconsModule} from 'angular-bootstrap-md';
import { MDBBootstrapModule } from 'angular-bootstrap-md';


@NgModule({
  declarations: [
    AppComponent,
    AddLocationComponent,
    LocationListComponent,
    LocationAddComponent,
    DistanceAddComponent,
    EmployeeAddComponent,
    PriceAddComponent,
    Test1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgMultiSelectDropDownModule,
    IconsModule,
    MDBBootstrapModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
