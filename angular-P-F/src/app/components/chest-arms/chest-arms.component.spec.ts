import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChestArmsComponent } from './chest-arms.component';

describe('ChestArmsComponent', () => {
  let component: ChestArmsComponent;
  let fixture: ComponentFixture<ChestArmsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChestArmsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChestArmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
