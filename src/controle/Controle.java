/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Icrud;
import modelos.Contato;
import persistencia.ContatoDAO;
import serviçospdf.MetodosPdf;

public class Controle implements Icrud{
     private Icrud c = new ContatoDAO();
    public void Controle(){
    }
    @Override
    public void incluir(Contato objeto) throws Exception {
        try {
            String erro = verificar(objeto);
            if (!erro.isEmpty()) throw new Exception(erro);

            boolean confirmado = false;
            while (!confirmado) {
                // Perguntar se o número está correto
                String numeroCompleto = "+" + objeto.getTelefone().getDdi() + " " +
                                        objeto.getTelefone().getDdd() + " " +
                                        objeto.getTelefone().getNumero();
                int resposta = JOptionPane.showConfirmDialog(null, 
                    "O número de telefone está correto?\n" + numeroCompleto, 
                    "Confirmação de Número de Telefone", 
                    JOptionPane.YES_NO_OPTION);
                
                if (resposta == JOptionPane.YES_OPTION) {
                    
                    JOptionPane.showMessageDialog(null, "Contato incluído com sucesso.");
                    confirmado = true;
                } else if (resposta == JOptionPane.NO_OPTION) {
                    // Permitir que o usuário corrija o número
                    String novoDdi = JOptionPane.showInputDialog("Digite o novo DDI:");
                    String novoDdd = JOptionPane.showInputDialog("Digite o novo DDD:");
                    String novoNumero = JOptionPane.showInputDialog("Digite o novo número:");
                    
                    objeto.getTelefone().setDdi(Integer.parseInt(novoDdi));
                    objeto.getTelefone().setDdd(Integer.parseInt(novoDdd));
                    objeto.getTelefone().setNumero(Integer.parseInt(novoNumero));
                } else {
                    JOptionPane.showMessageDialog(null, "Inclusão cancelada.");
                    return;
                }
            }
        } catch (Exception erro) {
            throw erro;
        }
    }

   @Override
    public void excluir(String nome) throws Exception {
        try {
            int resposta = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente excluir o contato " + nome + "?", 
                "Confirmação de Exclusão", 
                JOptionPane.YES_NO_OPTION);
            
            if (resposta == JOptionPane.YES_OPTION) {
                c.excluir(nome);
                JOptionPane.showMessageDialog(null, "Contato excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
                return;
            }
        }catch (Exception erro) {
            throw erro;
    }}

    @Override
    public void alterar(Contato objeto) throws Exception {
        try {
            String erro = verificar(objeto);
            if (!erro.isEmpty()) throw new Exception(erro);

            boolean confirmado = false;
            while (!confirmado) {
                // Perguntar se o número está correto
                String numeroCompleto = "+" + objeto.getTelefone().getDdi() + " " +
                                        objeto.getTelefone().getDdd() + " " +
                                        objeto.getTelefone().getNumero();
                int resposta = JOptionPane.showConfirmDialog(null, 
                    "O número de telefone está correto?\n" + numeroCompleto, 
                    "Confirmação de Número de Telefone", 
                    JOptionPane.YES_NO_OPTION);
                
                if (resposta == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Contato alterado com sucesso.");
                    confirmado = true;
                } else if (resposta == JOptionPane.NO_OPTION) {
                    // Permitir que o usuário corrija o número
                    String novoDdi = JOptionPane.showInputDialog("Digite o novo DDI:");
                    String novoDdd = JOptionPane.showInputDialog("Digite o novo DDD:");
                    String novoNumero = JOptionPane.showInputDialog("Digite o novo número:");
                    
                    objeto.getTelefone().setDdi(Integer.parseInt(novoDdi));
                    objeto.getTelefone().setDdd(Integer.parseInt(novoDdd));
                    objeto.getTelefone().setNumero(Integer.parseInt(novoNumero));
                } else {
                    JOptionPane.showMessageDialog(null, "Alteração cancelada.");
                    return;
                }
            }
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
    private MetodosPdf pdf = new MetodosPdf();

    public void gerarPdf(List<Contato> contatos) {
        try {
            String filePath = "Tabela.PDF";
            pdf.gerarPdf(contatos, filePath);
        } catch (Exception erro) {
            System.out.println("Erro ao gerar PDF: " + erro.getMessage());
            throw erro;
        }
    }

    public void abrirPdf(String filePath) {
        try {
            pdf.abrirPdf(filePath);
        } catch (Exception erro) {
            System.out.println("Erro ao abrir PDF: " + erro.getMessage());
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
        if(objeto.getEndereco().getLogradouro().isEmpty()) erro += "Esse campo (Logradouro) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getEndereco().getNumero()).isEmpty()) erro += "Esse campo (Numero) e obrigatorio, nao pode estar vazio.\n";
        if(Integer.toString(objeto.getEndereco().getCep()).isEmpty()) erro += "Esse campo (Cep) e obrigatorio, nao pode estar vazio.\n";
        if(objeto.getEndereco().getCidade().isEmpty()) erro += "Esse campo (Cidade) e obrigatorio, nao pode estar vazio.\n";
        if(objeto.getEndereco().getEstado().isEmpty()) erro += "Esse campo (Estado) e obrigatorio, nao pode estar vazio.\n";
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