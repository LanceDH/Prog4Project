/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAL.Account;
import DAL.Password;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author LanceDH
 */
public class AccountRegistrationPanel extends javax.swing.JPanel {

    private GameWindow _parent;
    /**
     * Creates new form AccountRegistrationPanel
     */
    public AccountRegistrationPanel(GameWindow parent) {
        this._parent = parent;
        initComponents();
        
        txt_Account.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {}
            @Override
            @SuppressWarnings("empty-statement")
            public void insertUpdate(DocumentEvent de) {
                if(txt_Account.getText().length() > Account.MAXLENGTH){
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt_Account.setText(txt_Account.getText().substring(0, Account.MAXLENGTH));
                        }
                    });
                    ;
                }
            }
            @Override
            public void removeUpdate(DocumentEvent de) {}
        });
        
        txt_Password.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {}
            @Override
            @SuppressWarnings("empty-statement")
            public void insertUpdate(DocumentEvent de) {
                if(txt_Password.getText().length() > Password.MAXLENGTH){
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt_Password.setText(txt_Password.getText().substring(0, Password.MAXLENGTH));
                        }
                    });
                    ;
                }
            }
            @Override
            public void removeUpdate(DocumentEvent de) {}
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Account = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        btn_Register = new javax.swing.JButton();
        lbl_Error = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(129, 114));
        jPanel2.setMinimumSize(new java.awt.Dimension(129, 114));

        jLabel1.setText("Account Name");

        jLabel2.setText("Password");

        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        lbl_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_Password)
                    .addComponent(btn_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txt_Account))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancel)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Cancel)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        _parent.remove(this);
        _parent.ShowLogin();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        String name = txt_Account.getText();
        String passInput = txt_Password.getText();
        
        // make sure the name is max 25 chars
        if (name.length() > Account.MAXLENGTH) {
            name = name.substring(0, Account.MAXLENGTH);
        }
        // make sure the pass is max 25 chars
        if (name.length() > Password.MAXLENGTH) {
            name = name.substring(0, Password.MAXLENGTH);
        }

        DAL.Password pass = new Password(passInput);
        
        if (!pass.IsValid()) {
            lbl_Error.setText(pass.getError());
            return;
        }
        
        DAL.Account account = new Account();
        account.setName(name);
        account.setPassword(pass.getPass());
        
        if (!account.IsValid()) {
            lbl_Error.setText(account.getError());
            return;
        }
        
        try {
            Services.AccountServices.InsertAccount(account);
        } catch (Exception e) {
            lbl_Error.setText(e.getMessage());
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Account created.");
        _parent.remove(this);
        _parent.ShowLogin();
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Reset();
    }//GEN-LAST:event_formAncestorAdded

    public void Reset(){
        txt_Account.setText("");
        txt_Password.setText("");
        lbl_Error.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JTextField txt_Account;
    private javax.swing.JTextField txt_Password;
    // End of variables declaration//GEN-END:variables
}
