import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
	kotlin("plugin.jpa")
	id("org.springframework.boot")
}

dependencies {
	implementation(project(":common-dtos"))
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.cloud:spring-cloud-stream")
	implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka")
	implementation("org.springframework.kafka:spring-kafka")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.liquibase:liquibase-core")
	implementation("org.postgresql:postgresql")
	implementation("org.mapstruct:mapstruct:1.5.5.Final")
	implementation("ch.qos.logback:logback-classic")
	implementation("io.github.microutils:kotlin-logging:3.0.5")

	runtimeOnly("org.springdoc:springdoc-openapi-kotlin:1.8.0")

	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testImplementation("org.springframework.cloud:spring-cloud-stream-test-binder")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
	testImplementation("org.springframework.kafka:spring-kafka-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.register<GenerateTask>("generateOrderApi") {
	generatorName.set("spring")
	// todo check it
	outputDir.set(rootProject.layout.buildDirectory.dir("generated").get().asFile.toString())
	apiPackage.set("org.example.orderservice.api")
	modelPackage.set("org.example.orderservice.model")
	inputSpec.set("")
}
