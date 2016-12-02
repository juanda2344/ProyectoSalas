/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Conexion.DBUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Externo;

/**
 *
 * @author porta
 */
public class CRUDExterno {
    
    public void addNew(Externo externo)
      {
        try 
        {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into PersonaExterna values(?,?,?,?,?,?)");
            ps.setString(1, externo.getDocumento());
            ps.setString(2, externo.getNombres());
            ps.setString(3, externo.getApellidos());
            ps.setString(4, externo.getCorreo());            
            ps.setString(5, externo.getTelefono());
            ps.setString(6, externo.getEntidad());
            ps.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error agregando un monitor: " + ex.getMessage());
        }
    }
    
}
