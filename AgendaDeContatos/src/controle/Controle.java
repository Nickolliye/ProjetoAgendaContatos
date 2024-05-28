/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.List;
import modelos.Icrud;
import modelos.Contato;
import persistencia.ContatoDAO;

public class Controle implements Icrud{
     private Icrud c = new ContatoDAO();
     private ContatoDAO ContatoDAO;

    public Controle(ContatoDAO ContatoDAO) {
        this.ContatoDAO = ContatoDAO;
    }
    public void Controle(){
    }
    @Override
    public void incluir(Contato objeto) throws Exception{
        try {
            String erro= verificar(objeto);           
            if(!erro.isEmpty())throw new Exception(erro);            
            c.incluir(objeto);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void excluir(String nome) throws Exception{
        try {
            String erro = "";
            if(!erro.isEmpty())throw new Exception("Insira o nome do cliente a ser excluido\n");   
            c.excluir(nome);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Contato objeto) throws Exception {
        try {
            String erro= verificar(objeto);           
            if(!erro.isEmpty())throw new Exception(erro);    
            c.alterar(objeto);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Contato> listar() throws Exception {
        try {             
            return c.listar();
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void GerarPDF(List<Contato> contatos) {
        try {
            ContatoDAO.GerarPDF(contatos);
        } catch (Exception erro) {
            throw erro;
        }
        }

    @Override
    public void AbrirPdf(String filePath) {
        try {
            ContatoDAO.AbrirPdf(filePath);
        } catch (Exception erro) {
            throw erro;
        }
    }
    private String verificar(Contato objeto){
        String erro = "";
        if(objeto.getNomeCompleto().isEmpty()) erro += "Esse campo (nome) e obrigatorio, nao pode estar vazio.\n";
        if(!objeto.getNomeCompleto().matches("^[a-zA-Z ]+$")) erro += "Esse campo (nome) somente aceita letras\n";
        if(objeto.getEmail().isEmpty()) erro += "Esse campo (email) e obrigatorio, nao pode estar vazio\n.";
        if(Integer.toString(objeto.getTelefone().getDdi()).isEmpty()) erro += "Esse campo (DDI) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getTelefone().getDdd()).isEmpty()) erro += "Esse campo (DDD) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getTelefone().getNumero()).isEmpty()) erro += "Esse campo (telefone) e obrigatorio, nao pode estar vazio.\n";         
        if(objeto.getEndereco().getLogradouro().isEmpty()) erro += "Esse campo (nome) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getEndereco().getNumero()).isEmpty()) erro += "Esse campo (email) e obrigatorio, nao pode estar vazio.\n";
        if(objeto.getEndereco().getComplemento().isEmpty()) erro += "Esse campo (DDI) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getEndereco().getCep()).isEmpty()) erro += "Esse campo (DDD) e obrigatorio, nao pode estar vazio.\n";
        if(objeto.getEndereco().getCidade().isEmpty()) erro += "Esse campo (telefone) e obrigatorio, nao pode estar vazio.\n";
        if(objeto.getEndereco().getEstado().isEmpty()) erro += "Esse campo (telefone) e obrigatorio, nao pode estar vazio.\n";
        if(!objeto.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) erro += "Esse campo (email) recebeu um email invalido.\n";
        String ddi = Integer.toString(objeto.getTelefone().getDdi());
        if(!ddi.matches("[0-9]+")) erro += "Esse campo (DDI) somente aceita numeros.\n";
        String ddd = Integer.toString(objeto.getTelefone().getDdd());
        if(!ddd.matches("[0-9]+")) erro += "Esse campo (DDD) somente aceita numeros.\n";
        String numero = Integer.toString(objeto.getTelefone().getNumero());
        if(!numero.matches("[0-9]+")) erro += "Esse campo (numero) somente aceita numeros.\n";
        return erro;
    }

    
}