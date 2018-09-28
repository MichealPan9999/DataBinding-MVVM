package com.example.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.databinding.ItemFruitBinding;

class FruitViewHolder extends RecyclerView.ViewHolder {
    private ItemFruitBinding binding;

    public ItemFruitBinding getBinding() {
        return binding;
    }

    public FruitViewHolder(ItemFruitBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
