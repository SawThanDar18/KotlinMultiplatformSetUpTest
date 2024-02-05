package com.sawthandar.kotlinmultitest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform