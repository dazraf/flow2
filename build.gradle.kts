import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "io.dazraf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.4.5")
    implementation(kotlin("reflect"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.0")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.8.0")
    runtimeOnly("org.jetbrains.kotlin:kotlin-compiler:1.8.0")
    api("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.8.0")
    api("org.jetbrains.kotlin:kotlin-script-util:1.8.0")
    runtimeOnly("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:1.8.0")


    testImplementation(kotlin("test"))
    testImplementation("org.mockito:mockito-core:4.11.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}