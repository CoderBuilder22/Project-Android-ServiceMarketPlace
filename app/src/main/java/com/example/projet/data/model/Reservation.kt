package com.example.projet.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reservations")
data class Reservation(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val customerId: String,
    val serviceId: String,
    val date: Long,
    val status: String // "pending", "confirmed", "cancelled"
)