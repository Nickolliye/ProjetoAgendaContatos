/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface Icrud {

    public abstract void incluir(Contato objeto)throws Exception;
    public abstract void excluir(String nomeCompleto)throws Exception;
    public abstract void alterar(Contato objeto)throws Exception;
    public ArrayList<Contato> listar()throws Exception;
    void GerarPDF(List<Contato> contatos);
    void AbrirPdf(String filePath);
}

