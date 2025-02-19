plugins {
    id 'com.android.application'
    id 'com.google.gms.google-services'
}

android {
    namespace 'com.asrofi.ruangpeduli'
    compileSdk 34

    defaultConfig {
        applicationId "com.asrofi.ruangpeduli"
        minSdk 26
        targetSdk 34
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding true
    }
    sourceSets {
        main {
            java {
                srcDirs 'src\\main\\java', 'src\\main\\java\\com.asrofi.ruangpeduli\\adapters', 'src\\main\\java\\com\\asrofi\\ruangpeduli\\adapter'
            }
        }
    }
}

dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation platform('com.google.firebase:firebase-bom:32.7.0')
    implementation 'com.google.firebase:firebase-analytics'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.annotation:annotation:1.7.1'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.7.0'
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0'
    implementation 'com.google.firebase:firebase-auth:22.3.0'
    implementation 'com.google.firebase:firebase-firestore:24.10.0'
    implementation 'com.google.firebase:firebase-database:20.3.0'
    implementation 'androidx.navigation:navigation-fragment:2.7.6'
    implementation 'androidx.navigation:navigation-ui:2.7.6'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    implementation 'com.google.firebase:firebase-storage:20.3.0'
    implementation 'androidx.palette:palette:1.0.0'
    testImplementation 'junit:junit:4.13'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
    implementation 'com.karumi:dexter:6.2.3'
    implementation('com.firebaseui:firebase-ui-database:8.0.0')
    implementation 'com.github.bumptech.glide:glide:4.16.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.13.0'

    implementation 'androidx.palette:palette:1.0.0'
    implementation 'com.google.android.gms:play-services-auth:20.7.0'

}
apply plugin: 'com.android.application'
apply plugin: 'com.google.gms.google-services'
