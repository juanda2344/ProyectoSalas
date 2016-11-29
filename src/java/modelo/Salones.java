
package modelo;
public class Salones {
    private String edificio;
    private String identificador;
    private String beam;
    private String tipo;
    private String computadores;
    private String sillas;

    public Salones(String edificio, String identificador,String beam, String tipo, String computadores, String sillas) {
        this.edificio = edificio;
        this.identificador = identificador;
        this.beam=beam;
        this.tipo = tipo;
        this.computadores = computadores;
        this.sillas = sillas;
    }

    public String getBeam() {
        return beam;
    }

    public void setBeam(String beam) {
        this.beam = beam;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComputadores() {
        return computadores;
    }

    public void setComputadores(String computadores) {
        this.computadores = computadores;
    }

    public String getSillas() {
        return sillas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }

   

    
    
    
}
