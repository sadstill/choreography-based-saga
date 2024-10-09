package org.example.orderservice.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(private val httpStatus: HttpStatus, private val errorText: String) {
    ERR_ORDERS_NOT_FOUND(HttpStatus.NOT_FOUND, "Orders not found")
}