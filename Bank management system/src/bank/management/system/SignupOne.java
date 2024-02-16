package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, pinTextField, stateTextField, cityTextField, dobTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    
    SignupOne(){
        
        setLayout(null);
        Random ran = new Random();
        long random = (Math.abs((ran.nextLong() % 9000L) + 1000L));
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raiway", Font.BOLD, 38));
        formno.setBounds(140 , 20, 600, 40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raiway", Font.BOLD, 22));
        personDetails.setBounds(290 , 80, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("NAME:");
        name.setFont(new Font("Raiway", Font.BOLD, 20));
        name.setBounds(100 , 140, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raiway", Font.BOLD, 20));
        fname.setBounds(100 , 190, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameTextField);
        
        JLabel dob = new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Raiway", Font.BOLD, 20));
        dob.setBounds(100 , 240, 200, 30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(300 , 240, 400, 30);
        add(datechooser);
        
        JLabel gender = new JLabel("GENDER:");
        gender.setFont(new Font("Raiway", Font.BOLD, 20));
        gender.setBounds(100 , 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("EMAIL ADDRESS:");
        email.setFont(new Font("Raiway", Font.BOLD, 20));
        email.setBounds(100 , 340, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raiway", Font.BOLD, 20));
        marital.setBounds(100 , 390, 200, 30);
        add(marital);
        
        married = new JRadioButton("married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raiway", Font.BOLD, 20));
        address.setBounds(100 , 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raiway", Font.BOLD, 20));
        city.setBounds(100 , 490, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityTextField);
        
        JLabel state = new JLabel("State");
        state.setFont(new Font("Raiway", Font.BOLD, 20));
        state.setBounds(100 , 540, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code");
        pincode.setFont(new Font("Raiway", Font.BOLD, 20));
        pincode.setBounds(100 , 590, 200, 30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        next = new JButton();
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "MALE";
        } else if (female.isSelected()){
            gender = "FEMALE";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "MARRIED";
        } else if (unmarried.isSelected()){
            marital = "UNMARRIED";
        } else if (other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city= cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);   
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
                
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
            
    public static void main(String args[]) {
        new SignupOne();
    }
    
}
