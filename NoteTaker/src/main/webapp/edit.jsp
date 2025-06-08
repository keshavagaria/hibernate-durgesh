<%@page import="com.hcl.todo.entity.Note"%>
<%@page import="com.hcl.todo.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<%@include file="js_css_lib.jsp" %>
</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Edit Your Note Here</h1>

	
	<%
				int noteId=Integer.parseInt(request.getParameter("note_id").trim());
				Session session3=FactoryProvider.getFactory().openSession();
				Note note=session3.get(Note.class, noteId);
				
				
				session3.close();
	%>

		<!-- form starts -->
		<form action="UpdateServlet" method="post">
		
		<input value="<%=note.getId() %>" name="noteId" type="hidden"/>
		
		
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title" required
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here"  value="<%= note.getTitle()%>"/>

			</div>

			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" required id="content"
					placeholder="Enter your content here" class="form-control"
					style="height: 300px"><%=note.getContent() %> </textarea>
			</div>

			<button type="submit" class="btn btn-success">Save</button>
		</form>

		<!-- form ends -->



	</div>
</body>
</html>