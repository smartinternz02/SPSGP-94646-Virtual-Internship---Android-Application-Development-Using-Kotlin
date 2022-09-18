package com.example.rahulbasket.ui.ShoppingList

import com.example.rahulbasket.data.db.Entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item: ShoppingItem)
}