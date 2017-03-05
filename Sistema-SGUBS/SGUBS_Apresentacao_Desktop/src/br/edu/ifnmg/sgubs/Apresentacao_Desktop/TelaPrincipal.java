/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.PacienteRepositorio;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
        
        AcessoRapido.enable();        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcessoRapido = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PainelFundo = new javax.swing.JLabel();
        btnAgendamento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMedicos = new javax.swing.JButton();
        bntPaciente = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnTecEnfermagem = new javax.swing.JButton();
        btnUnidadesDeSaude = new javax.swing.JButton();
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
        MenuConsultasAgendadas = new javax.swing.JMenuItem();
        MenuFarmacia = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuRelatorioMedico = new javax.swing.JMenuItem();
        MenuRelatorioPaciente = new javax.swing.JMenuItem();
        MenuSairLogoff = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuLogoff = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGUBS-Sistema De Gerenciamento De Unidade Basíca De Saúde");
        setSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(null);

        AcessoRapido.setClosable(true);
        AcessoRapido.setMaximizable(true);
        AcessoRapido.setResizable(true);
        AcessoRapido.setTitle("Acesso Rápido");
        AcessoRapido.setAutoscrolls(true);
        AcessoRapido.setVisible(true);
        AcessoRapido.getContentPane().setLayout(null);

        jLabel1.setText("Sistema de Gerenciamento de Unidades Basica de Saúde");
        AcessoRapido.getContentPane().add(jLabel1);
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

        btnAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconConsultas.png"))); // NOI18N
        btnAgendamento.setToolTipText("Agendamento");
        btnAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnAgendamento);
        btnAgendamento.setBounds(10, 180, 90, 90);

        jLabel2.setText("Cadastros :");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(10, 10, 77, 17);

        btnMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedico.jpg"))); // NOI18N
        btnMedicos.setToolTipText("Médicos");
        btnMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnMedicos);
        btnMedicos.setBounds(10, 40, 90, 90);

        bntPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPaciente.png"))); // NOI18N
        bntPaciente.setToolTipText("Paciêntes");
        bntPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPacienteActionPerformed(evt);
            }
        });
        jLayeredPane1.add(bntPaciente);
        bntPaciente.setBounds(110, 40, 90, 90);

        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedicamento.png"))); // NOI18N
        btnMedicamentos.setToolTipText("Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnMedicamentos);
        btnMedicamentos.setBounds(210, 40, 90, 90);

        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconFuncionarios.png"))); // NOI18N
        btnFuncionarios.setToolTipText("Funcionários");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnFuncionarios);
        btnFuncionarios.setBounds(510, 40, 90, 90);

        btnTecEnfermagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconTecEnfermagem.png"))); // NOI18N
        btnTecEnfermagem.setToolTipText("TecEnfermagem");
        btnTecEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecEnfermagemActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnTecEnfermagem);
        btnTecEnfermagem.setBounds(310, 40, 90, 90);

        btnUnidadesDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUnidadeDeSaude.png"))); // NOI18N
        btnUnidadesDeSaude.setToolTipText("Unidades de Saúde");
        btnUnidadesDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesDeSaudeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnUnidadesDeSaude);
        btnUnidadesDeSaude.setBounds(410, 40, 90, 90);

        jLabel3.setText("Agendamento :");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(10, 150, 106, 17);

        AcessoRapido.getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 80, 870, 624);

        getContentPane().add(AcessoRapido);
        AcessoRapido.setBounds(0, 220, 880, 490);

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

        MenuConsultasAgendadas.setText("Consultas Agendadas");
        MenuConsultasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultasAgendadasActionPerformed(evt);
            }
        });
        MenuAgendamento.add(MenuConsultasAgendadas);

        MenuPrincipal.add(MenuAgendamento);

        MenuFarmacia.setText("Farmacia");

        jMenuItem2.setText("EntradaMedicamento");
        MenuFarmacia.add(jMenuItem2);

        jMenuItem3.setText("SaídaMedicamento");
        MenuFarmacia.add(jMenuItem3);

        MenuPrincipal.add(MenuFarmacia);

        MenuRelatorio.setText("Relatórios");

        MenuRelatorioMedico.setText("Relatório de Cadastro de Médicos");
        MenuRelatorioMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioMedicoActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MenuRelatorioMedico);

        MenuRelatorioPaciente.setText("Relatório de Cadastro de Paciêntes");
        MenuRelatorioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioPacienteActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MenuRelatorioPaciente);

        MenuPrincipal.add(MenuRelatorio);

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

        setSize(new java.awt.Dimension(887, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPacientesActionPerformed
        TelaPacienteListagem tela=new TelaPacienteListagem();
        this.add(tela);    
        tela.setVisible(true); 
        AcessoRapido.dispose();
        
    }//GEN-LAST:event_MenuPacientesActionPerformed

    private void MenuMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicosActionPerformed
        TelaMedicoListagem tela=new TelaMedicoListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose();
    }//GEN-LAST:event_MenuMedicosActionPerformed

    private void MenuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionariosActionPerformed
       TelaFuncionarioListagem tela = new TelaFuncionarioListagem();
       this.add(tela);
       tela.setVisible(true);
        AcessoRapido.dispose();
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
       AcessoRapido.dispose();
    }//GEN-LAST:event_MenuEspecialidadeActionPerformed

    private void MenuUnidadeDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUnidadeDeSaudeActionPerformed
       TelaUnidadeDeSaudeListagem tela = new TelaUnidadeDeSaudeListagem();
       this.add(tela);
       tela.setVisible(true);
       AcessoRapido.dispose();
        
    }//GEN-LAST:event_MenuUnidadeDeSaudeActionPerformed

    private void MenuTecEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTecEnfermagemActionPerformed
       TelaTecEnfermagemListagem tela = new TelaTecEnfermagemListagem();
       this.add(tela);
       tela.setVisible(true);
       AcessoRapido.dispose();
       
    }//GEN-LAST:event_MenuTecEnfermagemActionPerformed

    private void MenuMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicamentoActionPerformed
        TelaMedicamentoListagem tela = new TelaMedicamentoListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose();
    }//GEN-LAST:event_MenuMedicamentoActionPerformed

    private void jLayeredPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLayeredPane1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLayeredPane1CaretPositionChanged

    private void btnAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentoActionPerformed
       TelaAgendamentoListagem tela = new TelaAgendamentoListagem();
         this.add(tela);
         tela.setVisible(true);
         AcessoRapido.dispose();
    }//GEN-LAST:event_btnAgendamentoActionPerformed

    private void btnMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicosActionPerformed
        TelaMedicoListagem tela=new TelaMedicoListagem();
        this.add(tela);
        tela.setVisible(true);
         AcessoRapido.dispose();
    }//GEN-LAST:event_btnMedicosActionPerformed

    private void bntPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPacienteActionPerformed
        TelaPacienteListagem tela=new TelaPacienteListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose();
    }//GEN-LAST:event_bntPacienteActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        TelaMedicamentoListagem tela = new TelaMedicamentoListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose(); 
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
       TelaFuncionarioListagem tela = new TelaFuncionarioListagem();
       this.add(tela);
       tela.setVisible(true);
       AcessoRapido.dispose();
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnTecEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecEnfermagemActionPerformed
        TelaTecEnfermagemListagem tela = new TelaTecEnfermagemListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose();
    }//GEN-LAST:event_btnTecEnfermagemActionPerformed

    private void btnUnidadesDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesDeSaudeActionPerformed
        TelaUnidadeDeSaudeListagem tela = new TelaUnidadeDeSaudeListagem();
        this.add(tela);
        tela.setVisible(true);
        AcessoRapido.dispose();
    }//GEN-LAST:event_btnUnidadesDeSaudeActionPerformed

    private void MenuAgendaConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaConsultasActionPerformed
         TelaAgendamentoListagem tela = new TelaAgendamentoListagem();
         this.add(tela);
         tela.setVisible(true);
         AcessoRapido.dispose();
         
         
    }//GEN-LAST:event_MenuAgendaConsultasActionPerformed

    private void MenuRelatorioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioPacienteActionPerformed
        PacienteRepositorio dao = GerenciadorReferencias.getPaciente();
        
        exibeRelatorioJasper("Pacientes.jasper", dao.Buscar(null) );
    }//GEN-LAST:event_MenuRelatorioPacienteActionPerformed

    private void MenuRelatorioMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioMedicoActionPerformed
        MedicoRepositorio dao = GerenciadorReferencias.getMedico();
        
        exibeRelatorioJasper("Medicos.jasper", dao.Buscar(null));
    }//GEN-LAST:event_MenuRelatorioMedicoActionPerformed

    private void MenuConsultasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultasAgendadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuConsultasAgendadasActionPerformed

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
    
      private void exibeRelatorioJasper(String caminho_relatorio, List dados) {

        try {
            // Parâmetros
            Map parametros = new HashMap();

            // Pega o caminho do arquivo do relatório
            URL arquivo = getClass().getResource(caminho_relatorio);
            
            // Carrega o relatório na memória
            JasperReport relatorio = (JasperReport) JRLoader.loadObject(arquivo);
            
            JRDataSource fontededados = new JRBeanCollectionDataSource(dados, true);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, fontededados);
            
            // Visualiza o relatório
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            
            jrviewer.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(JasperReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AcessoRapido;
    private javax.swing.JMenuItem MenuAgendaConsultas;
    private javax.swing.JMenu MenuAgendamento;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenuItem MenuConsultasAgendadas;
    private javax.swing.JMenuItem MenuEspecialidade;
    private javax.swing.JMenu MenuFarmacia;
    private javax.swing.JMenuItem MenuFuncionarios;
    private javax.swing.JMenuItem MenuLogoff;
    private javax.swing.JMenuItem MenuMedicamento;
    private javax.swing.JMenuItem MenuMedicos;
    private javax.swing.JMenuItem MenuPacientes;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem MenuRelatorioMedico;
    private javax.swing.JMenuItem MenuRelatorioPaciente;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenu MenuSairLogoff;
    private javax.swing.JMenuItem MenuTecEnfermagem;
    private javax.swing.JMenuItem MenuUnidadeDeSaude;
    private javax.swing.JLabel PainelFundo;
    private javax.swing.JButton bntPaciente;
    private javax.swing.JButton btnAgendamento;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnMedicos;
    private javax.swing.JButton btnTecEnfermagem;
    private javax.swing.JButton btnUnidadesDeSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
