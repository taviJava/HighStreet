import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LocationListComponent } from './location/components/location-list/location-list.component';
import {LocationAddComponent} from './location/components/location-add/location-add.component';
import {DistanceAddComponent} from './distance/components/distance-add/distance-add.component';

const routes: Routes = [
  {path: 'addLocation', component: LocationAddComponent},
  {path: 'locationList', component: LocationListComponent},
  {path: 'addDistance' , component: DistanceAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
