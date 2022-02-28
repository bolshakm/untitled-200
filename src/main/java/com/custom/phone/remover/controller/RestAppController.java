package com.custom.phone.remover.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api")
public class RestAppController {

	@GetMapping("/action/{param}")
	public ResponseEntity action(@PathVariable String param){

		log.error("test param:{}", param);
		return ResponseEntity.ok().build();
	}
}
