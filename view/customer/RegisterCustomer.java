package view.customer;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import controller.CustomerController;
import model.Customer;

public class RegisterCustomer{
    private static JFrame myFrame;
    private static JLabel lblFname,lblLname,lblPhone,lblAddress,lblGender,lblUsername,lblPassword,lblConfirmPassword;
    private static JTextField txtFname,txtLname,txtPhone,txtUsername;
    private static JTextArea txtAddress;
    private static JPasswordField jpPassword,jpConfirmPassword;
    private static JRadioButton rbMale,rbFemale,rbOthers;
    private static JButton btnRegsiter,btnClose;
    private static ButtonGroup bgGender;
    CustomerController customerController ;

   
    private void registerCustomer(){
        String fname = txtFname.getText();
        String lname = txtLname.getText();
        String phone = txtPhone.getText();
        
        char gender;
        if(rbMale.isSelected())
            gender = 'm';
        else if(rbFemale.isSelected())
            gender = 'f';
        else 
            gender ='o';
        
        String address = txtAddress.getText();
        String username = txtUsername.getText();
        String password = jpPassword.getText();
        String confirmPassword = jpConfirmPassword.getText();

      
        if(password.equals(confirmPassword)){
           
        }else{
            JOptionPane.showMessageDialog(null,"Password and Confirm Password does not match");
            jpPassword.requestFocus();
        }
    }
    public RegisterCustomer(){

        myFrame = new JFrame("Customer Registration");
        myFrame.setSize(500,500); 
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(Color.LIGHT_GRAY);

        lblFname = new JLabel("First Name");
        lblLname = new JLabel("Last Name");
        lblPhone = new JLabel("Phone");
        lblGender = new JLabel("Gender");
        lblAddress = new JLabel("Address");
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        lblConfirmPassword = new JLabel("Confirm Password");
        
        txtFname = new JTextField();
       
        txtLname = new JTextField();
        txtPhone = new JTextField();
        txtUsername = new JTextField();
        txtAddress = new JTextArea();
        
        jpPassword = new JPasswordField();
        jpPassword.setEchoChar('$');
        jpConfirmPassword = new JPasswordField();

        rbMale = new JRadioButton();
        rbFemale = new JRadioButton();
        rbOthers = new JRadioButton();

        btnRegsiter = new JButton("Register");
        btnClose = new JButton("Close");  
        
        bgGender = new ButtonGroup();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Center the screen
        myFrame.setLocationRelativeTo(null);

        populateComponents();

        btnRegsiter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!checkFields())
                    registerCustomer();
            }
        });
        myFrame.setVisible(true);
    }

    boolean flag = false;
    private boolean checkFields(){

        if(txtFname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"First Name is empty");
            txtFname.requestFocus();
            flag = true;
        }else if(txtLname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Last Name is empty");
            txtLname.requestFocus();
            flag = true;
        }
        return flag;
    }

    private void populateComponents(){
        lblFname.setBounds(20,20,100,30);
        myFrame.add(lblFname);

        txtFname.setBounds(200,20,200,30);
        myFrame.add(txtFname);

        lblLname.setBounds(20,60,100,30);
        myFrame.add(lblLname);

        txtLname.setBounds(200,60,200,30);
        myFrame.add(txtLname);
        
        lblPhone.setBounds(20,100,100,30);
        myFrame.add(lblPhone);

        txtPhone.setBounds(200,100,200,30);
        myFrame.add(txtPhone);

        lblAddress.setBounds(20,140,100,30);
        myFrame.add(lblAddress);

        txtAddress.setBounds(200,140,200,30);
        myFrame.add(txtAddress);

        lblGender.setBounds(20,180,100,30);
        myFrame.add(lblGender);

        rbMale.setBounds(200,180,100,30);
        rbMale.setText("Male");
        myFrame.add(rbMale);

        rbFemale.setBounds(200,220,100,30);
        rbFemale.setText("Female");
        myFrame.add(rbFemale);
        
        rbOthers.setBounds(200,260,100,30);
        rbOthers.setText("Others");
        myFrame.add(rbOthers);

        bgGender.add(rbFemale);
        bgGender.add(rbOthers);
        bgGender.add(rbMale);

        lblUsername.setBounds(20,300,100,30);
        myFrame.add(lblUsername);

        txtUsername.setBounds(200,300,200,30);
        myFrame.add(txtUsername);

        lblPassword.setBounds(20,340,100,30);
        myFrame.add(lblPassword);

        jpPassword.setBounds(200,340,200,30);
        myFrame.add(jpPassword);

        lblConfirmPassword.setBounds(20,380,120,30);
        myFrame.add(lblConfirmPassword);

        jpConfirmPassword.setBounds(200,380,200,30);
        myFrame.add(jpConfirmPassword);

        btnRegsiter.setBounds(50,420,150,30);
        myFrame.add(btnRegsiter);

        btnClose.setBounds(240,420,150,30);
        myFrame.add(btnClose);

     
    }
}