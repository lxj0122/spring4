<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>SpringMVC convert</title>
</head>
<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"></input>
    <script type="text/javascript" src="../assets/js/jquery-3.3.1.min.js"></script>
    <script>
        function req(){
            $.ajax({
                url:"convert",
                data:"1-test",
                type:"POST",
                contentType:"application/x-test",
                success:function(data){
                    $("#resp").html(data);
                }
            });
        }
    </script>
</body>
</html>