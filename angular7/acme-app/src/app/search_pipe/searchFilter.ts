import { Pipe, PipeTransform, Injectable } from '@angular/core';

@Pipe({
  name: 'filter'
})
@Injectable()
export class FilterPipe implements PipeTransform {
  transform(student: any[], field: string, value: string): any[] {
    if (!student) {
      return [];
    }
    if (!field || !value) {
      return student;
    }

    return student.filter(singleItem =>
      singleItem[field].toLowerCase().includes(value.toLowerCase())
    );
  }
}