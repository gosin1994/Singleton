package com.laosiji.thread;

import java.io.IOException;
import java.sql.DataTruncation;

/**
 * @Author: Gosin
 * @Date: 2017/12/9
 * Runtime 应用了单例模式
 */
public class Demo2_Runtime {
    public static void main(String[] args) throws IOException {

        Runtime r = Runtime.getRuntime();
       // r.exec("shutdown -s -t 300");
        r.exec("shutdown -a");
    }

}
