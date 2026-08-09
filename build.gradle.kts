import com.android.build.gradle.BaseExtension
import com.lagradost.cloudstream3.gradle.CloudstreamExtension

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

// This applies the Cloudstream plugin and Android settings to all sub-folders automatically
subprojects {
    apply(plugin = "com.android.library")
    apply(plugin = "kotlin-android")
    apply(plugin = "com.lagradost.cloudstream3.gradle")

    
extensions.configure<CloudstreamExtension>("cloudstream") {
        setRepo("github", "boestar234-debug", "sakau4")
    }

    extensions.configure<BaseExtension>("android") {
        compileSdkVersion(34)
        defaultConfig {
            minSdk = 21
            targetSdk = 34
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }

    dependencies {
        val implementation by configurations
        implementation("com.github.recloudstream.cloudstream:library:-SNAPSHOT")
    }
}
