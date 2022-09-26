package Funcionamento;

import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Objects;

public class FazerPedido extends javax.swing.JFrame {

    ResultSet rs;

    public FazerPedido() {
        initComponents();
        getContentPane().setBackground(Color.darkGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BtnFinalizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblPedido = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblCardapio = new javax.swing.JTable();
        SpnQuant = new javax.swing.JSpinner();
        BtnAdicionar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        LblTotal1 = new javax.swing.JLabel();
        LblTotal2 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Pedido");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnFinalizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.setToolTipText("");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        TblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Valor (R$)"
            }
        ));
        jScrollPane3.setViewportView(TblPedido);

        TblCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID", "Valor (R$)"
            }
        ));
        jScrollPane4.setViewportView(TblCardapio);

        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        LblTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LblTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal.setText("0");

        LblTotal1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LblTotal1.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal1.setText("Total: R$");

        LblTotal2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LblTotal2.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal2.setText("Nome:");

        TxtNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LblTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnAdicionar)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnExcluir)
                        .addComponent(BtnAdicionar))
                    .addComponent(SpnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTotal)
                    .addComponent(LblTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblTotal1)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFinalizar)
                    .addComponent(jButton1))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed

        
        //Adicionando os itens ao campo de Itens
        int linhasPedido = TblPedido.getRowCount();
        
        DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();
        
        String itens = Integer.toString((Integer) tblPedido.getValueAt(0, 1)) + "x " +  (String) tblPedido.getValueAt(0, 0);
        
        for (int i =1; i < linhasPedido; i++){
            itens += ", " + Integer.toString((Integer) tblPedido.getValueAt(i, 1)) + "x " + (String) tblPedido.getValueAt(i, 0);
        }
        //System.out.println(itens);
        
        
        //Obtendo o valor total
        double total = Double.parseDouble(LblTotal.getText());
       
        
        //Inserir no banco de dados o novo pedido
        Conectar obj = new Conectar();

        Connection conexao = obj.connectionMySql();
        
        obj.novoPedido(conexao, itens, total);
        
        obj.consultaPedidos(conexao);
        
        String nome = TxtNome.getText();
        
        PedidoSendoFeito criar = new PedidoSendoFeito();
        
        criar.LblNome.setText(nome);
        
        dispose();

        criar.setVisible(true);
        
        
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    public void redimensionarColuna() {

        TblCardapio.getColumnModel().getColumn(0)
                .setPreferredWidth(200);
        TblCardapio.getColumnModel().getColumn(1)
                .setPreferredWidth(20);

        TblPedido.getColumnModel().getColumn(0)
                .setPreferredWidth(150);
        TblPedido.getColumnModel().getColumn(1)
                .setPreferredWidth(50);

    }

    private void carregarCardapio() {
        DefaultTableModel tblCardapio = (DefaultTableModel) TblCardapio.getModel();

        Conectar obj = new Conectar();

        Connection conexao = obj.connectionMySql();

        try {

            PreparedStatement stml = conexao.prepareStatement("select * from Cardapio");
            ResultSet rs = stml.executeQuery();

            while (rs.next()) {

                String coluna0 = rs.getString(2);
                String coluna1 = Integer.toString(rs.getInt(1));
                
                //Formatar o valor para duas casas decimais e com a unidade R$
                //DecimalFormat db = new DecimalFormat(".00");
                String coluna2 = rs.getFloat(4) + "0";

                //Inserir os valores na JTable
                tblCardapio.addRow(new String[]{coluna0, coluna1, coluna2});

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();
        redimensionarColuna();
        carregarCardapio();

    }//GEN-LAST:event_formWindowOpened

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        // TODO add your handling code here:

        try {

            double total = Double.parseDouble(LblTotal.getText());
            
            int quantidade = (int) SpnQuant.getValue();
            //System.out.println(quantidade);

            int index = TblCardapio.getSelectedRow();
            Object[] row = new Object[3];

            DefaultTableModel tblCardapio = (DefaultTableModel) TblCardapio.getModel();
            DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();

            row[0] = tblCardapio.getValueAt(index, 0);
            row[1] = quantidade;
            row[2] = tblCardapio.getValueAt(index, 2);
            
            double v1 = Double.valueOf((String) tblCardapio.getValueAt(index, 2));
            
            total += v1*quantidade;
            
            LblTotal.setText(String.valueOf(total) + "0");
            
            tblPedido.addRow(row);

            SpnQuant.setValue(0);
            
        } catch (Exception e) {
            System.out.println("Erro!\nO erro em questão se trata de: " + e);
        }


    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();

        if (TblPedido.getSelectedRowCount() == 1) {
            tblPedido.removeRow(TblPedido.getSelectedRow());
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                new FazerPedido().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JLabel LblTotal1;
    private javax.swing.JLabel LblTotal2;
    private javax.swing.JSpinner SpnQuant;
    public javax.swing.JTable TblCardapio;
    public javax.swing.JTable TblPedido;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
