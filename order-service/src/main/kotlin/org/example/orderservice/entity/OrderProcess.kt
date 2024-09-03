package org.example.orderservice.entity

import event.OrderStatusEnum
import event.PaymentStatusEnum
import jakarta.persistence.*

@Entity
@Table(name = "order_process")
data class OrderProcess(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "user_id")
    var userId: Int,

    @Column(name = "product_id")
    var productId: Int,

    @Column(name = "price")
    val price: Int,

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    val orderStatus: OrderStatusEnum,

    @Column(name = "payment_status")
    @Enumerated(EnumType.STRING)
    val paymentStatus: PaymentStatusEnum
)