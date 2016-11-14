import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ActionListener,ItemListener {

  Container con;
  JLabel ltn,lfn,lmn,lln,lgd,ldb,lgr,lhb,led,lpd;
  JRadioButton rt1,rt2,rbm,rbf;
  JTextField tfn,tmn,tln,tei;
  JComboBox cbd,cbm,cby,cbgr;
  JPasswordField pf;
  JCheckBox cb1,cb2,cb3;
  JButton jb;
  ButtonGroup bg1,bg2;
  JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8;
  
  JFrame1(String s) {

   con = getContentPane();
   con.setLayout(new GridLayout(8,1));

// Tital

   bg1 = new ButtonGroup();

   ltn = new JLabel("Tital :: ");
   rt1 = new JRadioButton("Mr. ",true);
   rt2 = new JRadioButton("Mrs.");    

   bg1.add(rt1);
   bg1.add(rt2);

// First,Middel,Last name
  
   lfn = new JLabel("First Name :: ");
   tfn = new JTextField(10);
   lmn = new JLabel("Midel Name :: ");
   tmn = new JTextField(10);
   lln = new JLabel("Last Name  :: ");
   tln = new JTextField(10);
  
   bg2 = new ButtonGroup();

// Gender 
 
   lgd = new JLabel("GENDER     :: ");
   rbm = new JRadioButton(" MALE ",true);
   rbf = new JRadioButton(" FEMALE ");   
   
   bg2.add(rbm);
   bg2.add(rbf);

// DOB

   ldb = new JLabel("DOB :: ");
   cbd = new JComboBox();
   cbm = new JComboBox();
   cby = new JComboBox();   

    for(int i=31;i>0;i--){
       cbd.addItem(i);
    }
    for(int i=12;i>0;i--){
       cbm.addItem(i);
    }
    for(int i=2013;i>=1995;i--){
       cby.addItem(i+1);
    }
    
// Graduation

   lgr = new JLabel("GRADUATION :: ");
   cbgr = new JComboBox();
   cbgr.setEditable(true);
   cbgr.addItem("B.COM");
   cbgr.addItem("BBA");
   cbgr.addItem("BCA");

// HOBBY

   lhb = new JLabel("HOBBY");
   cb1 = new JCheckBox("CRICKET");
   cb2 = new JCheckBox("READING");
   cb3 = new JCheckBox("TRAVELING");

// Email-Password

   led = new JLabel("Email ID   :: "); 
   tei = new JTextField(10);
   lpd = new JLabel("Password   :: ");
    pf = new JPasswordField(10);

// Button

   jp8 = new JPanel();     
   jb = new JButton("SUBMIT FORM");
   jb.addActionListener(this);

// *Tital (add)

   jp1 = new JPanel();
   jp1.setLayout(new GridLayout(1,4));

   jp1.add(ltn); 
   jp1.add(new JLabel());
//   jp1.add(new JLabel());
   jp1.add(rt1);
   jp1.add(rt2);
   con.add(jp1);

// First,Middle,Last_name (add)

   jp2 = new JPanel();
   jp2.setLayout(new GridLayout(3,2));

   jp2.add(lfn);
   jp2.add(tfn);
   jp2.add(lmn);
   jp2.add(tmn);
   jp2.add(lln);
   jp2.add(tln);   
   con.add(jp2);

// Gender (add)

   jp3 = new JPanel();
   jp3.setLayout(new GridLayout(1,4));
  
   jp3.add(lgd);
   jp3.add(new JLabel());
   jp3.add(rbm);
   jp3.add(rbf);
   con.add(jp3);

// DOB (add)

   jp4 = new JPanel();
   jp4.setLayout(new GridLayout(1,6));
     
   jp4.add(ldb);
   jp4.add(new JLabel());
   jp4.add(new JLabel());
   jp4.add(cbd);
   jp4.add(cbm);
   jp4.add(cby);
   con.add(jp4);


// Graduation (add)

   jp5 = new JPanel();
   jp5.setLayout(new GridLayout(1,2));

   jp5.add(lgr);
   jp5.add(cbgr);
   con.add(jp5);

// Hobby (add)

   jp6 = new JPanel();
   jp6.setLayout(new GridLayout(1,6));

   jp6.add(lhb);
   jp6.add(new JLabel());
   jp6.add(new JLabel());
   jp6.add(cb1);  
   jp6.add(cb2);
   jp6.add(cb3);
   con.add(jp6);

// Email,Password (add)

   jp7 = new JPanel();
   jp7.setLayout(new GridLayout(2,2));

   jp7.add(led);
   jp7.add(tei);
   jp7.add(lpd);
   jp7.add(pf);
   con.add(jp7);

// Button  (add)

   jp8 = new JPanel();
   jp8.setLayout(new GridLayout(1,1));

   jp8.add(jb);
   con.add(jp8);

   setSize(500,550);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent ae){

    String s = "";

    s = " TITLE :: ";
  
    if(rt1.isSelected())
        s = s + rt1.getText();
    else
        s = s + rt2.getText();
  
    s = s + " " + tfn.getText() + " " + tmn.getText() + " " + tln.getText();

    s = s + "\n Gender :: ";
 
    if(rbm.isSelected())
        s = s + rbm.getText();
    else
        s = s + rbf.getText();

    s = s + "\n D.O.B :: ";
    s = s + cbd.getSelectedItem() + " / ";

    int month = (Integer)cbm.getSelectedItem();

         if(month == 1)  s = s + " JANUARY ";
    else if(month == 2)  s = s + " FEBRUARY ";
    else if(month == 3)  s = s + " MARCH ";
    else if(month == 4)  s = s + " APRIL ";
    else if(month == 5)  s = s + " MAY ";
    else if(month == 6)  s = s + " JUNE ";
    else if(month == 7)  s = s + " JULY ";
    else if(month == 8)  s = s + " AUGUST ";
    else if(month == 9)  s = s + " SEPTEMBER ";
    else if(month == 10)  s = s + " OCTUMBER ";
    else if(month == 11)  s = s + " NEVEMBER ";
    else if(month == 12)  s = s + " DECEMBER ";
 
    s = s + " / " + cby.getSelectedItem();
    s = s + "\n GRADUCATION :: " + cbgr.getSelectedItem();
    s = s + "\n HOBBY :: ";
    
    if(cb1.isSelected()) s = s + cb1.getText() + "; ";
    if(cb2.isSelected()) s = s + cb2.getText() + "; ";
    if(cb3.isSelected()) s = s + cb3.getText();
  
    s = s + "\n EMAIL ID :: " + tei.getText();
    s = s + "\n PASSWORD IS :: " + pf.getPassword();

     new JFrame2("TEXT AREAFORM ",s);
  }

  public void itemStateChanged(ItemEvent ie){
  }
}

class JFrame2 extends JFrame {

  Container con;
  JTextArea jta;
 
  JFrame2(String s1,String s2){
   super(s1);
   
   con = getContentPane();
   con.setLayout(new FlowLayout());

   jta = new JTextArea(20,30);
   jta.setText(s2);
   con.add(jta);

   setSize(500,550);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
  }
}

class JDetailForm {

  public static void main(String args[]) {

      new JFrame1("Detail Form");
  }
}