package poly.bean;

public class User {
String email;
String pass;
public User() {}
public User(String email,String pass) {
	this.email=email;
	this.pass=pass;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}


}

