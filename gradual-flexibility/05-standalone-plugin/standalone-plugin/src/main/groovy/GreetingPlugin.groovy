import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('helloWorld') {
            group = "Hello World"
            description = "Hello World"
            doLast {
                println 'Hello World'
            }
        }
    }
}
