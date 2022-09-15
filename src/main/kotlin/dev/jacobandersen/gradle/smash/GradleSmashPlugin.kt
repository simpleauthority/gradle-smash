package dev.jacobandersen.gradle.smash

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradleSmashPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("smash") {
            it.doLast {
                println("Hulk...SMASH!")
            }
        }
    }
}