/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Desktop;

import Controller.DBHandlerGetter;
import Controller.DBHandlerSetter;
import Domain.Classies.Booking;
import Domain.Classies.Customer;
import Domain.Classies.Room;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;

/**
 *
 * @author sakis
 */
public class ModifyBooking extends javax.swing.JFrame {
    private DateFormat displayFormat;
    private DateFormatter displayFormatter;
    private DateFormat editFormat;
    private DateFormatter editFormatter;
    private DefaultFormatterFactory factory;
    
    private Booking book;
    private DefaultListModel roomlistmodel;
    private DefaultListModel newlistmodel;
    
    private boolean flagdate = false;
    private boolean flagCustomer = false;
    private boolean flagRoom = false;
    
    private List<Room> r1;

    /**
     * Creates new form ModifyBooking
     */
    public ModifyBooking(Booking b) {
        super("Booking details #"+b.getBookid()+"# |"+b.getCustomer().CustomerName()+ " | "+ b.getReservationDate().toString());
        book = new Booking();
        book.deepcopy(b);
        initComponents();
        myInit();
    }
    
    private void myInit(){
        displayFormat = new SimpleDateFormat("dd--MMMM--yyyy");
        displayFormatter = new DateFormatter(displayFormat);
        editFormat = new SimpleDateFormat("dd/MM/yyyy");
        editFormatter = new DateFormatter(editFormat);
        factory = new DefaultFormatterFactory(editFormatter, displayFormatter, editFormatter);
        
        roomlistmodel = new DefaultListModel();
        newlistmodel = new DefaultListModel();
        this.ClearAll();
        this.addRoomstoList();
        this.addReservationDate();
        this.addCustomerDetails();  
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRoombox = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jDelete = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jCombobox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jCheckbox = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jCheckintext = new javax.swing.JFormattedTextField(factory, new Date());
        jPanel14 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jCheckouttext = new javax.swing.JFormattedTextField(factory, new Date());
        jPanel13 = new javax.swing.JPanel();
        jConfirm = new javax.swing.JButton();
        jCheckDates = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jCustomerbox = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLnametext = new javax.swing.JTextField();
        jFnametext = new javax.swing.JTextField();
        jGender = new javax.swing.JComboBox<>();
        jIDtext = new javax.swing.JTextField();
        jPhonetext = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modify");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setPreferredSize(new java.awt.Dimension(310, 205));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel8.setPreferredSize(new java.awt.Dimension(222, 35));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jRoombox.setForeground(new java.awt.Color(5, 0, 0));
        jRoombox.setText("Room(s)");
        jRoombox.setEnabled(false);
        jRoombox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRoombox.setMaximumSize(new java.awt.Dimension(300, 40));
        jRoombox.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel8.add(jRoombox, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.NORTH);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jList1);

        jPanel9.add(jScrollPane1);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel10.setPreferredSize(new java.awt.Dimension(222, 40));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jPanel10.add(jDelete, java.awt.BorderLayout.WEST);

        jAdd.setText("Add New");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });
        jPanel10.add(jAdd, java.awt.BorderLayout.EAST);

        jCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple", "Quad", "Suite", "SyperLux" }));
        jPanel10.add(jCombobox, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jPanel3.add(jPanel7);

        jPanel6.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        jPanel6.setPreferredSize(new java.awt.Dimension(170, 318));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel11.setPreferredSize(new java.awt.Dimension(222, 35));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setMaximumSize(new java.awt.Dimension(200, 20000));
        jPanel12.setMinimumSize(new java.awt.Dimension(150, 148));
        jPanel12.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel15.setPreferredSize(new java.awt.Dimension(222, 100));
        jPanel15.setLayout(new java.awt.GridLayout(2, 0));

        jPanel17.setPreferredSize(new java.awt.Dimension(352, 60));

        jCheckbox.setForeground(new java.awt.Color(1, 1, 1));
        jCheckbox.setText("Check in/out");
        jCheckbox.setEnabled(false);
        jCheckbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckbox.setMargin(new java.awt.Insets(20, 0, 0, 0));
        jPanel17.add(jCheckbox);

        jPanel15.add(jPanel17);

        jCheckintext.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jCheckintext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCheckintext.setMaximumSize(new java.awt.Dimension(150, 40));
        jCheckintext.setPreferredSize(new java.awt.Dimension(150, 40));
        jCheckintext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckintextKeyPressed(evt);
            }
        });
        jPanel18.add(jCheckintext);

        jPanel15.add(jPanel18);

        jPanel12.add(jPanel15, java.awt.BorderLayout.NORTH);

        jPanel14.setMinimumSize(new java.awt.Dimension(95, 74));
        jPanel14.setPreferredSize(new java.awt.Dimension(222, 100));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel20.setLayout(new javax.swing.BoxLayout(jPanel20, javax.swing.BoxLayout.PAGE_AXIS));

        jCheckouttext.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jCheckouttext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCheckouttext.setMaximumSize(new java.awt.Dimension(150, 40));
        jCheckouttext.setMinimumSize(new java.awt.Dimension(150, 40));
        jCheckouttext.setPreferredSize(new java.awt.Dimension(150, 40));
        jCheckouttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckouttextKeyPressed(evt);
            }
        });
        jPanel20.add(jCheckouttext);

        jPanel14.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel14, java.awt.BorderLayout.SOUTH);

        jPanel6.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(222, 60));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jConfirm.setText("Confirm");
        jConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmActionPerformed(evt);
            }
        });
        jPanel13.add(jConfirm, java.awt.BorderLayout.PAGE_END);

        jCheckDates.setText("Check");
        jCheckDates.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDatesActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckDates, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel13, java.awt.BorderLayout.SOUTH);

        jPanel3.add(jPanel6);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel21.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel21.setPreferredSize(new java.awt.Dimension(100, 60));

        jCustomerbox.setForeground(new java.awt.Color(1, 1, 1));
        jCustomerbox.setText("Customer");
        jCustomerbox.setEnabled(false);
        jCustomerbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCustomerbox.setMargin(new java.awt.Insets(25, 0, 0, 0));
        jPanel21.add(jCustomerbox);

        jPanel5.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel22.setPreferredSize(new java.awt.Dimension(280, 183));
        jPanel22.setLayout(new javax.swing.BoxLayout(jPanel22, javax.swing.BoxLayout.LINE_AXIS));

        jPanel25.setMaximumSize(new java.awt.Dimension(100, 32767));
        jPanel25.setPreferredSize(new java.awt.Dimension(80, 0));
        jPanel25.setLayout(new java.awt.GridLayout(5, 1));

        jLabel2.setText("Last Name :");
        jPanel25.add(jLabel2);

        jLabel3.setText("First Name :");
        jPanel25.add(jLabel3);

        jLabel4.setText("Gender :");
        jPanel25.add(jLabel4);

        jLabel5.setText("ID Number :");
        jPanel25.add(jLabel5);

        jLabel6.setText("Telephone :");
        jPanel25.add(jLabel6);

        jPanel22.add(jPanel25);

        jPanel24.setMaximumSize(new java.awt.Dimension(260, 32767));
        jPanel24.setPreferredSize(new java.awt.Dimension(200, 183));
        jPanel24.setLayout(new java.awt.GridLayout(5, 1));

        jLnametext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLnametextKeyTyped(evt);
            }
        });
        jPanel24.add(jLnametext);

        jFnametext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFnametextKeyTyped(evt);
            }
        });
        jPanel24.add(jFnametext);

        jGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });
        jPanel24.add(jGender);

        jIDtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIDtextKeyTyped(evt);
            }
        });
        jPanel24.add(jIDtext);

        jPhonetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPhonetextKeyTyped(evt);
            }
        });
        jPanel24.add(jPhonetext);

        jPanel22.add(jPanel24);

        jPanel5.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel23.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel23.setPreferredSize(new java.awt.Dimension(356, 40));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel23, java.awt.BorderLayout.SOUTH);

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmActionPerformed
        // Confirm
        System.out.println(book.getRooms().toString());
        int option = 0;
        if(!this.jRoombox.isSelected() && !this.jCheckbox.isSelected() && !this.jCustomerbox.isSelected())
            JOptionPane.showMessageDialog(null, "No changes were made!", "Alert", JOptionPane.ERROR_MESSAGE);
        else{
            //update
            this.jCheckDatesActionPerformed(null);
            if(flagdate && flagCustomer && flagRoom){
                String st = "Are you agree with the following modify?"
                    + "\nBooking id #"+book.getBookid()+"#"+"Number of rooms: "+book.getRooms().size() + " Period: "+ book.getReservationDate().getCheckinName() +" to "+ book.getReservationDate().getCheckoutName() +" Total cost: $"+book.getTotalCost();
                option = JOptionPane.showConfirmDialog(null, st, "Alert", JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.YES_OPTION){
                    UpdateBook();
                    DBHandlerSetter.updateBooking(book);
                    this.dispose();
                }
                flagdate=false;
                flagCustomer=false;
                flagRoom=false;
            }
        }
    }//GEN-LAST:event_jConfirmActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // delete room
        int option = 0;
        book.getRooms().get(this.jList1.getSelectedIndex());
        if(!this.jList1.isSelectionEmpty()){
            option = JOptionPane.showConfirmDialog(null, "You select to delete room with room id: "+book.getRooms().get(this.jList1.getSelectedIndex()).getID()+".\nAre you sure?", "Alert", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                book.getRooms().remove(this.jList1.getSelectedIndex());
                this.roomlistmodel.remove(this.jList1.getSelectedIndex());
                this.jRoombox.setSelected(true);
            }
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // add room
        r1 = DBHandlerGetter.getSameTypeRoom(this.getComboBoxintType(),this.getReservationChekin(), this.getReservationChekout());
        r1.removeAll(book.getRooms());
        if(!r1.isEmpty()){
            newlistmodel.clear();
            for(Room a : r1)
                newlistmodel.addElement(a.toString());
            AvailableRoomsSameType ar = new AvailableRoomsSameType(this);
            ar.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null, "None "+ this.getComboBoxType()+ " rooms are available for your dates.", "Alert", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jAddActionPerformed

    private void jCheckintextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckintextKeyPressed
        //  key press
        this.jCheckbox.setSelected(true);
    }//GEN-LAST:event_jCheckintextKeyPressed

    private void jCheckouttextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckouttextKeyPressed
        //  key press
        this.jCheckbox.setSelected(true);
    }//GEN-LAST:event_jCheckouttextKeyPressed

    private void jLnametextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLnametextKeyTyped
        this.jCustomerbox.setSelected(true);
    }//GEN-LAST:event_jLnametextKeyTyped

    private void jFnametextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFnametextKeyTyped
        this.jCustomerbox.setSelected(true);
    }//GEN-LAST:event_jFnametextKeyTyped

    private void jIDtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIDtextKeyTyped
        this.jCustomerbox.setSelected(true);
    }//GEN-LAST:event_jIDtextKeyTyped

    private void jPhonetextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhonetextKeyTyped
        this.jCustomerbox.setSelected(true);
    }//GEN-LAST:event_jPhonetextKeyTyped

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        this.jCustomerbox.setSelected(false);
        if(!book.getCustomer().getGender().equals(this.jGender.getSelectedItem().toString()))
            this.jCustomerbox.setSelected(true);
    }//GEN-LAST:event_jGenderActionPerformed

    private void jCheckDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDatesActionPerformed
        // check dates
        flagdate = CheckDates();
        flagCustomer = CheckCustomer();
        flagRoom = CheckList();      
    }//GEN-LAST:event_jCheckDatesActionPerformed

    private boolean CheckDates(){
        this.jCheckintext.setBorder(null);
        this.jCheckouttext.setBorder(null);
        book.setDate(this.getReservationChekin(), this.getReservationChekout());
        if(!DBHandlerGetter.CheckmodifyDate(book.getBookid(),book.getRooms(), book.getReservationDate().getCheckinName(), book.getReservationDate().getCheckoutName())){
            JOptionPane.showMessageDialog(null, "You can't change the reservation dates to "+this.getReservationChekin()+" and "+this.getReservationChekout()+"\nPlease check again!", "Alert", JOptionPane.ERROR_MESSAGE);
            this.jCheckintext.setBorder(BorderFactory.createLineBorder(Color.red));
            this.jCheckouttext.setBorder(BorderFactory.createLineBorder(Color.red));
            return false;
        }else{
            this.jCheckintext.setBorder(BorderFactory.createLineBorder(Color.green));
            this.jCheckouttext.setBorder(BorderFactory.createLineBorder(Color.green));
            return true;
        }
    }
    
    private boolean CheckCustomer(){
        this.jLnametext.setBorder(null);
        this.jFnametext.setBorder(null);
        this.jIDtext.setBorder(null);
        if(this.jLnametext.getText().equals(""))
            this.jLnametext.setBorder(BorderFactory.createLineBorder(Color.red));
        else
            this.jLnametext.setBorder(BorderFactory.createLineBorder(Color.green));
        
        if(this.jFnametext.getText().equals(""))
            this.jFnametext.setBorder(BorderFactory.createLineBorder(Color.red));
        else
            this.jFnametext.setBorder(BorderFactory.createLineBorder(Color.green));
        
        if(this.jIDtext.getText().equals(""))
            this.jIDtext.setBorder(BorderFactory.createLineBorder(Color.red));
        else
            this.jIDtext.setBorder(BorderFactory.createLineBorder(Color.green));
        
        if(this.jLnametext.getText().equals("") || this.jFnametext.getText().equals("") || this.jIDtext.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Customer inputs", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private boolean CheckList(){
        this.jList1.setBorder(null);
        if(!this.roomlistmodel.isEmpty()){
            this.jList1.setBorder(BorderFactory.createLineBorder(Color.green));
            return true;
        }else{
            this.jList1.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "You have to add room first", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void UpdateBook(){
        book.setDate(this.getReservationChekin(), this.getReservationChekout());
        Customer c = new Customer(book.getCustomer().getCID(), this.jFnametext.getText(), this.jLnametext.getText(), this.jGender.getSelectedItem().toString(), this.jIDtext.getText(), this.jPhonetext.getText());
        book.setCustomer(c);
    }
    
    private void addRoomstoList(){
        roomlistmodel.clear();
        for(Room r: book.getRooms())
            roomlistmodel.addElement(r);
        this.jList1.setModel(roomlistmodel);
    }
    
    protected void addRoomList(int index){
        book.getRooms().add(r1.get(index));
        this.jRoombox.setSelected(true);
        this.addRoomstoList();
    }
    
    protected DefaultListModel getroomlistmodel(){
        return newlistmodel;
    }
    
    private void addReservationDate(){
        this.jCheckintext.setValue((Date)book.getCheckinDate());
        this.jCheckouttext.setValue(book.getCheckoutDate());
    }
    
    private void addCustomerDetails(){
        this.jLnametext.setText(book.getCustomer().getLname());
        this.jFnametext.setText(book.getCustomer().getFname());
        this.jGender.setSelectedItem(book.getCustomer().getGender());
        this.jIDtext.setText(book.getCustomer().getAT());
        this.jPhonetext.setText(book.getCustomer().getPhone());
    }
    
    private String getReservationChekin(){
        Date d1 = (Date)this.jCheckintext.getValue();
        String s1 = editFormat.format(new Date(d1.getTime()));
        return s1;
    }
    
    private String getReservationChekout(){
        Date d1 = (Date)this.jCheckouttext.getValue();
        String s1 = editFormat.format(new Date(d1.getTime()));
        return s1;
    }
    
    protected String getBenefits(int list, int i){
        return this.r1.get(i).Benefits();
    }
    
    public int getComboBoxintType(){
        return this.jCombobox.getSelectedIndex()+1;
    }
    
    protected String getComboBoxType(){
        return (String) this.jCombobox.getSelectedItem();
    }
    
    private void ClearAll(){
        this.jCheckbox.setSelected(false);
        this.jRoombox.setSelected(false);
        this.jCustomerbox.setSelected(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jCheckDates;
    private javax.swing.JCheckBox jCheckbox;
    private javax.swing.JFormattedTextField jCheckintext;
    private javax.swing.JFormattedTextField jCheckouttext;
    private javax.swing.JComboBox<String> jCombobox;
    private javax.swing.JButton jConfirm;
    private javax.swing.JCheckBox jCustomerbox;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jFnametext;
    private javax.swing.JComboBox<String> jGender;
    private javax.swing.JTextField jIDtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextField jLnametext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jPhonetext;
    private javax.swing.JCheckBox jRoombox;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
