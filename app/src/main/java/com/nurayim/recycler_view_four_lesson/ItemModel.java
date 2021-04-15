package com.nurayim.recycler_view_four_lesson;

public class ItemModel {

    String number;
    String title;
    String desc;
    String data;


    public ItemModel(String number, String title, String desc, String data) {
        this.number = number;
        this.title = title;
        this.desc = desc;
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
