import { Ticketbooth } from 'src/app/ticketbooth/model/ticketbooth';
import { Distance } from 'src/app/distance/model/distance';

export class Location {
  id: number;
  name: string;
  ticketBooths: Ticketbooth[];
  distancesStart: Distance[];
  distancesEnd: Distance[];
}
