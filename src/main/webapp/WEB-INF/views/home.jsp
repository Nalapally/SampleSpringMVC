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
<table>
<tr>
<td>Id</td>
<td>Name</td>
</tr>
<c:forEach items="${person}" var="per">
  <tr>
  <td>${per.id}</td>
  <td>${per.name}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>
