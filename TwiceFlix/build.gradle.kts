import com.lagradost.cloudstream3.gradle.CloudstreamExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "com.sakau2.twiceflix"
    compileSdk = 34
    
    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

apply(plugin = "com.lagradost.cloudstream3.gradle")

extensions.configure<CloudstreamExtension>("cloudstream") {
    setRepo("boestar234-debug", "sakau4", "github")
}

dependencies {
    compileOnly("com.github.recloudstream:cloudstream:pre-release")
}