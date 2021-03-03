/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jesus Lozada
 */
public class DBConexion {
    static String bd = "db_registro";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;

    Connection conexion = null;

    public DBConexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url,login,password);
            if (conexion!=null){
                System.out.println("Conexión a base de datos "+bd+" OK");
            }
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public Connection getConexion(){
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
    }
}