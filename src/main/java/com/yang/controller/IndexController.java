package com.yang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**    
 * Description: TODO
 * @author yangtiao  
 */
@RestController
public class IndexController {

	@RequestMapping("index")
	public String index() {
		System.out.println("into controller index...");
		return "Hello World!";
	}
	
}
  
