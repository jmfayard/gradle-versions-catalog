plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.40.1"

    // See https://dev.to/jmfayard/the-one-gradle-trick-that-supersedes-all-the-others-5bpg
    // See https://docs.gradle.com/enterprise/gradle-plugin/
    id("com.gradle.enterprise") version "3.8.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
    }

}

rootProject.name = "gradle-versions-catalog"
include("kotlin", "groovy")
