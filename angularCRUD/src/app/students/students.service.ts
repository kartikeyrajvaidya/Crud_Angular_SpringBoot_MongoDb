import { Student } from './students.model';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class StudentsService {

  private baseUrl = 'http://localhost:8080' ;
  constructor(private http: Http) { }

  getStudents() {
    return this.http.get(this.baseUrl + '/students/') ;
  }

}
