import com.lagradost.cloudstream3.gradle.CloudstreamExtension

plugins {
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        // Leave Cloudstream here so the `make` command works
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

apply(plugin = "com.lagradost.cloudstream3.gradle")

extensions.configure<CloudstreamExtension>("cloudstream") {
    setRepo("boestar234-debug", "sakau4", "github")
}