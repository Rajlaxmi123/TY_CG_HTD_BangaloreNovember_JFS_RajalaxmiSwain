
<html>

<body>
	<h2>${name}</h2>
	<h2>${email}</h2>
	<h2>${password}</h2>
	<h2>${gender}</h2>
	<h1>Submit the form</h1>

	<form action="./form" method="post">

	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><input type="radio" name="gender" value="M">Male</td>
			<td><input type="radio" name="gender" value="F">Female</td>
		</tr>

		<tr>
			<td><input type="reset" name="Reset"></td>
			<td><input type="submit" name="Submit"></td>
			
		</tr>
	</table>
	</form>
</body>
</html>