package com.custom.phone.remover.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Service
public class AppService {

	@Autowired
	private RestTemplate standardRestTemplate;

	public void doGet() {

	}


	private void doPost() {

	}
}
