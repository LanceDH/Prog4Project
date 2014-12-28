/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import javax.swing.SwingUtilities;

/**
 *
 * @author 11627
 */
public class CharacterSelectWindow extends javax.swing.JPanel {

    /**
     * Creates new form pnl_CharacterSelect
     */
    public CharacterSelectWindow() {
        initComponents();
        HideAllCharacters();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnl_Char1 = new javax.swing.JPanel();
        btn_LoginChar1 = new javax.swing.JButton();
        btn_DeleteChar1 = new javax.swing.JButton();
        lbl_IconClassChar1 = new javax.swing.JLabel();
        lbl_IconRaceChar1 = new javax.swing.JLabel();
        pnl_Char2 = new javax.swing.JPanel();
        btn_LoginChar2 = new javax.swing.JButton();
        btn_DeleteChar2 = new javax.swing.JButton();
        lbl_IconClassChar2 = new javax.swing.JLabel();
        lbl_IconRaceChar2 = new javax.swing.JLabel();
        pnl_Char3 = new javax.swing.JPanel();
        btn_LoginChar3 = new javax.swing.JButton();
        btn_DeleteChar3 = new javax.swing.JButton();
        lbl_IconClassChar3 = new javax.swing.JLabel();
        lbl_IconRaceChar3 = new javax.swing.JLabel();
        pnl_Char4 = new javax.swing.JPanel();
        btn_LoginChar4 = new javax.swing.JButton();
        btn_DeleteChar4 = new javax.swing.JButton();
        lbl_IconClassChar4 = new javax.swing.JLabel();
        lbl_IconRaceChar4 = new javax.swing.JLabel();
        pnl_Char5 = new javax.swing.JPanel();
        btn_LoginChar5 = new javax.swing.JButton();
        btn_DeleteChar5 = new javax.swing.JButton();
        lbl_IconClassChar5 = new javax.swing.JLabel();
        lbl_IconRaceChar5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("AccountName");

        jButton2.setText("jButton2");

        jButton3.setText("logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        btn_LoginChar1.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar1.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar1.setPreferredSize(new java.awt.Dimension(33, 26));

        btn_DeleteChar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar1.setText("x");
        btn_DeleteChar1.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar1.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar1.setName(""); // NOI18N
        btn_DeleteChar1.setPreferredSize(new java.awt.Dimension(26, 26));

        lbl_IconClassChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconClassChar1.setToolTipText("");
        lbl_IconClassChar1.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar1.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar1.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconRaceChar1.setToolTipText("");
        lbl_IconRaceChar1.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar1.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar1.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char1Layout = new javax.swing.GroupLayout(pnl_Char1);
        pnl_Char1.setLayout(pnl_Char1Layout);
        pnl_Char1Layout.setHorizontalGroup(
            pnl_Char1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char1Layout.setVerticalGroup(
            pnl_Char1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char1);

        btn_LoginChar2.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar2.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar2.setPreferredSize(new java.awt.Dimension(33, 26));

        btn_DeleteChar2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar2.setText("x");
        btn_DeleteChar2.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar2.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar2.setName(""); // NOI18N
        btn_DeleteChar2.setPreferredSize(new java.awt.Dimension(26, 26));

        lbl_IconClassChar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconClassChar2.setToolTipText("");
        lbl_IconClassChar2.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar2.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar2.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconRaceChar2.setToolTipText("");
        lbl_IconRaceChar2.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar2.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar2.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char2Layout = new javax.swing.GroupLayout(pnl_Char2);
        pnl_Char2.setLayout(pnl_Char2Layout);
        pnl_Char2Layout.setHorizontalGroup(
            pnl_Char2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char2Layout.setVerticalGroup(
            pnl_Char2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char2);

        btn_LoginChar3.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar3.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar3.setPreferredSize(new java.awt.Dimension(33, 26));

        btn_DeleteChar3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar3.setText("x");
        btn_DeleteChar3.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar3.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar3.setName(""); // NOI18N
        btn_DeleteChar3.setPreferredSize(new java.awt.Dimension(26, 26));

        lbl_IconClassChar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconClassChar3.setToolTipText("");
        lbl_IconClassChar3.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar3.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar3.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconRaceChar3.setToolTipText("");
        lbl_IconRaceChar3.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar3.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar3.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char3Layout = new javax.swing.GroupLayout(pnl_Char3);
        pnl_Char3.setLayout(pnl_Char3Layout);
        pnl_Char3Layout.setHorizontalGroup(
            pnl_Char3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char3Layout.setVerticalGroup(
            pnl_Char3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char3);

        btn_LoginChar4.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar4.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar4.setPreferredSize(new java.awt.Dimension(33, 26));

        btn_DeleteChar4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar4.setText("x");
        btn_DeleteChar4.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar4.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar4.setName(""); // NOI18N
        btn_DeleteChar4.setPreferredSize(new java.awt.Dimension(26, 26));

        lbl_IconClassChar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconClassChar4.setToolTipText("");
        lbl_IconClassChar4.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar4.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar4.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconRaceChar4.setToolTipText("");
        lbl_IconRaceChar4.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar4.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar4.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char4Layout = new javax.swing.GroupLayout(pnl_Char4);
        pnl_Char4.setLayout(pnl_Char4Layout);
        pnl_Char4Layout.setHorizontalGroup(
            pnl_Char4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char4Layout.setVerticalGroup(
            pnl_Char4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char4);

        btn_LoginChar5.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar5.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar5.setPreferredSize(new java.awt.Dimension(33, 26));

        btn_DeleteChar5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar5.setText("x");
        btn_DeleteChar5.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar5.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar5.setName(""); // NOI18N
        btn_DeleteChar5.setPreferredSize(new java.awt.Dimension(26, 26));

        lbl_IconClassChar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconClassChar5.setToolTipText("");
        lbl_IconClassChar5.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar5.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar5.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unknown.png"))); // NOI18N
        lbl_IconRaceChar5.setToolTipText("");
        lbl_IconRaceChar5.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar5.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar5.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char5Layout = new javax.swing.GroupLayout(pnl_Char5);
        pnl_Char5.setLayout(pnl_Char5Layout);
        pnl_Char5Layout.setHorizontalGroup(
            pnl_Char5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char5Layout.setVerticalGroup(
            pnl_Char5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 167, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HideAllCharacters(){
        //pnl_Char1.setVisible(false);
        lbl_IconRaceChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/human26.png")));
        btn_LoginChar1.setText("TestCharacterName");
        pnl_Char2.setVisible(false);
        btn_LoginChar2.setText("null");
        pnl_Char3.setVisible(false);
        btn_LoginChar3.setText("null");
        pnl_Char4.setVisible(false);
        btn_LoginChar4.setText("null");
        pnl_Char5.setVisible(false);
        btn_LoginChar5.setText("null");
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GameWindow parent = (GameWindow)SwingUtilities.getWindowAncestor(this);
        parent.remove(this);
        parent.ShowLogin();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DeleteChar1;
    private javax.swing.JButton btn_DeleteChar2;
    private javax.swing.JButton btn_DeleteChar3;
    private javax.swing.JButton btn_DeleteChar4;
    private javax.swing.JButton btn_DeleteChar5;
    private javax.swing.JButton btn_LoginChar1;
    private javax.swing.JButton btn_LoginChar2;
    private javax.swing.JButton btn_LoginChar3;
    private javax.swing.JButton btn_LoginChar4;
    private javax.swing.JButton btn_LoginChar5;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_IconClassChar1;
    private javax.swing.JLabel lbl_IconClassChar2;
    private javax.swing.JLabel lbl_IconClassChar3;
    private javax.swing.JLabel lbl_IconClassChar4;
    private javax.swing.JLabel lbl_IconClassChar5;
    private javax.swing.JLabel lbl_IconRaceChar1;
    private javax.swing.JLabel lbl_IconRaceChar2;
    private javax.swing.JLabel lbl_IconRaceChar3;
    private javax.swing.JLabel lbl_IconRaceChar4;
    private javax.swing.JLabel lbl_IconRaceChar5;
    private javax.swing.JPanel pnl_Char1;
    private javax.swing.JPanel pnl_Char2;
    private javax.swing.JPanel pnl_Char3;
    private javax.swing.JPanel pnl_Char4;
    private javax.swing.JPanel pnl_Char5;
    // End of variables declaration//GEN-END:variables
}
