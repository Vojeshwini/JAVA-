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
import java.util.Optional;

@WebServlet(urlPatterns = {"/submit" ,"/search"},loadOnStartup = 1)
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
        long n_capacity=0;
        if(capacity!=null){
            n_capacity=Long.parseLong(capacity);
        }
        String cost= req.getParameter("cost");
        long n_cost=0;
        if(cost!=null){
            n_cost=Long.parseLong(cost);
        }

        ParachutDto parachutDto=new ParachutDto();
        parachutDto.setParachutType(parachutType);
        parachutDto.setN_reusable(n_reusable);
        parachutDto.setDeploymentType(deploymentType);
        parachutDto.setManufacturedBy(manufacturedBy);
        parachutDto.setN_capacity((int)n_capacity);
       parachutDto.setN_cost((int)n_cost);

        ParachutService parachutService=new ParachutServiceImpl();
        boolean saved=parachutService.save(parachutDto);
        RequestDispatcher requestDispatcher;
        if(saved) {
            //this is to display in the other page
//            requestDispatcher= req.getRequestDispatcher("parachutSuccess.jsp");

//this is to display in the same page
            requestDispatcher= req.getRequestDispatcher("parachut.jsp");

            req.setAttribute("message", "Report");
            req.setAttribute("parachutDto", parachutDto);
            req.setAttribute("success" ,"Saved succesfully");
        }
        else {
            requestDispatcher= req.getRequestDispatcher("parachut.jsp");
            req.setAttribute("message", "Details not incorrect");
            req.setAttribute("dto",parachutDto);
            req.setAttribute("Notsuccess" ,"Details not saved");

        }
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running the servlet");
        String id=req.getParameter("id");
        if(id!=null){
        int n_id=Integer.parseInt(id);
        System.out.println("Id:"+n_id);
       ParachutService parachutService=new ParachutServiceImpl();
            Optional<ParachutDto> optionalParachutDto=parachutService.findById(n_id);
            if(optionalParachutDto.isPresent()){
                System.out.println("parachut data found");
            }else {
                System.out.println("parachut not found"+n_id);
            }

        }
    }
}
