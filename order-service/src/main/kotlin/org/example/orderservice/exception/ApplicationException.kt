package org.example.orderservice.exception

import org.springframework.http.HttpStatus

class ApplicationException(val httpStatus: HttpStatus): RuntimeException()