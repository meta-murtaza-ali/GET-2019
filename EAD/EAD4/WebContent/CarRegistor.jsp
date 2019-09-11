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
    <script>
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
    </script>
</head>

<body>
    <form action="carRegistration" method="post" name="form2" onsubmit="return valCarform()">
        <table align="center">
            <th colspan="3">
                <p>
                    You have succesfully registered : <strong> Registration_Id
                        is ${employee_id}</strong>
                </p>
            </th>
            <tr>
                <td><label for="car name">CarName</label></td>
                <td><input type="text" id="car_name" name="CarName" onchange=" return checkCarName()"
                        placeholder="Car name"></td>
                <td><span id="car_error"></span></td>
            </tr>
            <tr>
                <td><label for="type">Vehicle Type</label></td>
                <td><select name="vehicle_type" id="veh_type" onchange=" return checkVehicleType()">
                        <option value="">Select vehicle</option>
                        <option value="Cycle">Cycle</option>
                        <option value="Two wheeler">Two wheeler</option>
                        <option value="Four wheeler">Four wheeler</option>
                    </select></td>
                <td><span id="veh_error"></span></td>
            </tr>
            <tr>
                <td><label for="vehicle number">Vehicle Number</label></td>
                <td><input type="int" id="veh_num" name="vehicleNumber" maxlength="10"
                        onchange=" return checkVehicleNumber()" placeholder="Vehicle Number"></td>
                <td><span>Ex:RJ17CAXXXX</span><br> <span id="num_error"></span></td>

            </tr>
            <tr>
                <td><label for="Employee_id">EmployeeId</label></td>
                <td><input type="hidden" id="employee_id" name="Employee_id" value="${employee_id}">${employee_id}</td>
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

                <td colspan="2"><input type="hidden" name="pass_price" id="pass_price"> <input type="Submit"
                        name="CollectPass"></td>

            </tr>
        </table>
    </form>
</body>

</html>