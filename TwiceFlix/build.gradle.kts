plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    // The fixed repository setting!
    setRepo("boestar234-debug", "sakau4", "github")
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

dependencies {
    compileOnly("com.github.recloudstream:cloudstream:pre-release")
}
