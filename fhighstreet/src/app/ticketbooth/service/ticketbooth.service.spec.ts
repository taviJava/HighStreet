import { TestBed } from '@angular/core/testing';

import { TicketboothService } from './ticketbooth.service';

describe('TicketboothService', () => {
  let service: TicketboothService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TicketboothService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
