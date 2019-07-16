package com.hyc.designparttern.creation.simple_factory_method;

import org.springframework.util.StringUtils;

public class ShapesFactory {

    public static Shapes getShape(String type) throws UnSupportedShapeException {
        if(StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("type can not be null or empty");
        }
        if(type.equals("circle")){
            return new Circle();
        }else if(type.equals("square")){
            return new Square();
        }else if(type.equals("triangle")){
            return new Triangle();
        }else {
            throw new UnSupportedShapeException("Types are not supported, type is " + type);
        }
    }


}
