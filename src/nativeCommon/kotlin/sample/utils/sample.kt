package sample.utils

import platform.posix.fclose
import platform.posix.fopen
import kotlin.system.exitProcess

fun fileExists(name: String): Boolean {
    val f = fopen(name, "r")
    try {
        return f != null
    } finally {
        if (f != null) {
            fclose(f)
        }
    }
}

fun exit(code: Int = 0, message: String? = null) {
    if (message != null) {
        println("ERROR: $message")
    }

    exitProcess(code)
}