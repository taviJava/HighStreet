import { Component, OnInit } from '@angular/core';
import {Distance} from '../../model/distance';
import {Location} from '../../../location/model/location';
import {DistanceService} from '../../service/distance.service';
import {LocationService} from '../../../location/service/location.service';
import {Router} from '@angular/router';
import {IDropdownSettings} from 'ng-multiselect-dropdown';

@Component({
  selector: 'app-distance-add',
  templateUrl: './distance-add.component.html',
  styleUrls: ['./distance-add.component.css']
})
export class DistanceAddComponent implements OnInit {
  distance: Distance = new Distance();
  dropdownSettings: IDropdownSettings = {};
  dropdownSettings2: IDropdownSettings = {};
  locations: Location[] = [];
  selectedStartLocations: Location[] = [];
  selectedEndLocations: Location[] = [];
  constructor(private distanceService: DistanceService,
              private locationService: LocationService,
              private router: Router) { }

  ngOnInit(): void {
    this.distance = new Distance();
    this.locations = [];
    this.getAll();
    this.dropdownSettings = {
      singleSelection: true,
      idField: 'id',
      textField: 'name',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      itemsShowLimit: 3,
      allowSearchFilter: true,
    };
    this.dropdownSettings2 = {
      singleSelection: true,
      idField: 'id',
      textField: 'name',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      itemsShowLimit: 3,
      allowSearchFilter: true,
    };
  }
  // tslint:disable-next-line:typedef
  onItemSelect(item: any) {
    console.log(item);
  }

  // tslint:disable-next-line:typedef
  onSelectAll(items: any) {
    console.log(items);
  }
  // tslint:disable-next-line:typedef
  getAll(){
    this.locationService.getAll().subscribe(result => {
      this.locations = [];
      this.locations = result;
    });
  }
  // tslint:disable-next-line:typedef
  onSubmit(){
    this.distance.startLocation = this.selectedStartLocations[0];
    this.distance.endLocation = this.selectedEndLocations[0];
    this.distanceService.save(this.distance).subscribe(result => {
      this.router.navigate(['']);
    });
  }
}
