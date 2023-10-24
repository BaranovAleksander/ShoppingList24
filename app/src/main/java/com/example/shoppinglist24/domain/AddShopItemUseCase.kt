package com.example.shoppinglist24.domain

class AddShopItemUseCase(private val shopListRepository: ShopLIstRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}