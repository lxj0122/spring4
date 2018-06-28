<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>@ControllerAdvice Demo</title>
</head>
<br>
     ${errorMessage}
     <br><%=request.getAttribute("errorMessage")%></br>
     <br>${requestScope.get("errorMessage")}</br>
     <br>${requestScope.errorMessage}</br>
</body>
</html>