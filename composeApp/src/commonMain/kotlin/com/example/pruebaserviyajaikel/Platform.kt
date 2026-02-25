package com.example.pruebaserviyajaikel

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform