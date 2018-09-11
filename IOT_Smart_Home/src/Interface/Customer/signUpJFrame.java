/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Network.Network;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajaygoel
 */
public class signUpJFrame extends javax.swing.JPanel {

    /**
     * Creates new form signUpJFrame
     */
    JPanel userProcessContaier;
    Ecosystem business;

    public signUpJFrame(JPanel userProcessContainer, Ecosystem business) {
        initComponents();
        this.userProcessContaier = userProcessContainer;
        this.business = business;

        populate_network_combo_box();
        populateLocCombobox();

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
        jLabel2 = new javax.swing.JLabel();
        FirstNameTxtField = new javax.swing.JTextField();
        LastNameTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PasswordTxtField = new javax.swing.JTextField();
        UserNameTxtField = new javax.swing.JTextField();
        PaymentComboBox = new javax.swing.JComboBox<>();
        MobiletxtField = new javax.swing.JTextField();
        LocationTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        HouseNoTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EmailtxtField = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        NetworkComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        MapJBtn = new javax.swing.JButton();
        locJComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ElecTxtField = new javax.swing.JTextField();
        WaterTxtField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Login");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 150, -1));
        add(FirstNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 58, 200, -1));
        add(LastNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 84, 200, -1));

        jLabel6.setText("Last Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 150, -1));

        jLabel5.setText("Location");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 150, -1));

        jLabel4.setText("Mobile Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, 150, -1));

        jLabel3.setText("Street Name: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 150, -1));

        jLabel7.setText("Mode of Payment");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 150, -1));

        jLabel8.setText("User name:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 150, -1));

        jLabel9.setText("Password:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 306, 150, -1));
        add(PasswordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 303, 200, -1));
        add(UserNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 265, 200, -1));

        PaymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Net Banking", "Credit Card", "Debit Card", " " }));
        add(PaymentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 239, 200, -1));
        add(MobiletxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 341, 200, -1));
        add(LocationTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 122, 200, -1));

        jLabel10.setText("House No:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 150, -1));
        add(HouseNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 163, 200, -1));

        jLabel14.setText("E mail:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 422, 150, -1));
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 277, -1, -1));
        add(EmailtxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 419, 200, -1));

        SaveBtn.setText("Create Account");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 574, 400, -1));

        add(NetworkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 381, 200, -1));

        jLabel13.setText("Society Name");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 384, 150, -1));

        MapJBtn.setText("View on Map");
        MapJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapJBtnActionPerformed(evt);
            }
        });
        add(MapJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 533, 400, -1));

        add(locJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 201, 200, -1));

        jLabel15.setText("Electricity Meter No.");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 150, -1));

        jLabel16.setText("Water Bill No.");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 498, 150, -1));
        add(ElecTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 457, 200, -1));
        add(WaterTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 495, 200, -1));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 76, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/signup.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populate_network_combo_box() {
        NetworkComboBox.removeAllItems();
        for (Network network : business.getNetworkDirectory()) {
            NetworkComboBox.addItem(network);
        }
    }
    
        public void populateLocCombobox(){
        String [] location = {"Clearway Street","Boston Harbour","NorthEnd","Washigton street","Oliver street","Aquarium","Fort Point","Stuart street","St Germaine Street"};
        locJComboBox.removeAllItems();
        for(String str:location){
            locJComboBox.addItem(str);
        }
    }

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:

        try {

            System.out.println("here 1");

            String First_name = FirstNameTxtField.getText();
            if (First_name.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Please enter the first name with no digits");
                return;
            }

            System.out.println("here2");

            String Last_name = LastNameTxtField.getText();
            if (Last_name.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Please enter the last name with no digits");
                return;
            }

            System.out.println("here3");

            String Location = LocationTxtField.getText();
            if (Location.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Please enter the location name with no digits");
                return;
            }
            int Mobil_no = Integer.parseInt(MobiletxtField.getText());
//            Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
//            Matcher m = p.matcher(MobiletxtField.getText());
//            if(m.find() && m.group().equals(MobiletxtField.getText()))
//            {
//                JOptionPane.showMessageDialog(null,"Please enter the mobile no with 10 digits");
//                return;
//
//            }

             String streetName = (String) locJComboBox.getSelectedItem();
            String Mode_o_payment = String.valueOf(PaymentComboBox.getSelectedItem());
            
            if(First_name.equals("")|| Location.equals("")||Last_name.equals("")||Mobil_no==0||
                streetName.equals("")){
                JOptionPane.showMessageDialog(this,"Please enter all the fields","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int House_no= Integer.parseInt(HouseNoTextField.getText());            

            Network net = (Network) NetworkComboBox.getSelectedItem();
            String UserName = UserNameTxtField.getText();
            String Password = PasswordTxtField.getText();
            
            for(Network n : business.getNetworkDirectory())
            {
                if(n.equals(net))
                {
                    Customer c = n.getCustomerDirectory().addCustomer();
                    c.setFirst_name(First_name);
                    c.setLast_name(Last_name);
                    c.setLocation(Location);
                    c.setMobile_no(Mobil_no);
                    c.setMode_of_payment(Mode_o_payment);
                    c.setStreet(streetName);
                    c.setHouse_no(House_no);
                    c.setNetworkName(net);
                    c.setE_mail(EmailtxtField.getText());
                    c.setWaterBill(Integer.parseInt(WaterTxtField.getText()));
                    c.setElecBill(Integer.parseInt(ElecTxtField.getText()));

                    for (UserAccount ua : business.getUserAccountDir().getUserAccountDirectory()) {
                        if (ua.getUserName().equalsIgnoreCase(UserName)) {
                            JOptionPane.showMessageDialog(null, "Please enter different User Name");
                            return;
                        }
                    }

                    UserAccount uu = business.getUserAccountDir().addUserAccount(UserName, Password, null, new CustomerRole());
                    c.setUserAcc(uu);
                    JOptionPane.showMessageDialog(this, "Customer Account has been created", "Info", JOptionPane.INFORMATION_MESSAGE);

                }

            }

//            for(UserAccount uu: business.getUserAccountDirectory().getUserAccountDirectory())
//            {
//                            System.out.println("here for loop");
//
//                if(uu.getUserName().equalsIgnoreCase(UserName))
//                {
//                    JOptionPane.showMessageDialog(null,"Please enter different User Name");
//                    return;
//                }
//            }
            //ua.setUserName(UserNameTxtField.getText());
            //ua.setPassword(PasswordTxtField.getText());
            //ua.setRole(new CustomerRole());
            //ua.setEmployee(null);
            FirstNameTxtField.setText("");
            LastNameTxtField.setText("");
            LocationTxtField.setText("");
            MobiletxtField.setText("");
            PasswordTxtField.setText("");
            UserNameTxtField.setText("");
            HouseNoTextField.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter the valid values", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void MapJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapJBtnActionPerformed
        // TODO add your handling code here:

        Network n2 = (Network) NetworkComboBox.getSelectedItem();
        for (Network n : business.getNetworkDirectory()) {
            if (n.getName().equals(n2.getName())) {
                JFrame test = new JFrame("Google Maps");
                try {
                    String latitude = n.getLatitude();
                    String longitude =n.getLongitude();
                    String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
                            + latitude
                            + ","
                            + longitude
                            + "&zoom=16&size=612x612&scale=2&maptype=hybrid";
                    String destinationFile = "image.jpg";
// read the map image from Google
// then save it to a local file: image.jpg
//
                    URL url = new URL(imageUrl);
                    InputStream is = url.openStream();
                    OutputStream os = new FileOutputStream(destinationFile);
                    byte[] b = new byte[2048];
                    int length;
                    while ((length = is.read(b)) != -1) {
                        os.write(b, 0, length);
                    }
                    is.close();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
// create a GUI component that loads the image: image.jpg
//
                ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
                        .getImage().getScaledInstance(630, 600,
                                java.awt.Image.SCALE_SMOOTH));
                test.add(new JLabel(imageIcon));
// shoEmailtxtField
                test.setVisible(true);
                test.pack();
            }
        }

    }//GEN-LAST:event_MapJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ElecTxtField;
    private javax.swing.JTextField EmailtxtField;
    private javax.swing.JTextField FirstNameTxtField;
    private javax.swing.JTextField HouseNoTextField;
    private javax.swing.JTextField LastNameTxtField;
    private javax.swing.JTextField LocationTxtField;
    private javax.swing.JButton MapJBtn;
    private javax.swing.JTextField MobiletxtField;
    private javax.swing.JComboBox NetworkComboBox;
    private javax.swing.JTextField PasswordTxtField;
    private javax.swing.JComboBox<String> PaymentComboBox;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UserNameTxtField;
    private javax.swing.JTextField WaterTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> locJComboBox;
    // End of variables declaration//GEN-END:variables
}