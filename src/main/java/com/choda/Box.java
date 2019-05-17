package com.choda;

public class Box {
    float length;
    float width;
    int height;
    public Box(float length,float width,int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length,float width,int height){
        do{
            if(length-width<0){
                float p = length;
                length = width;
                width = p;
            }else if (width-height<0){
                float p = width;
                width = height;
                height = (int) Math.ceil(p);
            }
        }while(length-width<0 || width-height<0);
        return (this.length>=length && this.width>=width && this.height>=height)? true:false;
    }

}
