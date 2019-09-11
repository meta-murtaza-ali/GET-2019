<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
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
    <script type="text/javascript">

        function checkFirstName() {
            var error_flag = 0;
            if ((document.getElementById('fname').value).length < 2) {
                document.getElementById('fname_error').innerHTML = "Name must be contain atleast two charcter.";
                error_flag = 1;
            } else if ((/^[A-Z]*[a-z]{2,}/
                .test(document.getElementById('fname').value)) == false) {
                document.getElementById('fname_error').innerHTML = "Name not contain any number.";
                error_flag = 1;
            } else {
                document.getElementById('fname_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }

        }
        function checkLastName() {
            var error_flag = 0;
            if ((document.getElementById('lname').value).length < 2) {
                document.getElementById('lname_error').innerHTML = "Name must be contain atleast two charcter";
                error_flag = 1;
            } else if ((/^[A-Z]*[a-z]{2,}/
                .test(document.getElementById('lname').value)) == false) {
                document.getElementById('lname_error').innerHTML = "Name not contain any number";
                error_flag = 1;
            } else {
                document.getElementById('lname_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkGender() {
            var error_flag = 0;
            if ((document.getElementById('m1').checked == false)
                && (document.getElementById('f1').checked == false)) {
                document.getElementById('gender_error').innerHTML = "Must be select one option.";
                error_flag = 1;
            } else {
                document.getElementById('gender_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkEmail() {
            var error_flag = 0;
            if (document.getElementById('email_id').value == "") {
                document.getElementById('email_error').innerHTML = "Enter  Email.";
                error_flag = 1;
            } else if ((/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/).test(document.getElementById('email_id').value)
                == false) {
                document.getElementById('email_error').innerHTML = "Enter Valid Email.";
                error_flag = 1;
            } else {
                document.getElementById('email_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkPassword() {
            var error_flag = 0;
            if ((document.getElementById('password').value) == "") {
                document.getElementById('pass_error').innerHTML = "Enter password.";
                error_flag = 1;
            } else if ((document.getElementById('password').value).length < 8) {
                document.getElementById('pass_error').innerHTML = "Password must contain atleast 8 character.";
                error_flag = 1;
            } else if ((/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}/.test(document
                .getElementById('password').value)) == false) {
                document.getElementById('pass_error').innerHTML = "Enter in correct format.";
                error_flag = 1;
            } else {
                document.getElementById('pass_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkContactNumber() {
            var error_flag = 0;
            if ((document.getElementById('contact').value) == "") {
                document.getElementById('con_error').innerHTML = "Enter contact number.";
                error_flag = 1;
            } else if ((document.getElementById('contact').value).length < 8) {
                document.getElementById('con_error').innerHTML = "Contact number must contain 8 number.";
                error_flag = 1;
            } else if ((/^[0-9]{10}/.test(document.getElementById('contact').value)) == false) {
                document.getElementById('con_error').innerHTML = "Enter correct contact number.";
                error_flag = 1;
            } else {
                document.getElementById('con_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkOrganization() {
            var error_flag = 0;
            if (document.getElementById('org_type').value == "") {
                document.getElementById('org_error').innerHTML = "Select any option";
                error_flag = 1;
            } else {
                document.getElementById('org_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function validateRegForm() {
            var error_flag = 0;
            if ((document.getElementById('fname').value) == "") {
                alert("hello");
                document.getElementById('fname_error').innerHTML = "Enter First Name.";
                error_flag = 1;
            } else if (!checkFirstName()) {
                error_flag = 1;
            }
            if ((document.getElementById('lname').value) == "") {
                document.getElementById('lname_error').innerHTML = "Enter Last Name.";
                error_flag = 1;
            } else if (!checkLastName()) {
                error_flag = 1;
            }
            if (!checkGender()) {
                error_flag = 1;
            }
            if (!checkEmail()) {
                error_flag = 1;
            }
            if (!checkPassword()) {
                error_flag = 1;
            }

            if (!check("confirm_password")) {
                error_flag = 1;
            }
            if (!checkContactNumber()) {
                error_flag = 1;
            }
            if (!checkOrganization()) {
                error_flag = 1;
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }

        }

        function check(id) {

            if (document.getElementById('password').value == document
                .getElementById(id).value) {

                document.getElementById('message').innerHTML = "Match.";
                return true;

            } else {
                document.getElementById('message').innerHTML = "no Match.";
                return false;
            }
        }
    </script>
</head>

<body>
    <form action="signup" method="Post" name="registrationform" id="form1" onsubmit="return validateRegForm()">


        <table align="center" cellspacing="0px" width="60%" cellpadding="10">
            <th colspan="2">
                <center>Registration Form</center>
            </th>
            <tr>

                <td><label for="firstName :">First Name</label></td>
                <td><input type="text" name="FirstName" id="fname" onchange="return checkFirstName()"
                        placeholder="Type firstName here"></td>
                <td><span id="fname_error"></span></td>
            </tr>

            <tr>
                <td><label for="lastName">Last Name</label></td>
                <td><input type="text" name="LastName" id="lname" onchange="return checkLastName()"
                        placeholder="Type lastName here"></td>
                <td><span id="lname_error"></span></td>
            </tr>
            <tr>
                <td><label for="gender">Gender</label></td>
                <td><input type="radio" id="m1" name="gender" value="male" onchange="return checkGender()">Male <input
                        type="radio" id="f1" name="gender" value="female" onchange="return checkGender()">Female</td>
                <td><span id="gender_error"></span></td>
            </tr>
            <tr>
                <td><label for="emailId">Email Id</label></td>
                <td><input type="text" id="email_id" name="emailId" onchange="return checkEmail()"
                        placeholder="Type Email id here"></td>
                <td><span id="email_error"></span></td>
            </tr>
            <tr>
                <td><label for="password">Password</label></td>
                <td><input type="password" name="password" id="password" onchange="return checkPassword()"
                        placeholder="password"></td>
                <td><span id="pass_error"></span></td>
            </tr>
            <tr>
                <td colspan="3"><span> *Password should contains
                        Uppercase, Lowercase, Numeric, Alphanumeric, and length minimum 8</span>
                </td>
            </tr>
            <tr>
                <td><label for="confirm password">Confirm password</label></td>
                <td><input type="password" name="confirm password" id="confirm_password" oninput="return check(this.id)"
                        onchange="return validateRegForm()" placeholder="confirm password"></td>
                <td><span id="message"></span></td>
            </tr>
            <tr>
                <td><label for="contactnumber">ContactNo.</label></td>
                <td><input type="text" id="contact" name="contactNumber" maxlength="10" size="10"
                        onchange="return checkContactNumber()" placeholder="contact no."></td>
                <td><span id="con_error"></span></td>
            </tr>
            <tr>
                <td><label for="type">Organization</label></td>
                <td><select name="organization_type" id="org_type" onchange="return checkOrganization()">
                        <option value="">Select Organization</option>
                        <option value="metacube">Metacube</option>
                        <option value="infosys">Infosys</option>
                        <option value="wipro">Wipro</option>
                        <option value="capg">Capgemini</option>
                    </select></td>
                <td><span id="org_error"></span></td>
            </tr>
            <tr>

                <td colspan="2">
                    <center>
                        <input type="submit" value="Register">
                    </center>
                </td>


            </tr>
        </table>
    </form>
</body>

</html>