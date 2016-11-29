/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Monitores 
{
    
   
    private String nombre;
    private String apellidos;
    private String documento;
    private String correo;
    private String semestre;
    private String telefono;
    private String carrera;
    
    
    //6 line

    public Monitores(String nombre, String apellidos,String documento, String correo, String semestre, String telefono, String carrera)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento=documento;
        this.correo = correo;
        this.semestre = semestre;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
        

    public String getDocumento() 
    {
        return documento;
    }

    public void setDocumento(String documento)
    {
        this.documento = documento;
    }
    
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public String getSemestre() 
    {
        return semestre;
    }

    public void setSemestre(String semestre)
    {
        this.semestre = semestre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

  

 

    
}
