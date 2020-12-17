package com.github.thiagopromano.intellijelixirls.services

import com.intellij.openapi.project.Project
import com.github.thiagopromano.intellijelixirls.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
