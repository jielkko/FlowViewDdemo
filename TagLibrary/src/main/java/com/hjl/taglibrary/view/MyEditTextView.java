package com.hjl.taglibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjl.taglibrary.R;


public class MyEditTextView extends LinearLayout {
    private static final String TAG = "CustomerEditText";
    private Context mContext;

    public MyEditTextView(Context context) {
        super(context);
    }

    public MyEditTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init(attrs);
    }

    public MyEditTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    private TextView mInputTitle;
    private EditText mInputContent;




    private void init(AttributeSet attrs) {
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT); //第一个参数是宽,第二个参数是高
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(R.layout.view_my_edittext, null);
        view.setLayoutParams(lp);
        addView(view);



        mInputTitle = (TextView) findViewById(R.id.input_title);
        mInputContent = (EditText) findViewById(R.id.input_content);

        TypedArray array = mContext.obtainStyledAttributes(attrs, R.styleable.customer);


        mInputTitle.setText(array.getString(R.styleable.customer_mTitle));
        mInputContent.setText(array.getString(R.styleable.customer_mContent));
        mInputContent.setHint(array.getString(R.styleable.customer_mHint));
        //是否只读 true 只读  false  可以输入
        boolean mIsEnabled = array.getBoolean(R.styleable.customer_mIsEnabled, false);
        mInputContent.setEnabled(mIsEnabled);

        //<!--是否必选 true 必选  false  可选   app:mInputType="phone"   app:mInputType="number"-->
        String mInputType = array.getString(R.styleable.customer_mInputType);
        if (mInputType != null) {
            if (mInputType.equals("number")) {
                mInputContent.setInputType(InputType.TYPE_CLASS_NUMBER);
            }
            if (mInputType.equals("number.")) {
                mInputContent.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

                //设置字符过滤
                mInputContent.setFilters(new InputFilter[]{new InputFilter() {
                    @Override
                    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                        if(source.equals(".") && dest.toString().length() == 0){
                            return "0.";
                        }
                        if(dest.toString().contains(".")){
                            int index = dest.toString().indexOf(".");
                            int length = dest.toString().substring(index).length();
                            if(length == 3){
                                return "";
                            }
                        }
                        return null;
                    }
                }});
            }

            if (mInputType.equals("phone")) {
                mInputContent.setInputType(InputType.TYPE_CLASS_PHONE);
            }
        }

        if (array.getInt(R.styleable.customer_mMaxLength, 0) == 0) {

        } else {
            InputFilter[] filters = {new InputFilter.LengthFilter(array.getInt(R.styleable.customer_mMaxLength, 0))};
            mInputContent.setFilters(filters);
        }



        array.recycle();


    }

    public void setText(String text) {
        mInputContent.setText(text);
    }

    public String getText() {
        return mInputContent.getText().toString();
    }

}
