/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jesus Lozada
 */
public class DBPuntajes {
    DBConexion cn;
    
    public DBPuntajes(){
        this.cn = new DBConexion();
    }
    
    public void insertPuntaje(int puntaje) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("INSERT INTO puntos (puntaje)"
                    + " VALUES (?)");
            pstm.setInt(1, puntaje);

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public String[] getPuntaje() throws SQLException {
        int i = 0;
        int mejores = 5;
        
        String[] puntajes = new String[mejores];
        
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT puntaje "
                + " FROM puntos "
                + " ORDER BY puntaje DESC ");

        ResultSet res = pstm.executeQuery();
        
        while(res.next() && i < mejores){
            puntajes[i] = String.valueOf(res.getInt("puntaje"));
            i++;
        }
        
        if(i < mejores){
            while(i < mejores){
                puntajes[i] = " ";
                i++;
            }
        }
        
        return puntajes;
    }
}
