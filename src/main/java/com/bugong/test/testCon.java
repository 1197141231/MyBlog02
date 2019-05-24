package com.bugong.test;

import com.bugong.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class testCon extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.1.199:3306/test", "root", "Oraps123");
            PreparedStatement ps=con.prepareStatement("select * from person");
            ResultSet rs=ps.executeQuery();
            ArrayList<Person> books=new ArrayList<Person>();
            while(rs.next())
            {
                Person b= new Person();
                b.setId(rs.getInt(0));
                b.setName(rs.getString(1));
                b.setAge(rs.getInt(2));

                books.add(b);
            }
            request.setAttribute("bookslist",books);
            con.close();





        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {



        this.doGet(request, response);

    }

}
