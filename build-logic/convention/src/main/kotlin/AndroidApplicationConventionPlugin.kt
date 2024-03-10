import com.android.build.api.dsl.ApplicationExtension
import com.bigbackboom.tst.build.logic.configureAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            extensions.getByType(ApplicationExtension::class.java).apply {
                defaultConfig.targetSdk = 34
                configureAndroid(this)
            }
        }
    }
}