<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details Page</title>
</head>
<body>
			
		<!-- alert logic -->
		<c:if test="${param.message ne null}">
			<div>
				${param.message}
			</div>
		</c:if>
		
				
		
		<h1>Flight Details</h1>
		<c:if test="${flightdetailsList ne null}">
			<table>
				<tr>
					<th>FlightNo</th>
					<th>Airline</th>
					<th>Departure City</th>
					<th>Arrival City</th>
					<th>Departure Date</th>
					<th>Arrival Date</th>
					<th>First Seats</th>
					<th>First Seats Fare</th>
				</tr>
				<c:forEach items="${flightdetailsList}" var="flightdetails">
					<tr>
						<%-- <th>${flightdetails.flightno}</th> --%>
						<th><a href="displayFlight.obj?name=${flightdetails.flightno}">${flightdetails.flightno}</a></th>
						<th>${flightdetails.airline}</th>
						<th>${flightdetails.dep_city}</th>
						<th>${flightdetails.arr_city}</th>
						<th>${flightdetails.dep_date}</th>
						<th>${flightdetails.arr_date}</th>
						<th>${flightdetails.fseats}</th>
						<th>${flightdetails.fseatsfare}</th>
					</tr>
				</c:forEach>
			</table>
			<!-- <h5>Click a Hotel name to start Booking</h5> -->
		</c:if>
	</div>
</body>
</html>