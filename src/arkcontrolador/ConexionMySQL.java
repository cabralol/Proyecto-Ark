/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkcontrolador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class ConexionMySQL {
/*    public String db = "ark";
public String url = "jdbc:mysql://localhost/"+db;
public String user = "root";
public String pass = "";
*/
     public String db = "sql7235104";
public String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/"+db;
public String user = "sql7235104";
public String pass = "ESltgJiIyT";
    
    
public Connection Conectar(){

Connection link = null;  
try{   
 Class.forName("org.gjt.mm.mysql.Driver");
 link = DriverManager.getConnection(this.url, this.user, this.pass);

    }catch(Exception ex){

 JOptionPane.showMessageDialog(null, ex);
    }
return link; 
}

}

