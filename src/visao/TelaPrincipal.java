/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.Contato;
import modelos.Endereco;
import modelos.Telefone;
import persistencia.ContatoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import controle.Controle;
import java.util.List;

/**
 *
 * @author dobne
 */
public class TelaPrincipal extends javax.swing.JFrame {
private Controle controle = new Controle();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1_Lista = new javax.swing.JList<>();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextField1_Telefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_NomeCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Logradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_Numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3_Complemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField1_CEP = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4_Cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4_UF = new javax.swing.JTextField();
        jTextField1_Email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Tabela = new javax.swing.JTable();
        jButton1_Adicionar = new javax.swing.JButton();
        jButton2_Alterar = new javax.swing.JButton();
        jButton3_Excluir = new javax.swing.JButton();
        jButton4_Listar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1_PDF = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPopupMenu1.setFocusable(false);

        jScrollPane2.setViewportView(jList1_Lista);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda de Contatos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("AGENDA DE CONTATOS");

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setForeground(new java.awt.Color(0, 102, 51));

        try {
            jFormattedTextField1_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_Telefone.setText("+55   ()      -    ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Completo:");

        jTextField1_NomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_NomeCompletoActionPerformed(evt);
            }
        });
        jTextField1_NomeCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_NomeCompletoKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");

        jLabel4.setBackground(new java.awt.Color(0, 102, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        jTextField1_Logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_LogradouroActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 102, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logradouro:");

        jLabel7.setBackground(new java.awt.Color(0, 102, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CEP:");

        jLabel8.setBackground(new java.awt.Color(0, 102, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Complemento:");

        jTextField3_Complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_ComplementoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 102, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N°:");

        try {
            jFormattedTextField1_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setBackground(new java.awt.Color(0, 102, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade:");

        jTextField4_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_CidadeActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 102, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UF:");

        jTextField4_UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_UFActionPerformed(evt);
            }
        });
        jTextField4_UF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_UFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField3_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField1_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1_Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField1_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTable1_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Endereço"
            }
        ));
        jTable1_Tabela.getTableHeader().setReorderingAllowed(false);
        jTable1_Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Tabela);

        jButton1_Adicionar.setBackground(new java.awt.Color(0, 102, 51));
        jButton1_Adicionar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1_Adicionar.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jButton1_Adicionar.setText("ADICIONAR");
        jButton1_Adicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_AdicionarActionPerformed(evt);
            }
        });

        jButton2_Alterar.setBackground(new java.awt.Color(0, 102, 51));
        jButton2_Alterar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2_Alterar.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jButton2_Alterar.setText("ALTERAR");
        jButton2_Alterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AlterarActionPerformed(evt);
            }
        });

        jButton3_Excluir.setBackground(new java.awt.Color(0, 102, 51));
        jButton3_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton3_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButton3_Excluir.setText("EXCLUIR");
        jButton3_Excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_ExcluirActionPerformed(evt);
            }
        });

        jButton4_Listar.setBackground(new java.awt.Color(0, 102, 51));
        jButton4_Listar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton4_Listar.setForeground(new java.awt.Color(255, 255, 255));
        jButton4_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        jButton4_Listar.setText("LISTAR");
        jButton4_Listar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_ListarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.jpeg"))); // NOI18N

        jButton1_PDF.setBackground(new java.awt.Color(0, 102, 51));
        jButton1_PDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_PDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pdf.png"))); // NOI18N
        jButton1_PDF.setText("PDF");
        jButton1_PDF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_PDFActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setText("Sobre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton1_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void gerarPDF() throws Exception {
    List<Contato> contato = controle.listar(); // Supondo que existe um método listar na classe Controle
    controle.gerarPdf(contato);
    JOptionPane.showMessageDialog(this, "PDF criado com sucesso!");
}

private void abrirPdf() {
    String filePath = "Tabela.PDF";
    controle.abrirPdf(filePath);
}
    private void jButton3_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_ExcluirActionPerformed
        if (jTable1_Tabela.getSelectedRow() != -1) {
        int contato = jTable1_Tabela.getSelectedRow();
        
        String nome = jTable1_Tabela.getValueAt(contato, 0).toString();
        try{
            ContatoDAO contatoDao = new ContatoDAO();
            
            jButton4_ListarActionPerformed(evt);
            jTextField1_NomeCompleto.setEnabled(true);
            jTextField1_NomeCompleto.setText("");
            jFormattedTextField1_Telefone.setText("");
            jTextField1_Email.setText("");
            jTextField1_Logradouro.setText(" ");
            jTextField2_Numero.setText("");
            jFormattedTextField1_CEP.setText("");
            jTextField3_Complemento.setText(" ");
            jTextField4_Cidade.setText(" ");
            jTextField4_UF.setText(" ");
            controle.excluir(nome);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this,erro.getMessage());
        }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um contato para excluir.");
        }
    
    }//GEN-LAST:event_jButton3_ExcluirActionPerformed

    private void jTextField1_LogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_LogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_LogradouroActionPerformed

    private void jTextField3_ComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_ComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_ComplementoActionPerformed

    private void jTextField4_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_CidadeActionPerformed

    private void jTextField4_UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_UFActionPerformed

    private void jButton1_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_PDFActionPerformed

    try {
        gerarPDF();
    } catch (Exception ex) {
        Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
        abrirPdf();
    }//GEN-LAST:event_jButton1_PDFActionPerformed

    private void jTable1_TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_TabelaMouseClicked
        // TODO add your handling code here:
        boolean click = jTable1_Tabela.isEditing();
        if(click==false){
            JOptionPane.showMessageDialog(null, "O campo não pode ser editado.");
        }
        
        jTextField1_NomeCompleto.setEnabled(false);
        DefaultTableModel table = (DefaultTableModel)jTable1_Tabela.getModel();
        int selecionado = jTable1_Tabela.getSelectedRow();
       
        String tblNome = table.getValueAt(selecionado, 0).toString();
        String tblTelefone = table.getValueAt(selecionado, 1).toString();
        String tblEmail = table.getValueAt(selecionado, 2).toString();
        String tblEndereco = table.getValueAt(selecionado, 3).toString();
        
        String[] telefone = tblTelefone.split(";");
        String[] endereco = tblEndereco.split(";");
       
        jTextField1_NomeCompleto.setText(tblNome);
        jFormattedTextField1_Telefone.setText(telefone[0] + telefone[1] + telefone[2]);
        jTextField1_Email.setText(tblEmail);
        
        jTextField1_Logradouro.setText(endereco[0]);
        jTextField2_Numero.setText(endereco[1].trim());
        jTextField3_Complemento.setText(endereco[2].trim());
        jFormattedTextField1_CEP.setText(endereco[3].trim());
        jTextField4_Cidade.setText(endereco[4]);
        jTextField4_UF.setText(endereco[5]);
              
    }//GEN-LAST:event_jTable1_TabelaMouseClicked

    private void jButton1_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_AdicionarActionPerformed
        // TODO add your handling code here:
        String nome = jTextField1_NomeCompleto.getText();
        String telefone = jFormattedTextField1_Telefone.getText();
        String email = jTextField1_Email.getText();
        String logradouro = jTextField1_Logradouro.getText();
        int numero = Integer.parseInt(jTextField2_Numero.getText().trim().replaceAll("[^0-9]", ""));
        String complemento = jTextField3_Complemento.getText();
        int cep = Integer.parseInt(jFormattedTextField1_CEP.getText().trim().replaceAll("[^0-9]", ""));
        String cidade = jTextField4_Cidade.getText();
        String estado = jTextField4_UF.getText();

        try{
            ContatoDAO cont = new ContatoDAO();
            Endereco end = new Endereco(logradouro, numero, complemento, cep, cidade, estado);
            String digitos = telefone.replaceAll("[^0-9]", "");
            
            // Extrair DDI, DDD e número
            String ddi = digitos.substring(0, 2);
            String ddd = digitos.substring(2, 4);
            String numeroTel = digitos.substring(4);

            Telefone tel = new Telefone(Integer.parseInt(ddi), Integer.parseInt(ddd), Integer.parseInt(numeroTel));
            Contato contato = new Contato(nome, tel, email, end); 
            DefaultTableModel model = (DefaultTableModel) jTable1_Tabela.getModel();
            controle.incluir(contato);
            cont.incluir(contato);

            jTextField1_NomeCompleto.setText("");
            jFormattedTextField1_Telefone.setText("");
            jTextField1_Email.setText("");
            jTextField1_Logradouro.setText(" ");
            jTextField2_Numero.setText("");
            jFormattedTextField1_CEP.setText("");
            jTextField3_Complemento.setText(" ");
            jTextField4_Cidade.setText(" ");
            jTextField4_UF.setText(" ");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this,erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_AdicionarActionPerformed

    private void jButton4_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_ListarActionPerformed
        jTable1_Tabela.setRowSorter(null);
        DefaultTableModel model = (DefaultTableModel) jTable1_Tabela.getModel();

        ContatoDAO contatoDAO = new ContatoDAO();
        ArrayList<Contato> contatos;
        try {
            contatos = contatoDAO.listar(); // Obtém a lista de contatos

            model.setRowCount(0); // Limpa a tabela antes de adicionar os novos dados
            for (Contato contato : contatos) {
                // Obtém Telefone e Endereço de cada Contato
                Telefone telefone = contato.getTelefone();
                Endereco endereco = contato.getEndereco();
                String telefoneStr = telefone.getDdi() + ";" + telefone.getDdd() + ";" + telefone.getNumero();
                String enderecoStr = endereco.getLogradouro() + ";" + endereco.getNumero() + ";" + endereco.getComplemento() + ";" + endereco.getCep() + ";" + endereco.getCidade() + ";" + endereco.getEstado();
            
                // Adiciona os dados na tabela, cada campo em sua própria coluna
                Object[] dados = new Object[] {
                    contato.getNomeCompleto(),
                    telefoneStr,
                    contato.getEmail(),
                    enderecoStr
                };
                model.addRow(dados);
            }
        } catch (Exception erro) {
        }
        jTextField1_NomeCompleto.setEnabled(true);
        jTextField1_NomeCompleto.setText("");
        jFormattedTextField1_Telefone.setText("");
        jTextField1_Email.setText("");
        jTextField1_Logradouro.setText(" ");
        jTextField2_Numero.setText("");
        jFormattedTextField1_CEP.setText("");
        jTextField3_Complemento.setText(" ");
        jTextField4_Cidade.setText(" ");
        jTextField4_UF.setText(" ");
    }//GEN-LAST:event_jButton4_ListarActionPerformed

    private void jButton2_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AlterarActionPerformed
        if (jTable1_Tabela.getSelectedRow() != -1) {
            String nomeCompleto = jTextField1_NomeCompleto.getText();
            String telefone = jFormattedTextField1_Telefone.getText();
            String email = jTextField1_Email.getText();
            String logradouro = jTextField1_Logradouro.getText();
            int numero = Integer.parseInt(jTextField2_Numero.getText().trim().replaceAll("[^0-9]", ""));
            String complemento = jTextField3_Complemento.getText();
            int cep = Integer.parseInt(jFormattedTextField1_CEP.getText().trim().replaceAll("[^0-9]", ""));
            String cidade = jTextField4_Cidade.getText();
            String estado = jTextField4_UF.getText();

            Endereco enderecoAtualizado = new Endereco(logradouro, numero, complemento, cep, cidade, estado);
            String digitos = telefone.replaceAll("[^0-9]", "");

            // Extrair DDI, DDD e número
            String ddi = digitos.substring(0, 2);
            String ddd = digitos.substring(2, 4);
            String numeroTel = digitos.substring(4);

            //Cria Telefone e Endereço atualizados
            Telefone telefoneAtualizado = new Telefone(Integer.parseInt(ddi), Integer.parseInt(ddd), Integer.parseInt(numeroTel));
            Contato contato = new Contato(nomeCompleto, telefoneAtualizado, email, enderecoAtualizado);

            Contato contatoAtualizado = new Contato(nomeCompleto, telefoneAtualizado, email, enderecoAtualizado);
            ContatoDAO contatoDAO = new ContatoDAO();

            try {
                controle.alterar(contato);
                contatoDAO.alterar(contatoAtualizado);

                // Atualiza a lista
                jButton4_ListarActionPerformed(evt);

                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
                jTextField1_NomeCompleto.setEnabled(true);
                jTextField1_NomeCompleto.setText("");
                jFormattedTextField1_Telefone.setText("");
                jTextField1_Email.setText("");
                jTextField1_Logradouro.setText(" ");
                jTextField2_Numero.setText("");
                jFormattedTextField1_CEP.setText("");
                jTextField3_Complemento.setText(" ");
                jTextField4_Cidade.setText(" ");
                jTextField4_UF.setText(" ");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um contato para alterar.");   
            }
    }//GEN-LAST:event_jButton2_AlterarActionPerformed

    private void jTextField1_NomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_NomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_NomeCompletoActionPerformed

    private void jTextField1_NomeCompletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_NomeCompletoKeyReleased
        int posicao = jTextField1_NomeCompleto.getCaretPosition();
        jTextField1_NomeCompleto.setText(jTextField1_NomeCompleto.getText().toUpperCase());
        jTextField1_NomeCompleto.setCaretPosition(posicao);
        
        // Cria um novo filtro apenas se o campo de texto não estiver vazio
        DefaultTableModel model = (DefaultTableModel) jTable1_Tabela.getModel();
        TableRowSorter<DefaultTableModel> linha = new TableRowSorter<>(model);
        jTable1_Tabela.setRowSorter(linha);
        linha.setRowFilter(RowFilter.regexFilter(jTextField1_NomeCompleto.getText()));
    
    }//GEN-LAST:event_jTextField1_NomeCompletoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaSobre obj = new TelaSobre();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4_UFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_UFKeyReleased
        int posicao = jTextField4_UF.getCaretPosition();
        jTextField4_UF.setText(jTextField4_UF.getText().toUpperCase());
        jTextField4_UF.setCaretPosition(posicao);
    }//GEN-LAST:event_jTextField4_UFKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Adicionar;
    private javax.swing.JButton jButton1_PDF;
    private javax.swing.JButton jButton2_Alterar;
    private javax.swing.JButton jButton3_Excluir;
    private javax.swing.JButton jButton4_Listar;
    private javax.swing.JFormattedTextField jFormattedTextField1_CEP;
    private javax.swing.JFormattedTextField jFormattedTextField1_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1_Lista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_Tabela;
    private javax.swing.JTextField jTextField1_Email;
    private javax.swing.JTextField jTextField1_Logradouro;
    private javax.swing.JTextField jTextField1_NomeCompleto;
    private javax.swing.JTextField jTextField2_Numero;
    private javax.swing.JTextField jTextField3_Complemento;
    private javax.swing.JTextField jTextField4_Cidade;
    private javax.swing.JTextField jTextField4_UF;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
