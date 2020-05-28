package firstproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class Firstproject {

private JFrame frame;
private JTextField txtDisplay;
private JTextField ReceiptArea;
private JTextField txtFriedRice;
private JTextField txtShawarma;
private JTextField txtChicken;
private JTextField txtChooseDrink;
double firstnum;
double secondnum;
double result;
String operations;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	Firstproject window = new Firstproject();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Firstproject() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
frame.setBounds(0, 0, 1500, 725);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 10));
panel.setBounds(0, 117, 394, 569);
frame.getContentPane().add(panel);
panel.setLayout(null);

JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(10, 11, 374, 547);
panel.add(tabbedPane);

JPanel panel_3 = new JPanel();
tabbedPane.addTab("Calculator", null, panel_3, null);
panel_3.setLayout(null);

JButton btnbackspace = new JButton("\uF0E7");
btnbackspace.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if(txtDisplay.getText().length()>0)
{
String backspace=null;
StringBuilder strB=new StringBuilder(txtDisplay.getText());
strB.deleteCharAt(txtDisplay.getText().length()-1);
backspace=strB.toString();
txtDisplay.setText(backspace);;
}

}
});
btnbackspace.setFont(new Font("Dialog", Font.BOLD, 25));
btnbackspace.setBounds(10, 64, 80, 80);
panel_3.add(btnbackspace);

JButton btnClear = new JButton("C");
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
txtDisplay.setText(null);
}
});
btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
btnClear.setBounds(100, 64, 80, 80);
panel_3.add(btnClear);

JButton btnModulus = new JButton("%");
btnModulus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
firstnum = Double.parseDouble(txtDisplay.getText());
txtDisplay.setText("");
operations = "%";
}
});
btnModulus.setFont(new Font("Tahoma", Font.BOLD, 25));
btnModulus.setBounds(193, 64, 80, 80);
panel_3.add(btnModulus);

JButton btnPlus = new JButton("+");
btnPlus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
firstnum = Double.parseDouble(txtDisplay.getText());
txtDisplay.setText("");
operations = "+";
}
});
btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
btnPlus.setBounds(283, 64, 80, 80);
panel_3.add(btnPlus);

JButton btn7 = new JButton("7");
btn7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn7.getText();
txtDisplay.setText(EnterValue);
}
});
btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
btn7.setBounds(10, 155, 80, 80);
panel_3.add(btn7);

JButton btn8 = new JButton("8");
btn8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn8.getText();
txtDisplay.setText(EnterValue);
}
});
btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
btn8.setBounds(100, 155, 80, 80);
panel_3.add(btn8);

JButton btnminus = new JButton("-");
btnminus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
firstnum = Double.parseDouble(txtDisplay.getText());
txtDisplay.setText("");
operations = "-";
}
});
btnminus.setFont(new Font("Tahoma", Font.BOLD, 25));
btnminus.setBounds(283, 155, 80, 80);
panel_3.add(btnminus);

JButton btn9 = new JButton("9");
btn9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn9.getText();
txtDisplay.setText(EnterValue);
}
});
btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
btn9.setBounds(190, 155, 80, 80);
panel_3.add(btn9);

JButton btn4 = new JButton("4");
btn4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn4.getText();
txtDisplay.setText(EnterValue);
}
});
btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
btn4.setBounds(10, 246, 80, 80);
panel_3.add(btn4);

JButton btn5 = new JButton("5");
btn5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn5.getText();
txtDisplay.setText(EnterValue);
}
});
btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
btn5.setBounds(100, 246, 80, 81);
panel_3.add(btn5);

JButton btn6 = new JButton("6");
btn6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn6.getText();
txtDisplay.setText(EnterValue);
}
});
btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
btn6.setBounds(190, 246, 80, 80);
panel_3.add(btn6);

JButton btnmultiply = new JButton("*");
btnmultiply.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
firstnum = Double.parseDouble(txtDisplay.getText());
txtDisplay.setText("");
operations = "*";
}
});
btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 25));
btnmultiply.setBounds(283, 246, 80, 80);
panel_3.add(btnmultiply);

JButton btn1 = new JButton("1");
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn1.getText();
txtDisplay.setText(EnterValue);
}
});
btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
btn1.setBounds(10, 337, 80, 80);
panel_3.add(btn1);

JButton btn2 = new JButton("2");
btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn2.getText();
txtDisplay.setText(EnterValue);
}
});
btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
btn2.setBounds(100, 337, 80, 80);
panel_3.add(btn2);

JButton btn3 = new JButton("3");
btn3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn3.getText();
txtDisplay.setText(EnterValue);
}
});
btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
btn3.setBounds(190, 337, 80, 80);
panel_3.add(btn3);

JButton btndivide = new JButton("/");
btndivide.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
firstnum = Double.parseDouble(txtDisplay.getText());
txtDisplay.setText("");
operations = "/";
}
});
btndivide.setFont(new Font("Tahoma", Font.BOLD, 25));
btndivide.setBounds(283, 337, 80, 80);
panel_3.add(btndivide);

JButton btn0 = new JButton("0");
btn0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btn0.getText();
txtDisplay.setText(EnterValue);
}
});
btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
btn0.setBounds(10, 428, 80, 80);
panel_3.add(btn0);

JButton btnDot = new JButton(".");
btnDot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterValue= txtDisplay.getText()+btnDot.getText();
txtDisplay.setText(EnterValue);
}
});
btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
btnDot.setBounds(100, 428, 80, 80);
panel_3.add(btnDot);

JButton btnplusminus = new JButton("\u00B1");
btnplusminus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
double plusminus=Double.parseDouble(String.valueOf(txtDisplay.getText()));
plusminus=plusminus*(-1);
txtDisplay.setText(String.valueOf(plusminus));
}
});
btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 25));
btnplusminus.setBounds(190, 428, 80, 81);
panel_3.add(btnplusminus);

JButton btnequal = new JButton("=");
btnequal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String answer;
secondnum=Double.parseDouble(txtDisplay.getText());

if(operations=="+")
{
result=firstnum+secondnum;
answer=String.format("%.2f",result);
txtDisplay.setText(answer);

}
else if(operations=="-")
{
result=firstnum-secondnum;
answer=String.format("%.2f",result);
txtDisplay.setText(answer);

}
else if(operations=="*")
{
result=firstnum*secondnum;
answer=String.format("%.2f",result);
txtDisplay.setText(answer);

}
else if(operations=="/")
{
result=firstnum/secondnum;
answer=String.format("%.2f",result);
txtDisplay.setText(answer);

}
else if(operations=="%")
{
result=firstnum%secondnum;
answer=String.format("%.2f",result);
txtDisplay.setText(answer);

}
}
});
btnequal.setFont(new Font("Tahoma", Font.BOLD, 25));
btnequal.setBounds(283, 428, 80, 81);
panel_3.add(btnequal);

txtDisplay = new JTextField();
txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
txtDisplay.setColumns(10);
txtDisplay.setBounds(10, 11, 353, 41);
panel_3.add(txtDisplay);

JPanel panel_4 = new JPanel();
tabbedPane.addTab("Receipt", null, panel_4, null);
panel_4.setLayout(null);

ReceiptArea = new JTextField();
ReceiptArea.setBounds(0, 0, 369, 519);
panel_4.add(ReceiptArea);
ReceiptArea.setColumns(10);

JPanel panel_1 = new JPanel();
panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
panel_1.setBounds(393, 400, 962, 286);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel btnTotalCostOfMeal = new JLabel("Total Cost Of Meal");
btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
btnTotalCostOfMeal.setBounds(44, 32, 142, 25);
panel_1.add(btnTotalCostOfMeal);

JLabel btnTotalCostOfDrink = new JLabel("Total Cost Of Drink");
btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
btnTotalCostOfDrink.setBounds(44, 87, 142, 25);
panel_1.add(btnTotalCostOfDrink);

JLabel btnCostOfDelivery = new JLabel("Cost Of Delivery");
btnCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 13));
btnCostOfDelivery.setBounds(44, 140, 142, 25);
panel_1.add(btnCostOfDelivery);

JLabel txtTotalCostOfMeal = new JLabel("");
txtTotalCostOfMeal.setForeground(Color.BLACK);
txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0,0,0),1));
txtTotalCostOfMeal.setBackground(Color.WHITE);
txtTotalCostOfMeal.setBounds(241, 28, 156, 29);
panel_1.add(txtTotalCostOfMeal);

JLabel txtTotalCostOfDrink = new JLabel("");
txtTotalCostOfDrink.setForeground(Color.BLACK);
txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0,0,0),1));
txtTotalCostOfDrink.setBackground(Color.WHITE);
txtTotalCostOfDrink.setBounds(241, 83, 156, 29);
panel_1.add(txtTotalCostOfDrink);

JLabel txtCostOfDelivery = new JLabel("");
txtCostOfDelivery.setForeground(Color.BLACK);
txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtCostOfDelivery.setBorder(new LineBorder(new Color(0,0,0),1));
txtCostOfDelivery.setBackground(Color.WHITE);
txtCostOfDelivery.setBounds(241, 136, 156, 29);
panel_1.add(txtCostOfDelivery);

JSeparator separator_4 = new JSeparator();
separator_4.setForeground(Color.DARK_GRAY);
separator_4.setOrientation(SwingConstants.VERTICAL);
separator_4.setBounds(536, 285, 8, -272);
panel_1.add(separator_4);

JSeparator separator_5 = new JSeparator();
separator_5.setOrientation(SwingConstants.VERTICAL);
separator_5.setBounds(522, 279, 8, -266);
panel_1.add(separator_5);

JSeparator separator_6 = new JSeparator();
separator_6.setBounds(529, 87, 1, 2);
panel_1.add(separator_6);

JSeparator separator_8 = new JSeparator();
separator_8.setOrientation(SwingConstants.VERTICAL);
separator_8.setForeground(Color.GRAY);
separator_8.setBounds(532, -2, -1, 288);
panel_1.add(separator_8);

JSeparator separator_9 = new JSeparator();
separator_9.setOrientation(SwingConstants.VERTICAL);
separator_9.setForeground(new Color(64, 64, 64));
separator_9.setBounds(536, -14, 9, 288);
panel_1.add(separator_9);

JLabel btnTax1 = new JLabel("TAX");
btnTax1.setFont(new Font("Tahoma", Font.BOLD, 13));
btnTax1.setBounds(568, 32, 142, 25);
panel_1.add(btnTax1);

JLabel btnSubTotal = new JLabel("Sub Total");
btnSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
btnSubTotal.setBounds(568, 87, 142, 25);
panel_1.add(btnSubTotal);

JLabel btnTotal = new JLabel("Total");
btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
btnTotal.setBounds(568, 136, 142, 25);
panel_1.add(btnTotal);

JLabel txtTax = new JLabel("");
txtTax.setForeground(Color.BLACK);
txtTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtTax.setBorder(new LineBorder(new Color(0,0,0),1));
txtTax.setBackground(Color.WHITE);
txtTax.setBounds(694, 32, 156, 29);
panel_1.add(txtTax);

JLabel txtSubTotal = new JLabel("");
txtSubTotal.setForeground(Color.BLACK);
txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtSubTotal.setBorder(new LineBorder(new Color(0,0,0),1));
txtSubTotal.setBackground(Color.WHITE);
txtSubTotal.setBounds(694, 83, 156, 29);
panel_1.add(txtSubTotal);

JLabel txtTotal = new JLabel("");
txtTotal.setForeground(Color.BLACK);
txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
txtTotal.setBorder(new LineBorder(new Color(0,0,0),1));
txtTotal.setBackground(Color.WHITE);
txtTotal.setBounds(694, 136, 156, 29);
panel_1.add(txtTotal);


JPanel panel_2 = new JPanel();
panel_2.setForeground(Color.GRAY);
panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
panel_2.setBounds(393, 126, 950, 280);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JLabel lblMenu = new JLabel("MENU");
lblMenu.setFont(new Font("Tahoma", Font.BOLD, 13));
lblMenu.setBounds(48, 21, 46, 14);
panel_2.add(lblMenu);

JLabel lblQuantity = new JLabel("QUANTITY");
lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
lblQuantity.setBounds(419, 21, 63, 14);
panel_2.add(lblQuantity);

JLabel lblPrice = new JLabel("PRICE ");
lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
lblPrice.setBounds(717, 21, 63, 14);
panel_2.add(lblPrice);

txtFriedRice = new JTextField();
txtFriedRice.setBounds(408, 46, 86, 20);
panel_2.add(txtFriedRice);
txtFriedRice.setColumns(10);

txtShawarma = new JTextField();
txtShawarma.setBounds(408, 82, 86, 20);
panel_2.add(txtShawarma);
txtShawarma.setColumns(10);

txtChicken = new JTextField();
txtChicken.setBounds(408, 113, 86, 20);
panel_2.add(txtChicken);
txtChicken.setColumns(10);

JLabel btnRice = new JLabel("RICE");
btnRice.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnRice.setBounds(48, 51, 46, 14);
panel_2.add(btnRice);

JLabel btnShawarma = new JLabel("CURRY");
btnShawarma.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnShawarma.setBounds(48, 84, 86, 14);
panel_2.add(btnShawarma);

JLabel btnChicken = new JLabel("CHICKEN");
btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnChicken.setBounds(48, 115, 69, 14);
panel_2.add(btnChicken);

JLabel lblNewLabel_1 = new JLabel("60.000");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_1.setBounds(717, 51, 46, 14);
panel_2.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("50.000");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2.setBounds(717, 84, 46, 14);
panel_2.add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("100.000");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_3.setBounds(717, 115, 46, 14);
panel_2.add(lblNewLabel_3);

txtChooseDrink = new JTextField();
txtChooseDrink.setBounds(408, 156, 86, 20);
panel_2.add(txtChooseDrink);
txtChooseDrink.setColumns(10);

JLabel label = new JLabel("  -");
label.setFont(new Font("Tahoma", Font.PLAIN, 27));
label.setBounds(715, 152, 33, 14);
panel_2.add(label);

JSeparator separator_3 = new JSeparator();
separator_3.setBounds(10, 205, 905, 1);
panel_2.add(separator_3);

JComboBox btnChooseDrink = new JComboBox();
btnChooseDrink.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

double Drinks=Double.parseDouble(txtChooseDrink.getText());
double Coca_Cola = 30.000*Drinks;
double Heineken = 70.000*Drinks;
double Pepsi = 30.000*Drinks;

}
});
btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a Drink", "CocaCola", "Heineken", "Pepsi"}));
btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnChooseDrink.setBounds(48, 155, 117, 20);
panel_2.add(btnChooseDrink);

JCheckBox btnDelivery = new JCheckBox("Delivery");
btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnDelivery.setBounds(74, 213, 123, 46);
panel_2.add(btnDelivery);

JCheckBox btnTax = new JCheckBox("Tax");
btnTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnTax.setBounds(271, 213, 74, 46);
panel_2.add(btnTax);



JSeparator separator_7 = new JSeparator();
separator_7.setOrientation(SwingConstants.VERTICAL);
separator_7.setBounds(533, 299, 9, -18);
panel_2.add(separator_7);


JLabel lblNewLabel = new JLabel("HOTEL MANAGEMENT SYSTEM");
lblNewLabel.setForeground(Color.DARK_GRAY);
lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 80));
lblNewLabel.setBounds(91, 25, 1173, 79);
frame.getContentPane().add(lblNewLabel);

JMenuBar menuBar = new JMenuBar();
menuBar.setBounds(0, 0, 1354, 30);
frame.getContentPane().add(menuBar);

JMenu mnNewMenu = new JMenu("File");
mnNewMenu.setForeground(Color.BLACK);
mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
menuBar.add(mnNewMenu);

JSeparator separator = new JSeparator();
mnNewMenu.add(separator);

JMenuItem mntmReceipt = new JMenuItem("Receipt");
mnNewMenu.add(mntmReceipt);
mntmReceipt.setFont(new Font("Segoe UI", Font.BOLD, 15));
mntmReceipt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Double Invoice1=Double.parseDouble(txtFriedRice.getText());
Double Invoice2=Double.parseDouble(txtShawarma.getText());
Double Invoice3=Double.parseDouble(txtChicken.getText());
Double Invoice4=Double.parseDouble(txtChooseDrink.getText());

ReceiptArea.setText("Hotel Management System: "
+"\nFried Rice: "+ Invoice1
+"\nCurry: "+ Invoice2
+"\nChicken: "+ Invoice3
+ "\n"+ btnChooseDrink.getSelectedItem()+":" + Invoice4
+"\nTotal : "   +    txtTotal.getText()
+"\nWelcome and ThakYou for coming");

}
});

JMenuItem mntmReset = new JMenuItem("Reset");
mnNewMenu.add(mntmReset);
mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 15));
mntmReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
txtFriedRice.setText(null);
txtShawarma.setText(null);
txtChicken.setText(null);
txtChooseDrink.setText(null);
txtTotalCostOfDrink.setText(null);
txtTotalCostOfMeal.setText(null);
txtCostOfDelivery.setText(null);
txtTax.setText(null);
txtSubTotal.setText(null);
txtTotal.setText(null);
txtDisplay.setText(null);
btnChooseDrink.setSelectedItem("Choose a drink");
ReceiptArea.setText(null);
}
});

JSeparator separator_1 = new JSeparator();
mnNewMenu.add(separator_1);

JMenuItem mntmExit = new JMenuItem("Exit");
mnNewMenu.add(mntmExit);
mntmExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
mntmExit.setForeground(Color.RED);
mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 15));

JButton btnSubmit = new JButton("SUBMIT");
btnSubmit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
//===================Drinks===============//
double Drinks=Double.parseDouble(txtChooseDrink.getText());
double Coca_Cola =30.000*Drinks;
double Heineken = 70.000*Drinks;
double Pepsi = 30.000*Drinks;
if(btnChooseDrink.getSelectedItem().equals("Coca Cola")) {
String pCocaCola= String.format("%.3f", Coca_Cola);
txtTotalCostOfDrink.setText(pCocaCola);
}
if(btnChooseDrink.getSelectedItem().equals("Heineken")) {
String pHeineken= String.format("%.3f", Heineken);
txtTotalCostOfDrink.setText(pHeineken);
}
if(btnChooseDrink.getSelectedItem().equals("Pepsi")) {
String pPepsi= String.format("%.3f", Pepsi);
txtTotalCostOfDrink.setText(pPepsi);
}
if(btnChooseDrink.getSelectedItem().equals("Choose a drink")) {

txtTotalCostOfDrink.setText("0.000");
}

//========================Meals=====================//
Double FriedRice=Double.parseDouble(txtFriedRice.getText());
Double pFriedRice=60.000;
Double getFriedRice;
getFriedRice=(FriedRice*pFriedRice);
String TotalFriedRice= String.format("%.3f", getFriedRice);
txtTotalCostOfMeal.setText(TotalFriedRice);

Double Shawarma=Double.parseDouble(txtShawarma.getText());
Double pShawarma=50.000;
Double getShawarma;
getShawarma=(Shawarma*pShawarma);
String TotalShawarma= String.format("%.3f", getShawarma+getFriedRice);
txtTotalCostOfMeal.setText(TotalShawarma);

Double Chicken=Double.parseDouble(txtChicken.getText());
Double pChicken=100.000;
Double getChicken;
getChicken=(Chicken*pChicken);
String TotalChicken= String.format("%.3f", getChicken+getShawarma+getFriedRice);
txtTotalCostOfMeal.setText(TotalChicken);


//======================Delivery================//
double cDelivery=10.000;
if(btnDelivery.isSelected())
{
String pDelivery= String.format("%.3f", cDelivery);
txtCostOfDelivery.setText(pDelivery);
}
else
{
txtCostOfDelivery.setText("0.000");
}

//===============Tax========================//
Double pTotal1=Double.parseDouble(txtTotalCostOfMeal.getText());
Double pTotal2=Double.parseDouble(txtTotalCostOfDrink.getText());
Double pTotal3=Double.parseDouble(txtCostOfDelivery.getText());
Double cTotal=(pTotal1+pTotal2+pTotal3)/100;
if(btnTax.isSelected()) {
String xTotal= String.format("%.3f", cTotal);
txtTax.setText(xTotal);
}
//===============================Total==============//
double pTotal4=Double.parseDouble(txtTax.getText());
String zTaxTotal= String.format("%.3f", pTotal4);
txtTax.setText(zTaxTotal);
double SubTotal=(pTotal1+pTotal2+pTotal3);
String pSubTotal= String.format("%.3f", SubTotal);
txtSubTotal.setText(pSubTotal);
double xTotal=(pTotal1+pTotal2+pTotal3+pTotal4);
String yTotal= String.format("%.3f", xTotal);
txtTotal.setText(yTotal);
}
});
btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
btnSubmit.setBounds(485, 228, 89, 23);
panel_2.add(btnSubmit);



JButton btnReset1 = new JButton("RESET");
btnReset1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
txtFriedRice.setText(null);
txtShawarma.setText(null);
txtChicken.setText(null);
txtChooseDrink.setText(null);
txtTotalCostOfDrink.setText(null);
txtTotalCostOfMeal.setText(null);
txtCostOfDelivery.setText(null);
txtTax.setText(null);
txtSubTotal.setText(null);
txtTotal.setText(null);
txtDisplay.setText(null);
btnChooseDrink.setSelectedItem("Choose a drink");
ReceiptArea.setText(null);
}
});
btnReset1.setFont(new Font("Tahoma", Font.BOLD, 13));
btnReset1.setBounds(631, 228, 89, 23);
panel_2.add(btnReset1);

}
}
