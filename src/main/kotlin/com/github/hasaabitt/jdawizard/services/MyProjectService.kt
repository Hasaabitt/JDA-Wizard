package com.github.hasaabitt.jdawizard.services

import com.intellij.openapi.project.Project
import com.github.hasaabitt.jdawizard.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
