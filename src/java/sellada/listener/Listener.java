/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Swadesh Sharma
 */
public class Listener implements ServletContextListener {
    private static Connection conn=null;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc=sce.getServletContext();
        String classpath=sc.getInitParameter("class");
        String addr=sc.getInitParameter("path");
        String username=sc.getInitParameter("username");
        String pass=sc.getInitParameter("password");
        try{
            Class.forName(classpath);
            conn=DriverManager.getConnection(addr,username,pass);
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally{
            sc.setAttribute("conn", conn);
        }
    }
    
    public static Connection getConnection(){
        return conn;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
