package com.expedia.demo.repository

import com.expedia.demo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {
//    @Query(
//        nativeQuery = true, value = "select s.student_id,s.name  from student s inner join student_course sc on s.student_id" +
//                " = sc.student_id inner join course c on sc.course_id=c.course_id where c.course_name = :course_name "
//    )
//    fun getStudentsByCourseName(@Param("course_name") courseName: String): MutableList<Student>
}