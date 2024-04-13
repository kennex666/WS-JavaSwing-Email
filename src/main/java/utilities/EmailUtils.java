/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author duong
 */
public class EmailUtils {
    private static String host = "smtp.gmail.com"
            , user = "PLACE_YOUR_USER"
            , email = "PLACE_YOUR_EMAIL"
            , password = "PLACE_YOUR_APP_PASSWORD" // How to get app password: https://support.google.com/mail/answer/185833?hl=en
            , port = "465"
            , name = "PLACE_YOUR_NAME";
    
    public static void sendEmail(String toEmail, String subject, String body) throws Exception {

        MimeMessage msg = new MimeMessage(createSession());
        //set message headers
        msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
        msg.addHeader("format", "flowed");
        msg.addHeader("Content-Transfer-Encoding", "8bit");

        msg.setFrom(new InternetAddress(email, name));

//          msg.setReplyTo(InternetAddress.parse(, false));
        msg.setSubject(subject, "UTF-8");

        msg.setText(body, "UTF-8");

        msg.setSentDate(new Date());

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
        Transport.send(msg);

    }

    public static Session createSession() {
        Properties props = new Properties();

        props.put("mail.smtp.host", host); //SMTP Host
        props.put("mail.smtp.socketFactory.port", port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.prot", port);

        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user ,  password);
            }
        };
        Session session = Session.getInstance(props, auth);
        return session;
    }

}
