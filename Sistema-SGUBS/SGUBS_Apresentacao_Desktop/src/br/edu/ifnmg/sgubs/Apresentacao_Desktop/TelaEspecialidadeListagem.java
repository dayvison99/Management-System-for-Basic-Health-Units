/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.Especialidade;
import br.edu.ifnmg.sgubs.Aplicacao.EspecialidadeRepositorio;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dayvison
 */
public class TelaEspecialidadeListagem extends javax.swing.JInternalFrame {
    
    EspecialidadeRepositorio dao = GerenciadorReferencias.getEspecialidade();
    
    TelaEspecialidadeEditar editar;

    /**
     * Creates new form TelaEspecialidadeListagem
     */
    public TelaEspecialidadeListagem() {
        initComponents();
        
        List<Especialidade> busca =dao.Buscar(null);
        
        preencheTabela(busca);
    }
    
    private void preencheTabela(List<Especialidade> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Especialidade");
        
        for(Especialidade e : lista){
            Vector linha = new Vector();
            linha.add(e.getId());
            linha.add(e.getEspecialidade());
            modelo.addRow(linha);
        }
        
        tblBusca.setModel(modelo);
    }
    
    public void buscar(String nome){
        
        Especialidade filtro = new Especialidade(0, nome);
        
        List<Especialidade> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusca);
        if (tblBusca.getColumnModel().getColumnCount() > 0) {
            tblBusca.getColumnModel().getColumn(0).setResizable(false);
            tblBusca.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        editarEspecialidade(0);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar( txtBusca.getText() );
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        int selecionada = tblBusca.getSelectedRow();
        
        int id = Integer.parseInt( tblBusca.getModel().getValueAt( selecionada, 0).toString());
        
        editarEspecialidade(id);
    }//GEN-LAST:event_tblBuscaMouseClicked

    public void editarEspecialidade(int id){
        Especialidade entidade;
        
        if(id == 0)
            entidade = new Especialidade(0, "");
        else
            entidade = dao.Abrir(id);
        
        editar = new TelaEspecialidadeEditar();
        
        editar.setEntidade(entidade);
        
        editar.setListagem(this);
        
        this.getParent().add(editar);
        editar.setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
