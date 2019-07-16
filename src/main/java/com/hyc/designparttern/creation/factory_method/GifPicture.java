package com.hyc.designparttern.creation.factory_method;

public  class GifPicture extends Picture {
    @Override
    public void read() {
        System.out.println("读取gif图片");
    }
}
