package com.example.recyclerview.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.bean.FruitItem;
import com.example.recyclerview.bean.IBaseBindingAdapterItem;
import com.example.recyclerview.bean.TextItem;
import com.example.recyclerview.databinding.ItemFruitBinding;
import com.example.recyclerview.databinding.ItemTextBinding;

import java.util.List;

public class MultiItemAdapter extends BaseBindRecyclerViewAdapter<IBaseBindingAdapterItem> {
    public MultiItemAdapter(Context context, List<IBaseBindingAdapterItem> mList) {
        super(context, mList);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case R.layout.item_fruit:
                //ItemFruitBinding 该名称与布局有关 item_fruit.xml
                ItemFruitBinding itemFruitBinding = DataBindingUtil.inflate(inflater, R.layout.item_fruit, parent, false);
                return new FruitViewHolder(itemFruitBinding);
            case R.layout.item_text:
                //ItemTextBinding 该名称与布局有关 item_text.xml
                ItemTextBinding itemTextBinding = DataBindingUtil.inflate(inflater, R.layout.item_text, parent, false);
                return new TextViewHolder(itemTextBinding);
            default:
                ItemFruitBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_fruit, parent, false);
                return new FruitViewHolder(binding);
        }
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FruitViewHolder) {
            FruitItem fruitBean = (FruitItem) mList.get(position);
            ((FruitViewHolder) holder).getBinding().setItem(fruitBean);
            ((FruitViewHolder) holder).getBinding().executePendingBindings(); //解决databinding闪烁问题
        } else if (holder instanceof TextViewHolder) {
            TextItem textBean = (TextItem) mList.get(position);
            ((TextViewHolder) holder).getBinding().setItem(textBean);
            ((TextViewHolder) holder).getBinding().executePendingBindings(); //解决databinding闪烁问题
        }
    }


}
