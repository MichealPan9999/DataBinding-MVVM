package com.example.recyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;

import com.example.recyclerview.adapter.MultiItemAdapter;
import com.example.recyclerview.bean.FruitItem;
import com.example.recyclerview.bean.IBaseBindingAdapterItem;
import com.example.recyclerview.bean.TextItem;
import com.example.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MultiItemAdapter multiItemAdapter;
    private List<IBaseBindingAdapterItem> mList = new ArrayList<>(); //数据源
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initData();
        multiItemAdapter = new MultiItemAdapter(this,mList);//获取填充的数据
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL,false);
        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(multiItemAdapter);//填充数据到R.id.recyclerView
    }
    private void initData() {
        mList.add(new TextItem("标题1"));
        mList.add(new FruitItem(R.mipmap.fruit, "苹果"));
        mList.add(new FruitItem(R.mipmap.fruit, "香蕉"));
        mList.add(new TextItem("标题2"));
        mList.add(new TextItem("标题3"));
        mList.add(new FruitItem(R.mipmap.fruit, "桃子"));
        mList.add(new TextItem("标题4"));
        mList.add(new FruitItem(R.mipmap.fruit, "梨"));
        mList.add(new TextItem("标题5"));
    }
}
