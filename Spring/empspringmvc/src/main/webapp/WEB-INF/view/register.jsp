<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./register" method="post">
<fieldset>
		<legend>Employee Details</legend>
		
			<table>
				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<td>Email</td>
					<td>:</td>
					<td><input type="email" name="email" required></td>
				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>

				

			</table>
		
	</fieldset>
	<fieldset>
		<legend>Employee Permanent Address</legend>
		
			<table>
				<tr>
					<td>Address Type</td>
					<td>:</td>
					<td><select name="addressBeans[0].addType">
					<option>-----Select------</option >
					<option value="permanent">Permanent</option >
					<option value="temporary">Temporary</option >
					</select>
					</td>
				</tr>

				<tr>
					<td>Adress1</td>
					<td>:</td>
					<td><input type="text" name="addressBeans[0].address1" required></td>
				</tr>
				<tr>
					<td>Adress2</td>
					<td>:</td>
					<td><input type="text" name="addressBeans[0].address2" required></td>
				</tr>

				


			</table>
		
	</fieldset>
	<fieldset>
		<legend>Employee Temporary Details</legend>
		
			<table>
				<tr>
					<td>Address Type</td>
					<td>:</td>
					<td><select name="addressBeans[1].addType">
					<option >-------------</option >
					<option value="temporary">Temporary</option >
					<option value="permanent">Permanent</option >
					
					
					
					</select>
					</td>
				</tr>

				<tr>
					<td>Address1</td>
					<td>:</td>
					<td><input type="text" name="addressBeans[1].address1" required></td>
				</tr>
				<tr>
					<td>Address2</td>
					<td>:</td>
					<td><input type="text" name="addressBeans[1].address2" required></td>
				</tr>
				

				

			</table>
		</fieldset>
		<table><tr>
					<td colspan="3" align="center"><br>
					 <input type="submit" value="Register"></td>
				</tr>
		</table>
		</form>
</body>
</html>