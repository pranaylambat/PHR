/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.services;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Sendemail {

    public static void main(String[] args) {
        sucessRegistration("ashish.lokhande@majesco.com", "PHR - PROJECT - SECRET - SHARE - KEY");
    } 

    public static void send(String mailId, String key) {
        sucessRegistration(mailId, "KEY TO DOWNLOAD :- " + key);
    }

    public static void sucessRegistration(String toEmail, String messageBody) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("eewphr@gmail.com",
                                "james@phr007");
                    }
                });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("eewphr@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));
            message.setSubject("PHR-PROJECT");
            message.setText(messageBody);
            Transport.send(message);
            System.out.println("Sent");
        } catch (MessagingException e) {
            System.out.println("e = " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
