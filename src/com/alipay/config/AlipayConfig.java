package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000117690223";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCp6dSbGe0go/5aLuomG6b48OKGHLa0dWt6+Pxh5Y03Zyd5BaUHfY8ZyNwBvknXnIe9DZnOp+7S+1pFN6SeUIN8IoInAswTH6QSYH9c17BqMTyfDuC2Zmn8lDQ4DC9h4gHrCOX5rPRMZR8XSvcUGMiL3Ac7cSYrUR+vt10wBvddC2JXPBvJK6RVHmpPdZEbO3HSk/M8n/CKQGTv2s+By46q5Og3dXy+eyg3JXyrhtqQuAaGHwVtji7PI0t9aaWgg54io31xIylIve0yk42+oCRBmPWoW4zqd9mqfWpIYZVjTose2eSuv6m8ua+R38tdkOsJsCQ5LqWSsCkUHLnJ+TC9AgMBAAECggEANMPowkHK4dgLpPXswOjVcXlc30kLc/8C4a1wsvYWZJ4kI/EczravOdKmf+QYCl0RyiPvH74G7H4iCly9Qmy+aE5PHM5Bka7BxPMymiJhJpkjukFkh0BGqalcjgs6q6sD7XlV8bNEKnU8sn8VO6h2nvg1RsBcmhcXP/oxdjizmLDt4CxPJD/CEurF5idYbJdCOQ4mZnDUBDdM7cLjKpMRztGfnYeuG2owZOJ/dvqIUBIcPGDuIePyMpiEnm65hpOjuS+MqMAT720VOEfxHQPMAO4o0JB1zSxZTmilR49OIM1e9wVfspSyU4LKhrMLV6AXou/wjZMReuiF8cQPbIzQAQKBgQDrMVsnPTpFjX9IlKrvRqlIOuUSve2wstTR9gmfVJiSYGlH/F5qcTjNHr+Bpcpy4g7L3FPdm/bFSikrVSq/YXbKx9kVfn9dIofKpxzszC5z3NPFc4HalpZYLxEQQQlqCebXlrzTpEodbpBvzxwJuc4qZc84bZNJjjG95xy3QEvzmQKBgQC48gcAafGxdo3p+DW4HtbOazNPu5Ykm7Sdx7TMlfnfsEa2+82q0PqPO5UFKtfI9SvkV7dM0I8b8+/FTW+0eAqu94eD0XksJ88IUFRL9DGTWmDW3S/BQCFsngPaOjR5ox9AW2E1XlQT2ZGGe/PU04Qrq9VnzSvf3e2AlLkm9TIcxQKBgGonYMkZLY/vCaAs2eodrpJXYsVOzFWQodYSgs1TVXnb4ikHk2XfrI+IbU+LERFBTwRccc34cy0hB+vzCNRQnVlxUl4NNldHGpsxSjDnB6Br73mTZOzQQxOSStVXRXSC+5obAydTY9Bc8vxEMpeBMbiZMyp46p2sfG8GPUPI1X8hAoGARf/tIH346cdKfWThyDd77BLtD9+bO23nldRxnQGi2sRYb4es11tTioTtqVAG7lvFah69FQjXMahJdy8Q+Yh52rF7jCvrpgfHN4lX7ouVfAU4I/sByS4huH+yS5W+KM/R00UC7PUv83dkujcOGd6Y5wKZujkQwyG3c/RWg+VIO1UCgYB0THe1eH3LGYM0hc9vjkODELifRoQuB8JpFXXkKyMDoBpJms60fI4/QeTUFuRPKFDl9x85UcNMDFbdRcPMeFwMhjq7tUDxwtNO1G3/4X8V/tmrdTJq4r6HycxCPzw4k3jhmkkSuHFZcZui8PulpFznGA8sFvDNbHhjotLiayNung==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqenUmxntIKP+Wi7qJhum+PDihhy2tHVrevj8YeWNN2cneQWlB32PGcjcAb5J15yHvQ2Zzqfu0vtaRTeknlCDfCKCJwLMEx+kEmB/XNewajE8nw7gtmZp/JQ0OAwvYeIB6wjl+az0TGUfF0r3FBjIi9wHO3EmK1Efr7ddMAb3XQtiVzwbySukVR5qT3WRGztx0pPzPJ/wikBk79rPgcuOquToN3V8vnsoNyV8q4bakLgGhh8FbY4uzyNLfWmloIOeIqN9cSMpSL3tMpONvqAkQZj1qFuM6nfZqn1qSGGVY06LHtnkrr+pvLmvkd/LXZDrCbAkOS6lkrApFBy5yfkwvQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/demo/succeed.action";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/demo/succeed.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\desktop";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

