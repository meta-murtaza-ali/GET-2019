<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"
	import="Employee.FriendsDetail"%>
<%
	FriendsDetail data = (FriendsDetail) request.getSession()
			.getAttribute("frienddetails");
%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>EmployeeFriendProfile</title>
    <style>
        body {
            background-color: lightblue;
        }

        a:link {
            color: maroon;
        }

        a:visited {
            color: green;
        }

        a:hover {
            color: red;
        }

        a:active {
            color: yellow;
        }

        table {
            background-color: #d1ede7;
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>

<body>
    <table align="center">

        <nav>
            <a href="logout">Log Out</a>
        </nav>
        <form>
            <tr>
                <td>First Name</td>
                <td><%=data.getFirstName()%></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><%=data.getLastName()%></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><%=data.getGender()%></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><%=data.getEmail()%></td>
            </tr>
            <tr>
                <td>Contact Number</td>
                <td><%=data.getContactNumber()%></td>
            </tr>
            <tr>
                <td>Organization</td>
                <td><%=data.getOrganization()%></td>
            </tr>
        </form>
    </table>
</body>

</html>