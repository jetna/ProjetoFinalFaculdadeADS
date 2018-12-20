package DAO;
import java.sql.ResultSet;
import java.sql.Statement; 
import java.sql.SQLException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import Model.Preco;
import Model.Marca;
import Model.Produto;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import java.util.ArrayList;
import java.util.Vector;
import org.eclipse.persistence.internal.sessions.remote.SequencingFunctionCall;
import org.eclipse.persistence.queries.SQLResult;
/**
 *
 * @author Jétna
 */

public class precoDAO extends GenericDAO{
    int id;
    float valora; // Valor Aquisição 
    float valorr; //Valor Revenda
    int modeloId; // chave que liga a tabela modelo     -- isso é necessário?
   // List<Produto> listaProduto = new ArrayList<Produto>(); TALVEZ NÃO SEJA NECESSÁRIO 
        
        //Ações
    //preciso exibir e atualizar = select and update
    public List <Float> ListarPrecoAquisicao() throws SQLException{
        List<Preco> lista = new ArrayList<Preco>();
         List<Marca> listaMarca = new ArrayList<Marca>();
       Produto produtoParaPrecoDAO= new Produto();
       Marca marcaParaPrecoDAO = new Marca();
       int  produtoId=produtoParaPrecoDAO.getId();
       String MarcaPrecoDAO = marcaParaPrecoDAO.getMarca();       
    ResultSet resultset = executeQuery("select distinct pd.nome, ma.marca, mo.modelo, pc.valora, pc.valorr from produto pd inner join marca ma on pd.id=ma.produtoId inner join modelo mo on ma.id=mo.marcaId inner join preco pc on mo.id=pc.modeloId where pd.id="+produtoId+" and ma.marca=?"+MarcaPrecoDAO+";");
    // resultset=SQLResult(execute) Vector<String> lista = new Vector<String>();
      while (resultset.next()) {
          
      preco.getValora(valora);
      lista.nex(resultset.getString("marca"));
                         }
      resultset.close();
      return lista;
        
    }
    public int AtualizarPrecoA(Preco APA) throws SQLException{
        //APA = Atualizar Preço Aquisição 
        String query ="select  "
        return ;
    }
    
    
}
