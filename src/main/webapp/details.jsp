<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h2>Animal details!</h2>

<h4>Presenting details of ${animal.name}</h4>
<h5>${animal.name} is ${animal.age} years old (${animal.species})</h5>

<img src="${animal.pictureUrl}" style="max-width:100%;">

</body>
</html>
