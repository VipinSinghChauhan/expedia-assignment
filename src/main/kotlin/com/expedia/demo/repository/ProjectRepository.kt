package com.expedia.demo.repository

import com.expedia.demo.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository:JpaRepository<Project,Long> {
    fun getProjectByProjectName(projectName:String):Project
}