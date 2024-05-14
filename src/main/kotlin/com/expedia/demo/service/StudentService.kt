package com.expedia.demo.service

import com.expedia.demo.dto.StudentResponseDto
import com.expedia.demo.entity.Course
import com.expedia.demo.entity.Student
import com.expedia.demo.repository.CourseRepository
import com.expedia.demo.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    val studentRepository: StudentRepository,
    val courseRepository: CourseRepository
) {
    fun addStudent(student: Student): Student {
        return studentRepository.save(student)
    }

    fun addCourse(courseRequest: Course, studentId: Long): Course {
        val course = studentRepository.findById(studentId).map { student ->
            if (courseRequest.courseId != 0L) {
                val _course = courseRepository.findById(courseRequest.courseId)
                    .orElseThrow { RuntimeException("Not found course") }
                student.courses?.add(_course)
                studentRepository.save(student)
                Course(_course.courseId, _course.courseName, _course.students)
            } else {
                student.courses?.add(courseRequest)
                courseRepository.save(courseRequest)
            }

        }.orElseThrow({ RuntimeException() })
        return course;
    }

    fun getAllStudents(): MutableList<Student> {
        return studentRepository.findAll();
    }

    fun getAllStudentsByCourseName(courseName: String): MutableList<StudentResponseDto> {
        return courseRepository.getCourseByCourseName(courseName)
            .map { t -> StudentResponseDto(t.get("student_id"), t.get("name"), t.get("course_name")) }.toMutableList()
    }
}