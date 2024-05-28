/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviçospdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import modelos.Contato;

public class MetodosPdf {

    public void abrirPdf(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new IOException("Arquivo não encontrado: " + filePath);
            }
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                throw new UnsupportedOperationException("Abertura de PDF não é suportada neste sistema.");
            }
        } catch (IOException ex) {
            System.out.println("Erro ao abrir PDF: " + ex.getMessage());
        }
    }

    public void gerarPdf(List<Contato> contatos, String filePath) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(filePath));
            documento.open();
            for (Contato contato : contatos) {
                documento.add(new Paragraph(contato.toString()));
            }
            documento.close(); // Fechar o documento depois de escrever
            System.out.println("PDF criado com sucesso em: " + filePath);
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado: " + ex.getMessage());
        } catch (DocumentException ex) {
            System.out.println("Erro ao gerar PDF: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro inesperado: " + ex.getMessage());
        }
    }
}