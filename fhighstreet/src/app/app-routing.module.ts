import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LocationListComponent } from './location/components/location-list/location-list.component';
import {LocationAddComponent} from './location/components/location-add/location-add.component';
import {DistanceAddComponent} from './distance/components/distance-add/distance-add.component';
import {EmployeeAddComponent} from './employee/components/employee-add/employee-add.component';
import {PriceAddComponent} from './price/components/price-add/price-add.component';

const routes: Routes = [
  {path: 'addLocation', component: LocationAddComponent},
  {path: 'locationList', component: LocationListComponent},
  {path: 'addDistance' , component: DistanceAddComponent},
  {path: 'addEmployee' , component: EmployeeAddComponent},
  {path: 'priceUpdate' , component: PriceAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
