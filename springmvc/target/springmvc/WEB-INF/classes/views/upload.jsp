<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>SpringMVC upload</title>
</head>
<body>
<div class="upload">
   <form action="upload" enctype="multipart/form-data" method="post">
       <input type="file" name="flie"></input>
       <input type="submit" value="上传"></input>
   </form>
</div>
</body>
</html>