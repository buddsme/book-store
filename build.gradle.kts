plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    implementation("com.google.guava:guava:31.1-jre")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.andersen.App"
    }
}

application {
    mainClass.set("com.andersen.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
