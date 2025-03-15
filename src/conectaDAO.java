
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Adm
 */
public class conectaDAO {

    private String url = "jdbc:mysql://localhost:3306/uc11";
    private String user = "root";
    private String password = "";

    public Connection connectDB() {
         Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO");

        }
        return null;

    }

}
