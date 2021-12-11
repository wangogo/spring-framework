plugins {
    java
}

group = "org.springframework"
version = "6.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
	compile(project(":spring-beans"))
	compile(project(":spring-context"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}