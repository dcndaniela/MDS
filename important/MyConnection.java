/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MyConnection {
    //cream o functie pt a conecta proiectul la bd mysql
    public static Connection getConnection()
    {
    Connection con=null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:/java_login_register","root","");
        
    } catch(Exception ex){ System.out.println(ex.getMessage());}
    
    return con;
    }
    
}
