package com.sky.demo.decorator_pattern.jdk;

import org.junit.Test;

import java.io.*;

/**
 * Created by user on 17/5/17.
 */
public class InputStreamTest {


    @Test
    public void test_fullTransparent() throws FileNotFoundException {

        String path = "/User/user/1.txt";
        File inputfile = new File(path);

        //完全透明的装饰器模式，装饰后的类有着和抽象构件角色同样的接口方法
        InputStream inputStream0 = new FileInputStream(inputfile);
        InputStream inputStream1 = new BufferedInputStream(new FileInputStream(inputfile));
        InputStream inputStream2 = new DataInputStream(new BufferedInputStream(new FileInputStream(inputfile)));

    }


    @Test
    public void test_halfTransparent() throws FileNotFoundException {

        String path = "/User/user/1.txt";
        File inputfile = new File(path);

        //半透明的装饰器模式，允许装饰后的类中有属于自己的方法
        FileInputStream inputStream0 = new FileInputStream(inputfile);
        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(inputfile));
        DataInputStream inputStream2 = new DataInputStream(new BufferedInputStream(new FileInputStream(inputfile)));

    }

}
