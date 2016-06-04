/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Desktop;

import javax.swing.JOptionPane;



/**
 *
 * @author sakis
 */
public class AvailableRooms extends javax.swing.JFrame {
    private mainwindow myfather;
    

    /**
     * Creates new form AvailableRooms
     */
    public AvailableRooms(mainwindow mw) {
        myfather=mw;
        initComponents();
        myInit();
    }
    
    private void myInit(){
        this.jLabel1.setText("Type of room: "+this.myfather.getComboBoxType());
        this.jLabel3.setText("NOT type of room: "+this.myfather.getComboBoxType());
        this.jLabel4.setText("Type of room: "+this.myfather.getComboBoxType()+" "+this.myfather.getAlternativeCheckin()+"----"+this.myfather.getAlternativeCheckout());
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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jsameType = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jnotSameType = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jsameType1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jCancel = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jAddroom = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Available Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jsameType.setLayout(new javax.swing.BoxLayout(jsameType, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Same type");
        jsameType.add(jLabel1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1 room 1001 Diklino 45", "Item 2 room 1001 Diklino 45", "Item 3 room 1012 Diklino 45", "Item 4 room 1011 Diklino 45", "Item 5 room 1013 Diklino 45" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setVisibleRowCount(10);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jsameType.add(jScrollPane1);

        jPanel3.add(jsameType, java.awt.BorderLayout.LINE_START);

        jnotSameType.setLayout(new javax.swing.BoxLayout(jnotSameType, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("not Same Type");
        jnotSameType.add(jLabel3);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1 room 2001 Souita 45", "Item 2 room 2002 Syperlux 45", "Item 3 room 2003 Souita 45", "Item 4 room 2004 Souita 45", "Item 5 room 2005 Quando 45" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setVisibleRowCount(10);
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jnotSameType.add(jScrollPane2);

        jPanel3.add(jnotSameType, java.awt.BorderLayout.CENTER);

        jsameType1.setLayout(new javax.swing.BoxLayout(jsameType1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Same type");
        jsameType1.add(jLabel4);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1 room 1007 Diklino 45", "Item 2 room 1006 Diklino 45", "Item 3 room 1005 Diklino 45", "Item 4 room 1004 Diklino 45", "Item 5 room 1003 Diklino 45" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.setVisibleRowCount(10);
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jsameType1.add(jScrollPane3);

        jPanel3.add(jsameType1, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });
        jPanel5.add(jCancel);

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        jAddroom.setText("Add Room");
        jAddroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddroomActionPerformed(evt);
            }
        });
        jPanel5.add(jAddroom);

        jPanel1.add(jPanel5, java.awt.BorderLayout.SOUTH);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jAddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddroomActionPerformed
        //return the room
        String st=null;
        if(jList1.getSelectedValue()!=null){
            st = new String(jList1.getSelectedValue());
        }else if(jList2.getSelectedValue()!=null){
            st = new String(jList2.getSelectedValue());
        }else if(jList3.getSelectedValue()!=null){
            st = new String(jList3.getSelectedValue());
            this.myfather.AlternativeResarvation();
        }
        
        if(st!=null){
            myfather.addBookingList(st);
            this.dispose();
        }else 
            JOptionPane.showMessageDialog(null, "You have to select a room first", "Alert", JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_jAddroomActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // Cancel
        jList1.clearSelection();
        jList2.clearSelection();
        jList3.clearSelection();
        this.dispose();
    }//GEN-LAST:event_jCancelActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // clear other
        jList2.clearSelection();
        jList3.clearSelection();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        // clear other
        jList3.clearSelection();
        jList1.clearSelection();
    }//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        // clear other
        jList2.clearSelection();
        jList1.clearSelection();
    }//GEN-LAST:event_jList3MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddroom;
    private javax.swing.JButton jCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jnotSameType;
    private javax.swing.JPanel jsameType;
    private javax.swing.JPanel jsameType1;
    // End of variables declaration//GEN-END:variables
}
