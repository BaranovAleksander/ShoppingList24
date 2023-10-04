package com.example.shoppinglist24.data

import com.example.shoppinglist24.domain.ShopItem
import com.example.shoppinglist24.domain.ShopLIstRepository

object ShopListRepositoryImpl :ShopLIstRepository {
    private val shopList = mutableListOf<ShopItem>()
    private var autoIncremenId = 0



    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncremenId++
        }
         shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find{
            it.id == shopItemId
        }?:throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}