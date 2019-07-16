package com.hyc.designparttern.creation.factory_method;

public class GifPictureFactory extends PictureFactory{


    @Override
    public Picture getPicture() {
        System.out.println("创建gif图片类");
        return new GifPicture();
    }


}
