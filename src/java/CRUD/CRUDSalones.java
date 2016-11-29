package CRUD;
import Conexion.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Salones;

public class CRUDSalones {
    
    public void addSalon(Salones n){
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Sala values (?,?,?,?,?,?)");
            ps.setString(1,n.getEdificio());
            ps.setString(2, n.getIdentificador());
            ps.setString(3, n.getBeam());
            ps.setString(4,n.getTipo());
            ps.setString(5, n.getComputadores());
            ps.setString(6,n.getSillas());
            
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
              System.out.println("Error insertando la lista de salas el error es: " + ex.getMessage());
        }
        
    }
    
    public static List<Salones> getAll(){
        List<Salones> ls = new LinkedList<>();
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Sala").executeQuery();
            while(rs.next()){
                System.out.println("sadfasfsdfsdf");
                Salones s = new Salones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ls.add(s);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return ls;
    }
    
    //---------
        public static List<Salones> getSalonByID(String edificio,String identificador){
        List<Salones> ls = new LinkedList<>();
        String sql = "select * from Sala where edificio = " +"'"+edificio+"' and identificador = " +"'"+identificador+"' ";
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
                Salones s = new Salones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ls.add(s);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("salee");
        return ls;
    }
        
    public void edit(String beam, String tipo, String computadores, String sillas,String edificio,String identificador){
        String sql = "update Sala set beam= ?, tipo = ? , computadores = ? , sillas = ?" + " where edificio = ? and identificador=?";
        PreparedStatement  ps;
        System.out.println("enyta");
        try {
            ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, beam);
            ps.setString(2, tipo);
            ps.setString(3, computadores);
            ps.setString(4, sillas);
            ps.setString(5, edificio);
            ps.setString(6, identificador);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
    
    
    public void delete(String edificio,String identificador){
        try {
            String sql = "delete Salon where edificio= ? and identificador=?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, edificio);
            ps.setString(2, identificador);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
