/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Conexion.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import modelo.Externo;

/**
 *
 * @author porta
 */
public class CRUDExterno {

    public void addNew(Externo externo) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into PersonaExterna values(?,?,?,?,?,?)");
            ps.setString(1, externo.getDocumento());
            ps.setString(2, externo.getNombres());
            ps.setString(3, externo.getApellidos());
            ps.setString(4, externo.getCorreo());
            ps.setString(5, externo.getTelefono());
            ps.setString(6, externo.getEntidad());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error agregando un monitor: " + ex.getMessage());
        }
    }
    
    public boolean deleteExterno(String documentoExterno)
    {
        try 
        {
            String sentenciaSQL = "delete PersonaExterna where documento= ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sentenciaSQL);
            ps.setString(1, documentoExterno);
            ps.executeUpdate();
            return true;
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error eliminando una persona externa de la BD: " + ex.getMessage());
            return false;
        }
    }

    public static List<Externo> getAll() {
        List<Externo> listaExternos = new LinkedList<>();
        try {
            ResultSet resultSet = DBUtils.getPreparedStatement("select * from PersonaExterna").executeQuery();
            while (resultSet.next()) {
                Externo externo = new Externo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                listaExternos.add(externo);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error Consultando a los Usuario Externos: " + ex.getMessage());
        }
        return listaExternos;
    }

    public void EditarExterno(Externo externo)
    {
        try 
        {
            String sentenciaSQL = "update PersonaExterna SET nombres = ?, apellidos = ?, correo = ?, telefono = ?, entidad= ?" + " where documento = ?";
            PreparedStatement preparacionSentencia= DBUtils.getPreparedStatement(sentenciaSQL);
            preparacionSentencia.setString(1, externo.getNombres());
            preparacionSentencia.setString(2, externo.getApellidos());
            preparacionSentencia.setString(3, externo.getCorreo());
            preparacionSentencia.setString(4, externo.getTelefono());
            preparacionSentencia.setString(5, externo.getEntidad());
            preparacionSentencia.setString(6, externo.getDocumento());
            preparacionSentencia.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error Modificando Monitor: " + ex.getMessage());
        }
        
    }
    
    public static List<Externo> getExternoConDocumento(String documento)
    {
        List<Externo> listaExterno = new LinkedList<>();
        String sentenciaSQL = "select * from PersonaExterna where documento = " +"'"+documento+"'";
        try {
            ResultSet resultSet = DBUtils.getPreparedStatement(sentenciaSQL).executeQuery();
            while(resultSet.next())
            {
                Externo externo = new Externo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                listaExterno.add(externo);
            }
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error Buscando monitor para ser modificado: " + ex.getMessage());
        }
        return listaExterno;
    }
    
}
