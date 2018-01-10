<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="design/design.css"> 
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<title>Add House Info</title>
</head>
</head>
<body>
	<jsp:include page="design/header.jsp" />
	
	<form  action="ControllerHouse" method="post" onsubmit = "return validate()" >
	
		Title: <input  type="text" name="houseId" /> <br>
		<h2>Address</h2>
	         
	    <!-- address-line1 input-->
		<label>Address Line 1</label>
		<input name="address-line1" type="text" placeholder="Street address, P.O. box, company name, c/o">
	    <br> 
	    
		<!-- address-line2 input-->
		<label>Address Line 2</label>
		<input name="address-line2" type="text" placeholder="Apartment, suite , unit, building, floor, etc.">
		<br>
		
		<!-- city input-->
		<label>City / Town</label>
	    <input name="city" type="text">
		<br>
		
		<!-- postal-code input-->
		<label>Zip/Code Postal </label>
	    <input name="postal-code" type="text">
		<br>

		<!-- country select -->
		<label>Country</label>
		<jsp:include page="selectCity.jsp" />
		<br>
		
		Date Available:
	 
		<label for="from">From</label>
		<input type="text" id="from" name="from">
		<label for="to">to</label>
		<input type="text" id="to" name="to">
		<br>
		
		Number of people: <input  type="text" name="number" /> 
		<br>
		
		House Type:  
		<select name="houseType">
			<option value="Apartment">Apartment</option>
			<option value="House">House</option>
			<option value="Studio">Studio</option>
		</select>
		<br>
		
		<br>
		Services
		<br>
		WIFI
		<input name="service" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		Clean the house
		<input name="service" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		Hot Water 24h
		<input name="service" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		<br>
		
		<br>
		Constraints
		<br>
		
		No smoking in the accommodation
		<input name="constraint" type="checkbox" value=""/>
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		No noise after 23h
		<input name="constraint" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		No children
		<input name="constraint" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		No pets allowed
		<input name="constraint" type="checkbox" value="" />
		&nbsp;&nbsp;&nbsp;&nbsp;<br>
		
		
		<input type="submit" value="Submit">

	</form>
	
	<jsp:include page="design/footer.jsp" />
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
	  $( function() {
	    var dateFormat = "mm/dd/yy",
	      from = $( "#from" )
	        .datepicker({
	          defaultDate: "+1w",
	          changeMonth: true,
	          numberOfMonths: 1
	        })
	        .on( "change", function() {
	          to.datepicker( "option", "minDate", getDate( this ) );
	        }),
	      to = $( "#to" ).datepicker({
	        defaultDate: "+1w",
	        changeMonth: true,
	        numberOfMonths: 1
	      })
	      .on( "change", function() {
	        from.datepicker( "option", "maxDate", getDate( this ) );
	      });
	 
	    function getDate( element ) {
	      var date;
	      try {
	        date = $.datepicker.parseDate( dateFormat, element.value );
	      } catch( error ) {
	        date = null;
	      }
	 
	      return date;
	    }
	  } );
	</script>
</body>
    </html>