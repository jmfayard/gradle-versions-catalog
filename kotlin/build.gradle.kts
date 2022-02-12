plugins {
    kotlin("jvm")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation(project(":groovy"))
    implementation(kotlin("stdlib"))
    implementation(libs.mockito.kotlin)
    implementation(Testing.kotest.property)
    implementation(libs.kotest.extensions)
    implementation(Testing.kotest.assertions.core)
    implementation(Ktor.features.velocity)
    implementation(Ktor.features.jackson)
    implementation(BuildSrc.ktorMetrics)
    implementation(libs.commons.lang3)
}

