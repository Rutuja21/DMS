/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentmgm;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

        /**
 *
 * @author shiv
 */
public class Db {
     Connection con;
    PreparedStatement ps,ps1,ps2;
    public Connection getconnection() throws SQLException{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                   
                  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin123");
                  
        } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null,ex);
        }
     return con;
    }
    
}
