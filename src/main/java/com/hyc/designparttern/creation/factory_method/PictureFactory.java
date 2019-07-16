package com.hyc.designparttern.creation.factory_method;

public abstract class PictureFactory {

    public abstract Picture getPicture();

    public void read(){
        this.getPicture().read();
    }
}
