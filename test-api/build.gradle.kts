group = "com.kotlin"
version = "1.0.0"

allprojects{

    task("end").doLast {
        println("hello $project.name")
    }
}
