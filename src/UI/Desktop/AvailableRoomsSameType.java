/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Desktop;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sakis
 */
public class AvailableRoomsSameType extends javax.swing.JFrame {
    private mainwindow myfather1 = null;
    private ModifyBooking myfather2 = null;

    /**
     * Creates new form AvailableRoomsSameType
     */
    public AvailableRoomsSameType(ModifyBooking mw) {
        super("Available Rooms");
        myfather2 = mw;
        initComponents();
        myInit();
    }
    
    public AvailableRoomsSameType(mainwindow mw) {
        super("Available Rooms");
        myfather1 = mw;
        initComponents();
        myInit();
    }
    
    private void myInit(){
        this.jLabel2.setText("Type of room: "+this.getComboBoxType());
        jList1.setModel(this.getroomlistmodel());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jAddroom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Available Rooms");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jLabel2, java.awt.BorderLayout.NORTH);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel3.setEditable(false);
        jLabel3.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        jLabel3.setEnabled(false);
        jLabel3.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(6, 40));
        jScrollPane2.setViewportView(jLabel3);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(179, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.WEST);

        jAddroom.setText("Add Room");
        jAddroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddroomActionPerformed(evt);
            }
        });
        jPanel4.add(jAddroom, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel4, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddroomActionPerformed
        // Add room
        if(!this.jList1.isSelectionEmpty()){
            this.addRoomList(jList1.getSelectedIndex());
            this.dispose();
        }else
            JOptionPane.showMessageDialog(null, "You have to select a room first", "Alert", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jAddroomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // cancel
        jList1.clearSelection();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        this.jLabel3.setText("Benefits: "+getBenefits(this.jList1.getSelectedIndex()));
    }//GEN-LAST:event_jList1MouseClicked

    
    private String getComboBoxType(){
        if(this.myfather1!=null)
            return this.myfather1.getComboBoxType();
        else
            return this.myfather2.getComboBoxType();
    }
    
    private DefaultListModel getroomlistmodel(){
        if(this.myfather1!=null)
            return this.myfather1.getroomlistmodel();
        else
            return this.myfather2.getroomlistmodel();
    }
    
    private String getBenefits(int index){
        if(this.myfather1!=null)
            return this.myfather1.getBenefits(1,index);
        else
            return this.myfather2.getBenefits(1,index);        
    }
    
    private void addRoomList(int index){
        if(this.myfather1!=null)
            this.myfather1.addBookingList(1,index);
        else
            this.myfather2.addRoomList(index);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextPane jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
