package com.example.shoppinglist24.domain

interface ShopLIstRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItem: Int):ShopItem
    fun getShopList(): List<ShopItem>

}