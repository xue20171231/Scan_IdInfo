package com.xue.utils;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * 身份证识别
 * @author Xuezg
 * @version 1.0
 * <url src="http://ai.baidu.com/docs#/OCR-Java-SDK/top">开发流程规范参考地址</url>
 */
public class IdUtil {

    /**
     * 设置APPID/AK/SK
     * 该三个变量的值，是需要去百度云里的文字识别里注册应用获取对应的值放进去
     * <url src="https://console.bce.baidu.com/ai/?fromai=1#/ai/ocr/app/create">文字识别应用注册地址</url>
     */
    public static final String APP_ID = "15178687";
    public static final String API_KEY = "Ypp17cj1dOenEtAudT0uMtud";
    public static final String SECRET_KEY = "h3uxXTbuyUZG4oSMh73NBhTwwpuB99nH";

    public static String getScanResult(String path){
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        return res.toString(2);
    }

    /**
     * 测试身份证识别入口
     * @param args
     */
    public static void main(String[] args) {
        // 调用接口
        String path = "E:\\myProjects\\ideaWorkspace\\myProjects\\Scan_Info\\web\\images\\id.png";
        String result = getScanResult(path);
        System.out.println(result);

    }
}
