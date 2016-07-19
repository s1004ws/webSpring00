<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h2><a href="/webApp/aLink?num=100&name=김길동">A태그로 링크걸기</a></h2>
<h2>
	폼데이타전송<br/>
	<form method="post" action="/webApp/formData"> <!-- Post방식은 한글이 깨진다  -->
		이름 : <input type="text" name="name"/><br/>
		번호 : <input type="text" name="num"/><br/>
		연락처 : <input type="text" name="tel"/><br/>
		<input type="submit" value="전송"/>
	</form>
</h2>
<img src="/webApp/resources/aaa.jpg"/>
<img src="/webApp/resources/img/bbb.jpg"/>
<img src="/webApp/imglist/ccc.jpg"/>
</body>
</html>
