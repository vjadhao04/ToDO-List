// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
   dependencies {
       classpath( libs.hilt.android.gradle.plugin)


   }
}


plugins {
    alias(libs.plugins.android.application) apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.android.library") version "8.5.0" apply false

}