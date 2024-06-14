
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import modelos.Contato;
import modelos.Endereco;
import modelos.Icrud;
import modelos.Telefone;
import util.ConexaoBD;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author dobne
 */
public class ContatoDAO implements Icrud {
    private Connection conexao = null;
    PreparedStatement pstm;
    
    public ContatoDAO() throws Exception{
    conexao = (Connection) ConexaoBD.getConexao();
  }
    
@Override
public void incluir(Contato objeto) throws Exception{
    try {
        String sql = "insert into Contato (nomeCompleto, ddi, ddd, telefone, email, logradouro, numero, complemento, cep, cidade, estado) values (?,?,?,?,?,?,?,?,?,?,?)";
        
        pstm = conexao.prepareStatement(sql);
        
        Telefone telefone = objeto.getTelefone();
        Endereco endereco = objeto.getEndereco();

        pstm.setString(1, objeto.getNomeCompleto());
        pstm.setInt(2, telefone.getDdi());
        pstm.setInt(3, telefone.getDdd());
        pstm.setString(4, Integer.toString(telefone.getNumero()));
        pstm.setString(5, objeto.getEmail());
        pstm.setString(6, endereco.getLogradouro());
        pstm.setInt(7, endereco.getNumero());
        pstm.setString(8, endereco.getComplemento());
        pstm.setString(9, endereco.getCep());
        pstm.setString(10, endereco.getCidade());
        pstm.setString(11, endereco.getEstado());
        
        pstm.executeUpdate();
        pstm.close();

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ContatoDAO incluir" + erro);
    }
}

@Override
public LinkedList<Contato> listar() throws Exception{
    LinkedList<Contato> lista = new LinkedList<>();
    
    try {
       String sql = "select * from Contato";
       pstm = conexao.prepareStatement(sql);
       ResultSet rs = pstm.executeQuery();
       
       while(rs.next()){ //enquanto houver linha, execute rs
           Telefone objTelefone = new Telefone();
           Endereco objEndereco = new Endereco();
           Contato objeto = new Contato();
           
           objeto.setId(rs.getInt("idContato")); //set recebe o valor
           objeto.setNomeCompleto(rs.getString("nomeCompleto"));
           objTelefone.setDdi(rs.getInt("ddi"));
           objTelefone.setDdd(rs.getInt("ddd"));
           objTelefone.setNumero(rs.getInt("telefone"));
           objeto.setTelefone(objTelefone);
           objeto.setEmail(rs.getString("email"));
           objEndereco.setLogradouro(rs.getString("logradouro"));
           objEndereco.setNumero(rs.getInt("numero"));
           objEndereco.setComplemento(rs.getString("complemento"));
           objEndereco.setCep(rs.getString("cep"));
           objEndereco.setCidade(rs.getString("cidade"));
           objEndereco.setEstado(rs.getString("estado"));
           objeto.setEndereco(objEndereco);
           
           lista.add(objeto);
       }
       rs.close();
       pstm.close();
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao listar: " + erro.getMessage());
    }
    return lista;
}

    @Override
    public void excluir(int id) throws Exception {
        try{
            String sql = "delete from Contato where idContato = ?";

            pstm = conexao.prepareStatement(sql);
             
            pstm.setInt(1, id);
        
            pstm.executeUpdate();
            pstm.close();
            
            }catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao alterar" + erro);
    }      
}

@Override
public void alterar(Contato objeto) throws Exception {
    try{
        String sql = "update Contato set nomeCompleto=?, ddi=?, ddd=?, telefone=?, email=?, logradouro=?, numero=?, complemento=?, cep=?, cidade=?, estado=? where idContato = ?";
         pstm = conexao.prepareStatement(sql);
        
        Telefone telefone = objeto.getTelefone();
        Endereco endereco = objeto.getEndereco();

        pstm.setString(1, objeto.getNomeCompleto());
        pstm.setInt(2, telefone.getDdi());
        pstm.setInt(3, telefone.getDdd());
        pstm.setString(4, Integer.toString(telefone.getNumero()));
        pstm.setString(5, objeto.getEmail());
        pstm.setString(6, endereco.getLogradouro());
        pstm.setInt(7, endereco.getNumero());
        pstm.setString(8, endereco.getComplemento());
        pstm.setString(9, endereco.getCep());
        pstm.setString(10, endereco.getCidade());
        pstm.setString(11, endereco.getEstado());
        pstm.setInt(12, objeto.getId());
        
        pstm.executeUpdate();
        pstm.close();
             }
             catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar" + erro);
    }
    }
}

