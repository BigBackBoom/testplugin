plugins {
    `kotlin-dsl`
}

group = "com.testplugin.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.bigbackboom.tst.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}

dependencies {
    compileOnly(libs.android.gradle)
    compileOnly(libs.kotlin.gradle)
}
