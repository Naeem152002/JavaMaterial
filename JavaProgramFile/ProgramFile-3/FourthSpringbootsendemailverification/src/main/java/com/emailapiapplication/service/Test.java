package com.emailapiapplication.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class Test {
	
	public boolean sendEmail(String subject,String message,String to) {
		String from="naeemkuraishi00786@gmail.com";
		String host="smtp.gmail.com";
		boolean check=false;
		
		Properties p=System.getProperties();
		
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", true);
		
		Session s=Session.getInstance(p, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("naeemkuraishi00786@gmail.com", "zzfw zeal krdg tyrn");
			}
		
		});
		
		s.setDebug(true);
		
		MimeMessage m=new MimeMessage(s);
		
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			
			
			Transport.send(m);
			check=true;
			
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
		
}
}