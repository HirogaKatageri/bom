buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}")
    }
}

tasks.register("clean", Delete::class) {
    println("Deleting: ${rootProject.buildDir}")
    delete(rootProject.buildDir)
}
