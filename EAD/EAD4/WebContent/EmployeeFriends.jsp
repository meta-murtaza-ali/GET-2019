<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@page import = "Employee.FriendsDetail" session="false" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <style>
        body {
            background-color: #e4d7f7;
        }

        table,
        thead th {
            background-color: #d3bcf5;
            text-align: center;
            border-spacing: 10px;
            border-collapse: collapse;
            padding: 15px;
        }

        table td {
            background-color: rgb(226, 202, 202);
            text-align: center;
            border-spacing: 10px;
        }

        table tr.even {
            background-color: #fde9d9;
        }

        input[type=submit] {
            background-color: #008CBA;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }
    </style>
</head>

<body>
    <br>
    <br>
    <h1 align="center">
        <font color="#314c54">Enrolled Students List</font>
    </h1>
    <br>
    <br>
    <div class="studentDetails" align="center">
        <table>
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Edit Here</th>
                </tr>
            </thead>
            <%
				ArrayList<FriendsDetail> li = (ArrayList<FriendsDetail>) (request.getSession().getAttribute(("friendData")));	
				for (FriendsDetail s : li) {
						 
			%>
            <form method='POST' action='friendprofile'>
                <tr>
                    <td>
                        <%
									out.print(s.getFirstName());
								%>
                    </td>
                    <td>
                        <%
								out.print(s.getLastName());
							%>
                    </td>

                    <td><input type='hidden' name='emp_id' value=<%=s.getEmployee_id()%>></td>
                    <td><input type='submit' value='Edit'></td>
                </tr>
            </form>
            <%
				}
			
			%>
        </table>
    </div>
</body>

</html>