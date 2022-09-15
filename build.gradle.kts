plugins {
    kotlin("jvm") version "1.5.10"
}

group = "dev.jacobandersen.gradle"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

//gradlePlugin {
//    plugins {
//        create("gradleSmash") {
//            id = "dev.jacobandersen.gradle.smash"
//            implementationClass = "dev.jacobandersen.gradle.smash.GradleSmashPlugin"
//        }
//    }
//}

