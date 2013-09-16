/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.gui.cadastros;

import br.tecnocar.main.Main;
import br.tecnocar.source.cadastros.Pessoa;
// import br.tecnocar.source.cadastros.PessoaFisica;
import br.tecnocar.util.Habilita_Desabilita_Campos;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author MiltonRogerio
 */
/*
public class CadCliFor extends javax.swing.JDialog {

    Habilita_Desabilita_Campos hab_des = new Habilita_Desabilita_Campos();
    private Pessoa cl;

    private MaskFormatter setMascara(String masc) {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(masc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mask;
    }

    public CadCliFor(java.awt.Frame parent, boolean modal, Pessoa cl) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); // Esse comando esta dizendo que a tela vai abrir centralizada         
        this.cl = cl;
        hab_des.botaoCancelar(jPCadastro, jPBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCbPessoa = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jCbAtivo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTfNmRazao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTfFantasia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTfCpfCnpj = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTfRgIe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTfFone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTfCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTfFax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTfEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTfCep = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTfCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTfLogradouro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTfNumero = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVeiculo = new javax.swing.JTable();
        jTfBairro = new javax.swing.JTextField();
        jBtnPCidade = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTfUF = new javax.swing.JTextField();
        jPBtn = new javax.swing.JPanel();
        jBtnNovo = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jFtDtcadastro = new javax.swing.JFormattedTextField();
        jFtDtNascimento = new javax.swing.JFormattedTextField();
        jXDtCadastro = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente / Fornecedor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO CLIENTE/FORNCEDOR");
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CODIGO");

        jTfCodigo.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PESSOA");

        jCbPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fisica", "Juridica" }));
        jCbPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbPessoaMouseClicked(evt);
            }
        });
        jCbPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbPessoaItemStateChanged(evt);
            }
        });
        jCbPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbPessoaActionPerformed(evt);
            }
        });
        jCbPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCbPessoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCbPessoaFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ATIVO");

        jCbAtivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("DATA CADASTRO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("NOME / RAZAO SOCIAL");

        jTfNmRazao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTfNmRazaoFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("FANTASIA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("CPF / CNPJ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("RG / IE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("DATA NASCIMENTO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("FONE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CELULAR");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("FAX");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("E-MAIL");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("CEP");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("CIDADE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("LOGRADOURO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("NUMERO");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("BAIRRO / COMPLEMENTO");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("CADASTRO DE VEICULOS");

        jTVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PLACA", "DESCRICAO", "COR", "CHASSI"
            }
        ));
        jScrollPane1.setViewportView(jTVeiculo);

        jBtnPCidade.setText("pesq");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("UF");

        jBtnNovo.setText("NOVO");
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("ALTERAR");

        jBtnExcluir.setText("EXCLUIR");

        jBtnSalvar.setText("SALVAR");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBtnLayout = new javax.swing.GroupLayout(jPBtn);
        jPBtn.setLayout(jPBtnLayout);
        jPBtnLayout.setHorizontalGroup(
            jPBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPBtnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnAlterar, jBtnCancelar, jBtnExcluir, jBtnNovo, jBtnSalvar});

        jPBtnLayout.setVerticalGroup(
            jPBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBtnLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNovo)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        jPBtnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnAlterar, jBtnCancelar, jBtnExcluir, jBtnNovo, jBtnSalvar});

        try {
            jFtDtcadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addComponent(jTfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTfFax, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jTfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jTfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel9)
                                .addGap(93, 93, 93)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jFtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(104, 104, 104)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jFtDtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTfNmRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addComponent(jTfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnPCidade))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTfFantasia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroLayout.createSequentialGroup()
                                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTfRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(107, 107, 107)))
                                .addGap(142, 142, 142)
                                .addComponent(jXDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFtDtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTfNmRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPCidade)
                            .addComponent(jTfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
        // TODO add your handling code here:        
        hab_des.botaoIncluir(jPCadastro, jPBtn);
        jTfFantasia.setEnabled(false);
    }//GEN-LAST:event_jBtnNovoActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        hab_des.botaoCancelar(jPCadastro, jPBtn);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jCbPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbPessoaActionPerformed

    private void jCbPessoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCbPessoaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbPessoaFocusGained

    private void jCbPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCbPessoaFocusLost
        // TODO add your handling code here:
        if (jCbPessoa.getSelectedItem().equals("Fisica")) {
            jTfFantasia.setEnabled(false);
        } else if (jCbPessoa.getSelectedItem().equals("Juridica")) {
            jTfFantasia.setEnabled(true);
        }
    }//GEN-LAST:event_jCbPessoaFocusLost

    private void jCbPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbPessoaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbPessoaMouseClicked

    private void jCbPessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbPessoaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbPessoaItemStateChanged

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // TODO add your handling code here:
        salvar();
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    public void salvar() {

        cl = new PessoaFisica();

        cl.setNome(jTfNmRazao.getText());

        try {
            if (jTfCodigo.getText().isEmpty()) {
                Main.dao.insere(cl);
            } else {
                Main.dao.atualiza(cl);
            }
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(CadCliFor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTfNmRazaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfNmRazaoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNmRazaoFocusLost
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnPCidade;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JComboBox jCbAtivo;
    private javax.swing.JComboBox jCbPessoa;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFtDtNascimento;
    private javax.swing.JFormattedTextField jFtDtcadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPBtn;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVeiculo;
    private javax.swing.JTextField jTfBairro;
    private javax.swing.JTextField jTfCelular;
    private javax.swing.JTextField jTfCep;
    private javax.swing.JTextField jTfCidade;
    private javax.swing.JTextField jTfCodigo;
    private javax.swing.JTextField jTfCpfCnpj;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfFantasia;
    private javax.swing.JTextField jTfFax;
    private javax.swing.JTextField jTfFone;
    private javax.swing.JTextField jTfLogradouro;
    private javax.swing.JTextField jTfNmRazao;
    private javax.swing.JTextField jTfNumero;
    private javax.swing.JTextField jTfRgIe;
    private javax.swing.JTextField jTfUF;
    private org.jdesktop.swingx.JXDatePicker jXDtCadastro;
    // End of variables declaration//GEN-END:variables
}
*/