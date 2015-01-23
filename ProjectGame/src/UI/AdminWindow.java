/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAL.Item;
import DAL.Slot;
import Services.UIException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author LanceDH
 */
public class AdminWindow extends javax.swing.JFrame {

    private DAL.Account _selectedAccount;
    private DAL.Item _selectedItem;
    
    /**
     * Creates new form AdminWindow
     */
    public AdminWindow() {
        initComponents();
        
        InitAccount();
        InitItem();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnl_MainPanel = new javax.swing.JTabbedPane();
        pnl_Accounts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Accounts = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txt_Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        cbx_Admin = new javax.swing.JCheckBox();
        btn_SaveAccount = new javax.swing.JButton();
        btn_DeleteAccount = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_Characeters = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        btn_ViewCharaceter = new javax.swing.JButton();
        btn_DeleteCharacter = new javax.swing.JButton();
        pnl_Characters = new javax.swing.JPanel();
        pnl_Items = new javax.swing.JPanel();
        cmb_Items_SlotList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Items_ItemList = new javax.swing.JList();
        txt_Items_Search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Items_Name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_Items_Slot = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmb_Items_Attribute1 = new javax.swing.JComboBox();
        txt_Items_Attribute1Value = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_Items_Attribute2 = new javax.swing.JComboBox();
        txt_Items_Attribute2Value = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_Items_Save = new javax.swing.JButton();
        btn_Items_Add = new javax.swing.JButton();
        btn_Items_Delete = new javax.swing.JButton();
        txt_Items_Icon = new javax.swing.JTextField();
        lbl_Items_Icon = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setViewportView(lst_Accounts);

        jLabel1.setText("Accounts");

        jLabel2.setText("Account Name");

        jLabel3.setText("Password");

        cbx_Admin.setText("Admin Account");

        btn_SaveAccount.setText("Save");
        btn_SaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveAccountActionPerformed(evt);
            }
        });

        btn_DeleteAccount.setText("Del");
        btn_DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteAccountActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lst_Characeters);

        jLabel4.setText("Characters");

        btn_ViewCharaceter.setText("View");

        btn_DeleteCharacter.setText("Del");

        javax.swing.GroupLayout pnl_AccountsLayout = new javax.swing.GroupLayout(pnl_Accounts);
        pnl_Accounts.setLayout(pnl_AccountsLayout);
        pnl_AccountsLayout.setHorizontalGroup(
            pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_AccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbx_Admin)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_AccountsLayout.createSequentialGroup()
                        .addComponent(btn_SaveAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btn_DeleteAccount))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_AccountsLayout.createSequentialGroup()
                        .addComponent(btn_ViewCharaceter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_DeleteCharacter))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_Password)
                    .addComponent(txt_Name))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        pnl_AccountsLayout.setVerticalGroup(
            pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_AccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_AccountsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_AccountsLayout.createSequentialGroup()
                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_Admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_SaveAccount)
                            .addComponent(btn_DeleteAccount))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ViewCharaceter)
                    .addComponent(btn_DeleteCharacter))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        tpnl_MainPanel.addTab("Accounts", pnl_Accounts);

        javax.swing.GroupLayout pnl_CharactersLayout = new javax.swing.GroupLayout(pnl_Characters);
        pnl_Characters.setLayout(pnl_CharactersLayout);
        pnl_CharactersLayout.setHorizontalGroup(
            pnl_CharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        pnl_CharactersLayout.setVerticalGroup(
            pnl_CharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        tpnl_MainPanel.addTab("Characters", pnl_Characters);

        cmb_Items_SlotList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_Items_SlotListActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lst_Items_ItemList);

        jLabel5.setText("Name");

        jLabel6.setText("Slot type");

        jLabel7.setText("Attribute 1");

        jLabel8.setText("Value");

        jLabel9.setText("Attribute 2");

        jLabel10.setText("Value");

        btn_Items_Save.setText("Save");
        btn_Items_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Items_SaveActionPerformed(evt);
            }
        });

        btn_Items_Add.setText("Add");
        btn_Items_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Items_AddActionPerformed(evt);
            }
        });

        btn_Items_Delete.setText("Delete");
        btn_Items_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Items_DeleteActionPerformed(evt);
            }
        });

        lbl_Items_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown.png"))); // NOI18N

        jLabel12.setText("Icon");

        javax.swing.GroupLayout pnl_ItemsLayout = new javax.swing.GroupLayout(pnl_Items);
        pnl_Items.setLayout(pnl_ItemsLayout);
        pnl_ItemsLayout.setHorizontalGroup(
            pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmb_Items_SlotList, 0, 151, Short.MAX_VALUE)
                    .addComponent(txt_Items_Search))
                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ItemsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ItemsLayout.createSequentialGroup()
                                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ItemsLayout.createSequentialGroup()
                                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ItemsLayout.createSequentialGroup()
                                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_Items_Icon, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Items_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_Items_Slot, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_ItemsLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(cmb_Items_Attribute1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ItemsLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Items_Attribute1Value, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addComponent(cmb_Items_Attribute2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ItemsLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Items_Attribute2Value, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnl_ItemsLayout.createSequentialGroup()
                                .addComponent(btn_Items_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Items_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(btn_Items_Delete)))
                        .addContainerGap())
                    .addGroup(pnl_ItemsLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lbl_Items_Icon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_ItemsLayout.setVerticalGroup(
            pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ItemsLayout.createSequentialGroup()
                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_Items_SlotList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_ItemsLayout.createSequentialGroup()
                                .addComponent(txt_Items_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_Items_Slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Items_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Items_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_ItemsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Items_Attribute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Items_Attribute1Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Items_Attribute2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Items_Attribute2Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Items_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Items_Save)
                    .addComponent(btn_Items_Add)
                    .addComponent(btn_Items_Delete))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        tpnl_MainPanel.addTab("Items", pnl_Items);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnl_MainPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnl_MainPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteAccountActionPerformed
        if(_selectedAccount == null){
            return;
        }
        
        int result = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete " + _selectedAccount.getName() + " ?", "Warning" , JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            
            if (Services.CharacterServices.GetAllChactersOfAccount(_selectedAccount.getId()).size() != 0) {
                JOptionPane.showMessageDialog(this,"Can't delete account that has characters.");
                return;
            }
            else{
                Services.AccountServices.DeleteAccount(_selectedAccount);
                ResetAccountPanel();
            }
 
        }
    }//GEN-LAST:event_btn_DeleteAccountActionPerformed

    private void btn_SaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveAccountActionPerformed
        if(_selectedAccount == null){
            return;
        }
        
        _selectedAccount.setName(txt_Name.getText());
        _selectedAccount.setPassword(txt_Password.getText());
        _selectedAccount.setAdmin(cbx_Admin.isSelected());
        Services.AccountServices.UpdateAccount(_selectedAccount);
        JOptionPane.showMessageDialog(this,"Account updated.");
 
        lst_Accounts.setListData(Services.AccountServices.GetAllAccounts().toArray());
        
        
    }//GEN-LAST:event_btn_SaveAccountActionPerformed

    private void btn_Items_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Items_SaveActionPerformed
        
    }//GEN-LAST:event_btn_Items_SaveActionPerformed

    private void btn_Items_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Items_AddActionPerformed
        DAL.Item item = new Item();
        item.setName(txt_Items_Name.getText());
        item.setSlot((DAL.Slot) cmb_Items_Slot.getSelectedItem());
        item.setAttribute1((DAL.Attribute)cmb_Items_Attribute1.getSelectedItem());
        item.setAttribute1value(Integer.parseInt(txt_Items_Attribute1Value.getText()));
        if (((DAL.Attribute)cmb_Items_Attribute1.getSelectedItem()).getName().equals("None")) {
            item.setAttribute2(null);
            item.setAttribute2value(0);
        }
        else{
            item.setAttribute2((DAL.Attribute)cmb_Items_Attribute1.getSelectedItem());
            item.setAttribute2value(Integer.parseInt(txt_Items_Attribute2Value.getText()));
        }
        
        try {
            Services.ItemServices.InsertItem(item);
        } catch (UIException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
            return;
        }
        
        UpdateItemlist();
    }//GEN-LAST:event_btn_Items_AddActionPerformed

    private void btn_Items_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Items_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Items_DeleteActionPerformed

    private void cmb_Items_SlotListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_Items_SlotListActionPerformed
        lst_Items_ItemList.removeAll();
        
        UpdateItemlist();
    }//GEN-LAST:event_cmb_Items_SlotListActionPerformed

    private void ResetAccountPanel(){
        _selectedAccount = null;
        txt_Name.setText("");
        txt_Password.setText("");
        cbx_Admin.setSelected(false);
        lst_Characeters.removeAll();
        lst_Accounts.setListData(Services.AccountServices.GetAllAccounts().toArray());
    }
    
    private void InitAccount(){
        lst_Accounts.setListData(Services.AccountServices.GetAllAccounts().toArray());
        lst_Accounts.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(lst_Accounts.getSelectedValue() == null){
                    return;
                }
                _selectedAccount = (DAL.Account) lst_Accounts.getSelectedValue();
                txt_Name.setText(_selectedAccount.getName());
                txt_Password.setText(_selectedAccount.getPassword());
                cbx_Admin.setSelected(_selectedAccount.isAdmin());
                
                lst_Characeters.setListData(Services.CharacterServices.GetAllChactersOfAccount(_selectedAccount.getId()).toArray());
            }
        });
        
        txt_Search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {}
       
            @Override
            @SuppressWarnings("empty-statement")
            public void insertUpdate(DocumentEvent de) {
                lst_Accounts.setListData(Services.AccountServices.GetAccountsLike(txt_Search.getText()).toArray()); ;
            }
            @Override
            @SuppressWarnings("empty-statement")
            public void removeUpdate(DocumentEvent de) {
                lst_Accounts.setListData(Services.AccountServices.GetAccountsLike(txt_Search.getText()).toArray()); ;
            }
        });
    }
    
    private void InitItem(){
        Slot slot = new Slot("All");
        cmb_Items_SlotList.addItem(slot);
        
        if(Services.MiscServices.getSlotList() == null){
            Services.MiscServices.LoadSlotData();
        }
        for (DAL.Slot s : Services.MiscServices.getSlotList()) {
            cmb_Items_SlotList.addItem(s);
            cmb_Items_Slot.addItem(s);
        }

        DAL.Attribute attribute = new DAL.Attribute("None");
        cmb_Items_Attribute2.addItem(attribute);
        for (DAL.Attribute att : Services.MiscServices.getAttributeList()) {
            cmb_Items_Attribute1.addItem(att);
            cmb_Items_Attribute2.addItem(att);
        }
        
        lst_Items_ItemList.setListData(Services.ItemServices.getLootList().toArray());
        
        
        lst_Items_ItemList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(lst_Items_ItemList.getSelectedValue() == null){
                    return;
                }
                _selectedItem = (DAL.Item) lst_Items_ItemList.getSelectedValue();
                txt_Items_Name.setText(_selectedItem.getName());
                txt_Items_Attribute1Value.setText("" + _selectedItem.getAttribute1value());
                txt_Items_Attribute2Value.setText("" + _selectedItem.getAttribute2value());
                for (int i = 0; i < cmb_Items_Slot.getItemCount(); i++) {
                    DAL.Slot sl = (DAL.Slot)cmb_Items_Slot.getItemAt(i);
                    if(sl.getId() == _selectedItem.getSlot().getId()){
                       cmb_Items_Slot.setSelectedIndex(i);
                    }
                }
                
                for (int i = 0; i < cmb_Items_Attribute1.getItemCount(); i++) {
                    DAL.Attribute att = (DAL.Attribute)cmb_Items_Attribute1.getItemAt(i);
                    if (att.getId() == _selectedItem.getAttribute1().getId()) {
                        cmb_Items_Attribute1.setSelectedIndex(i);
                    }
                }
                
                if(_selectedItem.getAttribute2() == null){
                    cmb_Items_Attribute2.setSelectedIndex(0);
                }else{
                    for (int i = 1; i < cmb_Items_Attribute2.getItemCount(); i++) {
                    
                        DAL.Attribute att = (DAL.Attribute)cmb_Items_Attribute2.getItemAt(i);
                        if (att.getId() == _selectedItem.getAttribute2().getId()) {
                            cmb_Items_Attribute2.setSelectedIndex(i);
                        }
                    }
                }
                
                txt_Items_Icon.setText(_selectedItem.getIconPath());
                GameWindow gmw = new GameWindow();
                gmw.ChangeIcon(lbl_Items_Icon, _selectedItem.getIconPath());
            }
        });
        
        txt_Items_Search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {}
       
            @Override
            @SuppressWarnings("empty-statement")
            public void insertUpdate(DocumentEvent de) {
                UpdateItemlist();
            }
            @Override
            @SuppressWarnings("empty-statement")
            public void removeUpdate(DocumentEvent de) {
                UpdateItemlist();
            }
        });
        
        txt_Items_Icon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {}
       
            @Override
            @SuppressWarnings("empty-statement")
            public void insertUpdate(DocumentEvent de) {
                GameWindow gmw = new GameWindow();
                gmw.ChangeIcon(lbl_Items_Icon, txt_Items_Icon.getText());
            }
            @Override
            @SuppressWarnings("empty-statement")
            public void removeUpdate(DocumentEvent de) {
                GameWindow gmw = new GameWindow();
                gmw.ChangeIcon(lbl_Items_Icon, txt_Items_Icon.getText());
            }
        });
    }
    
    private void UpdateItemlist(){
        DAL.Slot slot = (DAL.Slot)cmb_Items_SlotList.getSelectedItem();
        if (slot.getName().equals("All")) { 
            lst_Items_ItemList.setListData(Services.ItemServices.GetAccountsLike(txt_Items_Search.getText(), null).toArray());
        }else{
            lst_Items_ItemList.setListData(Services.ItemServices.GetAccountsLike(txt_Items_Search.getText(), slot).toArray());
        }
    }
    
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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DeleteAccount;
    private javax.swing.JButton btn_DeleteCharacter;
    private javax.swing.JButton btn_Items_Add;
    private javax.swing.JButton btn_Items_Delete;
    private javax.swing.JButton btn_Items_Save;
    private javax.swing.JButton btn_SaveAccount;
    private javax.swing.JButton btn_ViewCharaceter;
    private javax.swing.JCheckBox cbx_Admin;
    private javax.swing.JComboBox cmb_Items_Attribute1;
    private javax.swing.JComboBox cmb_Items_Attribute2;
    private javax.swing.JComboBox cmb_Items_Slot;
    private javax.swing.JComboBox cmb_Items_SlotList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Items_Icon;
    private javax.swing.JList lst_Accounts;
    private javax.swing.JList lst_Characeters;
    private javax.swing.JList lst_Items_ItemList;
    private javax.swing.JPanel pnl_Accounts;
    private javax.swing.JPanel pnl_Characters;
    private javax.swing.JPanel pnl_Items;
    private javax.swing.JTabbedPane tpnl_MainPanel;
    private javax.swing.JTextField txt_Items_Attribute1Value;
    private javax.swing.JTextField txt_Items_Attribute2Value;
    private javax.swing.JTextField txt_Items_Icon;
    private javax.swing.JTextField txt_Items_Name;
    private javax.swing.JTextField txt_Items_Search;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Search;
    // End of variables declaration//GEN-END:variables
}
