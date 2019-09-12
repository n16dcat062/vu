package poly.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.bean.Major;
import poly.bean.Student;



@Controller
@RequestMapping("/student/")
public class StudentController {

//	@RequestMapping(value="/{name}",params = "lnkEdit")
//	public String edit(ModelMap model,@PathVariable("name") String name) {
//		return "student";
//	}
	
	
	@RequestMapping("edit")
	public String edit(ModelMap model) {
		Student sv=new Student("Nguyen Van Teo",9.0,"WEB");
		
		model.addAttribute("student",sv);
		return "/student/student";
	}
	
@RequestMapping("update")
public String update(@ModelAttribute("student")Student student) {
	return "/student/student";
}

//	@ModelAttribute("majors")
//	public String[] getMajors() {
//		String[] majors= {"Ung dung phan mem",
//				"Thiet ke trang web",
//				"an toan thong tin"};
//		return majors;
//	}
	//@ModelAttribute("majors")
	//public List<String> getMajors(){
	//	List<String> majors=new ArrayList<>();
	//	majors.add("Ung dung phan mem 123");
	//	majors.add("Thiet ke trang web");
	//	majors.add("An toan thong tin");
	//	return majors;
	//}

//@ModelAttribute("majors")
//public Map<String,String> getMajors(){
//	Map<String,String> majors =new HashMap<>();
//	majors.put("APP", "Ung dung phan mem");
//	majors.put("WEB", "Thiet ke web");
//	return majors;
//}


@ModelAttribute("majors")
public List<Major> getMajors(){
	List<Major> majors= new ArrayList<>();
	majors.add(new Major("APP","UNG DUNG PHAN MEM"));
	majors.add(new Major("WEB","THIET KE WEB"));
	return majors;
}
}
