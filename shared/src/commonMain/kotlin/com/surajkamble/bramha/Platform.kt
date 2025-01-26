package com.surajkamble.bramha

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform