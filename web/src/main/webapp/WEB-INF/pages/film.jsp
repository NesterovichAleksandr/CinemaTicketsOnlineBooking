<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>film</title>
</head>
<body>

<table>
    <div class="row">
        <div class=col-md-2><b>Name</b></div>
        <div class=col-md-1><b>Country</b></div>
        <div class=col-md-3><b>Genre</b></div>
        <div class=col-md-1><b>Year of issue</b></div>
        <div class=col-md-1><b>Duration</b></div>
    </div>
    <c:forEach items="${films}" var="film">
        <form class="form-horizontal">
            <%--<fieldset>--%>
                <tr>
                    <div class="row">
                            <%--<input type="hidden" name="filmId" value="${film.id}"/>--%>
                        <div class=col-md-2>${film.name}</div>
                            <%--<input type="hidden" name="filmIdName" value="${film.name}"/>--%>
                        <div class=col-md-1>${film.country}</div>
                            <%--<input type="hidden" name="filmIdCountry" value="${film.country}"/>--%>
                        <div class=col-md-3>${film.genre}</div>
                            <%--<input type="hidden" name="filmIdGenre" value="${film.genre}"/>--%>
                        <div class=col-md-1>${film.yearOfIssue}</div>
                            <%--<input type="hidden" name="filmIdYearOfIssue" value="${film.yearOfIssue}"/>--%>
                        <div class=col-md-1>${film.duration}</div>
                            <%--<input type="hidden" name="filmIdDuration" value="${film.duration}"/>--%>

                    </div>
                </tr>
            <%--</fieldset>--%>
        </form>
    </c:forEach>
</table>

</body>
</html>