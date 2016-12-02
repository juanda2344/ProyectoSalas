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
import modelo.ReservaExterna;

/**
 *
 * @author porta
 */
public class CRUDReservaExterna {
 
    public void addNewReservaExterna(ReservaExterna reservaExterna) {
        try {
            PreparedStatement preparacionSentencia = DBUtils.getPreparedStatement("insert into ReservasExternos values(?,?,?,?,?,?,?)");
            preparacionSentencia.setString(1, reservaExterna.getNameIdUsuario());
            preparacionSentencia.setString(2, reservaExterna.getDocumento());
            preparacionSentencia.setString(3, reservaExterna.getEdificio());
            preparacionSentencia.setString(4, reservaExterna.getIdentificador());
            preparacionSentencia.setString(5, reservaExterna.getFecha());
            preparacionSentencia.setString(6, reservaExterna.getHoraInicio());
            preparacionSentencia.setString(7, reservaExterna.getHoraFin());
            preparacionSentencia.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en inserccion de reserva el error es: " + ex.getMessage());

        }
    }
    
    public static List<ReservaExterna> getAllReservasExternas() {
        List<ReservaExterna> listaReservasExternas = new LinkedList<>();

        try {
            ResultSet resultadoConsulta = DBUtils.getPreparedStatement("select * from ReservasExternos").executeQuery();
            while (resultadoConsulta.next()) {
                String nombreExterno = CRUDExterno.getExternoConDocumento(resultadoConsulta.getString(3)).get(0).getNombres();
                ReservaExterna reservaExterna = new ReservaExterna(resultadoConsulta.getString(1), resultadoConsulta.getString(2), resultadoConsulta.getString(3), resultadoConsulta.getString(4), resultadoConsulta.getString(5), resultadoConsulta.getString(6), resultadoConsulta.getString(7), resultadoConsulta.getString(8), nombreExterno);                
                listaReservasExternas.add(reservaExterna);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Se Presento un error en la insercion de una reserva para externo en la base de datos: " + ex.getMessage());
        }
        return listaReservasExternas;
    }
    
}
