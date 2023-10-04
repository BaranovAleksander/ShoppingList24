package com.example.shoppinglist24.domain

class EditShopItemUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopLIstRepository.editShopItem(shopItem)

    }
}