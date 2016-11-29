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
import modelo.Usuario;


/**
 *
 * @author Juan
 */
public class CRUDUsuario 
{
    
      public void addNew(Usuario n)
      {
        try 
        {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Usuario values(?,?,?,?,?)");
            ps.setString(1, n.getUsuario());
            ps.setString(2, n.getCorreo());
            ps.setString(3, n.getNombre());
            ps.setString(4, n.getApellidos());
            ps.setString(5, n.getContrasena());
            ps.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error en consulta el error es: " + ex.getMessage());
        }
    }
    
    public static List<Usuario> getAll()
    {
        List<Usuario> ls = new LinkedList<>();
        
        try 
        {
            ResultSet rs = DBUtils.getPreparedStatement("select * from usuario").executeQuery();
            while(rs.next())
            {
                Usuario n = new Usuario(rs.getString(3), rs.getString(4), rs.getString(1), rs.getString(5), rs.getString(2));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public static List<Usuario> getUsuario(String us)
    {
        System.out.println(us);
        List<Usuario> ls = new LinkedList<>();
        String sql = "select * from Usuario where nameId = " +"'"+us+"'";
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next())
            {
                Usuario n = new Usuario(rs.getString(3), rs.getString(4), rs.getString(1), rs.getString(5), rs.getString(2));
                ls.add(n);
            }
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
       public static List<Usuario> login(String us,String contra)
    {
        System.out.println(us);
        List<Usuario> ls = new LinkedList<>();
        String sql = "select * from Usuario where nameId = " +"'"+us+"' and contrasena=" +"'"+contra+"' ";
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next())
            {
                Usuario n = new Usuario(rs.getString(3), rs.getString(4), rs.getString(1), rs.getString(5), rs.getString(2));
                ls.add(n);
            }
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    
    public void edit(String nombre, String apellidos, String usuario, String contrasena, String correo)
    {
        try 
        {
            String sql = "update usuario SET nombre = ?, apellidos = ?, contrasena = ?, correo = ?" + " where nameId = ?";
            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3,contrasena);
            ps.setString(4, correo);
            ps.setString(5, usuario);
            ps.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error Al Modificar Un Usuario " + ex.getMessage());
        }
        
    }
    
    public boolean delete(String us)
    {
        try 
        {
            String sql = "delete usuario where nameId  = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, us);
            ps.executeUpdate();
            return true;
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error Eliminando Un Usuario " + ex.getMessage());
            return false;
        }
    }
    
}
