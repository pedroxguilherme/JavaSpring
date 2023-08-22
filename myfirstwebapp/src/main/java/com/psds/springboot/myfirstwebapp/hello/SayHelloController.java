package com.psds.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	
	

@RequestMapping("say-hello")
@ResponseBody
public String Sayhello() {
	return "Hello World without html";
	
}	
@RequestMapping("say-hello-html")
@ResponseBody	
public String HelloHtml() {
	
	StringBuffer sb = new StringBuffer();
	sb.append("<html>");
	sb.append("<head>");
	sb.append("<title> My first Html web</title>");
	sb.append("<head>");
	sb.append("<body>");
	sb.append("<p>My first Html web</p>");
	sb.append("</body>");
	sb.append("</html>");
	
	
	return sb.toString();
}

@RequestMapping("say-hello-jsp")
public String HelloJsp() {
	
	
	return "sayHello";
}	
	
	
	

}
