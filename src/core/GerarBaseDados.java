/**
 * Gera a base de dados
 * @author Elias
 */
package core;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GerarBaseDados {
    
    public static void gerarBase(javax.swing.JFrame f){
        ConnectionSG con = new ConnectionSG(f);
        con.executar("CREATE DATABASE IF NOT EXISTS alunos","");
        con.executar("CREATE TABLE IF NOT EXISTS `usuarios` ("
                      + "`us_cod` int(11) NOT NULL AUTO_INCREMENT,"
                      + "`us_nome` varchar(255) NOT NULL,"
                      + "`us_login` varchar(45) NOT NULL,"
                      + "`us_senha` varchar(45) NOT NULL,"
                      + "PRIMARY KEY (`us_cod`),"
                      + "UNIQUE KEY `us_login` (`us_login`)"
                      + ") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8","alunos");
        con.consulta("SELECT * FROM usuarios WHERE us_login='root'", "alunos");
        try {
            if(!con.resultado.next()){
                con.executar("INSERT INTO usuarios VALUES('1','Elias Ferreira','root','djM34tBlcxdieo4cXRbLeQ==')","alunos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerarBaseDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(GerarBaseDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close();
    }
}
