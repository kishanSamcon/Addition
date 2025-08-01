pluginManagement {
    repositories {
        gradlePluginPortal()
        google() // ✅ REQUIRED for Android plugins like 'com.android.library'
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Addition"
 