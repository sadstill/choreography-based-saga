package org.example.orderservice.entity

import event.OrderStatus
import event.PaymentStatus
import jakarta.persistence.*

@Entity
@Table(name = "order_process")
data class OrderProcess(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(name = "user_id")
    var userId: Int,

    @Column(name = "product_id")
    var productId: Int,

    @Column(name = "price")
    val price: Int,

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    val orderStatus: OrderStatus,

    @Column(name = "payment_status")
    @Enumerated(EnumType.STRING)
    val paymentStatus: PaymentStatus
)