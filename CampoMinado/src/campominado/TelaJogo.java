/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.Timer;
import niveis.Nivel;

/**
 *
 * @author rodri
 */
public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaPricipal
     */
    private Timer t;
    private int count = 0;
    ArrayList<JButton> botaosNivel1 = new Nivel().getBotoes();
    ArrayList<JButton> botaosNivel2 = new Nivel().getBotoes();
    ArrayList<JButton> botaosNivel3 = new Nivel().getBotoes();
    ArrayList<JButton> botaosNivel4 = new Nivel().getBotoes();

    public TelaJogo() {
        initComponents();
        preencherArryButos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_1A = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_1B = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_1C = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_1D = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_2A = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_2B = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_2C = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_2D = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btn_3A = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btn_3B = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btn_3C = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btn_3D = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btn_4A = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        btn_4B = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        btn_4C = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        btn_4D = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btn_4E = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        btn_3E = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        btn_2E = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        btn_1E = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Tentativas = new javax.swing.JTextField();
        Pontos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Campo minado");
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(839, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(840, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/m.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 460, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoMMM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 30, 190, 30);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btn_1A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_1A.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_1A.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_1A.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1AActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1A);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 350, 90, 80);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btn_1B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_1B.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_1B.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_1B.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1BActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1B);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 350, 90, 80);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        btn_1C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_1C.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_1C.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_1C.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1CActionPerformed(evt);
            }
        });
        jPanel3.add(btn_1C);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(460, 350, 90, 80);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        btn_1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_1D.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_1D.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_1D.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1DActionPerformed(evt);
            }
        });
        jPanel4.add(btn_1D);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(560, 350, 90, 80);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        btn_2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_2A.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2AActionPerformed(evt);
            }
        });
        jPanel5.add(btn_2A);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(260, 260, 90, 80);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        btn_2B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_2B.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2BActionPerformed(evt);
            }
        });
        jPanel6.add(btn_2B);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(360, 260, 90, 80);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        btn_2C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_2C.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2CActionPerformed(evt);
            }
        });
        jPanel8.add(btn_2C);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(460, 260, 90, 80);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        btn_2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_2D.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2DActionPerformed(evt);
            }
        });
        jPanel11.add(btn_2D);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(560, 260, 90, 80);

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        btn_3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions2.png"))); // NOI18N
        btn_3A.setPreferredSize(new java.awt.Dimension(79, 70));
        btn_3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3AActionPerformed(evt);
            }
        });
        jPanel12.add(btn_3A);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(260, 170, 90, 80);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));

        btn_3B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions2.png"))); // NOI18N
        btn_3B.setPreferredSize(new java.awt.Dimension(79, 70));
        btn_3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3BActionPerformed(evt);
            }
        });
        jPanel14.add(btn_3B);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(360, 170, 90, 80);

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));

        btn_3C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions2.png"))); // NOI18N
        btn_3C.setPreferredSize(new java.awt.Dimension(79, 70));
        btn_3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3CActionPerformed(evt);
            }
        });
        jPanel15.add(btn_3C);

        getContentPane().add(jPanel15);
        jPanel15.setBounds(460, 170, 90, 80);

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));

        btn_3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions2.png"))); // NOI18N
        btn_3D.setPreferredSize(new java.awt.Dimension(79, 70));
        btn_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3DActionPerformed(evt);
            }
        });
        jPanel16.add(btn_3D);

        getContentPane().add(jPanel16);
        jPanel16.setBounds(560, 170, 90, 80);

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));

        btn_4A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minions3.png"))); // NOI18N
        btn_4A.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_4A.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_4A.setPreferredSize(new java.awt.Dimension(73, 60));
        btn_4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4AActionPerformed(evt);
            }
        });
        jPanel17.add(btn_4A);

        getContentPane().add(jPanel17);
        jPanel17.setBounds(260, 90, 90, 70);

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));

        btn_4B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minions3.png"))); // NOI18N
        btn_4B.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_4B.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_4B.setPreferredSize(new java.awt.Dimension(73, 60));
        btn_4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4BActionPerformed(evt);
            }
        });
        jPanel18.add(btn_4B);

        getContentPane().add(jPanel18);
        jPanel18.setBounds(360, 90, 90, 70);

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));

        btn_4C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minions3.png"))); // NOI18N
        btn_4C.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_4C.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_4C.setPreferredSize(new java.awt.Dimension(73, 60));
        btn_4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4CActionPerformed(evt);
            }
        });
        jPanel19.add(btn_4C);

        getContentPane().add(jPanel19);
        jPanel19.setBounds(460, 90, 90, 70);

        jPanel20.setBackground(new java.awt.Color(153, 153, 153));

        btn_4D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minions3.png"))); // NOI18N
        btn_4D.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_4D.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_4D.setPreferredSize(new java.awt.Dimension(73, 60));
        btn_4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4DActionPerformed(evt);
            }
        });
        jPanel20.add(btn_4D);

        getContentPane().add(jPanel20);
        jPanel20.setBounds(560, 90, 90, 70);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Pontos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 200, 70, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Tentativas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 240, 90, 22);

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));

        btn_4E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minions3.png"))); // NOI18N
        btn_4E.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_4E.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_4E.setPreferredSize(new java.awt.Dimension(73, 60));
        btn_4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4EActionPerformed(evt);
            }
        });
        jPanel21.add(btn_4E);

        getContentPane().add(jPanel21);
        jPanel21.setBounds(660, 90, 90, 70);

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));

        btn_3E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions2.png"))); // NOI18N
        btn_3E.setPreferredSize(new java.awt.Dimension(79, 70));
        btn_3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3EActionPerformed(evt);
            }
        });
        jPanel22.add(btn_3E);

        getContentPane().add(jPanel22);
        jPanel22.setBounds(660, 170, 90, 80);

        jPanel23.setBackground(new java.awt.Color(153, 153, 153));

        btn_2E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_2E.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2EActionPerformed(evt);
            }
        });
        jPanel23.add(btn_2E);

        getContentPane().add(jPanel23);
        jPanel23.setBounds(660, 260, 90, 80);

        jPanel24.setBackground(new java.awt.Color(153, 153, 153));

        btn_1E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minions.png"))); // NOI18N
        btn_1E.setMaximumSize(new java.awt.Dimension(73, 73));
        btn_1E.setMinimumSize(new java.awt.Dimension(73, 73));
        btn_1E.setPreferredSize(new java.awt.Dimension(73, 70));
        btn_1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1EActionPerformed(evt);
            }
        });
        jPanel24.add(btn_1E);

        getContentPane().add(jPanel24);
        jPanel24.setBounds(660, 350, 90, 80);

        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Placar ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 110, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 370, 20, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 200, 20, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 110, 20, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("A");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 60, 16, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("B");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 60, 16, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("C");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(490, 60, 16, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("D");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 60, 18, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("E");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(680, 60, 15, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("2");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(240, 280, 20, 30);

        Tentativas.setEditable(false);
        Tentativas.setBackground(new java.awt.Color(204, 204, 204));
        Tentativas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tentativas.setForeground(new java.awt.Color(204, 0, 0));
        Tentativas.setText("1");
        Tentativas.setAutoscrolls(false);
        Tentativas.setBorder(null);
        Tentativas.setFocusable(false);
        Tentativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TentativasActionPerformed(evt);
            }
        });
        getContentPane().add(Tentativas);
        Tentativas.setBounds(140, 231, 30, 30);

        Pontos.setEditable(false);
        Pontos.setBackground(new java.awt.Color(204, 204, 204));
        Pontos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pontos.setForeground(new java.awt.Color(255, 0, 0));
        Pontos.setText("0");
        Pontos.setAutoscrolls(false);
        Pontos.setBorder(null);
        Pontos.setFocusable(false);
        getContentPane().add(Pontos);
        Pontos.setBounds(140, 190, 30, 30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FotoDoFundo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1BActionPerformed
        btn_1B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_1B.setEnabled(false);
        }
    }//GEN-LAST:event_btn_1BActionPerformed

    private void btn_4EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4EActionPerformed
        btn_4E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_4E.setEnabled(false);
        }

    }//GEN-LAST:event_btn_4EActionPerformed

    private void btn_1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1CActionPerformed
        btn_1C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Setinha.png")));
        btn_1A.setEnabled(false);
        btn_1B.setEnabled(false);
        btn_1D.setEnabled(false);
        btn_1E.setEnabled(false);

        int num1 = Integer.parseInt(Pontos.getText());
        int soma = num1 + 10;
        Pontos.setText(Integer.toString(soma));

    }//GEN-LAST:event_btn_1CActionPerformed

    private void btn_1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1DActionPerformed
        btn_1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_1D.setEnabled(false);
        }
    }//GEN-LAST:event_btn_1DActionPerformed

    private void btn_1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1EActionPerformed
        btn_1E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pontinho.png")));

        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 + 1;
        Tentativas.setText(Integer.toString(soma));
        btn_1E.setEnabled(false);


    }//GEN-LAST:event_btn_1EActionPerformed

    private void btn_1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1AActionPerformed
        btn_1A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_1A.setEnabled(false);
        }
    }//GEN-LAST:event_btn_1AActionPerformed

    private void btn_4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4DActionPerformed
        btn_4D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Setinha.png")));
        int num1 = Integer.parseInt(Pontos.getText());
        int soma = num1 + 10;
        Pontos.setText(Integer.toString(soma));

        // pega a guantidade de pontos que jogador tem 
        TelaJogo pontos = new TelaJogo();
        pontos.setName(Pontos.getText());
        Ganhou frm = new Ganhou();
        frm.ExportarPontos(pontos);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_4DActionPerformed

    private void btn_4CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4CActionPerformed
        btn_4C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_4C.setEnabled(false);
        }

    }//GEN-LAST:event_btn_4CActionPerformed

    private void btn_4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4BActionPerformed
        btn_4B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_4B.setEnabled(false);
        }

    }//GEN-LAST:event_btn_4BActionPerformed

    private void btn_4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4AActionPerformed
        btn_4A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));

        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_4A.setEnabled(false);
        }


    }//GEN-LAST:event_btn_4AActionPerformed

    private void btn_2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2AActionPerformed
        btn_2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_2A.setEnabled(false);
        }
    }//GEN-LAST:event_btn_2AActionPerformed

    private void btn_2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2BActionPerformed
        btn_2B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_2B.setEnabled(false);
        }
    }//GEN-LAST:event_btn_2BActionPerformed

    private void btn_2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2CActionPerformed
        btn_2C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_2C.setEnabled(false);

        }
    }//GEN-LAST:event_btn_2CActionPerformed

    private void btn_2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2EActionPerformed
        btn_2E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Setinha.png")));
        btn_2A.setEnabled(false);
        btn_2B.setEnabled(false);
        btn_2C.setEnabled(false);
        btn_2D.setEnabled(false);

        int num1 = Integer.parseInt(Pontos.getText());
        int soma = num1 + 10;
        Pontos.setText(Integer.toString(soma));
    }//GEN-LAST:event_btn_2EActionPerformed

    private void btn_2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2DActionPerformed
        btn_2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pontinho.png")));

        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 + 1;
        Tentativas.setText(Integer.toString(soma));
        btn_2D.setEnabled(false);

    }//GEN-LAST:event_btn_2DActionPerformed

    private void btn_3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3AActionPerformed
        btn_3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_3A.setEnabled(false);
        }

    }//GEN-LAST:event_btn_3AActionPerformed

    private void btn_3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3BActionPerformed
        btn_3B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Setinha.png")));
        btn_3A.setEnabled(false);
        btn_3C.setEnabled(false);
        btn_3D.setEnabled(false);
        btn_3E.setEnabled(false);

        int num1 = Integer.parseInt(Pontos.getText());
        int soma = num1 + 10;
        Pontos.setText(Integer.toString(soma));

    }//GEN-LAST:event_btn_3BActionPerformed

    private void btn_3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3CActionPerformed
        btn_3C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_3C.setEnabled(false);
        }
    }//GEN-LAST:event_btn_3CActionPerformed

    private void btn_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3DActionPerformed
        btn_3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pontinho.png")));

        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 + 1;
        Tentativas.setText(Integer.toString(soma));
        btn_3D.setEnabled(false);
    }//GEN-LAST:event_btn_3DActionPerformed

    private void btn_3EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3EActionPerformed
        btn_3E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bombinha.png")));
        int num1 = Integer.parseInt(Tentativas.getText());
        int soma = num1 - 1;
        Tentativas.setText(Integer.toString(soma));

        if (Tentativas.getText().equals("0")) {
            this.dispose();

            // pega a guantidade de pontos que jogador tem 
            TelaJogo ponto = new TelaJogo();
            ponto.setName(Pontos.getText());
            GameOver frms = new GameOver();
            frms.ExportarPontos(ponto);
            frms.setVisible(true);
            dispose();

        } else {
            btn_3E.setEnabled(false);
        }
    }//GEN-LAST:event_btn_3EActionPerformed

    private void TentativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TentativasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TentativasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pontos;
    private javax.swing.JTextField Tentativas;
    private javax.swing.JButton btn_1A;
    private javax.swing.JButton btn_1B;
    private javax.swing.JButton btn_1C;
    private javax.swing.JButton btn_1D;
    private javax.swing.JButton btn_1E;
    private javax.swing.JButton btn_2A;
    private javax.swing.JButton btn_2B;
    private javax.swing.JButton btn_2C;
    private javax.swing.JButton btn_2D;
    private javax.swing.JButton btn_2E;
    private javax.swing.JButton btn_3A;
    private javax.swing.JButton btn_3B;
    private javax.swing.JButton btn_3C;
    private javax.swing.JButton btn_3D;
    private javax.swing.JButton btn_3E;
    private javax.swing.JButton btn_4A;
    private javax.swing.JButton btn_4B;
    private javax.swing.JButton btn_4C;
    private javax.swing.JButton btn_4D;
    private javax.swing.JButton btn_4E;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

    private void preencherArryButos() {

        botaosNivel1.addAll(Arrays.asList(btn_1A, btn_1B, btn_1C, btn_1D, btn_1E));

        botaosNivel2.addAll(Arrays.asList(btn_2A, btn_2B, btn_2C, btn_2D, btn_2E));

        botaosNivel3.addAll(Arrays.asList(btn_3A, btn_3B, btn_3C, btn_3D, btn_3E));

        botaosNivel4.addAll(Arrays.asList(btn_4A, btn_4B, btn_4C, btn_4D, btn_4E));

    }

    private void embaranharBotoes() {
        for (int i = 0; i <= botaosNivel1.size(); i++) {
            botaosNivel1.get(i).getLocation();
        }
    }
}
