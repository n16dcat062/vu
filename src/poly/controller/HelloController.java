package poly.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping(value="say-hello")
	public String Hello() {
		return "redirect:/login.htm";
	}

	
@RequestMapping(value="say-hello",params="mvc")
public String sayHello() {
	return "hello";
}

@RequestMapping(value="say-hello",params="abc")
public String sayHelloabc() {
	return "hello";
}

}
