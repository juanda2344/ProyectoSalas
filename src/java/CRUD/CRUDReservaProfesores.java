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
import modelo.Profesores;
import modelo.ReservaProfesor;
import modelo.Usuario;

/**
 *
 * @author porta
 */
public class CRUDReservaProfesores {

    public void addNew(ReservaProfesor reservaProfesor) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into ReservasProfesores values(?,?,?,?,?,?,?)");
            ps.setString(1, reservaProfesor.getNameIdUsuario());
            ps.setString(2, reservaProfesor.getDocumento());
            ps.setString(3, reservaProfesor.getEdificio());
            ps.setString(4, reservaProfesor.getIdentificador());
            ps.setString(5, reservaProfesor.getFecha());
            ps.setString(6, reservaProfesor.getHoraInicio());
            ps.setString(7, reservaProfesor.getHoraFin());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en inserccion de reserva el error es: " + ex.getMessage());

        }
    }

    public static List<ReservaProfesor> getAll() {
        List<ReservaProfesor> ls = new LinkedList<>();

        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from ReservasProfesores").executeQuery();
            while (rs.next()) {
                ReservaProfesor n = new ReservaProfesor();
                String nombre = CRUDProfesores.getNewByCedula(rs.getString(3)).get(0).getNombres();
                n.ReservaProfesor2(rs.getString(1), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), nombre);
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ls;
    }

}
