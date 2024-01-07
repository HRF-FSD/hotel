package com.test.hoteltest;


import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailService {

    public void sendEmail(String toAddress, String subject, String messageBody) {
        String fromAddress = "harafaymen@gmail.com";
        String username = "harafaymen@gmail.com";
        String password = "azer+123";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.example.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); //  TLS

        Session session = Session.getInstance(properties,
                new jakarta.mail.Authenticator() {
                    protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new jakarta.mail.PasswordAuthentication(username, password);
                    }
                });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromAddress));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject(subject);
            message.setText(messageBody);

            Transport.send(message);

            System.out.println("E-mail envoyé avec succès");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'envoi de l'e-mail");
        }
    }
}
