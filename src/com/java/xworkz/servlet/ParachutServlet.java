package com.java.xworkz.servlet;

import com.java.xworkz.dto.ParachutDto;
import com.java.xworkz.service.ParachutService;
import com.java.xworkz.service.ParachutServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit" ,loadOnStartup = 1)
public class ParachutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parachutType=req.getParameter("parachutType");
        String reusable=req.getParameter("reusable");
      //bool
        boolean n_reusable=false;
        if(reusable!=null){
            n_reusable=Boolean.parseBoolean(reusable);
        }

        String  deploymentType=req.getParameter("deploymentType");
        String manufacturedBy=req.getParameter("manufacturedBy");
        String capacity=req.getParameter("capacity");
        int n_capacity=0;
        if(capacity!=null){
            n_capacity=Integer.parseInt(capacity);
        }
        String cost= req.getParameter("cost");
        int n_cost=0;
        if(capacity!=null){
            n_cost=Integer.parseInt(cost);
        }

        ParachutDto parachutDto=new ParachutDto();
        parachutDto.setParachutType(parachutType);
        parachutDto.setN_reusable(n_reusable);
        parachutDto.setDeploymentType(deploymentType);
        parachutDto.setManufacturedBy(manufacturedBy);
        parachutDto.setN_capacity(n_capacity);
        parachutDto.setN_cost(n_capacity);

        ParachutService parachutService=new ParachutServiceImpl();
        boolean saved=parachutService.save(parachutDto);
        RequestDispatcher requestDispatcher;
        if(saved) {
            requestDispatcher= req.getRequestDispatcher("parachutSuccess.jsp");
            req.setAttribute("message", "Report");
            req.setAttribute("parachutDto", parachutDto);
        }
        else {
            requestDispatcher= req.getRequestDispatcher("parachut.jsp");
            req.setAttribute("message", "Details not incorrect");
        }
        requestDispatcher.forward(req,resp);



    }
}
