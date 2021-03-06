package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jétna
 */
public class GenericDAO {

public abstract class GenericDao {

    private static final long serialVersionUID = 1L;

    public Connection getConnection() {
        try {
      Class.forName("com.mysql.jdbc.Driver");     
            Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/aspiads27abril14h", "doll", "doll2014fev");
            return cx;
        } catch (Exception ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Statement getStatement() throws SQLException {
        return getConnection().createStatement();
    }

    public PreparedStatement getStatement(String st) throws SQLException {
        return getConnection().prepareStatement(st);
    }

    public ResultSet executeQuery(String query,Object... params) throws SQLException {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        return ps.executeQuery();
    }

    public int executeCommand(String query,Object... params) throws SQLException {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            try {
            ps.setObject(i+1, params[i]);
            } catch (Exception e) {
                System.out.println("Erro "+i+" com "+params[i]);            }
        }
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    public Integer getNextId(String tableName,String idx) throws SQLException {
        ResultSet rs = executeQuery("select MAX("+idx+") from ambhelp."+tableName);
        rs.next();
        Object result = rs.getObject(1);
        if (result == null) {
            rs.close();
            return 1;
        } else {
            return ((Integer)result)+1;
        }
    }

}
  
}
