package com.jsp.servlet.playerdb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.playerdb.Dao.PlayerDao;
import com.jsp.servlet.playerdb.Entity.Player;

@WebServlet("/UpdatePlayer")

public class SaveupdatePlayer extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int playerId=Integer.parseInt(req.getParameter("playerId"));
		String title=req.getParameter("title");
		int age=Integer.parseInt(req.getParameter("age"));
		String nationality=req.getParameter("national");
		String team=req.getParameter("team");
		int salary=Integer.parseInt(req.getParameter("salary"));
		
		Player player=new Player();
		player.setPlayerid(playerId);
		player.setTitle(title);
		player.setAge(age);
		player.setNationality(nationality);
		player.setTeam(team);
		player.setSalary(salary);
		
		PlayerDao.updatePlayer(player);
		
		resp.sendRedirect("display-all");



		
		
	}

}
