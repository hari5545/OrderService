<!DOCTYPE html>
<html>
<head></head>
<body bgcolor="gray">
	<form action="http://localhost:7878/orderitem/save/save" method="post">
		<table border='0' width='480px' cellpadding='0' cellspacing='0'
			align='center'>
			<center>
				<tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<center>
					<tr>
						<td><h1>User details</h1></td>
					</tr>
					<center>
						<tr>
							<td align='center'>FirstName:</td>
							<td><input type='text' placeholder="Enter FirstName"
								name='first_name'></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'>MiddleName:</td>
							<td><input type='text' placeholder="Enter MiddleName"
								name='middle_name'></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'>LastName:</td>
							<td><input type='text' placeholder="Enter LastName"
								name='last_name'></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'>Address:</td>
							<td><input type='text' placeholder="Enter Address"
								name='address' size=""></td>
						</tr>


						<td><h1>Iteam details</h1></td>
						</tr>
						<center>

							<table border='0' width='480px' cellpadding='0' cellspacing='0'
								align='center'>
								<tr>
									<td align='center'>IteamName:</td>
									<td><input type='text' placeholder="Enter IteamName"
										name='itemName'></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td align='center'>Quantity:</td>
									<td><input type="text" name="qty">

								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td align='center'>Ordered By:</td>
									<td><input type="text" name='orderedby'></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<table border='0' cellpadding='0' cellspacing='0' width='480px'
									align='center'>
									<tr>
										<td align='center'><input type='submit' name='Order'
											value="Order"></td>
									</tr>
								</table>
							</table>
		</table>
	</form>
</body>
</html>