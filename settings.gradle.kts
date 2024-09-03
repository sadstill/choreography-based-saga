rootProject.name = "choreography-based-saga"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

include("order-service", "payment-service", "common-dtos")
