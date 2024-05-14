package com.expedia.demo.service

import com.expedia.demo.entity.Employee
import com.expedia.demo.entity.Project
import com.expedia.demo.repository.EmployeeRepository
import com.expedia.demo.repository.ProjectRepository
import org.springframework.stereotype.Service

@Service
class ProjectService(val projectRepository: ProjectRepository, val employeeRepository: EmployeeRepository) {
    fun addProject(project: Project): Project {
        return projectRepository.save(project);
    }

    fun addEmployee(employee: Employee, projectId: Long): Employee {
        val optProject = projectRepository.findById(projectId)
        if (optProject.isPresent) {
            val project = optProject.get()
            employee.project = project
            return employeeRepository.save(employee)
        }
        throw RuntimeException("Project not found : $projectId")
    }

    fun getAllProject(): MutableList<Project> {
        return projectRepository.findAll();
    }

    fun getAllEmployees(): MutableList<Employee> {
        return employeeRepository.findAll();
    }

    fun getEmployeesByProjectName(projectName: String): MutableList<Employee>? {
        return projectRepository.getProjectByProjectName(projectName).employees
    }
}