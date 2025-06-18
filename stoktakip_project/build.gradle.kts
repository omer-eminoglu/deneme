plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.stoktakip"

    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.stoktakip"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.1" }
    kotlinOptions { jvmTarget = "1.8" }

}


