<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="c" items="${coffee}">
	${c.name} / ${c.size} / ${c.price} <br/>
</c:forEach>
