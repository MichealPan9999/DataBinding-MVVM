package com.example.recyclerview.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.recyclerview.R;
import com.example.recyclerview.BR;

public class FruitItem extends BaseObservable implements IBaseBindingAdapterItem {
    private int picId; //图片的ID
    private String describe; //描述

    public FruitItem(int picId, String describe) {
        this.picId = picId;
        this.describe = describe;
    }

    @Bindable
    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
        notifyPropertyChanged(BR.picId);
    }

    @Bindable
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
        notifyPropertyChanged(BR.describe);
    }

    @Override
    public int getItemViewType() { //获取到对应的ItemView 此处对应item_fruit
        return R.layout.item_fruit;
    }
}
