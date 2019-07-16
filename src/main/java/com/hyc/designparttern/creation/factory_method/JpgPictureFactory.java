package com.hyc.designparttern.creation.factory_method;

public class JpgPictureFactory extends PictureFactory{

    @Override
    public Picture getPicture() {
        System.out.println("创建jpa图片类");
        return new JpgPicture();
    }
}
