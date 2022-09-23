package com.mycompany._08;

import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;

public class MenuAdm extends javax.swing.JFrame {

    ResultSet rs;

    public MenuAdm() {
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
        TblFuncionario = new javax.swing.JTable();
        SpnQuant = new javax.swing.JSpinner();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        LblTotal1 = new javax.swing.JLabel();
        LblTotal2 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JTextField();
        TxtCampo = new javax.swing.JComboBox<>();

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
        jLabel1.setText("Gerenciamento de Funcionários");

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

        TblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "RG", "Salário (R$)", "CEP", "Senha", "Nível de Acesso"
            }
        ));
        jScrollPane4.setViewportView(TblFuncionario);

        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        LblTotal1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LblTotal1.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal1.setText("Campo:");

        LblTotal2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LblTotal2.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal2.setText("Novo valor:");

        TxtValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorActionPerformed(evt);
            }
        });

        TxtCampo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "CPF", "Nome", "RG", "Salário", "CEP", "Senha", "Nível de acesso" }));
        TxtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnExcluir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LblTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122)
                                        .addComponent(LblTotal1)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(BtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(213, 213, 213)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(55, 55, 55))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpnQuant)
                    .addComponent(BtnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblTotal1)
                        .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        String itens = Integer.toString((Integer) tblPedido.getValueAt(0, 1)) + "x " + (String) tblPedido.getValueAt(0, 0);

        for (int i = 1; i < linhasPedido; i++) {
            itens += ", " + Integer.toString((Integer) tblPedido.getValueAt(i, 1)) + "x " + (String) tblPedido.getValueAt(i, 0);
        }
        //System.out.println(itens);

        //Obtendo o valor total
        //Inserir no banco de dados o novo pedido
        Conectar obj = new Conectar();

        Connection conexao = obj.connectionMySql();

        obj.consultaPedidos(conexao);

        String nome = TxtValor.getText();

        PedidoSendoFeito criar = new PedidoSendoFeito();

        criar.LblNome.setText(nome);

        dispose();

        criar.setVisible(true);


    }//GEN-LAST:event_BtnFinalizarActionPerformed

    public void redimensionarColuna() {

        /*
        TblFuncionario.getColumnModel().getColumn(0)
                .setPreferredWidth(200);
        TblFuncionario.getColumnModel().getColumn(1)
                .setPreferredWidth(20);
         */
        TblPedido.getColumnModel().getColumn(0)
                .setPreferredWidth(150);
        TblPedido.getColumnModel().getColumn(1)
                .setPreferredWidth(50);

    }

    private void carregarFuncionarios() {
        DefaultTableModel tblFuncionario = (DefaultTableModel) TblFuncionario.getModel();

        tblFuncionario.setRowCount(0);
        
        Conectar obj = new Conectar();

        Connection conexao = obj.connectionMySql();

        try {

            PreparedStatement stml = conexao.prepareStatement("select * from Funcionarios");
            ResultSet rs = stml.executeQuery();

            while (rs.next()) {

                String coluna0 = Long.toString(rs.getLong(1));       //CPF
                String coluna1 = rs.getString(2);                    //Nome
                String coluna2 = rs.getString(3);                    //RG
                String coluna3 = Float.toString(rs.getFloat(4));     //Salário
                String coluna4 = Long.toString(rs.getLong(5));       //CEP
                String coluna5 = rs.getString(6);                    //Senha
                String coluna6 = Integer.toString(rs.getInt(7));     //Nível de acesso

                System.out.println(
                        "\n   CPF:" + rs.getLong(1)
                        + "\n   Nome:" + rs.getString(2)
                        + "\n   RG:" + rs.getString(3)
                        + "\n   Salário:" + rs.getFloat(4)
                        + "\n   CEP: " + rs.getInt(5)
                );

                //Formatar o valor para duas casas decimais e com a unidade R$
                //DecimalFormat db = new DecimalFormat(".00");
                //Inserir os valores na JTable
                tblFuncionario.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4, coluna5, coluna6});

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();

        redimensionarColuna();

        carregarFuncionarios();

    }//GEN-LAST:event_formWindowOpened

    public void alterarCampo(String Campo, String novoValor) throws SQLException {

        try {
            

            System.out.println("\n\nFUNÇÃO\nCampo: " + Campo + "\nValor: " + novoValor);
            
            //Obter a chave primária do registro a ser alterado
            int index = TblFuncionario.getSelectedRow();
            DefaultTableModel tblFuncionario = (DefaultTableModel) TblFuncionario.getModel();
            String CPF = (String) tblFuncionario.getValueAt(index, 0);
            long cpf = Long.parseLong(CPF);
            System.out.println("CPF selecionado: " + cpf);
            //Preparar a conexão com o MySQL
            Conectar obj = new Conectar();
            Connection conexao = obj.connectionMySql();

            PreparedStatement pstm;

            //Executar a query de atualizar o devido registro
            switch (Campo) {

                case "Nome":
                    System.out.println("Executando case para Nome");
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET Nome_fun= ? WHERE CPF= ?;");
                    pstm.setString(1, novoValor);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    
                    break;

                case "RG":
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET RG= ? WHERE CPF= ?;");
                    pstm.setString(1, novoValor);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    
                    break;

                case "Salário":

                    float salario = Float.parseFloat(novoValor);
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET Salario= ? WHERE CPF= ?;");
                    pstm.setFloat(1, salario);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    break;

                case "CEP":

                    long cep = Long.parseLong(novoValor);
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET CEP= ? WHERE CPF= ?;");
                    pstm.setLong(1, cep);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    break;

                case "Senha":
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET Senha= ? WHERE CPF= ?;");
                    pstm.setString(1, novoValor);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    break;

                case "Nível de acesso":
                    int nivel = Integer.parseInt(novoValor);
                    pstm = conexao.prepareStatement("UPDATE Funcionarios SET Nivel= ? WHERE CPF= ?;");
                    pstm.setInt(1, nivel);
                    pstm.setLong(2, cpf);
                    pstm.execute();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro!\nO erro em questão se trata de: " + e);
        }

    }

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        // TODO add your handling code here:

        try {

            String campo = (String) TxtCampo.getSelectedItem();
            String novoValor = TxtValor.getText();

            alterarCampo(campo, novoValor);
            carregarFuncionarios();

        } catch (Exception e) {
            System.out.println("Erro!\nO erro em questão se trata de: " + e);
        }


    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblPedido = (DefaultTableModel) TblPedido.getModel();

        if (TblPedido.getSelectedRowCount() == 1) {
            tblPedido.removeRow(TblPedido.getSelectedRow());
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void TxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorActionPerformed

    private void TxtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCampoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new MenuAdm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JLabel LblTotal1;
    private javax.swing.JLabel LblTotal2;
    private javax.swing.JSpinner SpnQuant;
    public javax.swing.JTable TblFuncionario;
    private javax.swing.JTable TblPedido;
    private javax.swing.JComboBox<String> TxtCampo;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
