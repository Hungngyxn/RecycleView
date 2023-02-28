package com.example.buoi5;

import java.io.Serializable;

public class ViewItem implements Serializable {
    private int imgId;
    private String title;
    private String text;

    public ViewItem(int imgId, String title, String text){
        this.imgId =imgId;
        this.title = title;
        this.text = text;
    }

    public int getImgId(){return imgId;}
    public String getTitle(){return title;}
    public String getText(){return text;}

}
