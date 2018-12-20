package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Usuario {
    public Connection conexaoBD(){
        Connection conn =null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            Connection cx = DriverManager.getConnection("jdbc:mysql://localhost/ambhelp", "root", "hnq7etd1");
            return cx;
           } catch (Exception ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    public String id="";
    public boolean resultado=false;
    public boolean verificarusuario(String login, String senha){
        String sql="";
        Connection conn= conexaoBD();
        sql+="select id from usuario";
        sql+="where login ="+"'"+login+"'";
        sql+="and senha="+"'"+senha+"'";
              
        try{
            Statement stm = conn.createStatement();
            ResultSet resultquery = stm.executeQuery(sql);
            
            if (resultquery.next()){
                resultado=true;
                id=resultquery.getString("id");}
            }catch(Exception e){}
        return resultado;}
    public static void main(String[] args) {
          }
       }
        
    
        
    
   
