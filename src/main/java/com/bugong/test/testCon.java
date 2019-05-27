package com.bugong.test;

import com.bugong.domain.BRole;
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
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "swj000123");
            PreparedStatement ps=con.prepareStatement("select * from b_role");
            ResultSet rs=ps.executeQuery();
            ArrayList<BRole> books=new ArrayList<BRole>();
            while(rs.next())
            {
                BRole b= new BRole();
                b.setId(rs.getInt(0));
                b.setRoleName(rs.getString(2));
                b.setRoleNo(rs.getInt(1));

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
