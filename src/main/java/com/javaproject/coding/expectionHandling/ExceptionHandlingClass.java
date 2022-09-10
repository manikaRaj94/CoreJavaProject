package com.javaproject.coding.expectionHandling;


import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandlingClass {

    public void methodWthOutCatch(int input1, int input2) {
        int output = input1 / input2;
        System.out.println("methodWthOutCatch Output : " + output);

    }

    public void methodWthOneCatchBlock(int input1, int input2) {
        int output = 0;
        try {
            output = input1 / input2;
        } catch (Exception ex) {
            System.out.println("ex : " + ex);
        }
        System.out.println("methodWthOneCatchBlock Output : " + output);

    }

    public void methodWthMoreThanOneCatchBlock(int input1, int input2) {
        int output = 0;
        try {
            output = input1 / input2;
        } catch (ArithmeticException ex) {
            System.out.println("ex : " + ex);
        } catch (Exception ex) {
            System.out.println("ex : " + ex);
        }
        System.out.println(" methodWthMoreThanOneCatchBlock Output : " + output);

    }

    public void methodWthPipelineCatchBlock(int input1, int input2) {
        int output = 0;
        try {
            output = input1 / input2;
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("ex : " + ex);
        }
        System.out.println("methodWthPipelineCatchBlock Output : " + output);

    }

    public void methodWithFinallyBlock() throws IOException {
        System.out.println("Inside == methodWithFinallyBlock");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\sks88\\Desktop\\hello.txt");

            while (inputStream.read() != -1) {
             //   System.out.println(inputStream);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            inputStream.close();
        }
    }

    public void methodWithTryWithResources() {
        System.out.println("Inside == methodWithTryWithResources");
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\sks88\\Desktop\\hello.txt");) {

            while (inputStream.read() != -1) {
             //   System.out.println(inputStream);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void methodWithTryWithThrow() throws IOException {
        System.out.println("Inside == methodWithTryWithThrow");
        FileInputStream inputStream = new FileInputStream("C:\\Users\\sks88\\Desktop\\hello.txt");
        try {

            while (inputStream.read() != -1) {
              //  System.out.println(inputStream);
                throw  new IOException(new Exception());
            }
        }
        finally {
           inputStream.close();
        }

    }

    public void methodWithCustom() throws CustomException, IOException {
        System.out.println("Inside == methodWithCustom");
        FileInputStream inputStream = new FileInputStream("C:\\Users\\sks88\\Desktop\\hi.txt");
        try {

            while (inputStream.read() != -1) {
            //    System.out.println(inputStream);
            }
        }
            catch(Exception ex) {
                throw  new CustomException("customException",ex);
            }

        finally {
            inputStream.close();
        }

    }

    public void methodWithCustom2(int input1,int input2) throws CustomException {
        System.out.println("Inside == methodWithCustom2");
        int output = 0;
        try {
            output = input1 / input2;
        }
        // we just throw the exception  and get handle in main()
                catch (Exception ex) {
            throw  new CustomException("customException",ex);
        }
        finally {
            System.out.println(" methodWithCustom2 Output : " + output);
        }


    }




}
