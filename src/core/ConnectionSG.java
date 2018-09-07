/**
 * Classe de conexao com banco de dados MySQL
 * @author Elias
 */
package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import view.OptionPane;



public class ConnectionSG {
    
    public ConnectionSG(javax.swing.JFrame frame){
        fr = frame;
    }
    public void open(String db){
        try {
            String urlm = url+db;
            Class.forName(driver);
            this.connection = DriverManager.getConnection(urlm, user, senha);
            this.statement = this.connection.createStatement();
        }catch(ClassNotFoundException erro){
            op.showError("Driver JDBC-ODBC não encontrado!");
        }catch(SQLException erro){
            if(user.equals("User")){
                op.showError("Por favor, configure o servidor!");
            }else{
                op.showError("Problemas na conexão com a fonte de dados" + erro.toString());
            }
        }
    }
    
    public void close(){
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            op.showError("Problemas na conexão com a fonte de dados" + ex.toString());
        }
    }
    
    public void consulta(String sql, String db){
        
        try {
            this.open(db);
            this.resultado = statement.executeQuery(sql);
        } catch (SQLException ex) {
            op.showError("Problemas na conexão com a fonte de dados" + ex.toString());
        }
        
    }
    
    public void executar(String sql, String db){
        
        try {
            this.open(db);
            boolean res = statement.execute(sql);
        } catch (SQLException ex) {
            op.showError("Problemas na conexão com a fonte de dados" + ex.toString());
        }
        
    }
    
    RWConfig conf = new RWConfig();
    javax.swing.JFrame fr;
    view.OptionPane op = new OptionPane(fr, true);
    String[] dados = conf.read();
    String user = dados[0];
    String senha = dados[1];
    String server = dados[2];
    String port = dados[3];
    String driver = "com.mysql.jdbc.Driver"; 
    String url = "jdbc:mysql://"+server+":"+port+"/";
    public Connection connection;
    public Statement statement;
    public ResultSet resultado;
}
