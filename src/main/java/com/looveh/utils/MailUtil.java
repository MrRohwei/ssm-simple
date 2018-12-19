package com.looveh.utils;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @Author Looveh
 * @Date 2018/11/10/010 19:49
 * @Version 1.0
 * @Desc 邮件工具类
 **/
public class MailUtil {

    private static final String FROM = "965556351@qq.com";
    private static final String TO = "1203182685@qq.com";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws MessagingException {
        Properties prop = new Properties();
        prop.setProperty("mail.transport.protocol", "smtp");//连接协议
        prop.setProperty("mail.smtp.host", "smtp.qq.com");//主机名
        prop.setProperty("mail.smtp.port", "465");//端口
        prop.setProperty("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
        prop.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        //得到回话对象
        Session session = Session.getInstance(prop);
        //获取邮件对象
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(FROM));//发送人地址
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(TO));//收件人地址
        message.setSubject("注册认证");//设置标题
        message.setText("您正在139.224.112.141注册，验证码为：123456");//设置邮件内容
        Transport transport = session.getTransport();//得到邮差对象
//        transport.connect(FROM,PASSWORD);//连接账户
        transport.connect(FROM,"mxlvpywxmzhvbbah");
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();

    }


}
