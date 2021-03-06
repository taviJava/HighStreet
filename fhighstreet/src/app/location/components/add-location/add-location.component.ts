import { Component, OnInit } from '@angular/core';
import { Location } from 'src/app/location/model/location';
import { LocationService } from '../../service/location.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-location',
  templateUrl: './add-location.component.html',
  styleUrls: ['./add-location.component.css']
})
export class AddLocationComponent implements OnInit {
  location: Location = new Location();
  name1: any;
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
