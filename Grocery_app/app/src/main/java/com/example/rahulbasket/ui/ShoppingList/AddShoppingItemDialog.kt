package com.example.rahulbasket.ui.ShoppingList

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.rahulbasket.R
import com.example.rahulbasket.data.db.Entities.ShoppingItem
import kotlinx.android.synthetic.main.add_item_dialog.*

class AddShoppingItemDialog(context: Context, var addDialogListener: AddDialogListener) :
    AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_item_dialog)

        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()
            val price = etPrice.text.toString()

            if (name.isEmpty() || amount.isEmpty() || price.isEmpty()) {
                Toast.makeText(context, "Please Enter all information", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val item = ShoppingItem(name, amount.toInt(),price.toInt())
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            dismiss()
        }
    }

}