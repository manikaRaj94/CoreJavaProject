package com.javaproject.coding.expectionHandling;

import java.io.IOException;

public class ExceptionHandlingMainClass {


    public static void main(String[] args) {
        ExceptionHandlingClass exceptionHandlingClass = new ExceptionHandlingClass();
     //   exceptionHandlingClass.methodWthOutCatch(3,0);
        exceptionHandlingClass.methodWthOneCatchBlock(3,0);
        exceptionHandlingClass.methodWthMoreThanOneCatchBlock(3,0);
        exceptionHandlingClass.methodWthPipelineCatchBlock(3,0);
        try {
            exceptionHandlingClass.methodWithFinallyBlock();
        } catch (IOException e) {
           e.printStackTrace();
        }
        exceptionHandlingClass.methodWithTryWithResources();
        try {
            exceptionHandlingClass.methodWithTryWithThrow();
        } catch (IOException e) {
         //  e.printStackTrace();
        }
        try {
            exceptionHandlingClass.methodWithCustom();
        } catch (CustomException e) {
            //  e.printStackTrace();
        } catch (IOException e) {
            //  e.printStackTrace();
        }

        try {
            exceptionHandlingClass.methodWithCustom2(3,0);
        } catch (CustomException e) {
         //   e.printStackTrace();
        }
    }
}
