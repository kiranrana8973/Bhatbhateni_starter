package view.login;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.customer.RegisterCustomer;

public class LoginScreen {
  
    public static void main(String[] args) {

      JFrame frame = new JFrame("Login Page");
      frame.setSize(300,150);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);

      JLabel lblUsername = new JLabel("Username");
      JLabel lblPassword = new JLabel("Password");

      frame.add(lblUsername);
      frame.add(lblPassword);

      JTextField txtUsername = new JTextField();
      JPasswordField txtPassword = new JPasswordField();

      frame.add(txtUsername);
      frame.add(txtPassword);

      JButton btnLogin = new JButton("Login");
      JButton btnRegister = new JButton("Register");

      frame.add(btnLogin);
      frame.add(btnRegister);

      lblUsername.setBounds(20,10,80,25);
      lblPassword.setBounds(20,40,80,25);

      txtUsername.setBounds(100,10,160,25);
      txtPassword.setBounds(100,40,160,25);

      btnLogin.setBounds(30,80,100,25);
      btnRegister.setBounds(140,80,100,25);

      frame.setVisible(true);

      btnRegister.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          
          new RegisterCustomer();
          
        }
      });
  
      btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         
        }
      });
    }


    
}
