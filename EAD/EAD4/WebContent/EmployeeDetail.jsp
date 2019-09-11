<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	%>
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
        function displayCarForm() {
            document.getElementById("DetailForm").style.display = "none";
            document.getElementById("EditDetailForm").style.display = "none";
            document.getElementById("carDetailForm").style.display = "block";
        }
        function diplayForm() {
            document.getElementById("DetailForm").style.display = "none";
            document.getElementById("EditDetailForm").style.display = "block";
        }
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
            } else if (document.getElementById('email_id').value
                .match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/) == false) {
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
        function checkCarName() {
            var error_flag = 0;
            if ((document.getElementById('car_name').value) == "") {
                document.getElementById('car_error').innerHTML = "Enter Car Name.";
                error_flag = 1;
            } else if ((/^[A-Z]*[a-z]{2,}/).test(document
                .getElementById('car_name').value) == false) {
                document.getElementById('car_error').innerHTML = "Enter Correct Car Name.";
                error_flag = 1;
            } else {
                document.getElementById('car_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkVehicleType() {
            var error_flag = 0;
            if (document.getElementById('veh_type').value == "") {
                document.getElementById('veh_error').innerHTML = "Select any option.";
                error_flag = 1;
            } else {
                document.getElementById('veh_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkVehicleNumber() {
            var error_flag = 0;
            if ((document.getElementById('veh_num').value) == "") {
                document.getElementById('num_error').innerHTML = "Enter vehicle Number.";
                error_flag = 1;
            } else if ((/^(?=.*\d)(?=.*[A-Z]){9,10}/).test(document
                .getElementById('veh_num').value) == false) {
                document.getElementById('num_error').innerHTML = "Enter Correct Vehicle Number.";
                error_flag = 1;
            } else {
                document.getElementById('num_error').innerHTML = "";
            }
            if (error_flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        function checkPassType() {
            var error_flag = 0;
            if (document.getElementById('pass_type').value == "") {
                document.getElementById('pass_error').innerHTML = "Select any option.";
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
        function valCarform() {
            var error_flag = 0;
            if (!checkCarName()) {
                error_flag = 1;
            }
            if (!checkVehicleType()) {
                error_flag = 1;
            }
            if (!checkVehicleNumber()) {
                error_flag = 1;
            }
            if (!checkPassType()) {
                error_flag = 1;
            }
            if (error_flag == 1) {
                return false;
            } else {
                alert("Thank you");
                alert(document.getElementById('pass_price').value);
                return true;
            }
        }

        function calculate() {
            var type = document.getElementById('veh_type').value;
            if (type == "Cycle") {
                var passtype = document.getElementById('pass_type').value;
                if (passtype == "daily") {
                    document.getElementById('pass_price').value = "5";
                    document.getElementById('price').innerHTML = "5";
                } else if (passtype == "weekly") {
                    document.getElementById('pass_price').value = "100";
                    document.getElementById('price').innerHTML = "100";
                } else if (passtype == "monthly") {
                    document.getElementById('pass_price').value = "500";
                    document.getElementById('price').innerHTML = "500";
                }
            } else if (type == "Two wheeler") {
                var passtype = document.getElementById('pass_type').value;
                if (passtype == "daily") {
                    document.getElementById('pass_price').value = "10";
                    document.getElementById('price').innerHTML = "10";
                } else if (passtype == "weekly") {
                    document.getElementById('pass_price').value = "200";
                    document.getElementById('price').innerHTML = "200";
                } else if (passtype == "monthly") {
                    document.getElementById('pass_price').value = "1000";
                    document.getElementById('price').innerHTML = "1000";
                }
            } else if (type == "Four wheeler") {

                var passtype = document.getElementById('pass_type').value;
                if (passtype == "daily") {
                    document.getElementById('pass_price').value = "20";
                    document.getElementById('price').innerHTML = "20";
                } else if (passtype == "weekly") {
                    document.getElementById('pass_price').value = "500";
                    document.getElementById('price').innerHTML = "500";
                } else if (passtype == "monthly") {
                    document.getElementById('pass_price').value = "3500";
                    document.getElementById('price').innerHTML = "3500";
                }
            }


        }
        function displayEditForm() {
            document.getElementById("DetailForm").style.display = "none";
            document.getElementById("EditDetailForm").style.display = "none";
            document.getElementById("carDetailForm").style.display = "none";
            document.getElementById("carEditForm").style.display = "block";
        }
    </script>
</head>

<body>
    <div id="DetailForm" name="mydiv">
        <form action="carDetail" method="Post" name="EmployeeDetail" id="form1">


            <table align="center" cellspacing="0px" width="60%" cellpadding="10">
                <nav>
                    <a href="friends">Friends</a>
                    <a href="logout">Log out</a>
                </nav>
                <th colspan="2">
                    <center>Employee Detail</center>
                </th>
                <tr>
                    <td><label for="Employee_id">Employee Id</label></td>
                    <td>${data.getEmployee_id()}</td>
                </tr>
                <tr>
                    <td><label for="firstName :">First Name</label></td>
                    <td>${data.getFirstName()}</td>
                </tr>

                <tr>
                    <td><label for="lastName">Last Name</label></td>
                    <td>${data.getLastName()}</td>
                </tr>
                <tr>
                    <td><label for="gender">Gender</label></td>
                    <td>${data.getGender()}</td>
                </tr>
                <tr>
                    <td><label for="emailId">Email Id</label></td>
                    <td>${data.getEmail()}</td>
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td>${data.getPassword()}</td>
                </tr>
                <tr>
                    <td><label for="contactnumber">ContactNo.</label></td>
                    <td>${data.getContactNumber()}</td>
                </tr>
                <tr>
                    <td><label for="type">Organization</label></td>
                    <td>${data.getOrganization()}</td>
                </tr>
                <tr>
                    <td colspan="5"><input type="button" value="Edit" onclick="diplayForm()"><input type="button"
                            value="Next" onclick="displayCarForm()"></td>

                </tr>
            </table>
        </form>
    </div>
    <div id="EditDetailForm" style="display: none">
        <form action="updateEmployeeDetail" method="Post" id="form1" onsubmit="return validateRegForm()">


            <table align="center" cellspacing="0px" width="60%" cellpadding="10">
                <th colspan="2">
                    <center></center>
                </th>
                <tr>
                    <td><label for="Employee_id">Employee Id</label></td>
                    <td><input type="hidden" name="Employee_id"
                            value="${data.getEmployee_id()}">${data.getEmployee_id()}</td>
                </tr>
                <tr>
                    <td><label for="firstName :">First Name</label></td>
                    <td><input type="text" name="FirstName" id="fname" value="${data.getFirstName()}"
                            onchange="return checkFirstName()"></td>
                    <td><span id="fname_error"></span></td>
                </tr>
                <tr>
                    <td><label for="lastName">Last Name</label></td>
                    <td><input type="text" name="LastName" id="lname" value="${data.getLastName()}"
                            onchange="return checkLastName()"></td>
                    <td><span id="lname_error"></span></td>
                </tr>
                <tr>
                    <td><label for="gender">Gender</label></td>
                    <td><input type="radio" id="m1" name="gender" value="Male" onchange="return checkGender()">Male
                        <input type="radio" id="f1" name="gender" value="Female" onchange="return checkGender()">Female
                    </td>
                    <td><span id="gender_error"></span></td>
                </tr>
                <tr>
                    <td><label for="emailId">Email Id</label></td>
                    <td><input type="text" id="email_id" name="emailId" value="${data.getEmail()}"
                            onchange="return checkEmail()"></td>
                    <td><span id="email_error"></span></td>
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td><input type="password" name="password" id="password" onchange="return checkPassword()"></td>
                    <td><span id="pass_error"></span></td>
                </tr>
                <tr>
                    <td colspan="3"><span> *Password should contains
                            Uppercase, Lowercase, Numeric, Alphanumeric, and length minimum 8</span>
                    </td>
                </tr>
                <tr>
                    <td><label for="confirm password">Confirm password</label></td>
                    <td><input type="password" name="confirm password" id="confirm_password"
                            oninput="return check(this.id)" onchange="return validateRegForm()"
                            placeholder="confirm password"></td>
                    <td><span id="message"></span></td>
                </tr>
                <tr>
                    <td><label for="contactnumber">ContactNo.</label></td>
                    <td><input type="text" id="contact" name="contactNumber" value="${data.getContactNumber()}"
                            maxlength="10" size="10" onchange="return checkContactNumber()"></td>
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
                            <input type="submit" value="Update">
                        </center>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div id="carDetailForm" style="display:none">
        <form action="carRegistration" method="post" name="CarDetails" onsubmit="return valCarform()">
            <table align="center" cellspacing="0px" width="60%" cellpadding="10">
                <nav>
                    <a href="friends">Friends</a>
                    <a href="logout">Log out</a>
                </nav>
                <tr>
                    <td><label for="Employee Id">Employee Id</label></td>
                    <td>${carDetail.getEmployeeId()}</td>
                </tr>
                <tr>
                    <td><label for="car name">CarName</label></td>
                    <td>${carDetail.getCarName()}</td>
                </tr>
                <tr>
                    <td><label for="type">Vehicle Type</label></td>
                    <td>${carDetail.getVehicleType()}</td>
                </tr>
                <tr>
                    <td><label for="vehicle number">Vehicle Number</label></td>
                    <td>${carDetail.getVehicleNumber()}</td>

                </tr>
                <tr>
                    <td><label for="">Pass type</label></td>
                    <td>${carDetail.getPassType()}</td>

                </tr>
                <tr>
                    <td>Total Price(INR) = <span>${carDetail.getPassPrice()}</span> Rs
                    </td>
                </tr>
                <tr>
                    <input type="hidden" name="pass_price" id="pass_price">
                    <td colspan="2"> <input type="button" name="Edit" onclick="displayEditForm()"></td>

                </tr>
            </table>
        </form>
    </div>
    <div id="carEditForm" style="display:none">
        <form action="carUpdateData" method="post" name="form2" onsubmit="return valCarform()">
            <table align="center">
                <tr>
                    <td><label for="car name">CarName</label></td>
                    <td><input type="text" id="car_name" name="CarName" value="${carDetail.getCarName()}"
                            onchange=" return checkCarName()" placeholder="Car name"></td>
                    <td><span id="car_error"></span></td>
                </tr>
                <tr>
                    <td><label for="type">Vehicle Type</label></td>
                    <td><select name="vehicle_type" id="veh_type" value="${carDetail.getVehicleNumber()}"
                            onchange=" return checkVehicleType()">
                            <option value="">Select vehicle</option>
                            <option value="Cycle">Cycle</option>
                            <option value="Two wheeler">Two wheeler</option>
                            <option value="Four wheeler">Four wheeler</option>
                        </select></td>
                    <td><span id="veh_error"></span></td>
                </tr>
                <tr>
                    <td><label for="vehicle number">Vehicle Number</label></td>
                    <td><input type="int" id="veh_num" name="vehicleNumber" value="${carDetail.getVehicleNumber()}"
                            maxlength="10" onchange=" return checkVehicleNumber()" placeholder="Vehicle Number"></td>
                    <td><span>Ex:RJ17CAXXXX</span><br> <span id="num_error"></span></td>

                </tr>
                <tr>
                    <td><label for="Employee_id">EmployeeId</label></td>
                    <td><input type="hidden" id="employee_id" name="Employee_id"
                            value="${carDetail.getEmployeeId()}">${carDetail.getEmployeeId()}</td>
                </tr>
                <tr>
                    <td><label for="Discription">Discription</label></td>
                    <td><textarea name="Discription" id="Discription" cols="30" rows="10"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Pass type</label></td>
                    <td><select name="typeofpass" id="pass_type" onclick="return calculate()"
                            onchange=" return checkPassType()">
                            <option value="">Select pass</option>
                            <option value="daily">Daily</option>
                            <option value="weekly">Weekly</option>
                            <option value="monthly">Monthly</option>
                        </select><span id="pass_error"></span></td>
                </tr>
                <tr>
                    <td>Total Price(INR) =<span id="price"></span>Rs
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="hidden" name="pass_price" id="pass_price"
                            value="${carDetail.getPassPrice()}"> <input type="Submit" name="Update" value="Update"></td>

                </tr>
            </table>
        </form>
    </div>
</body>

</html>