package poly.controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

	@RequestMapping(value="login" ,method=RequestMethod.GET)
	public String showForm() {
		return "user/login";
	}

	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(ModelMap model,
						@RequestParam("email")String email,
						@RequestParam("pass")String pass) {
		
		String[] temp=email.split("@");
		email=temp[0];
		
		
		String dbURL = "jdbc:sqlserver://localhost;databaseName=WEB;user=sa;password=123456";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn=DriverManager.getConnection(dbURL);
			if(conn!=null) {
				
				String sql="select * from USERS where email=? and pass=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1,email);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					
					model.addAttribute("uid",rs.getString("email"));
					
					model.addAttribute("pwd",rs.getString("pass"));
					return "user/info";
				}
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		model.addAttribute("uid","Sai thong tin dang nhap");
		return "user/info";
	}
	
}
