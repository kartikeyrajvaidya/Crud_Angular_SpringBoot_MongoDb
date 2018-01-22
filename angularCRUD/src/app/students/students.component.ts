import { StudentsService } from './students.service';
import { Student } from './students.model';
import { Component, OnInit } from '@angular/core';
import { Http, Response } from '@angular/http';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  constructor(private studentsService: StudentsService) { }

  students: Student[];

  ngOnInit() {
    this.getStudents();
  }

  getStudents() {

    this.studentsService.getStudents()
    .subscribe(
      (response: Response) => {
        this.students = response.json();
      }
    );
  }

}
