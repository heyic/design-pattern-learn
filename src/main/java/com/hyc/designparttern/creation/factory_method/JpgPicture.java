package com.hyc.designparttern.creation.factory_method;

public class JpgPicture extends Picture {
    @Override
    public void read() {
        System.out.println("读取jpg图片");
    }
}
