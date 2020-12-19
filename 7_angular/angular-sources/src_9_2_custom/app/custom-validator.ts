import { FormControl } from '@angular/forms';

export class CustomValidator {
  static eq5(control: FormControl) {
    let result = null;
    if (control.value !== '5') {
      result = { re: true }; // 유효성 검증 문제
    }

    return result;
  }
}
