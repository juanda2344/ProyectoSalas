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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Monitores;


/**
 *
 * @author Juan
 */
public class CRUDMonitores 
{
    
      public void addNew(Monitores n)
      {
        try 
        {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Monitores values(?,?,?,?,?,?,?)");
            ps.setString(1, n.getDocumento());
            ps.setString(2, n.getNombre());
            ps.setString(3, n.getApellidos());
            ps.setString(4, n.getCorreo());
            ps.setString(5, n.getSemestre());
            ps.setString(6, n.getTelefono());
            ps.setString(7, n.getTelefono());
            ps.executeUpdate();
            
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error agregando un monitor: " + ex.getMessage());
        }
    }
    
    public static List<Monitores> getAll()
    {
        List<Monitores> ls = new LinkedList<>();
        
        try 
        {
            ResultSet rs = DBUtils.getPreparedStatement("select * from monitores").executeQuery();
            while(rs.next())
            {
                Monitores n = new Monitores(rs.getString(2), rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(CRUDMonitores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public static List<Monitores> getMonitorConDocumento(String doc)
    {
        List<Monitores> ls = new LinkedList<>();
        System.out.println(doc);
        String sql = "select * from Monitores where documento = " +"'"+doc+"'";
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next())
            {
                Monitores n = new Monitores(rs.getString(2), rs.getString(3), rs.getString(1), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                ls.add(n);
            }
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error Buscando monitor para ser modificado: " + ex.getMessage());
        }
        return ls;
    }
    
    public void edit(String nombre, String apellidos, String documento, String correo, String semestre, String telefono, String carrera)
    {
        try 
        {
            System.out.println(nombre + "" + apellidos + "" + documento + "" + correo + "" + semestre + "" + telefono + "" + carrera);
            String sql = "update Monitores SET nombres = ?, apellidos = ?, telefono = ?, correo = ?, semestre = ?, carrera = ?" + " where documento = ?";
            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, telefono);
            ps.setString(4, correo);
            ps.setString(5, semestre);
            ps.setString(6, carrera);
            ps.setString(7, documento);
            ps.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error Modificando Monitor: " + ex.getMessage());
        }
        
    }
    
    public boolean delete(String documento)
    {
        try 
        {
            String sql = "delete Monitores where documento= ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, documento);
            ps.executeUpdate();
            return true;
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error eliminando un monitor de la BD: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean deleteAll()
    {
        try 
        {
            String sql = "delete AsignarSalaMonitor";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.executeUpdate();
            
            sql = "delete Monitores";
            ps = DBUtils.getPreparedStatement(sql);
            ps.executeUpdate();
            return true;
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error eliminando un monitor de la BD: " + ex.getMessage());
            return false;
        }
    }
    
}
