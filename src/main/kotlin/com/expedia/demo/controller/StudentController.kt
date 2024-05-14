package com.expedia.demo.controller

import com.expedia.demo.dto.StudentResponseDto
import com.expedia.demo.entity.Course
import com.expedia.demo.entity.Student
import com.expedia.demo.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/student")
class StudentController(val studentService: StudentService) {
    @PostMapping("/")
    fun addStudent(@RequestBody student: Student): Student {
        return studentService.addStudent(student);
    }

    @PostMapping("/course/{id}")
    fun addCourse(@RequestBody courseRequest: Course, @PathVariable("id") studentId: Long): Course {
        return studentService.addCourse(courseRequest, studentId)
    }

    @GetMapping("/")
    fun getAllStudents(): MutableList<Student> {
        return studentService.getAllStudents();
    }

    @GetMapping("/course/{course_name}")
    fun getAllStudentsByCourseName(@PathVariable("course_name") courseName: String): MutableList<StudentResponseDto> {
        return studentService.getAllStudentsByCourseName(courseName);
    }

}