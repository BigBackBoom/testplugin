import com.android.build.gradle.LibraryExtension
import com.bigbackboom.tst.build.logic.configureAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            extensions.getByType(LibraryExtension::class.java).apply {
                configureAndroid(this)
            }
        }
    }
}