/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelos.Contato;
import modelos.Endereco;
import modelos.Icrud;
import modelos.Telefone;

/**
 *
 * @author dobne
 */
public class ContatoDAO implements Icrud {
    private static String nomeArquivo = "./dados/AgendaDeContatos.csv";
    
@Override
public void incluir(Contato objeto) throws Exception{
    try {
        FileWriter fw = new FileWriter(nomeArquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        Telefone telefone = objeto.getTelefone();
        Endereco endereco = objeto.getEndereco();
        
        String linha = String.join(";",
                objeto.getNomeCompleto(),
                Integer.toString(telefone.getDdi()),
                Integer.toString(telefone.getDdd()),
                Integer.toString(telefone.getNumero()),
                objeto.getEmail(),
                endereco.getLogradouro(),
                Integer.toString(endereco.getNumero()),
                endereco.getComplemento(),
                Integer.toString(endereco.getCep()),
                endereco.getCidade(),
                endereco.getEstado());

        bw.write(linha);
        bw.newLine();
        bw.close();
    } catch (Exception erro) {
        throw erro;
    }
}

    
    
@Override
public ArrayList<Contato> listar() throws Exception{
    ArrayList<Contato> lista = new ArrayList<>();

    try (BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo))) {
        String linha;
        while ((linha = buffRead.readLine()) != null) {
            String[] partes = linha.split(";");

                String nome = partes[0];
                    
                int ddi = Integer.parseInt(partes[1]);
                int ddd = Integer.parseInt(partes[2]);
                int numero = Integer.parseInt(partes[3]);
                Telefone telefone = new Telefone(ddi, ddd, numero);

                String email = partes[4];

                String logradouro = partes[5];
                int numeroEndereco = Integer.parseInt(partes[6]);
                String complemento = partes[7];
                int cep = Integer.parseInt(partes[8]);
                String cidade = partes[9];
                String estado = partes[10];
                Endereco endereco = new Endereco(logradouro, numeroEndereco, complemento, cep, cidade, estado);

                Contato contato = new Contato(nome, telefone, email, endereco);
                lista.add(contato);
                } 
        }catch (Exception e) {
            e.printStackTrace();
        }
    
        // Ordenar a lista de contatos pelo nome completo
        Collections.sort(lista, new Comparator<Contato>() {
            @Override
            public int compare(Contato contato1, Contato contato2) {
                return contato1.getNomeCompleto().compareToIgnoreCase(contato2.getNomeCompleto());
            }
        });
    
    return lista;
}



    @Override
    public void excluir(String nomeCompleto) {
        ArrayList<String> auxiliar = new ArrayList<>(); //criação de lista auxiliar
        boolean contatoEncontrado = false;

        try (BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = buffRead.readLine()) != null){
                String[] contato = linha.split(";");
                if(!contato[0].equalsIgnoreCase(nomeCompleto)){ //se a lista não contém o nome, adiciona à lista auxiliar
                    auxiliar.add(linha);
                } else {
                    contatoEncontrado = true; //se a lista contém o nome, ele é marcado como encontrado
                                              //mas não é adicionado à lista 
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        if(contatoEncontrado){
            try(BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeArquivo))) {
                for(String linha : auxiliar){
                    buffWrite.write(linha);
                    buffWrite.newLine();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }       
}

@Override
public void alterar(Contato objeto) throws Exception {
    // Ler todos os contatos do arquivo
    ArrayList<Contato> contatos = listar();
    
    // Encontrar o contato a ser alterado na lista
    boolean contatoEncontrado = false;
    for (int i = 0; i < contatos.size(); i++) {
        Contato contato = contatos.get(i);
        if (contato.getNomeCompleto().equalsIgnoreCase(objeto.getNomeCompleto())) {
            // Atualizar os dados do contato
            contatos.set(i, objeto);
            contatoEncontrado = true;
            break;
        }
    }
    
    if (contatoEncontrado) {
        // Escrever o contato atualizado de volta no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Contato contato : contatos) {
                Telefone telefone = contato.getTelefone();
                Endereco endereco = contato.getEndereco();
                String linha = String.join(";",
                        contato.getNomeCompleto(),
                        Integer.toString(telefone.getDdi()),
                        Integer.toString(telefone.getDdd()),
                        Integer.toString(telefone.getNumero()),
                        contato.getEmail(),
                        endereco.getLogradouro(),
                        Integer.toString(endereco.getNumero()),
                        endereco.getComplemento(),
                        Integer.toString(endereco.getCep()),
                        endereco.getCidade(),
                        endereco.getEstado());
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new Exception("Erro ao salvar o contato no arquivo.", e);
        }
    } else {
        throw new Exception("Contato não encontrado.");
    }
    
    }
@Override
    public void AbrirPdf(String filePath) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(filePath));
            } else {
                throw new UnsupportedOperationException("Abertura de PDF não é suportada neste sistema.");
            }
        } catch (IOException ex) { 
            System.out.println(ex); 
         } 
        }
    
    @Override
     public void GerarPDF(List<Contato> contatos){
    Document Documento = new Document();
         try {
             PdfWriter.getInstance(Documento, new FileOutputStream("Tabela.PDF"));
             Documento.open();
             for (Contato contato : contatos) {
                Documento.add(new Paragraph(contato.toString()));
            }
         } catch (FileNotFoundException ex) {
             System.out.println(ex);
         } catch (DocumentException ex) {
             System.out.println(ex);
         }
}
}
