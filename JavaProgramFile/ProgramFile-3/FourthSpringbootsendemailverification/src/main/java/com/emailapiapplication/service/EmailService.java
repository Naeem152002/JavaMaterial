package com.emailapiapplication.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
	public  boolean  sendEmail(String subject,String message,String to) {
		String from="naeemkuraishi00786@gmail.com";
		boolean check=false;
		//Variable for gmail
				String host="smtp.gmail.com";//simple mail transfer protocol
				
				//get the system properties
				Properties properties = System.getProperties();
				System.out.println("PROPERTIES "+properties);
				
				//setting important information to properties object
				
				//host set
				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port","465");
				properties.put("mail.smtp.ssl.enable","true");//security socket layer
				properties.put("mail.smtp.auth","true");
				
				//Step 1: to get the session object..
				Session session=Session.getInstance(properties, new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {				
						return new PasswordAuthentication("naeemkuraishi00786@gmail.com", "zzfw zeal krdg tyrn");
					}
					
					
					
				});
				
				session.setDebug(true);
				
				//Step 2 : compose the message [text,multi media]
				MimeMessage m = new MimeMessage(session);
				
				try {
				
				//from email
				m.setFrom(from);			//adding recipient to message
				m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				
				//adding subject to message
				m.setSubject(subject);
				
				m.setText(message);
				
				Transport.send(m);
				
				check=true;
				System.out.println("Sent success...................");
				}catch (Exception e) {
					e.printStackTrace();
				}
				return check;
			}

	
	}


