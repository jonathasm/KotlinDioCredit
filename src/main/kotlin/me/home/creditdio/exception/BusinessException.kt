package me.home.creditdio.exception

data class BusinessException(override val message: String?) : RuntimeException(message)