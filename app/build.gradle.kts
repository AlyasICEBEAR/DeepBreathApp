plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.deepbreath"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.deepbreath"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit for networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    // Gson converter for JSON parsing
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // OkHttp for networking (required by Retrofit)
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    // Gson for converting JSON data
    implementation("com.google.code.gson:gson:2.8.8")
}