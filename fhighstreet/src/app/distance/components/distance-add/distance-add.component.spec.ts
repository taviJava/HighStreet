import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DistanceAddComponent } from './distance-add.component';

describe('DistanceAddComponent', () => {
  let component: DistanceAddComponent;
  let fixture: ComponentFixture<DistanceAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DistanceAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DistanceAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
