plugins {
    id("java")
    kotlin("jvm") version "1.9.20"
    kotlin("kapt") version "1.9.20"
}
group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    kapt("com.google.dagger:dagger-compiler:2.50")
    implementation("com.google.dagger:dagger:2.50")
}
tasks.test {
    useJUnitPlatform()
}