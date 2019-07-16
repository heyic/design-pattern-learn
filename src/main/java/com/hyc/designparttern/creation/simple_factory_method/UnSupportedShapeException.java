package com.hyc.designparttern.creation.simple_factory_method;

public class UnSupportedShapeException extends Exception{
    public UnSupportedShapeException() {
        super();
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }

    public UnSupportedShapeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupportedShapeException(Throwable cause) {
        super(cause);
    }

    protected UnSupportedShapeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
