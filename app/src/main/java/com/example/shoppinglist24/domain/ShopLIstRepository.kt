package com.example.shoppinglist24.domain

import androidx.lifecycle.LiveData

interface ShopLIstRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItem: Int):ShopItem
    fun getShopList(): LiveData<List<ShopItem>>

}