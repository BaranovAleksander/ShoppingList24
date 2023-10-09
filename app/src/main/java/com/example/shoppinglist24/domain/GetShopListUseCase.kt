package com.example.shoppinglist24.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopLIstRepository: ShopLIstRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopLIstRepository.getShopList()
    }
}