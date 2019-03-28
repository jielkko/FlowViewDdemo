package com.hjl.taglibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjl.taglibrary.ConfigManager;
import com.hjl.taglibrary.R;
import com.hjl.taglibrary.TagConfig;


public class HotTagView extends LinearLayout {
    private static final String TAG = "热门标签";
    private Context mContext;

    public HotTagView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public HotTagView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initData(attrs);
    }

    public HotTagView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setText(String text) {
        mName.setText(text);
    }

    public void setTextColor(int color) {
        mName.setTextColor(color);
    }

    public void setLineColor(int color,int bgColor) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(5);
        drawable.setStroke(1, Color.parseColor("#cccccc"));
        drawable.setColor(Color.parseColor("#eeeeee"));
        mName.setBackgroundDrawable(drawable);
    }


    private TextView mName;

    private void initView() {
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT); //第一个参数是宽,第二个参数是高
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(R.layout.view_hot_tag, null);
        view.setLayoutParams(lp);
        addView(view);

        mName = (TextView) view.findViewById(R.id.name);


        //设置边框颜色
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(5);
        drawable.setStroke(1, ConfigManager.getInstance().getLineColor());
        drawable.setColor(ConfigManager.getInstance().getBgColor());
        mName.setBackgroundDrawable(drawable);

        //设置文字颜色
        mName.setTextColor(ConfigManager.getInstance().getTextColor());



    }

    private void initData(AttributeSet attrs) {
    /*    TypedArray array = mContext.obtainStyledAttributes(attrs, R.styleable.hottag);
        mName.setText(array.getString(R.styleable.hottag_mTitle));*/

    }


}
