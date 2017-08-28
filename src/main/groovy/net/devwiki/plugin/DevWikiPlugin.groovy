package net.devwiki.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DevWikiPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("devwiki", DevWikiPluginExtension)
    }
}
