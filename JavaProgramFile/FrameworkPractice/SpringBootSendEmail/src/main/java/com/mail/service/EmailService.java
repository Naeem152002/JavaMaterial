package com.mail.service;

public interface EmailService {
	
	public boolean sendEmail(String to,String subject,String message);

}
