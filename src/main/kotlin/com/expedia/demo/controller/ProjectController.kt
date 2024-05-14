package com.expedia.demo.controller

import com.expedia.demo.entity.Employee
import com.expedia.demo.entity.Project
import com.expedia.demo.service.ProjectService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project")
class ProjectController(val projectService: ProjectService) {
    @PostMapping("/")
    fun addProject(@RequestBody project: Project): Project {
        return projectService.addProject(project);
    }

    @PostMapping("/employee/{projectId}")
    fun addEmployee(@RequestBody employee: Employee, @PathVariable("projectId") projectId: Long) {
        projectService.addEmployee(employee, projectId);
    }

    @GetMapping("/")
    fun getAllProject(): MutableList<Project> {
        return projectService.getAllProject();
    }

    @GetMapping("/employees")
    fun getAllEmployees(): MutableList<Employee> {
        return projectService.getAllEmployees();
    }

    @GetMapping("/employee")
    fun getEmployeesByProject(@RequestParam("project_name") projectName: String): MutableList<Employee>? {
        return projectService.getEmployeesByProjectName(projectName);
    }
}