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
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Salon values (?,?,?,?,?)");
            ps.setString(1,n.getName());
            ps.setString(2, n.getBlock());
            ps.setString(3, n.getType());
            ps.setString(4, n.getBeam());
            ps.setString(5,n.getComment());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
              System.out.println("Error comsultando la lista de profesores el error es: " + ex.getMessage());
        }
        
    }
    
    public static List<Salones> getAll(){
        List<Salones> ls = new LinkedList<>();
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Salon").executeQuery();
            while(rs.next()){
                Salones s = new Salones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                ls.add(s);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ls;
    }
    
    //---------
        public static List<Salones> getSalonByID(String nombre){
        List<Salones> ls = new LinkedList<>();
        String sql = "select * from Salon where nombre = " +"'"+nombre+"'";
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
                Salones s = new Salones(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                ls.add(s);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("salee");
        return ls;
    }
        
    public void edit(String name, String block, String type, String beam, String comment){
        String sql = "update Salon set nombre= ?, bloque = ? , tipo = ? , beam = ?, comentario = ?" + " where nombre = ?";
        PreparedStatement  ps;
        System.out.println("enyta");
        try {
            ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, name);
            ps.setString(2, block);
            ps.setString(3, type);
            ps.setString(4, beam);
            ps.setString(5, comment);
            ps.setString(6, name);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
    
    
    public void delete(String nombre){
        try {
            String sql = "delete Salon where nombre= ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CRUDSalones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
