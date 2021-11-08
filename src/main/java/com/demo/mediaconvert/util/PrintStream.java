package com.demo.mediaconvert.util;

public class PrintStream extends Thread {

    java.io.InputStream __is = null;

    public PrintStream(java.io.InputStream is) {
        __is = is;
    }

    @Override
    public void run() {
        try {
            while (this != null) {
                int _ch = __is.read();
                if (_ch != -1) {
                    System.out.print((char) _ch);
                } else {
                    break;
                }
            }
            __is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}