package org.example.orderservice.exception

import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

private val log = KotlinLogging.logger { }

class GlobalExceptionHandler {


    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handle(ex: Exception) {
        log.error(ex) { "Internal server error " }
        return
    }
}