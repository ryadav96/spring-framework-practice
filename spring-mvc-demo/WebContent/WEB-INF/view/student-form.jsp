<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>
    <form:form action = "processForm" modelAttribute = "student">
    First name: <form:input path = "firstName"/>
    <br><br>
     Last name: <form:input path = "lastName"/>
    <br><br>
    Country:
    <form:select path ="country">
      <form:options items = "${student.countryOptions}"/>
    </form:select>
    <br><br>
    Favorite Language:
    Java <form:radiobutton path = "language" value = "Java" />
    JavaScript <form:radiobutton path ="language" value = "JavaScript" />
    C# <form:radiobutton path ="language" value = "C#" />
    C++ <form:radiobutton path ="language" value = "C++" />
    
        <br><br>
     <input type ="submit" value ="submit"/>
    </form:form>



</body>

</html>