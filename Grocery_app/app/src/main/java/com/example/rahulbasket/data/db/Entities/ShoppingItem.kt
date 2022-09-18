package com.example.rahulbasket.data.db.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ShoppingItem")
data class ShoppingItem(var item_name: String, var item_amount: Int, var item_price: Int) {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}