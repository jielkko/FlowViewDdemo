package com.hjl.taglibrary.model;


public class TagModel {

    private String title;  //标题
    private int lineWidth;  //边框宽度
    private int lineColor;  //边框宽度
    private int bgColor;  //背景颜色
    private int textColor;  //字体颜色
    private int iconColor;  //右方图标颜色

    public TagModel(){

    }

    public TagModel(String title){
       this.title = title;
    }

    public TagModel(String title,int lineColor,int bgColor,int textColor,int iconColor){
        this.title = title;
        this.lineColor = lineColor;
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.iconColor = iconColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public int getLineColor() {
        return lineColor;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getIconColor() {
        return iconColor;
    }

    public void setIconColor(int iconColor) {
        this.iconColor = iconColor;
    }
}
