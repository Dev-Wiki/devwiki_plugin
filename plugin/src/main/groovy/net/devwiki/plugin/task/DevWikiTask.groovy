package net.devwiki.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DevWikiTask extends DefaultTask{

    DevWikiTask() {
        group = 'devwiki'
        description = 'devwiki first task'
    }

    @TaskAction
    def devwiki() {
        println "devwiki plugin: Hello World!"
    }
}
