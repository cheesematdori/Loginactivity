pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url=uri("https://maven.google.com")
        }
        maven { url= uri( "https://maven.fabric.io/public") }
        maven { url= uri("https://devrepo.kakao.com/nexus/content/groups/public/") }
    }
}
dependencyResolutionManagement {

    repositories {
        maven {
            url = uri("https://jitpack.io")

        }
    }
}
// settings.gradle.kts

rootProject.name = "Loginactivity"
include(":app")
