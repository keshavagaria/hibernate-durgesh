package com.hcl.todo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.todo.entity.Note;
import com.hcl.todo.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet {

       
  
    public DeleteServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
				int noteId=Integer.parseInt(request.getParameter("note_id").trim());
				
				Session session=FactoryProvider.getFactory().openSession();
				Transaction tx=session.beginTransaction();
				Note note=session.get(Note.class, noteId);
				session.delete(note);
				tx.commit();
				session.close();
				response.sendRedirect("all_notes.jsp");
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}



}
