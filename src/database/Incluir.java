package database;

import App.Usuarios;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Incluir {

    public boolean Incluir(Usuarios objpes) throws SQLException{
        Conexao conexao = new Conexao();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO Usuarios (nome, senha)" + " VALUES (?,?)");
      
       pstmt.setString(1,objpes.getNome());
       pstmt.setString(2,objpes.getSenha());
      
        int registros = pstmt.executeUpdate();
        
        pstmt.close();// fecha a conexao
        
        if (registros == 1){
            return true; }
        else {
            return false; 

        }
    }
}
