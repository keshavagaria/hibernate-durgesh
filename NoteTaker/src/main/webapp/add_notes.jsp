<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="js_css_lib.jsp"%>
<title>Add Note</title>
</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Please Fill your Details</h1>
		<br/>

									<!-- form starts -->
		<form action="SaveNoteServlet" method="post"> 
			<div class="form-group">
				<label for="title">Note Title</label>
				 <input
				 name="title"
				  required
					type="text" 
					class="form-control" 
					id="title"
					aria-describedby="emailHelp"
					 placeholder="Enter here" /> 
					 
			</div>
			
			<div class="form-group">
				<label for="content">Note Content</label>
				 <textarea
				 name="content"
				 required
				  id="content" 
				  placeholder="Enter your content here" 
				  class="form-control" 
				  style="height: 300px"
				  > </textarea>
			</div>
		
			<button type="submit" class="btn btn-primary">Add</button>
		</form>
		
										<!-- form ends -->
	</div>
</body>
</html>