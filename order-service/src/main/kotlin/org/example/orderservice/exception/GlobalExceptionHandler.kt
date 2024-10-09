package org.example.orderservice.exception

import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus


@Slf4j
class GlobalExceptionHandler {


    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handle(ex: Exception) {

        return createError(HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase)
    }
}