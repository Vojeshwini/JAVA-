package com.xworkz.duster.repository;

import com.xworkz.duster.constant.DBProperties;
import com.xworkz.duster.dto.DusterDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class DusterRepoImpl implements DusterRepo{
    @Override
    public boolean persist(DusterDTO dusterDTO) {
        System.out.println("running persist in DusterRepoImpl");
        if (dusterDTO != null) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager
                        .getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());

               /* String sql = "insert into duster values (0,'"+ dusterDTO.getMaterial()+"','"+ dusterDTO.getColor()+"',"+ dusterDTO.getCost()+",'"+ dusterDTO.getDateOfManufac()+"',"+ dusterDTO.getQuantity()+",'"+ dusterDTO.getIsUseful()+"');";
                System.out.println("SQL generated :"+sql);
                Statement statement = connection.createStatement();

                statement.executeUpdate(sql);//compile the Query: DB
               */ System.out.println("===============================");

               String preSql="insert into duster values(?,?,?,?,?,?,?)";
               PreparedStatement  preparedStatement=
                       connection.prepareStatement(preSql);//pre-compile

               //below should go inside for , incase of many rows!
                preparedStatement.setInt(1,0);
                preparedStatement.setString(2,dusterDTO.getMaterial());
                preparedStatement.setString(3, dusterDTO.getColor());
                preparedStatement.setInt(4,dusterDTO.getCost());
                preparedStatement.setDate(5,Date.valueOf(dusterDTO.getDateOfManufac()));
                preparedStatement.setInt(6,dusterDTO.getQuantity());
                preparedStatement.setString(7, dusterDTO.getIsUseful());
                preparedStatement.executeUpdate();

            }
            catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getMessage());
            }
            return true;
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<DusterDTO> findById(int id) {
        System.out.println("running findById in dusterRepositoryImpl...");
        //JDBC
        // Load & register , Create the Connection , Preppare the Statemtne , Execute the statement
        //URL,UN,PWD
        Class.forName("com.mysql.cj.jdbc.Driver");//optional
        String findByIdSQL="select * from duster dust where dust.id=?";
        try(Connection connection
                    = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            PreparedStatement preparedStatement=connection.prepareStatement(findByIdSQL);) {

            
            System.out.println("findById :"+findByIdSQL);
           // Statement statement=connection.createStatement();

            preparedStatement.setInt(1,id);

            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
               int pk= resultSet.getInt("id");
               String material=resultSet.getString("material");
               String color=resultSet.getString("color");
               int cost=resultSet.getInt("cost");
                LocalDate manfdate=resultSet.getDate("dateOfManufac").toLocalDate();
                int quantity=resultSet.getInt("quantity");
                String useFul=resultSet.getString("isUseful");

                DusterDTO  dusterDTO=new DusterDTO(material,color,cost,manfdate,quantity,useFul);
                return  Optional.of(dusterDTO);
            }

        }
        catch (SQLException  exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }
        return Optional.empty();
    }
}
