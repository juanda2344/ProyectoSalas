/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author porta
 */
public class ReservaProfesor {

    private String idReserva;
    private String nameIdUsuario;
    private String documento;
    private String edificio;
    private String identificador;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String nombreProfesor;

    public ReservaProfesor(String nameIdUsuario, String documento, String edificio, String identificador, String fecha, String horaInicio, String horaFin) {
        this.nameIdUsuario = nameIdUsuario;
        this.documento = documento;
        this.edificio = edificio;
        this.identificador = identificador;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public ReservaProfesor(){
    }
    
    public void ReservaProfesor2(String idReserva, String nameIdUsuario, String documento, String edificio, String identificador, String fecha, String horaInicio, String horaFin, String nombreProfesor) {
        this.idReserva = idReserva;
        this.nombreProfesor = nombreProfesor;
        this.documento = documento;
        this.edificio = edificio;
        this.identificador = identificador;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNameIdUsuario() {
        return nameIdUsuario;
    }

    public void setNameIdUsuario(String nameIdUsuario) {
        this.nameIdUsuario = nameIdUsuario;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

}
