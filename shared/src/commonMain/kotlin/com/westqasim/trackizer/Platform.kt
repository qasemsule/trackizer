package com.westqasim.trackizer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform