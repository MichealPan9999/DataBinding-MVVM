package com.example.panzq.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.panzq.mvvm.bean.UserBean;
import com.example.panzq.mvvm.databinding.ActivityMain2Binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        List<String> list = new ArrayList<>();
        list.add("List1");
        list.add("List2");
        binding.setList(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("key0", "map_value0");
        map.put("key1", "map_value1");
        binding.setMap(map);

        String[] array = {"字符串1", "字符串2"};
        binding.setArray(array);

        UserBean userBean = new UserBean("张三", 18);
        binding.setMuser(userBean);
        UserBean userBean2 = new UserBean("李四", 17);
        binding.setMuser2(userBean2);

        binding.setClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.click_btn:
                Toast.makeText(Main2Activity.this, "点击了按钮", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
