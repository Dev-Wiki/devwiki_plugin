package net.devwiki.plugin

import net.devwiki.plugin.task.DevWikiTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class DevWikiPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("devwiki", DevWikiPluginExtension)
        project.tasks.create("devwiki", DevWikiTask)
    }
}
