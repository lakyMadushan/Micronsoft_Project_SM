/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dt;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vidura samitha
 */
public class p_l_saving extends javax.swing.JFrame {

    Icon icon = new javax.swing.ImageIcon(getClass().getResource("/dt/pics/suc.png"));
    Icon erricon = new javax.swing.ImageIcon(getClass().getResource("/dt/pics/cut.png"));

    /**
     * Creates new form p_l_saving
     */
    public p_l_saving() {
        initComponents();

        jTextField1.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(173, 225, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("SM | Price List Saving");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Price L ID");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Name");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(23, 184, 46));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dt/pics/cut.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Price List ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton2.setBackground(new java.awt.Color(65, 58, 138));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Load");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(194, 151, 105));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(235, 168, 41));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(225, 31, 29));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //save
        if (!jTextField2.getText().equals("")) {
            try {
                String id = jTextField1.getText();
                DB.iud("insert into price_l_save (p_l_n_id,name) values ( '" + jTextField1.getText() + "' ,'" + jTextField2.getText() + "' )");
                JOptionPane.showMessageDialog(this, "Insert successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                clear();
                tableLoad(id);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Data !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //save
            if (!jTextField2.getText().equals("")) {
                try {
                    String id = jTextField1.getText();
                    DB.iud("insert into price_l_save (p_l_n_id,name) values ( '" + jTextField1.getText() + "' ,'" + jTextField2.getText() + "' )");
                    JOptionPane.showMessageDialog(this, "Insert successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                    clear();
                    tableLoad(id);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Data !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableLoad();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton3.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tableLoad();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jButton2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton4.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clear();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //update
        try {
            if (jTextField1.getText().equals("") || jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Select Row", "DONE", JOptionPane.INFORMATION_MESSAGE, erricon);
            } else {
                JPasswordField passwordField = new JPasswordField(10);
                int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (option == JOptionPane.OK_OPTION) {
                    String password = new String(passwordField.getPassword());
                    if (password.equals("123")) {
                        DB.iud("update price_l_save set name = '" + jTextField2.getText() + "' where p_l_n_id = '" + jTextField1.getText() + "' ");

                        JOptionPane.showMessageDialog(this, "Update successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                        String id = jTextField1.getText();
                        clear();
                        tableLoad(id);
                    } else {
                        JOptionPane.showMessageDialog(this, "Invliid password !", "INVALID", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jButton3.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton5.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //update
            try {
                if (jTextField1.getText().equals("") || jTextField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Select Row", "DONE", JOptionPane.INFORMATION_MESSAGE, erricon);
                } else {
                    JPasswordField passwordField = new JPasswordField(10);
                    int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (option == JOptionPane.OK_OPTION) {
                        String password = new String(passwordField.getPassword());
                        if (password.equals("123")) {
                            DB.iud("update price_l_save set name = '" + jTextField2.getText() + "' where p_l_n_id = '" + jTextField1.getText() + "' ");

                            JOptionPane.showMessageDialog(this, "Update successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                            String id = jTextField1.getText();
                            clear();
                            tableLoad(id);

                        } else {
                            JOptionPane.showMessageDialog(this, "Invliid password !", "INVALID", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //delete
        if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Select The Row Before Delete !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
        } else {

            JPasswordField passwordField = new JPasswordField(10);
            int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                String password = new String(passwordField.getPassword());
                if (password.equals("123")) {
                    try {
                        DB.iud("delete from price_l_save where p_l_n_id = '" + jTextField1.getText() + "' ");
                        JOptionPane.showMessageDialog(this, "Delete successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                        clear();
                        tableLoad();
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Delete Fail !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invliid password !", "INVALID", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jButton4.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //delete
            if (jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Select The Row Before Delete !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
            } else {

                JPasswordField passwordField = new JPasswordField(10);
                int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (option == JOptionPane.OK_OPTION) {
                    String password = new String(passwordField.getPassword());
                    if (password.equals("123")) {
                        try {
                            DB.iud("delete from price_l_save where p_l_n_id = '" + jTextField1.getText() + "' ");
                            JOptionPane.showMessageDialog(this, "Delete successfully.", "DONE", JOptionPane.INFORMATION_MESSAGE, icon);
                            clear();
                            tableLoad();
                        } catch (Exception e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(this, "Delete Fail !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invliid password !", "INVALID", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (Character.isDigit(evt.getKeyChar()) | Character.isLetter(evt.getKeyChar()) | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_SPACE
                | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_RIGHT
                | evt.getKeyCode() == KeyEvent.VK_LEFT | evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField1.setEditable(true);
        } else {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter Only Letters", "ERROR!", JOptionPane.ERROR_MESSAGE, erricon);
            jTextField1.setText("");
            jTextField1.grabFocus();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (Character.isDigit(evt.getKeyChar()) | Character.isLetter(evt.getKeyChar()) | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_SPACE
                | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_RIGHT
                | evt.getKeyCode() == KeyEvent.VK_LEFT | evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField2.setEditable(true);
        } else {
            jTextField2.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter Only Letters", "ERROR!", JOptionPane.ERROR_MESSAGE, erricon);
            jTextField2.setText("");
            jTextField2.grabFocus();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                if (jTable1.getSelectedRow() != -1) {

                    String id = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
                    String name = dtm.getValueAt(jTable1.getSelectedRow(), 1).toString();

                    jTextField1.setText(id);
                    jTextField2.setText(name);

                    jButton1.setEnabled(false);
                } else {
                    System.out.println("No data found for ID: " + jTextField1.getText());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getSelectedRow() != -1) {

                String id = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String name = dtm.getValueAt(jTable1.getSelectedRow(), 1).toString();

                jTextField1.setText(id);
                jTextField2.setText(name);

                jButton1.setEnabled(false);
            } else {
                System.out.println("No data found for ID: " + jTextField1.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jButton1.grabFocus();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if(jTextField1.getText().equals("")){
            jTextField1.grabFocus();
            JOptionPane.showMessageDialog(this, "Enter Price List Id", "ERROR!", JOptionPane.ERROR_MESSAGE, erricon);
        }
    }//GEN-LAST:event_jTextField2FocusGained

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
            java.util.logging.Logger.getLogger(p_l_saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p_l_saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p_l_saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p_l_saving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p_l_saving().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void clear() {

        jTextField1.setText("");
        jTextField2.setText("");
        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jButton1.setEnabled(true);
    }

    private void tableLoad() {
        try {
            clear();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from price_l_save order by p_l_n_id ASC");
            while (rs.next()) {
                Vector<Object> v = new Vector<>();
                v.add(rs.getString("p_l_n_id"));
                v.add(rs.getString("name"));
                dtm.addRow(v);
            }
            jButton1.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Table loading Unsuccesfully !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
        }
    }

    private void tableLoad(String id) {
        try {
            clear();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from price_l_save where p_l_n_id = '" + id + "' ");
            while (rs.next()) {
                Vector<Object> v = new Vector<>();
                v.add(rs.getString("p_l_n_id"));
                v.add(rs.getString("name"));
                dtm.addRow(v);
            }

            jButton1.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Table loading Unsuccesfully !", "ERROR", JOptionPane.INFORMATION_MESSAGE, erricon);
        }
    }
}
