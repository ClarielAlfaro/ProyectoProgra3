<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String fecha ="2021-05-27";
//yyyy-MM-dd
%>
<h2>Manejo directo desde java</h2>
<input type="date" value="<%=fecha%>">
<h2>Directo desde html</h2>
<input type="date" value="2021-05-27">

<h2>Manejo desde</h2>
<input type="date" id="mi fecha">

<script type="text/javascript">
  document.getElementById(mifecha).value = "2021-05-27";
</script>

</body>
</html>