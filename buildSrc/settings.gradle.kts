pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
    plugins {
        id("de.fayard.refreshVersions") version "0.40.2-SNAPSHOT"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}

