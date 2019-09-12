<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update.htm" modelAttribute="student">
<div>Ho va ten</div>	
<form:input path="name"/>
<div>Diem</div>
<form:input path="mark"/>
<div>Chuyen Nganh</div>
<form:radiobuttons path="major" items="${majors}" itemLabel="name" itemValue="id"/>
<br>
<button>Update</button>
</form:form>
</body>
</html>