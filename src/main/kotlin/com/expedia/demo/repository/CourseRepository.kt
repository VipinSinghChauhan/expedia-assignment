package com.expedia.demo.repository

import com.expedia.demo.entity.Course
import jakarta.persistence.Tuple
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CourseRepository : JpaRepository<Course, Long> {
    @Query(nativeQuery = true, value = "select s.student_id, s.name, c.course_name from student s\n" +
            "inner join student_course sc on s.student_id=sc.student_id\n" +
            "inner join course c on sc.course_id=c.course_id\n" +
            "where c.course_name like concat('%',:course_name,'%')")
    fun getCourseByCourseName(@Param("course_name") courseName: String): MutableList<Tuple>
}