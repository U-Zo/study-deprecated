import { TestBed } from '@angular/core/testing';

import { MorningService } from './morning.service';

describe('MorningService', () => {
  let service: MorningService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MorningService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
