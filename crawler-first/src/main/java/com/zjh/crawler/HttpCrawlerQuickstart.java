package com.zjh.crawler;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/9/7/007 12:31
 */
public class HttpCrawlerQuickstart {
    public static void main(String[] args) throws IOException {
        //模拟打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //模拟输入网址
        HttpGet httpGet = new HttpGet("http://www.itcast.cn");
        //发起请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //创建输出流
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\12539\\Desktop\\1.html");
        //解析数据
        if(response.getStatusLine().getStatusCode() == 200){
            HttpEntity entity = response.getEntity();//响应的数据
            String content = EntityUtils.toString(entity,"utf-8");
            byte[] contentBytes = content.getBytes("utf-8");

            outputStream.write(contentBytes);
            FileDescriptor fd = outputStream.getFD();
            System.out.println("fd = " + fd);

        }
    }
}
