package com.example.shoppinglist24.domain

class GetShopItemUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopLIstRepository.getShopItem(shopItemId)
    }
}