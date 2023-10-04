package com.example.shoppinglist24.domain

class GetShopListUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun getShopList(): List<ShopItem> {
        return shopLIstRepository.getShopList()
    }
}