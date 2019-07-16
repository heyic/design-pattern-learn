package com.hyc.designparttern.creation.factory_method;

public class TestCase {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Picture picture = null;
        PictureFactory factory = (PictureFactory)Class.forName("com.hyc.designparttern.creation.factory_method.JpgPictureFactory").newInstance();
        factory.read();
    }
}
