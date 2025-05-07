<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Register</title></head>
<body>
<h2>Register</h2>
<form:form modelAttribute="user" method="post">
Name: <form:input path="name"/>
<form:errors path="name" cssClass="error"/><br/>
Email: <form:input path="email"/>
<form:errors path="email" cssClass="error"/><br/>
Password: <form:password path="password"/>
<form:errors path="password" cssClass="error"/><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>