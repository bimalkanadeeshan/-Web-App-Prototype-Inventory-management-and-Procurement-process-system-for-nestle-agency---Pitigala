<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Operator Data Entry Form</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Education Admission Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Custom Theme files -->
	<link href="static/css/style2.css" rel="stylesheet" type="text/css" media="all" />
	<!-- //Custom Theme files -->
	<link rel="stylesheet" href="static/css/font-awesome.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- web font -->
	<link href="//fonts.googleapis.com/css?family=Acme" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
	    rel="stylesheet">
	<!-- //web font -->
</head>

<body>
	<!-- main -->
	<div class="main-agileits">
		<h1>Stock Data Entry
			<img src="static/images/logo.png" alt="">
		</h1>
		<div class="register-form">
			<form action="#" method="post">
				<div class="fields-grid">
					<div class="styled-input">
						<span class="fa fa-user" aria-hidden="true"></span>
						<input type="text" placeholder="Your Name" name="name" required="">
					</div>
					<div class="styled-input">
						<span class="fa fa-calendar" aria-hidden="true"></span>
						<input id="datepicker" placeholder="Birth Date" name="date" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
						    required="">
					</div>
					<div class="styled-input agile-styled-input-top">
						<span class="fa fa-venus" aria-hidden="true"></span>
						<select class="category2" required="">
							<option value="">Gender</option>
							<option value="">Female</option>
							<option value="">Male</option>
							<option value="">Other</option>
						</select>
					</div>
					<div class="styled-input">
						<span class="fa fa-envelope-o" aria-hidden="true"></span>
						<input type="email" placeholder="Your E-mail" name="email" required="">
					</div>
					<div class="styled-input">
						<span class="fa fa-phone" aria-hidden="true"></span>
						<input type="text" placeholder="Phone Number" name="phone number" required="">
					</div>
					<div class="styled-input agile-styled-input-top">
						<span class="fa fa-book" aria-hidden="true"></span>
						<select class="category2" required="">
							<option value="">Select Course</option>
							<option value="">Web Designing</option>
							<option value="">Web Technology </option>
							<option value="">PC Systems </option>
							<option value="">IT Foundations </option>
							<option value="">HR Management </option>
							<option value="">Modeling </option>
							<option value="">Basic Marketing</option>
						</select>
					</div>
					<div class="styled-input">
						<div class="agileits_w3layouts_grid">
							<span class="fa fa-clock-o" aria-hidden="true"></span>
							<select class="category2" name="category1" required="">
								<option value="">Select Course Time</option>
								<option value="">Hours: 8am to 10am</option>
								<option value="">Hours: 10am to 12pm</option>
								<option value="">Hours: 12pm to 4pm</option>
								<option value="">Hours: 4pm to 7pm</option>
								<option value="">Hours: 7pm to 9pm</option>
							</select>
						</div>
					</div>
					<div class="styled-input-2">
						<label class="header">Your Address</label>
						<div class="styled-input">
							<input type="text" name="address" placeholder="Address" title="Please enter your Address" required="">
						</div>
						<div class="styled-input">
							<input type="text" name="line" placeholder="Line" title="Please enter your Line" required="">
						</div>
						<div class="styled-input">
							<input type="text" name="city" placeholder="City" title="Please enter your City" required="">
						</div>
						<div class="styled-input">
							<input type="text" name="zip code" placeholder="Zip Code" title="Please enter your Zip code" required="">
						</div>
					</div>
					<div class="clear"> </div>
				</div>
				<input type="submit" value="Submit">
			</form>
		</div>
	</div>
	<!-- //main -->

	<!-- js -->
	<script src="static/js/jquery-2.1.4.min.js"></script>

	<!-- Calendar -->
	<link rel="stylesheet" href="static/css/jquery-ui.css" />
	<script src="static/js/jquery-ui.js"></script>
	<script>
		$(function () {
			$("#datepicker,#datepicker1,#datepicker2,#datepicker3").datepicker();
		});
	</script>
	<!-- //Calendar -->

</body>

</html>