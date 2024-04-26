
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sendf
 */
interface ConnectInterface {

    void forConnection();

    void createDb();


}

public class MyConnection extends fronthand2 implements ConnectInterface {

    public void forConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sym_java_sql", "root", "Aditya@123");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(fronthand2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ;
    public void createDb() {
        
    }

    ;
   
;
}
