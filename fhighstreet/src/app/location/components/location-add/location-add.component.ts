import { Component, OnInit } from '@angular/core';
import {Location} from '../../model/location';
import {LocationService} from '../../service/location.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-location-add',
  templateUrl: './location-add.component.html',
  styleUrls: ['./location-add.component.css']
})
export class LocationAddComponent implements OnInit {
  location: Location = new Location();
  constructor(private locationService: LocationService,
              private router: Router) { }

  ngOnInit(): void {
    this.location = new Location();
  }
  // tslint:disable-next-line:typedef
  add(){
    this.locationService.save(this.location).subscribe(result =>{
        this.router.navigate(['']);
      }
    );
  }
}
