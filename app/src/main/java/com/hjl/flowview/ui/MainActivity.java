package com.hjl.flowview.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.hjl.taglibrary.TagConfig;
import com.hjl.taglibrary.model.TagModel;
import com.hjl.taglibrary.view.HotTagLIstView;
import com.hjl.flowview.R;
import com.hjl.taglibrary.view.ProcessListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private HotTagLIstView mTaglist;
    private ProcessListView mProcesslist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTaglist = (HotTagLIstView) findViewById(R.id.taglist);
        mProcesslist = (ProcessListView) findViewById(R.id.processlist);

        TagConfig.getInstance()
                .setBgColor(Color.parseColor("#eeeeee"))  //设置背景颜色
                .setLineColor(Color.parseColor("#cccccc"))//设置边框颜色
                .setTextColor(Color.parseColor("#848484"))//设置文字颜色
                .setIconColor(Color.parseColor("#cccccc"));//设置右方箭头颜色


       /* TagConfig.getInstance()
                .setBgColor(Color.parseColor("#ffffff"))  //设置背景颜色
                .setLineColor(Color.parseColor("#45c800"))//设置边框颜色
                .setTextColor(Color.parseColor("#45c800"))//设置文字颜色
                .setIconColor(Color.parseColor("#cccccc"));//设置右方箭头颜色*/


        List<TagModel> tagModelList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tagModelList.add(new TagModel("标签" + i));
        }
        mTaglist.setTagList(tagModelList);


        List<TagModel> processList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            processList.add(new TagModel("流程" + i));
        }
     /*   processList.add(new TagModel("待处理"));
        processList.add(new TagModel("进行"));
        processList.add(new TagModel("已完"));*/
        mProcesslist.setTagList(processList);

    }


}
