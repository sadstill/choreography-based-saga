rootProject.name = "choreography-based-saga"

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val dependencyManagementVersion: String by settings
    val openApiVersion: String by settings

    repositories {
        gradlePluginPortal()
    }

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
        id("org.openapi.generator") version openApiVersion
    }
}

include("order-service", "common-dtos")
