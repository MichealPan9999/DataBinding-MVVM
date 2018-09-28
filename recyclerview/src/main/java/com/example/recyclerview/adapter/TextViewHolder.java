package com.example.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.databinding.ItemTextBinding;

class TextViewHolder extends RecyclerView.ViewHolder {
    private ItemTextBinding binding;

    public ItemTextBinding getBinding() {
        return binding;
    }

    public TextViewHolder(ItemTextBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
