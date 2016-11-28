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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Profesores;


/**
 *
 * @author porta
 */
public class CRUDProfesores {

    public java.sql.Date convertirADate (String fecha){
        try {
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-mm-yyyy");
            Date parsed = formatoDelTexto.parse(fecha);
            java.sql.Date DateSql = new java.sql.Date(parsed.getDate());
            return DateSql;
        } catch (ParseException ex) {
            System.out.println("Imposible Castear A Date :" + ex.getMessage());
        }
        return null;
    }
    
    public void addProfesor(Profesores p) throws ClassNotFoundException {
            
        
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Profesores (documento, nombres, apellidos, correo, telefono, cumpleaños) values (?,?,?,?,?,?)");
            ps.setString(1, p.getCedula());
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getApellidos());
            ps.setString(4, p.getCorreo());
            ps.setString(5, p.getTelefono());
            ps.setDate(6, convertirADate(p.getCumpleaños()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al agregar un profesor el error es: " + ex.getMessage());
        }
    }

    public static List<Profesores> getAll() throws ClassNotFoundException {
        LinkedList<Profesores> listProfesores = new LinkedList<>();
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Profesores").executeQuery();
            while (rs.next()){
                listProfesores.addLast(new Profesores(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (SQLException ex) {
            System.out.println("Error comsultando la lista de profesores el error es: " + ex.getMessage());
        }
        return listProfesores;
    }
    
    public static List<Profesores> getNewByCedula(int cedula) throws ClassNotFoundException, SQLException {
        
        LinkedList<Profesores> listProfesores = new LinkedList<>();
        
        String sql = "select * from Profesores where cedula ="+cedula;
        
        try {
            
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while (rs.next()){
                
                listProfesores.addLast(new Profesores(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            System.out.println("Error comsultando la lista de profesores el error es: " + ex.getMessage());
        }
    
        return listProfesores;
    }

    public void edit(int cedula, String nombres, String apellidos, String correo, int telefono, String cumpleaños) throws ClassNotFoundException{
        try {
            String sql = "update Profesores set nombres = ?, apellidos = ?, correo = ?, telefono = ?, cumpleaños = ? " + "where cedula = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setInt(4, telefono);
            ps.setDate(5, convertirADate(cumpleaños));
            ps.setInt(6, cedula);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete (int cedula) throws ClassNotFoundException{
        try {
            String sql = "delete Profesores where cedula = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setLong(1, cedula);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
