/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.DaoConsulta;
import fatec.poo.control.DaoMedico;
import fatec.poo.control.DaoPaciente;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Consulta;
import fatec.poo.model.Medico;
import fatec.poo.model.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class GuiConsulta extends javax.swing.JFrame {

    /**
     * Creates new form GuiConsulta
     */
    public GuiConsulta() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtformCpfMedico = new javax.swing.JFormattedTextField();
        txtformCpfPaciente = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtformData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultarMedico = new javax.swing.JButton();
        btnConsultarPaciente = new javax.swing.JButton();
        lblNomeMedico = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNomePaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcar Consulta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("CPF Médico");

        try {
            txtformCpfMedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtformCpfMedico.setEnabled(false);

        try {
            txtformCpfPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtformCpfPaciente.setEnabled(false);

        jLabel3.setText("CPF Paciente");

        jLabel4.setText("Data");

        try {
            txtformData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtformData.setEnabled(false);

        jLabel5.setText("Valor");

        txtValor.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/save.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultarMedico.setText("jButton1");
        btnConsultarMedico.setEnabled(false);
        btnConsultarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMedicoActionPerformed(evt);
            }
        });

        btnConsultarPaciente.setText("jButton2");
        btnConsultarPaciente.setEnabled(false);
        btnConsultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPacienteActionPerformed(evt);
            }
        });

        lblNomeMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblNomeMedico.setEnabled(false);

        lblNomePaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblNomePaciente.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(30, 30, 30)
                        .addComponent(btnInserir)
                        .addGap(26, 26, 26)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtformData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtformCpfPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtformCpfMedico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConsultarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConsultarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnSair))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtformCpfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultarMedico))
                    .addComponent(lblNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtformCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnConsultarPaciente))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtformData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
      
           
            int cod = Integer.parseInt(txtCodigo.getText());
            consulta = daoConsulta.consultar(cod);

            if (consulta == null) {
                
                
                txtCodigo.setEnabled(false); 
                
                
                txtformCpfMedico.setEnabled(true);
                btnConsultarMedico.setEnabled(true);
                txtformCpfMedico.requestFocus();
                
                
                txtformCpfMedico.setText("");
                lblNomeMedico.setText("");
                txtformCpfPaciente.setText("");
                lblNomePaciente.setText("");
                txtformData.setText("");
                txtValor.setText("");
                
                
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            } else {
       
        txtCodigo.setText(String.valueOf(consulta.getCodigo()));
        txtformData.setText(consulta.getData());
        txtValor.setText(String.valueOf(consulta.getValor()));

        
        if (consulta.getMedico() != null) {
             txtformCpfMedico.setText(consulta.getMedico().getCpf());
             lblNomeMedico.setText(consulta.getMedico().getNome());
        }

        
        paciente = daoConsulta.buscarPacienteDaConsulta(cod);
        if (paciente != null) {
            txtformCpfPaciente.setText(paciente.getCpf());
            lblNomePaciente.setText(paciente.getNome());
        }
        
        
        txtCodigo.setEnabled(false);
        txtformCpfMedico.setEnabled(false);
        btnConsultarMedico.setEnabled(false);
        txtformCpfPaciente.setEnabled(false);
        btnConsultarPaciente.setEnabled(false);

        
        txtformData.setEnabled(true);
        txtValor.setEnabled(true);
        
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
       consulta = new Consulta(Integer.parseInt(txtCodigo.getText()), txtformData.getText());
        consulta.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));

        medico.addConsulta(consulta);
        paciente.addConsulta(consulta);

        daoConsulta.inserir(consulta, paciente);

        txtCodigo.setText("");
        txtformData.setText("");
        txtValor.setText("");
        lblNomeMedico.setText("");
        lblNomePaciente.setText("");
        txtformCpfMedico.setText("");
        txtformCpfPaciente.setText("");

        txtformCpfMedico.setEnabled(false);
        txtformCpfPaciente.setEnabled(false);
        btnConsultarMedico.setEnabled(false);
        btnConsultarPaciente.setEnabled(false);

        txtCodigo.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
             consulta.setData(txtformData.getText());
             consulta.setValor(Double.parseDouble(txtValor.getText()));
             daoConsulta.alterar(consulta);
         }
        txtCodigo.setText(null);
        txtformData.setText(null);
        txtValor.setText(null);
        lblNomeMedico.setText(null);
        lblNomePaciente.setText(null);
        txtformCpfMedico.setText(null);
        txtformCpfPaciente.setText(null);
        txtformData.setEnabled(false);
        txtValor.setEnabled(false);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConsultar.setEnabled(true);
        txtCodigo.setEnabled(true);
         
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
        daoConsulta.excluir(consulta);
            
        txtCodigo.setText(null);
        txtformData.setText(null);
        txtValor.setText(null);
        lblNomeMedico.setText(null);
        lblNomePaciente.setText(null);
        txtformCpfMedico.setText(null);
        txtformCpfPaciente.setText(null);
        
        txtformData.setEnabled(false);
        txtValor.setEnabled(false);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConsultar.setEnabled(true);
        txtCodigo.setEnabled(true);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMedicoActionPerformed
        String cpf = txtformCpfMedico.getText().replace(".", "").replace("-", "").trim();

        if (cpf.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite o CPF do Médico!");
            return;
        }

        medico = daoMedico.consultar(cpf);

        if (medico == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Médico não cadastrado");
            txtformCpfMedico.requestFocus();
            lblNomeMedico.setText("");
        } else {

            lblNomeMedico.setText(medico.getNome());

            txtformCpfMedico.setEnabled(false);
            btnConsultarMedico.setEnabled(false);

            txtformCpfPaciente.setEnabled(true);
            btnConsultarPaciente.setEnabled(true);
            txtformCpfPaciente.requestFocus();
    }
    }//GEN-LAST:event_btnConsultarMedicoActionPerformed

    private void btnConsultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPacienteActionPerformed
         String cpf = txtformCpfPaciente.getText().replace(".", "").replace("-", "").trim();

        paciente = daoPaciente.consultar(cpf);

        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Paciente não cadastrado");
            txtformCpfPaciente.requestFocus();
            lblNomePaciente.setText("");
        } else {
            lblNomePaciente.setText(paciente.getNome());

            txtformCpfPaciente.setEnabled(false);
            btnConsultarPaciente.setEnabled(false);

            txtformData.setEnabled(true);
            txtValor.setEnabled(true);
            btnInserir.setEnabled(true);
            txtformData.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarPacienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("","");
        prepCon.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
        prepCon.setConnectionString("jdbc:ucanaccess://C:\\Users\\artur\\ProjetoPOO\\prjPOOPietroArturAna\\src\\fatec\\poo\\basededados\\BDClinica.accdb");

        daoConsulta = new DaoConsulta(prepCon.abrirConexao());
        daoMedico = new DaoMedico(prepCon.abrirConexao());
        daoPaciente = new DaoPaciente(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarMedico;
    private javax.swing.JButton btnConsultarPaciente;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNomeMedico;
    private javax.swing.JLabel lblNomePaciente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtValor;
    private javax.swing.JFormattedTextField txtformCpfMedico;
    private javax.swing.JFormattedTextField txtformCpfPaciente;
    private javax.swing.JFormattedTextField txtformData;
    // End of variables declaration//GEN-END:variables
 private Medico medico = null;
    private DaoMedico daoMedico = null;
    private Paciente paciente = null;
    private DaoPaciente daoPaciente = null;
    private Consulta consulta = null;
    private DaoConsulta daoConsulta = null;
    private PreparaConexao prepCon = null;
}
