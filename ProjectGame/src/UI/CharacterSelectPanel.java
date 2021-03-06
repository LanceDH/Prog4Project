/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import javax.swing.SwingUtilities;
import DAL.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author 11627
 */
public class CharacterSelectPanel extends javax.swing.JPanel {

    private ArrayList<Map> charMaps = new ArrayList<Map>();
    private ArrayList<DAL.Character> characterList = null;
    private GameWindow _parentWindow;
    
    /**
     * Creates new form pnl_CharacterSelect
     */
    public CharacterSelectPanel(GameWindow parent) {
        _parentWindow = parent;
        initComponents();
        InitMapArray();
        ResetAllCharacterPanels();
        
        //characterList = Services.characterServices.GetAllChactersOfAccount(1);
        
        //for (int i = 0; i < characterList.size(); i++) {
        //    AddCharacterToList(i, characterList.get(i));
        //}
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
        btn_Logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnl_Char0 = new javax.swing.JPanel();
        btn_LoginChar0 = new javax.swing.JButton();
        btn_DeleteChar0 = new javax.swing.JButton();
        lbl_IconClassChar0 = new javax.swing.JLabel();
        lbl_IconRaceChar0 = new javax.swing.JLabel();
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
        btn_CreateChar = new javax.swing.JButton();
        lbl_AccountName = new javax.swing.JLabel();
        btn_Admin = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(500, 350));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logged in as:");

        btn_Logout.setText("logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 214));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 214));

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        pnl_Char0.setMaximumSize(new java.awt.Dimension(296, 38));
        pnl_Char0.setMinimumSize(new java.awt.Dimension(296, 38));

        btn_LoginChar0.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar0.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar0.setName("0"); // NOI18N
        btn_LoginChar0.setPreferredSize(new java.awt.Dimension(33, 26));
        btn_LoginChar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCharacter(evt);
            }
        });

        btn_DeleteChar0.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UI_Delete_16.png"))); // NOI18N
        btn_DeleteChar0.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar0.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar0.setName("0"); // NOI18N
        btn_DeleteChar0.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCharacter(evt);
            }
        });

        lbl_IconClassChar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconClassChar0.setToolTipText("");
        lbl_IconClassChar0.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar0.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar0.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconRaceChar0.setToolTipText("");
        lbl_IconRaceChar0.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar0.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconRaceChar0.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_Char0Layout = new javax.swing.GroupLayout(pnl_Char0);
        pnl_Char0.setLayout(pnl_Char0Layout);
        pnl_Char0Layout.setHorizontalGroup(
            pnl_Char0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconClassChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_IconRaceChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LoginChar0, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_Char0Layout.setVerticalGroup(
            pnl_Char0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Char0Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_Char0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IconRaceChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconClassChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Char0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_LoginChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_DeleteChar0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jPanel1.add(pnl_Char0);

        pnl_Char1.setMaximumSize(new java.awt.Dimension(296, 38));
        pnl_Char1.setMinimumSize(new java.awt.Dimension(296, 38));

        btn_LoginChar1.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar1.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar1.setName("1"); // NOI18N
        btn_LoginChar1.setPreferredSize(new java.awt.Dimension(33, 26));
        btn_LoginChar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCharacter(evt);
            }
        });

        btn_DeleteChar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UI_Delete_16.png"))); // NOI18N
        btn_DeleteChar1.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar1.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar1.setName("1"); // NOI18N
        btn_DeleteChar1.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCharacter(evt);
            }
        });

        lbl_IconClassChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconClassChar1.setToolTipText("");
        lbl_IconClassChar1.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar1.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar1.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
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

        pnl_Char2.setMaximumSize(new java.awt.Dimension(296, 38));
        pnl_Char2.setMinimumSize(new java.awt.Dimension(296, 38));

        btn_LoginChar2.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar2.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar2.setName("2"); // NOI18N
        btn_LoginChar2.setPreferredSize(new java.awt.Dimension(33, 26));
        btn_LoginChar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCharacter(evt);
            }
        });

        btn_DeleteChar2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UI_Delete_16.png"))); // NOI18N
        btn_DeleteChar2.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar2.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar2.setName("2"); // NOI18N
        btn_DeleteChar2.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCharacter(evt);
            }
        });

        lbl_IconClassChar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconClassChar2.setToolTipText("");
        lbl_IconClassChar2.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar2.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar2.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
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

        pnl_Char3.setMaximumSize(new java.awt.Dimension(296, 38));
        pnl_Char3.setMinimumSize(new java.awt.Dimension(296, 38));

        btn_LoginChar3.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar3.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar3.setName("3"); // NOI18N
        btn_LoginChar3.setPreferredSize(new java.awt.Dimension(33, 26));
        btn_LoginChar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCharacter(evt);
            }
        });

        btn_DeleteChar3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UI_Delete_16.png"))); // NOI18N
        btn_DeleteChar3.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar3.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar3.setName("3"); // NOI18N
        btn_DeleteChar3.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCharacter(evt);
            }
        });

        lbl_IconClassChar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconClassChar3.setToolTipText("");
        lbl_IconClassChar3.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar3.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar3.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
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

        pnl_Char4.setMaximumSize(new java.awt.Dimension(296, 38));
        pnl_Char4.setMinimumSize(new java.awt.Dimension(296, 38));

        btn_LoginChar4.setMaximumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar4.setMinimumSize(new java.awt.Dimension(33, 26));
        btn_LoginChar4.setName("4"); // NOI18N
        btn_LoginChar4.setPreferredSize(new java.awt.Dimension(33, 26));
        btn_LoginChar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCharacter(evt);
            }
        });

        btn_DeleteChar4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_DeleteChar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UI_Delete_16.png"))); // NOI18N
        btn_DeleteChar4.setMaximumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar4.setMinimumSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar4.setName("4"); // NOI18N
        btn_DeleteChar4.setPreferredSize(new java.awt.Dimension(26, 26));
        btn_DeleteChar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCharacter(evt);
            }
        });

        lbl_IconClassChar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
        lbl_IconClassChar4.setToolTipText("");
        lbl_IconClassChar4.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar4.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_IconClassChar4.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_IconRaceChar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown_26.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        btn_CreateChar.setText("Create New");
        btn_CreateChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateCharActionPerformed(evt);
            }
        });

        lbl_AccountName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_AccountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_Admin.setText("Admin");
        btn_Admin.setEnabled(false);
        btn_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Logout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(lbl_AccountName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CreateChar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CreateChar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logout)
                    .addComponent(btn_Admin))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InitMapArray(){
        Map map1 = new HashMap();
        map1.put("panel", pnl_Char0);
        map1.put("login", btn_LoginChar0);
        map1.put("class", lbl_IconClassChar0);
        map1.put("race", lbl_IconRaceChar0);
        map1.put("delete", btn_DeleteChar0);
        charMaps.add(map1);
        Map map2 = new HashMap();
        map2.put("panel", pnl_Char1);
        map2.put("login", btn_LoginChar1);
        map2.put("class", lbl_IconClassChar1);
        map2.put("race", lbl_IconRaceChar1);
        map2.put("delete", btn_DeleteChar1);
        charMaps.add(map2);
        Map map3 = new HashMap();
        map3.put("panel", pnl_Char2);
        map3.put("login", btn_LoginChar2);
        map3.put("class", lbl_IconClassChar2);
        map3.put("race", lbl_IconRaceChar2);
        map3.put("delete", btn_DeleteChar2);
        charMaps.add(map3);
        Map map4 = new HashMap();
        map4.put("panel", pnl_Char3);
        map4.put("login", btn_LoginChar3);
        map4.put("class", lbl_IconClassChar3);
        map4.put("race", lbl_IconRaceChar3);
        map4.put("delete", btn_DeleteChar3);
        charMaps.add(map4);
        Map map5 = new HashMap();
        map5.put("panel", pnl_Char4);
        map5.put("login", btn_LoginChar4);
        map5.put("class", lbl_IconClassChar4);
        map5.put("race", lbl_IconRaceChar4);
        map5.put("delete", btn_DeleteChar4);
        charMaps.add(map5);
    }
    
    private void AddCharacterToList(int nr, DAL.Character character){
        Map map = charMaps.get(nr);
        JPanel p = (JPanel)map.get("panel");
        p.setVisible(true);
        JLabel lblRace = (JLabel)map.get("race");
        _parentWindow.ChangeIcon(lblRace, character.getRace().getIconPath());
        JLabel lbl_Class = (JLabel)map.get("class");
        _parentWindow.ChangeIcon(lbl_Class, character.getCharclass().getIconPath());
        JButton b1 = (JButton)map.get("login");
        b1.setText(character.getName());
    }
    
    private void ResetAllCharacterPanels(){
        
        btn_Admin.setEnabled(false);
        btn_Admin.setVisible(false);
        
        for (Map map : charMaps) {
            JPanel p = (JPanel)map.get("panel");
            p.setVisible(false);
        }
        
        btn_CreateChar.setEnabled(true);
        btn_CreateChar.setVisible(true);
        
    }
    
    public void UpdateCharacters(int accId) {
        ResetAllCharacterPanels();
        
        lbl_AccountName.setText(_parentWindow.getActiveAccount().getName());
        
        if(_parentWindow.getActiveAccount().isAdmin()){
            btn_Admin.setEnabled(true);
            btn_Admin.setVisible(true);
        }
        
        characterList = Services.CharacterServices.GetAllChactersOfAccount(accId);
        
        for (int i = 0; i < characterList.size(); i++) {
            AddCharacterToList(i, characterList.get(i));
        }
        
        if(characterList.size() == 5){
            btn_CreateChar.setEnabled(false);
            btn_CreateChar.setVisible(false);
        }
    }
    
    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        _parentWindow.CloseAdminWindow();
        _parentWindow.setActiveAccount(null);
        _parentWindow.remove(this);
        _parentWindow.ShowLogin();
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void SelectCharacter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCharacter
        int charIdInArray = Integer.parseInt(((JButton)evt.getSource()).getName());
        DAL.Character character = characterList.get(charIdInArray);
        Services.CharacterServices.LoginCharacter(character);
        character.setIsLoggedIn(true);
        _parentWindow.setActiveCharacter(character);
        
        _parentWindow.remove(this);
        _parentWindow.ShowLoot();
    }//GEN-LAST:event_SelectCharacter

    private void btn_CreateCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateCharActionPerformed
        _parentWindow.remove(this);
        _parentWindow.ShowCharacterCreate();
    }//GEN-LAST:event_btn_CreateCharActionPerformed

    private void DeleteCharacter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCharacter
        int charIdInArray = Integer.parseInt(((JButton)evt.getSource()).getName());
        DAL.Character c = characterList.get(charIdInArray);
        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete " + c.getName() + " ?", "Warning" , JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            Services.CharacterServices.DeleteCharacter(c);
            UpdateCharacters(_parentWindow.getActiveAccount().getId());
        }
    }//GEN-LAST:event_DeleteCharacter

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        UpdateCharacters(_parentWindow.getActiveAccount().getId());
    }//GEN-LAST:event_formAncestorAdded

    private void btn_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminActionPerformed
        if (_parentWindow.getAdminwWindow().isVisible()) {
            _parentWindow.CloseAdminWindow();
        }else{
            _parentWindow.ShowAdminWindow();
        }
    }//GEN-LAST:event_btn_AdminActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Admin;
    private javax.swing.JButton btn_CreateChar;
    private javax.swing.JButton btn_DeleteChar0;
    private javax.swing.JButton btn_DeleteChar1;
    private javax.swing.JButton btn_DeleteChar2;
    private javax.swing.JButton btn_DeleteChar3;
    private javax.swing.JButton btn_DeleteChar4;
    private javax.swing.JButton btn_LoginChar0;
    private javax.swing.JButton btn_LoginChar1;
    private javax.swing.JButton btn_LoginChar2;
    private javax.swing.JButton btn_LoginChar3;
    private javax.swing.JButton btn_LoginChar4;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_AccountName;
    private javax.swing.JLabel lbl_IconClassChar0;
    private javax.swing.JLabel lbl_IconClassChar1;
    private javax.swing.JLabel lbl_IconClassChar2;
    private javax.swing.JLabel lbl_IconClassChar3;
    private javax.swing.JLabel lbl_IconClassChar4;
    private javax.swing.JLabel lbl_IconRaceChar0;
    private javax.swing.JLabel lbl_IconRaceChar1;
    private javax.swing.JLabel lbl_IconRaceChar2;
    private javax.swing.JLabel lbl_IconRaceChar3;
    private javax.swing.JLabel lbl_IconRaceChar4;
    private javax.swing.JPanel pnl_Char0;
    private javax.swing.JPanel pnl_Char1;
    private javax.swing.JPanel pnl_Char2;
    private javax.swing.JPanel pnl_Char3;
    private javax.swing.JPanel pnl_Char4;
    // End of variables declaration//GEN-END:variables

    
}
