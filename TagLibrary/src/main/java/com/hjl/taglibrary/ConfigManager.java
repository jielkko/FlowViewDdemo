package com.hjl.taglibrary;

import android.graphics.Color;

public class ConfigManager {

    private static int lineColor = Color.parseColor("#cccccc");
    private static int bgColor = Color.parseColor("#eeeeee");
    private static int textColor = Color.parseColor("#848484");
    private static int iconColor = Color.parseColor("#cccccc");

    private static ConfigManager mInstance;

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        if (mInstance == null) {
            synchronized (ConfigManager.class) {
                if (mInstance == null) {
                    mInstance = new ConfigManager();
                }
            }
        }
        return mInstance;
    }

    public static int getLineColor() {
        return lineColor;
    }

    public static void setLineColor(int lineColor) {
        ConfigManager.lineColor = lineColor;
    }

    public static int getBgColor() {
        return bgColor;
    }

    public static void setBgColor(int bgColor) {
        ConfigManager.bgColor = bgColor;
    }

    public static int getTextColor() {
        return textColor;
    }

    public static void setTextColor(int textColor) {
        ConfigManager.textColor = textColor;
    }

    public static int getIconColor() {
        return iconColor;
    }

    public static void setIconColor(int iconColor) {
        ConfigManager.iconColor = iconColor;
    }

    public static ConfigManager getmInstance() {
        return mInstance;
    }

    public static void setmInstance(ConfigManager mInstance) {
        ConfigManager.mInstance = mInstance;
    }
}
