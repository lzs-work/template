package com.github.lzswork.template.services

import com.intellij.openapi.project.Project
import com.github.lzswork.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
