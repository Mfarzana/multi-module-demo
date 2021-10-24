group = "com.kotlin"
version = "1.0.0"

allprojects{

    task("hello").doLast {
        println("hello $project.name")
    }
}




