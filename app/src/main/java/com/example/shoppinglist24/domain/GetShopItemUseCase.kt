package com.example.shoppinglist24.domain

class GetShopItemUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun getShopItem(shopItem: Int): ShopItem {
        return shopLIstRepository.getShopItem(shopItem)
    }
}