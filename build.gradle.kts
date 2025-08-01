plugins {
    id("com.android.library") version "7.0.4" // ✅ Add version
    id("org.jetbrains.kotlin.android") version "1.5.31"
}

repositories {
    google() // ✅ REQUIRED for Android plugins
    mavenCentral()
}

android {
    compileSdk = 33
    namespace = "com.example.addition"

    defaultConfig {
        minSdk = 21
        targetSdk = 33
      versionCode.set(1)
      versionName.set("1.0")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}
