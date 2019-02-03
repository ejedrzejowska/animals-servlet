<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.ewa.animal.model.Species" %>

<html>
<body>
<h2>Add animal!</h2>

<form name="new-animal-form" method="post" action="/animals/">
    Animal name <input type="text" name="name"/></br>
    Animal age <input type="text" name="age"></br>
    Animal picture <input type="text" name="pictureUrl"></br>
    <select name="species">
        <c:forEach var="species" items="${Species.values()}">
            <option value="${species}"><c:out value="${species}"/></option>
        </c:forEach>
    </select></br>
    <input type="submit" value="Add new animal"/>

</form>
</body>
</html>