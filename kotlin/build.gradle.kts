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
    implementation("org.mockito.kotlin:mockito-kotlin:4.0.0")
    implementation("io.kotest:kotest-property:5.1.0")
    implementation("io.kotest:kotest-extensions:5.1.0")
    implementation("io.kotest:kotest-assertions-core:5.1.0")
    implementation("io.ktor:ktor-velocity:1.6.7")
    implementation("io.ktor:ktor-jackson:1.6.7")
    implementation(BuildSrc.ktorMetrics)
    implementation(libs.commons.lang3)
}

