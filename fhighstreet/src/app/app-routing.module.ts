import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddLocationComponent } from './location/components/add-location/add-location.component';
import { LocationListComponent } from './location/components/location-list/location-list.component';
import {LocationAddComponent} from './location/components/location-add/location-add.component';

const routes: Routes = [
  {path: 'addLocation', component: LocationAddComponent},
  {path: 'locationList', component: LocationListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
