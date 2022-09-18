package com.example.rahulbasket

import android.app.Application
import com.example.rahulbasket.data.Repositories.ShoppingRepo
import com.example.rahulbasket.data.db.ShoppingDB
import com.example.rahulbasket.ui.ShoppingList.ShoppingVMFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class ShoppingApplication : Application(), KodeinAware {
    override val kodein: Kodein = Kodein.lazy {
        import(androidXModule(this@ShoppingApplication))
        bind() from singleton { ShoppingDB(instance()) }
        bind() from singleton { ShoppingRepo(instance()) }
        bind() from provider { ShoppingVMFactory(instance()) }
    }
}
