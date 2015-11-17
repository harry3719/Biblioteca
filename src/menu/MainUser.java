/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import factory.CriadorDeSessao;
import formularios.CadastroCidade;
import formularios.CadastroEstado;
import formularios.CadastroFuncionario;
import formularios.CadastroUsuario;
import formularios.CadastroLivros;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.TelaLogin;

/**
 *
 * @author Paulo
 */
public class MainUser extends javax.swing.JFrame {

    public MainUser() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        trocarUsuario = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        cadastrofuncionario = new javax.swing.JMenuItem();
        cadastroUsuario = new javax.swing.JMenuItem();
        cadastroLivro = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pesquisarLivro = new javax.swing.JMenuItem();
        pesquisarUsuario = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem2.setText("jMenuItem2");

        jMenu11.setText("jMenu11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Biblioteca");
        setIconImages(null);

        jMenu1.setText("Usuário");

        trocarUsuario.setText("Trocar Usuario");
        trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(trocarUsuario);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu1.add(sair);

        jMenuBar1.add(jMenu1);

        jMenu9.setText("Cadastro");

        cadastrofuncionario.setText("Cadastro de Funcionario");
        cadastrofuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrofuncionarioActionPerformed(evt);
            }
        });
        jMenu9.add(cadastrofuncionario);

        cadastroUsuario.setText("Cadastro Usuario");
        cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu9.add(cadastroUsuario);

        cadastroLivro.setText("Cadastro Livros");
        cadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLivroActionPerformed(evt);
            }
        });
        jMenu9.add(cadastroLivro);

        jMenuItem4.setText("Cadastro de Municipio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuBar1.add(jMenu9);

        jMenu2.setText("Pesquisa");

        pesquisarLivro.setText("Pesquisar Livro");
        pesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarLivroActionPerformed(evt);
            }
        });
        jMenu2.add(pesquisarLivro);

        pesquisarUsuario.setText("Pesquisar Usuario");
        pesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(pesquisarUsuario);

        jMenuBar1.add(jMenu2);

        jMenu10.setText("Ajuda");

        sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK));
        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        jMenu10.add(sobre);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        String sobre = "Sistema de biblioteca simples desenvolvido por:\n"
                + "\n-> Paulo Augusto\n-> Wellington\n-> Luciano\n-> Aluno A"
                + "\n-> Aluno B";

        JOptionPane.showMessageDialog(null, sobre);
    }//GEN-LAST:event_sobreActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void trocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioActionPerformed
        dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_trocarUsuarioActionPerformed

    private void pesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarUsuarioActionPerformed

    }//GEN-LAST:event_pesquisarUsuarioActionPerformed

    private void cadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioActionPerformed
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_cadastroUsuarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroCidade cc = new CadastroCidade();
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void cadastrofuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrofuncionarioActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);

    }//GEN-LAST:event_cadastrofuncionarioActionPerformed

    private void cadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLivroActionPerformed
        CadastroLivros cadastroLivro = new CadastroLivros();
        cadastroLivro.setVisible(true);
    }//GEN-LAST:event_cadastroLivroActionPerformed

    private void pesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarLivroActionPerformed
        pesquisarLivro.setVisible(true);
    }//GEN-LAST:event_pesquisarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MainUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroLivro;
    private javax.swing.JMenuItem cadastroUsuario;
    private javax.swing.JMenuItem cadastrofuncionario;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem pesquisarLivro;
    private javax.swing.JMenuItem pesquisarUsuario;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem sobre;
    private javax.swing.JMenuItem trocarUsuario;
    // End of variables declaration//GEN-END:variables
}
