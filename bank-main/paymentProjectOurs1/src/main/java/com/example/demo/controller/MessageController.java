package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Message;
import com.example.demo.repository.MessageCodeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageCodeRepository messageCodeRepo;


	@GetMapping
	public List<Message> getMessage() {
		return messageCodeRepo.findAll();
	}
	@GetMapping("{ele}")
	public Message getMessage(@PathVariable String ele) {
		return messageCodeRepo.findById(ele).orElseThrow(RuntimeException::new);
	}

//	@GetMapping("/{element}")
//	public ResponseEntity getMessage(@PathVariable String element) {
//		MessageCode message = msgCode.findById(element).orElseThrow(RuntimeException::new);
////		System.out.println(message.getInstruction());
//		return ResponseEntity.ok(message);
//	}

}
