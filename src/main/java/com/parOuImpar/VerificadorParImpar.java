package com.parOuImpar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")

public class VerificadorParImpar {
	
	
	  @GetMapping
	    public ResponseEntity getNumber(@RequestParam(value="numberUser", required = false) String numberParam) {
		  try {
			int number = Integer.parseInt(numberParam);
		  	
		  	if (number % 2 == 0) {
		  		System.out.println("O número recebido ->" + number + "é PAR");
		  	}else {
		  		System.out.println("O número recebido ->" + number + "é IMPAR");	  		
		  	}
	        return new ResponseEntity(HttpStatus.OK);  
		  } catch (IllegalArgumentException e) {
			  return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);  
		  }
		  	
	    }
}
