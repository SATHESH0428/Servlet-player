package com.jsp.servlet.playerdb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.playerdb.Dao.PlayerDao;
import com.jsp.servlet.playerdb.Entity.Player;
@WebServlet("/find-by-id")
public class FindPlayerByIdServlet extends HttpServlet{

	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int playerId=Integer.parseInt(req.getParameter("playerId"));
		
		Player player=PlayerDao.getPlayerById(playerId);
		
		req.setAttribute("player", player);
		RequestDispatcher rd=req.getRequestDispatcher("updatePlayer.jsp");
		rd.forward(req, resp);
	
	}



}
