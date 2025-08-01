plugins {
    id("com.android.library") version "7.0.4"
    id("org.jetbrains.kotlin.android") version "1.5.31"
    id("maven-publish")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = 33
    namespace = "com.example.addition"
    
    defaultConfig {
        minSdk = 21
        targetSdk = 33
        
        // versionCode and versionName MUST be inside this defaultConfig block
    
        
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

dependencies {
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.kishanSamcon"
            artifactId = "addition-library"
            version = "1.0.9"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}