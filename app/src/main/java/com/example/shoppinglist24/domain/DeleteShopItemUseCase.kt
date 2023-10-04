package com.example.shoppinglist24.domain

class DeleteShopItemUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        shopLIstRepository.deleteShopItem(shopItem)
    }
}