<%@page import="com.hcl.todo.entity.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.hcl.todo.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
<%@include file="js_css_lib.jsp"%>
</head>

<body>

<div class="container">
	<%@include file="navbar.jsp"%>
	<h1 class="text-uppercase">Add Notes Page</h1>
	
	<div class="row">
		<div class="col-12">

				<%
				Session session2 = FactoryProvider.getFactory().openSession();
				Query query = session2.createQuery("from Note");
				List<Note> notes = query.list();
				for (Note note : notes) {
				%>
				
				<div class="card mt-3">
					<img class="card-img-top m-4 mx-auto" style="max-width: 100px;"   src="img/note.png" alt="Card image cap">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle() %></h5>
						<p class="card-text"><%=note.getContent() %></p>
						
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger">Delete</a>
							<a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
						</div>
						
					</div>
				</div>

				<%   	}
				session2.close();
				%>

			</div>
	</div>
	

</div>

</body>
</html>