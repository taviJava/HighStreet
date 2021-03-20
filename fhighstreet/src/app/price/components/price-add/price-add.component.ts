import { Component, OnInit } from '@angular/core';
import {Price} from '../../model/price';
import {PriceService} from '../../service/price.service';
import {Router} from '@angular/router';
import {Distance} from '../../../distance/model/distance';
import {DistanceService} from '../../../distance/service/distance.service';

@Component({
  selector: 'app-price-add',
  templateUrl: './price-add.component.html',
  styleUrls: ['./price-add.component.css']
})
export class PriceAddComponent implements OnInit {
  price: Price = new Price();
  distances: Distance[] = [];
  vehicles: string[] = ['Truck' , 'Car' , 'Bus' , 'Moto'];
  constructor(private priceService: PriceService,
              private router: Router,
              private distanceService: DistanceService) { }

  ngOnInit(): void {
    this.distances = [];
    this.getDistances();
  }
  // tslint:disable-next-line:typedef
  getDistances(){
    this.distanceService.getAll().subscribe(result =>{
      this.distances = [];
      this.distances = result;
      for (const dist of this.distances){
      }
    });
  }
  getCityName(name: string): any{
    const city = '';
    if (name !== undefined){
      return name;
    }
  }
}
