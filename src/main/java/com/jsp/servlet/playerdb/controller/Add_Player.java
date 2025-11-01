package com.jsp.servlet.playerdb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.playerdb.Dao.PlayerDao;
import com.jsp.servlet.playerdb.Entity.Player;
@WebServlet("/addplayer")

public class Add_Player extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		int age=Integer.parseInt(req.getParameter("age"));
		String nationality=req.getParameter("nationality");
		String team=req.getParameter("team");
		int salary=Integer.parseInt(req.getParameter("salary"));
		
		Player player=new Player();
		player.setTitle(title);
		player.setAge(age);
		player.setNationality(nationality);
		player.setTeam(team);
		player.setSalary(salary);
PlayerDao.savePlayer(player);
		
		
		resp.sendRedirect("index.jsp");


	}

}
