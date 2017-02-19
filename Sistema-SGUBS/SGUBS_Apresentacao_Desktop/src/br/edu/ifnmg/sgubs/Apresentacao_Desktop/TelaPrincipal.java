/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

/**
 *
 * @author dayvison
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal1
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PainelFundo = new javax.swing.JLabel();
        jButtonTecEnfermagem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonMedicos = new javax.swing.JButton();
        jButtonPaciente = new javax.swing.JButton();
        jButtonMedicamentos = new javax.swing.JButton();
        jButtonTecEnfermagem1 = new javax.swing.JButton();
        jButtonTecEnfermagem2 = new javax.swing.JButton();
        jButtonTecEnfermagem3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuEspecialidade = new javax.swing.JMenuItem();
        MenuFuncionarios = new javax.swing.JMenuItem();
        MenuMedicamento = new javax.swing.JMenuItem();
        MenuMedicos = new javax.swing.JMenuItem();
        MenuPacientes = new javax.swing.JMenuItem();
        MenuTecEnfermagem = new javax.swing.JMenuItem();
        MenuUnidadeDeSaude = new javax.swing.JMenuItem();
        MenuAgendamento = new javax.swing.JMenu();
        MenuAgendaConsultas = new javax.swing.JMenuItem();
        MenuFarmacia = new javax.swing.JMenu();
        MenuSairLogoff = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuLogoff = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGUBS-Sistema De Gerenciamento De Unidade Basíca De Saúde");
        setAlwaysOnTop(true);
        setSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(null);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setTitle("Acesso Rápido");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel1.setText("Sistema de Gerenciamento de Unidades Basica de Saúde");
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 7, 400, 30);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLayeredPane1CaretPositionChanged(evt);
            }
        });

        PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconengrenagem.png"))); // NOI18N
        jLayeredPane1.add(PainelFundo);
        PainelFundo.setBounds(580, -60, 770, 360);

        jButtonTecEnfermagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconConsultas.png"))); // NOI18N
        jButtonTecEnfermagem.setToolTipText("Agendamento");
        jButtonTecEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTecEnfermagemActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonTecEnfermagem);
        jButtonTecEnfermagem.setBounds(10, 180, 90, 90);

        jLabel2.setText("Cadastros :");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(10, 10, 77, 17);

        jButtonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedico.jpg"))); // NOI18N
        jButtonMedicos.setToolTipText("Médicos");
        jButtonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonMedicos);
        jButtonMedicos.setBounds(10, 40, 90, 90);

        jButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPaciente.png"))); // NOI18N
        jButtonPaciente.setToolTipText("Paciêntes");
        jButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonPaciente);
        jButtonPaciente.setBounds(110, 40, 90, 90);

        jButtonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedicamento.png"))); // NOI18N
        jButtonMedicamentos.setToolTipText("Medicamentos");
        jButtonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicamentosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonMedicamentos);
        jButtonMedicamentos.setBounds(210, 40, 90, 90);

        jButtonTecEnfermagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconFuncionarios.png"))); // NOI18N
        jButtonTecEnfermagem1.setToolTipText("Funcionarios");
        jButtonTecEnfermagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTecEnfermagem1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonTecEnfermagem1);
        jButtonTecEnfermagem1.setBounds(510, 40, 90, 90);

        jButtonTecEnfermagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconTecEnfermagem.png"))); // NOI18N
        jButtonTecEnfermagem2.setToolTipText("TecEnfermagem");
        jButtonTecEnfermagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTecEnfermagem2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonTecEnfermagem2);
        jButtonTecEnfermagem2.setBounds(310, 40, 90, 90);

        jButtonTecEnfermagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUnidadeDeSaude.png"))); // NOI18N
        jButtonTecEnfermagem3.setToolTipText("Unidades de Saúde");
        jButtonTecEnfermagem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTecEnfermagem3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonTecEnfermagem3);
        jButtonTecEnfermagem3.setBounds(410, 40, 90, 90);

        jLabel3.setText("Agendamento :");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(10, 150, 106, 17);

        jInternalFrame1.getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 80, 870, 624);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 140, 880, 490);

        MenuPrincipal.setName(""); // NOI18N

        MenuCadastros.setText("Cadastros");

        MenuEspecialidade.setText("Especialidades");
        MenuEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEspecialidadeActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuEspecialidade);

        MenuFuncionarios.setText("Funcionários");
        MenuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionariosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuFuncionarios);

        MenuMedicamento.setText("Medicamentos");
        MenuMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicamentoActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuMedicamento);

        MenuMedicos.setText("Medicos");
        MenuMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuMedicos);

        MenuPacientes.setText("Pacientes");
        MenuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPacientesActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuPacientes);

        MenuTecEnfermagem.setText("Téc Enfermagem");
        MenuTecEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTecEnfermagemActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuTecEnfermagem);

        MenuUnidadeDeSaude.setText("Unidades De Saúde");
        MenuUnidadeDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUnidadeDeSaudeActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuUnidadeDeSaude);

        MenuPrincipal.add(MenuCadastros);

        MenuAgendamento.setText("Agendamento");

        MenuAgendaConsultas.setText("AgendarConsultas");
        MenuAgendaConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaConsultasActionPerformed(evt);
            }
        });
        MenuAgendamento.add(MenuAgendaConsultas);

        MenuPrincipal.add(MenuAgendamento);

        MenuFarmacia.setText("Farmacia");
        MenuPrincipal.add(MenuFarmacia);

        MenuSairLogoff.setText("Sair/Logoff");
        MenuSairLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairLogoffActionPerformed(evt);
            }
        });

        jMenuItem1.setText("ControleUsuario");
        MenuSairLogoff.add(jMenuItem1);

        MenuLogoff.setText("Logoff");
        MenuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogoffActionPerformed(evt);
            }
        });
        MenuSairLogoff.add(MenuLogoff);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuSairLogoff.add(MenuSair);

        MenuPrincipal.add(MenuSairLogoff);

        setJMenuBar(MenuPrincipal);

        setSize(new java.awt.Dimension(887, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPacientesActionPerformed
        TelaPacienteListagem tela=new TelaPacienteListagem();
        this.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_MenuPacientesActionPerformed

    private void MenuMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicosActionPerformed
        TelaMedicoListagem tela=new TelaMedicoListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_MenuMedicosActionPerformed

    private void MenuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionariosActionPerformed
       TelaFuncionarioListagem tela = new TelaFuncionarioListagem();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_MenuFuncionariosActionPerformed

    private void MenuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogoffActionPerformed
        new TelaLogin().setVisible(true);

    }//GEN-LAST:event_MenuLogoffActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuSairLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairLogoffActionPerformed
        //System.exit(0);
               // TODO add your handling code here:
    }//GEN-LAST:event_MenuSairLogoffActionPerformed

    private void MenuEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEspecialidadeActionPerformed
       TelaEspecialidadeListagem tela = new TelaEspecialidadeListagem();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_MenuEspecialidadeActionPerformed

    private void MenuUnidadeDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUnidadeDeSaudeActionPerformed
       TelaUnidadeDeSaudeListagem tela = new TelaUnidadeDeSaudeListagem();
       this.add(tela);
       tela.setVisible(true);
        
    }//GEN-LAST:event_MenuUnidadeDeSaudeActionPerformed

    private void MenuTecEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTecEnfermagemActionPerformed
       TelaTecEnfermagemListagem tela = new TelaTecEnfermagemListagem();
       this.add(tela);
       tela.setVisible(true);
       
    }//GEN-LAST:event_MenuTecEnfermagemActionPerformed

    private void MenuMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicamentoActionPerformed
        TelaMedicamentoListagem tela = new TelaMedicamentoListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_MenuMedicamentoActionPerformed

    private void jLayeredPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLayeredPane1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLayeredPane1CaretPositionChanged

    private void jButtonTecEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTecEnfermagemActionPerformed
       TelaTecEnfermagemListagem tela = new TelaTecEnfermagemListagem();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_jButtonTecEnfermagemActionPerformed

    private void jButtonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicosActionPerformed
        TelaMedicoListagem tela=new TelaMedicoListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonMedicosActionPerformed

    private void jButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteActionPerformed
        TelaPacienteListagem tela=new TelaPacienteListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonPacienteActionPerformed

    private void jButtonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicamentosActionPerformed
        TelaMedicamentoListagem tela = new TelaMedicamentoListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonMedicamentosActionPerformed

    private void jButtonTecEnfermagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTecEnfermagem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTecEnfermagem1ActionPerformed

    private void jButtonTecEnfermagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTecEnfermagem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTecEnfermagem2ActionPerformed

    private void jButtonTecEnfermagem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTecEnfermagem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTecEnfermagem3ActionPerformed

    private void MenuAgendaConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaConsultasActionPerformed
         TelaAgendamentoListagem tela = new TelaAgendamentoListagem();
         this.add(tela);
         tela.setVisible(true);
    }//GEN-LAST:event_MenuAgendaConsultasActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAgendaConsultas;
    private javax.swing.JMenu MenuAgendamento;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenuItem MenuEspecialidade;
    private javax.swing.JMenu MenuFarmacia;
    private javax.swing.JMenuItem MenuFuncionarios;
    private javax.swing.JMenuItem MenuLogoff;
    private javax.swing.JMenuItem MenuMedicamento;
    private javax.swing.JMenuItem MenuMedicos;
    private javax.swing.JMenuItem MenuPacientes;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenu MenuSairLogoff;
    private javax.swing.JMenuItem MenuTecEnfermagem;
    private javax.swing.JMenuItem MenuUnidadeDeSaude;
    private javax.swing.JLabel PainelFundo;
    private javax.swing.JButton jButtonMedicamentos;
    private javax.swing.JButton jButtonMedicos;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JButton jButtonTecEnfermagem;
    private javax.swing.JButton jButtonTecEnfermagem1;
    private javax.swing.JButton jButtonTecEnfermagem2;
    private javax.swing.JButton jButtonTecEnfermagem3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
