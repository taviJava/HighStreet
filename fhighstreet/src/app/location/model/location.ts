import { Ticketbooth } from 'src/app/ticketbooth/model/ticketbooth';
import { Distance } from 'src/app/distance/model/distance';

export class Location {
  id: number | undefined;
  name: string | undefined;
  ticketBooths: Ticketbooth[]| undefined;
  distancesStart: Distance[]| undefined;
  distancesEnd: Distance[] | undefined;
}
