package com.stamford.hackathon.ui.main.viewholder

import com.stamford.hackathon.core.ItemViewHolder
import com.stamford.hackathon.core.model.ui.ItemListingUiModel
import com.stamford.hackathon.databinding.ViewHolderLoadingBinding

class LoadingViewHolder(binding: ViewHolderLoadingBinding) :
    ItemViewHolder<ItemListingUiModel.Loading>(binding.root) {

    override fun fillData(data: ItemListingUiModel.Loading, position: Int) = Unit
}