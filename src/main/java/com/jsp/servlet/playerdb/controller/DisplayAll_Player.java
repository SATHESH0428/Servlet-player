package com.jsp.servlet.playerdb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.playerdb.Dao.PlayerDao;
import com.jsp.servlet.playerdb.Entity.Player;
@WebServlet("/display-all")

public class DisplayAll_Player extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Player> players=PlayerDao.findAll();
		req.setAttribute("player", players);
		RequestDispatcher rd=req.getRequestDispatcher("displayAllplayers.jsp");
		rd.forward(req, resp);
		
		
	}

}
