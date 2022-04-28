import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddActivitieComponent } from './add-activitie.component';

describe('AddActivitieComponent', () => {
  let component: AddActivitieComponent;
  let fixture: ComponentFixture<AddActivitieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddActivitieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddActivitieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
