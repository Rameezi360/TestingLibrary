# TestingLibrary

A general-purpose utility library for Android development.

## How to use this library

**Step 1:** Add the JitPack repository to your new project's `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("[https://jitpack.io](https://jitpack.io)") } // Add this line
    }
}

Step 2: Add the dependency in your app-level build.gradle.kts file:

dependencies {
    implementation("com.github.Rameezi360:TestingLibrary:1.0.0")
}
