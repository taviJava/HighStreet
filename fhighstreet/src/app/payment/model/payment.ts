import { Price } from 'src/app/price/model/price';
import { Employee } from 'src/app/employee/model/employee';
import { Ticketbooth } from 'src/app/ticketbooth/model/ticketbooth';

export class Payment {
  id: number;
  value: number;
  price: Price;
  employee: Employee;
  ticketBooth: Ticketbooth;
}
