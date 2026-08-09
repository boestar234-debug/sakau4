plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    setRepo(
        "https://raw.githubusercontent.com/boestar234-debug/sakau4/builds/",
        "sakau4",
        "Sakau4 Cloudstream Extensions"
    )
}

android {
    namespace = "com.sakau4.twiceflix"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    compileOnly("com.github.recloudstream:cloudstream:pre-release")
    // Jsoup is built into Cloudstream and used for scraping HTML
}
