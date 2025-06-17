package com.java.xworkz.repository;

import com.java.xworkz.dto.ParachutDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class ParachutRepoImpl implements ParachutRepo {
    public boolean persist(ParachutDto parachutDto) {
        System.out.println("running the weatherDto");
        if(parachutDto!=null){
            String url="jdbc:mysql://localhost:3306/java";
            String username="root";
            String password="vojeshwini";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection= DriverManager.getConnection(url,username,password);

                //Step 3 : Prepare the Statement(for string '"++"'
                String sql="insert into parachut values(0,'"+parachutDto.getParachutType()+"',"+ parachutDto.isN_reusable()+",'"+ parachutDto.getDeploymentType()+"','"+ parachutDto.getManufacturedBy()+"',"+ parachutDto.getN_capacity()+","+ parachutDto.getN_cost()+")";
                          Statement statement=connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return true;
        }
        return false;
    }

    @Override
    public Optional<ParachutDto> findById(int n_id) {
        System.out.println("running the findById in ParachutrepoImpl");
        return ParachutRepo.super.findById(n_id);
    }
}