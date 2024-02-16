package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Signuptwo extends JFrame implements ActionListener{
    

    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    Signuptwo(String formno){
        
        setLayout(null);
        this.formno = formno;
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raiway", Font.BOLD, 22));
        additionalDetails.setBounds(290 , 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raiway", Font.BOLD, 20));
        name.setBounds(100 , 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
     
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raiway", Font.BOLD, 20));
        fname.setBounds(100 , 190, 200, 30);
        add(fname);
        
        String valCategory[] = {"OPEN", "SC", "ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raiway", Font.BOLD, 20));
        dob.setBounds(100 , 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        add(income);        
        
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raiway", Font.BOLD, 20));
        gender.setBounds(100 , 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raiway", Font.BOLD, 20));
        email.setBounds(100 , 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raiway", Font.BOLD, 20));
        marital.setBounds(100 , 390, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
        JLabel address = new JLabel("Pan no:");
        address.setFont(new Font("Raiway", Font.BOLD, 20));
        address.setBounds(100 , 440, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setBounds(300,440,400,30);
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        add(pan);
        
        JLabel city = new JLabel("Addhar No");
        city.setFont(new Font("Raiway", Font.BOLD, 20));
        city.setBounds(100 , 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setBounds(300,490,400,30);
        aadhar.setFont(new Font("Arial", Font.BOLD, 14));
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen");
        state.setFont(new Font("Raiway", Font.BOLD, 20));
        state.setBounds(100 , 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account");
        pincode.setFont(new Font("Raiway", Font.BOLD, 20));
        pincode.setBounds(100 , 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno); 
        
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
        String sreligion =  (String) religion.getSelectedItem();
        String scategoty = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String gender = null;
        if(syes.isSelected()) {
            gender = "MALE";
        } else if (sno.isSelected()){
            gender = "FEMALE";
        }

        String existing = null;
        if(eyes.isSelected()){
            existing = "MARRIED";
        } else if (eno.isSelected()){
            existing = "UNMARRIED";
        }
        String span = pan.getText();
        String saadhar= aadhar.getText();

        
        try {
            
            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formno+"','"+sreligion+"','"+  scategoty+"','"+sincome+"','"+soccupation+"','"+seducation+"','"+existing+"','"+gender+"','"+saadhar+"','"+span+"')";
            c.s.executeUpdate(query);   
            
            //Signup3 value
            setVisible(false);
            new Signupthree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
    }
            
    public static void main(String args[]) {
        new Signuptwo("");
    }

   
}