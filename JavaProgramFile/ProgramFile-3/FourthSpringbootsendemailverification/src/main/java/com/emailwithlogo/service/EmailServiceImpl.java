package com.emailwithlogo.service;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl implements EmailService {

	@Override
	public boolean sendEmail(String to, String subject, String message) {
		String from="naeemkuraishi00786@gmail.com";
		
		String host="smtp.gmail.com";
		
		boolean check=false;
		
		
		Properties p=System.getProperties();
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", "true");
		
		//step 1
		Session session=Session.getInstance(p,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("naeemkuraishi00786@gmail.com", "zzfw zeal krdg tyrn");
			}
			
			
		});
		session.setDebug(true);
		//step 2
		MimeMessage m=new MimeMessage(session);
		
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			//m.setText(message);
			
		String path="C:\\Users\\naeem\\OneDrive\\Desktop\\JavaNotes\\JavaNotes\\image.png";
			
			MimeMultipart mimeMultiPart=new MimeMultipart();
			
			MimeBodyPart textMime=new MimeBodyPart();
			MimeBodyPart fileMime=new MimeBodyPart();
			
			
			File f=new File(path); 
			textMime.setText(message);
			fileMime.attachFile(f);
			mimeMultiPart.addBodyPart(textMime);
			mimeMultiPart.addBodyPart(fileMime);
			m.setContent(mimeMultiPart);
			//Step 3 
			Transport.send(m);
			check=true;
			System.out.println("sent sucess");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return check;
	}

}
