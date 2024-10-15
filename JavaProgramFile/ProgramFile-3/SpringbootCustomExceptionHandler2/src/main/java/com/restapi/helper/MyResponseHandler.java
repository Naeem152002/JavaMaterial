package com.restapi.helper;

import java.util.Date;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.restapi.entities.UserEntity;

public class MyResponseHandler {

	public static ResponseEntity<Object> getHandler(HttpStatus status, boolean error, String msg, Object obj) {
		HashMap<String, Object> hm = new HashMap();
		
		try {
			
			hm.put("timestamp", new Date());
			hm.put("status", status.value());
			hm.put("isSuccess", error);
			hm.put("message", msg);
			hm.put("data", obj);
			return new ResponseEntity<Object>(hm, status);
		} catch (Exception e) {
			// TODO: handle exception
			    hm.clear();
			    hm.put("timestamp", new Date());
				hm.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
				hm.put("isSuccess", false);
				hm.put("message", e.getMessage());
				hm.put("data", obj);
			return new ResponseEntity<Object>(hm, status);

		}

	}

	

}
