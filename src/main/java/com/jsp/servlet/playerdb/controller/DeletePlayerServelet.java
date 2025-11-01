package com.jsp.servlet.playerdb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.playerdb.Dao.PlayerDao;
@WebServlet("/delete-by-id")
public class DeletePlayerServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int playerId=Integer.parseInt(req.getParameter("playerId"));
		
		PlayerDao.deletePlayer(playerId);
		
		resp.sendRedirect("display-all");

	}
	

}
