package com.hjl.taglibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjl.taglibrary.R;
import com.hjl.taglibrary.model.TagModel;

import java.util.ArrayList;
import java.util.List;


public class HotTagLIstView extends LinearLayout {
    private static final String TAG = "热门标签";
    private Context mContext;

    public HotTagLIstView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public HotTagLIstView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initView();
        initData(attrs);
    }

    public HotTagLIstView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    private FlowLayout mContainer;





    private void initView() {
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT); //第一个参数是宽,第二个参数是高
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(R.layout.view_hot_tag_list, null);
        view.setLayoutParams(lp);
        addView(view);

        mContainer = (FlowLayout) view.findViewById(R.id.container);

    }

    private void initData(AttributeSet attrs) {


    }

    private void setHotTag(FlowLayout mFlowLayout,String text){
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT); //第一个参数是宽,第二个参数是高
        HotTagView tag1 = new HotTagView(mContext);
        tag1.setLayoutParams(lp);
        tag1.setText(text);//设置显示的字符
        //tag1.setTextColor(R.color.colorGray);//设置显示的字符
        //tag1.setLineColor(Color.parseColor("#cccccc"),Color.parseColor("#eeeeee"));//设置显示的字符
        mContainer.addView(tag1);
    }

    public void setTagList(List<TagModel> list){
        mContainer.removeAllViews();
        for(TagModel item :list){
            setHotTag(mContainer,item.getTitle());
        }


    }


}
