package com.hjl.taglibrary;

import android.graphics.Color;

public class TagConfig {

    private static TagConfig mInstance;

    private TagConfig() {
    }

    public static TagConfig getInstance() {
        if (mInstance == null) {
            synchronized (TagConfig.class) {
                if (mInstance == null) {
                    mInstance = new TagConfig();
                }
            }
        }
        return mInstance;
    }

    /**
     * 设置边框颜色
     * @param lineColor
     * @return
     */
    public TagConfig setLineColor(int lineColor) {
        ConfigManager.getInstance().setLineColor(lineColor);
        return mInstance;
    }

    /**
     * 设置背景颜色
     * @param bgColor
     * @return
     */
    public TagConfig setBgColor(int bgColor) {
        ConfigManager.getInstance().setBgColor(bgColor);
        return mInstance;
    }

    /**
     * 设置文字颜色
     * @param textColor
     * @return
     */
    public TagConfig setTextColor(int textColor) {
        ConfigManager.getInstance().setTextColor(textColor);
        return mInstance;
    }

    /**
     * 设置右方箭头颜色
     * @param iconColor
     * @return
     */
    public TagConfig setIconColor(int iconColor) {
        ConfigManager.getInstance().setIconColor(iconColor);
        return mInstance;
    }

}
