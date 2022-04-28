import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditActivitieComponent } from './edit-activitie.component';

describe('EditActivitieComponent', () => {
  let component: EditActivitieComponent;
  let fixture: ComponentFixture<EditActivitieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditActivitieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditActivitieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
