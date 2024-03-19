/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.util;

import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import sellada.pojo.SellerPojo;


class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth;
        pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}



public class Mailer {
    private static Properties prop;

    static {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    }

    public static void sendMail(Map<String, String> emailCredentials, SellerPojo seller) throws MessagingException {
        final String username = emailCredentials.get("email");
        final String password = emailCredentials.get("secKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(seller.getCompanyMail()));

        String emailSubject = "Seller Details";

        String emailBody = "Dear " + seller.getSellerName() + ",\n"
                + "\n"
                + "I hope this email finds you well. I am writing to provide you with the necessary credentials as requested. Please find the information below:\n"
                + "\n"
                + "Company Name: " + seller.getCompanyName() + "\n"
                + "Email ID: " + seller.getCompanyMail() + "\n"
                + "Staff password: " + seller.getPassword() + "\n"
                + "Contant Number: " + seller.getMobileNo() +"\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n"
                + "\n"
                + seller.getSellerName();

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);

    }
}
