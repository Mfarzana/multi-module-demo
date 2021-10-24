group = "com.kotlin"
version = "1.0.1"

task("end").doLast {
    println("goodbye $project.name")
}
