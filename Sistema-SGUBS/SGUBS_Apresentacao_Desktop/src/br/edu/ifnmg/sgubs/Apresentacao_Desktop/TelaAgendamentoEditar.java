/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.Agendamento;
import br.edu.ifnmg.sgubs.Aplicacao.AgendamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.Paciente;
import br.edu.ifnmg.sgubs.Aplicacao.PacienteRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaude;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaudeRepositorio;
import com.sun.istack.internal.logging.Logger;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dayvison
 */
public class TelaAgendamentoEditar extends javax.swing.JInternalFrame {
    
    AgendamentoRepositorio dao = GerenciadorReferencias.getAgendamento();
    
    PacienteRepositorio daoPaciente = GerenciadorReferencias.getPaciente();
    
    UnidadesDeSaudeRepositorio daoUnidadesDeSaude = GerenciadorReferencias.getUnidadeDeSaude();
    
    MedicoRepositorio daoMedico = GerenciadorReferencias.getMedico();
    
    //Calendar calendario = GregorianCalendar.getInstance();
    
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    DateFormat dh = new SimpleDateFormat("00:00:00");
    
    TelaAgendamentoListagem listagem;
    
    Agendamento entidade;
    
   

    /**
     * Creates new form TelaAgendamentoEditar
     */
    public TelaAgendamentoEditar() {
        initComponents();
        
        ComboBoxModel Paciente = new DefaultComboBoxModel( daoPaciente.Buscar(null).toArray());
        
        cbxPaciente.setModel(Paciente);
        
        ComboBoxModel Unidade = new DefaultComboBoxModel( daoUnidadesDeSaude.Buscar(null).toArray());
        
        cbxUnidade.setModel(Unidade);
        
        ComboBoxModel Medico = new DefaultComboBoxModel( daoMedico.Buscar(null).toArray());
        
        cbxMedico.setModel(Medico);
    }

    public Agendamento getEntidade() {
        return entidade;
    }

    public void setEntidade(Agendamento entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaAgendamentoListagem getListagem(){
        return listagem;
    }
    
    public void setListagem(TelaAgendamentoListagem listagem){
        this.listagem = listagem;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblMedico = new javax.swing.JLabel();
        cbxMedico = new javax.swing.JComboBox<>();
        cbxPaciente = new javax.swing.JComboBox<>();
        lblPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxUnidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblCodAgendamento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntListar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        bntNovo = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agendamento de Consultas");

        lblMedico.setText("Medico:");

        cbxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPacienteActionPerformed(evt);
            }
        });

        lblPaciente.setText("Paciente");

        jLabel1.setText("Unidade:");

        cbxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("CodAgendamento:");

        lblCodAgendamento.setText("jLabel3");

        jLabel3.setText("Data :");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora da Consulta:");

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntListar.setText("Voltar");
        bntListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntListarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntNovo.setText("Novo");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedico)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPaciente)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodAgendamento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntNovo)
                .addGap(30, 30, 30)
                .addComponent(bntSalvar)
                .addGap(18, 18, 18)
                .addComponent(bntListar)
                .addGap(18, 18, 18)
                .addComponent(bntExcluir)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSalvar)
                    .addComponent(bntListar)
                    .addComponent(bntExcluir)
                    .addComponent(bntNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCodAgendamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedico)
                    .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPacienteActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        try {
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja salvar alterações ?") == 0){
            
            preencheObjeto();
            
            if(dao.Salvar(entidade)){
                
                JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso !");
                preencheCampos();
            }
            
            else
                
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
        }
        }catch (ParseException ex){
           // Logger.getLogger(TelaAgendamentoEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListarActionPerformed
        listagem.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_bntListarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir Esse Agendamento ?") == 0){

            if(dao.Apagar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Dados Excluidos com sucesso !");
                entidade = new Agendamento(0,null,null,null,null,new Date());
                preencheCampos();
            }
            else
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        entidade =new Agendamento(0,null,null,null,null,new Date());
        preencheCampos();
    }//GEN-LAST:event_bntNovoActionPerformed

    private void preencheCampos(){
        lblCodAgendamento.setText( Integer.toString(entidade.getId()));
        cbxPaciente.setSelectedItem( entidade.getPaciente());
        cbxUnidade.setSelectedItem( entidade.getUnidadeSaude());
        cbxMedico.setSelectedItem( entidade.getMedico());
        txtHora.setText( dh.format(entidade.getHorario()));
        txtData.setText( df.format(entidade.getData()));
    }
    
    private void preencheObjeto() throws ParseException{
        entidade.setPaciente((Paciente)cbxPaciente.getSelectedItem());
        entidade.setUnidadeSaude((UnidadesDeSaude)cbxPaciente.getSelectedItem());
        entidade.setMedico((Medico)cbxPaciente.getSelectedItem());
        entidade.setHorario((Time) dh.parse(txtHora.getText()));
        entidade.setData( df.parse(txtData.getText())  );
              
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntListar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<String> cbxMedico;
    private javax.swing.JComboBox<String> cbxPaciente;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblCodAgendamento;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}