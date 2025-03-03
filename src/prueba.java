import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class VentanaInicial extends JFrame implements ActionListener{
	
	JMenu menuMasters,menuBooking,menuTestPerform,menuPrinting,menuTransaction,menuLabReports,menuSettings,menuUtility,menuWindow,menuHelp;


	JButton btnAdd,btnEdit,btnBack,btnNext,btnList,btnSave,btnPrint,btnTest,btnCancel,btnSettings,btnDelete,btnSlip,btnExit;
	
	JButton accederLab;
	
	JInternalFrame IFLab;
	
	public VentanaInicial() {
		getContentPane().setLayout(null);
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Lab master");
		setVisible(true);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuMasters = new JMenu("Masters");
		menuBooking = new JMenu("Booking");
		menuTestPerform = new JMenu("Test Perform");
		menuPrinting = new JMenu("Printing");
		menuTransaction = new JMenu("Transaction");
		menuLabReports = new JMenu("Lab Reports");
		menuSettings = new JMenu("Settings");
		menuUtility = new JMenu("Utility");
		menuWindow = new JMenu("Window");
		menuHelp = new JMenu("Help");
		
		menuBar.add(menuMasters);
		menuBar.add(menuBooking);
		menuBar.add(menuTestPerform);
		menuBar.add(menuPrinting);
		menuBar.add(menuTransaction);
		menuBar.add(menuLabReports);
		menuBar.add(menuSettings);
		menuBar.add(menuUtility);
		menuBar.add(menuWindow);
		menuBar.add(menuHelp);
			
		accederLab = new JButton("Acceder lab master");
		accederLab.addActionListener(this);
		accederLab.setBounds(0,0,200,30);
		add(accederLab);
		
		
		setJMenuBar(menuBar);
		
		IFLab = new JInternalFrame();
		IFLab.setSize(1000,700);
		IFLab.setClosable(true);
		IFLab.setMaximizable(true);
		IFLab.setIconifiable(true);
		IFLab.setResizable(true);
		IFLab.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IFLab.getContentPane().setLayout(null);
		IFLab.setBounds(100, 100, 1000, 700);
			
			Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
			
			
			
			
			
			
			JToolBar toolBar = new JToolBar();
				
			
				
				btnAdd = new JButton("ADD");
				btnEdit = new JButton("EDIT");
				btnBack = new JButton("BACK");
				btnNext = new JButton("NEXT");
				btnList = new JButton("LIST");
				btnSave = new JButton("SAVE");
				btnPrint = new JButton("PRINT");
				btnTest = new JButton("TEST");
				btnCancel = new JButton("CANCEL");
				btnSettings = new JButton("SETTINGS");
				btnDelete = new JButton("DELETE");
				btnSlip = new JButton("SLIP");
				btnExit = new JButton("EXIT");
				
				toolBar.add(btnAdd);			
				toolBar.add(btnEdit);
				toolBar.add(btnBack);
				toolBar.add(btnNext);
				toolBar.add(btnList);
				toolBar.add(btnSave);
				toolBar.add(btnPrint);
				toolBar.add(btnTest);
				toolBar.add(btnCancel);
				toolBar.add(btnSettings);
				toolBar.add(btnDelete);
				toolBar.add(btnSlip);
				toolBar.add(btnExit);
				
				
			toolBar.setBounds(0,0,1000,40);
			
			IFLab.add(toolBar);
			
			
			JPanel panel1 = new JPanel();
			panel1.setLayout(null);
			panel1.setSize(900,150);
			panel1.setBorder(null);
			panel1.setBorder(border);
			panel1.setBounds(50,50,900,150);
				JLabel txtPatient = new JLabel("Patient ID");
				txtPatient.setBounds(10,10,100,20);
				panel1.add(txtPatient);
				
				JTextField IDPaciente = new JTextField();
				IDPaciente.setBounds(90,10,100,20);
				panel1.add(IDPaciente);
				
				JLabel txtDate = añadirLabel("Date", 190, 10, 30, 20, panel1);
				JComboBox<String> date = new JComboBox<String>();
					date.addItem("*2/01/2012");
				date.setBounds(220,10,100,20);
				panel1.add(date);
				
				JLabel txtTime = añadirLabel("Time (hh:mm)", 330, 10, 80, 20, panel1);
				
				JTextField hh = añadirTextField("0", 415, 10, 20, 20, panel1);
				
				JLabel txtBetween = añadirLabel(":", 440, 10, 10, 20, panel1);
				
				JTextField mm = añadirTextField("0", 445, 10, 20, 20, panel1);
				
				JLabel txtLab = añadirLabel("Lab No.", 470, 10, 60, 20, panel1);
				
				JTextField lab = añadirTextField("", 530, 10, 20, 20, panel1);
				
				JLabel txtName = new JLabel("Name");
				txtName.setBounds(10,30,100,20);
				panel1.add(txtName);
				
				JComboBox<String> señor = new JComboBox<String>();
					señor.addItem("MR");
					señor.addItem("MRS");
				señor.setBounds(90,30,60,20);
				panel1.add(señor);
				
				JTextField nombre = añadirTextField("", 160, 30, 240, 20, panel1);
				
				
				JLabel txtSex = new JLabel("Sex");
				txtSex.setBounds(10,50,100,20);
				panel1.add(txtSex);
				
				JComboBox<String> sexo = new JComboBox<String>();
					sexo.addItem("Male");
					sexo.addItem("Female");
				sexo.setBounds(90,50,60,20);
				panel1.add(sexo);
				
				JLabel txtxAge = new JLabel("Age");
				txtxAge.setBounds(160,50,40,20);
				panel1.add(txtxAge);
				
				JTextField age = añadirTextField("0", 190, 50, 40, 20, panel1);
				
				JLabel txtMonths = añadirLabel("months", 230, 50, 50, 20, panel1);
				
				JTextField months = añadirTextField("0", 280, 50, 40, 20, panel1);
				
				JLabel txtDays = añadirLabel("Days", 320, 50, 40, 20, panel1);
				
				JTextField days = añadirTextField("0", 360, 50, 40, 20, panel1);
				
				JLabel txtSample = añadirLabel("Sample by", 410, 50, 70, 20, panel1);
				
				JTextField sample = añadirTextField("", 480, 50, 70, 20, panel1);
				
				JLabel txtReformed = new JLabel("Reformed by");
				txtReformed.setBounds(10,70,100,20);
				panel1.add(txtReformed);
				
				JTextField reformed = new JTextField();
				reformed.setBounds(90,70,100,20);
				panel1.add(reformed);
				
				JLabel txtCode = añadirLabel("Panel code", 410, 70, 70, 20, panel1);
				
				JTextField code = añadirTextField("", 480, 70, 70, 20, panel1);
				
				JLabel txtPanelID = añadirLabel("Panel ID", 410, 90, 70, 20, panel1);
				
				JTextField panelID = añadirTextField("", 480, 90, 70, 20, panel1);
				
				JLabel txtEmail = añadirLabel("e-mail", 410, 110, 70, 20, panel1);
				
				JTextField email = añadirTextField("", 480, 110, 70, 20, panel1);
				
			
			IFLab.add(panel1);
			
			
			
			JPanel panel2 = new JPanel(); 
			panel2.setLayout(null);
			panel2.setSize(900,150);
			panel2.setBorder(null);
			panel2.setBorder(border);
			panel2.setBounds(50,210,900,250);
			
				JPanel panel2_1 = new JPanel();
				panel2_1.setLayout(null);
				panel2_1.setSize(500,150);
				panel2_1.setBorder(null);
				panel2_1.setBorder(border);
				panel2_1.setBounds(10,10,500,230);
				
					String rowData[][]= {{"","","","","","",""}};
		
					String columnNames[] = {"Test id","Test name","Rate","Disc%","Disc Amount","Tax%","Tax amt"};
		
					JTable tabla1 = new JTable(rowData,columnNames);
					
					JScrollPane scrollPane = new JScrollPane(tabla1);
					
					scrollPane.setBounds(0,0,500,300);
	
					panel2_1.add(scrollPane);
				
				panel2.add(panel2_1);
			
				JLabel txtTotalTest = añadirLabel("Total test", 520, 10, 100, 20, panel2);
				JTextField totalTest= añadirTextField("", 620, 10, 80, 20, panel2);
				totalTest.setBackground(Color.BLUE);
				
				JLabel txtTestAmt = añadirLabel("Test amount", 520, 40, 100, 20, panel2);
				JTextField testAmt = añadirTextField("", 620, 40, 80, 20, panel2);
				testAmt.setBackground(Color.BLUE);
				
				JLabel txtConcession = añadirLabel("Concession", 520, 70, 100, 20, panel2);
				JTextField concession = añadirTextField("", 620, 70, 80, 20, panel2);
				concession.setBackground(Color.BLUE);
				
				JLabel txtHmCollector = añadirLabel("Home collector", 520, 100, 100, 20, panel2);
				JTextField hmCollector = añadirTextField("", 620, 100, 80, 20, panel2);
				hmCollector.setBackground(Color.BLUE);
				
				JLabel txtTaxAmt = añadirLabel("Tax amount", 520, 130, 100, 20, panel2);
				JTextField taxAmt = añadirTextField("", 620, 130, 80, 20, panel2);
				taxAmt.setBackground(Color.BLUE);
				
				JLabel txtNetAmt = añadirLabel("Net amountt", 520, 160, 100, 20, panel2);
				JTextField netAmt = añadirTextField("", 620,160, 80, 20, panel2);
				netAmt.setBackground(Color.BLUE);
				
				JLabel txtBalance = añadirLabel("Balance", 520, 190, 80, 20, panel2);
				JTextField balance = añadirTextField("", 620, 190, 80, 20, panel2);
				balance.setBackground(Color.BLUE);
				
				
			
			IFLab.add(panel2);
				
			JPanel panel3 = new JPanel(); 
			panel3.setLayout(null);
			panel3.setSize(900,150);
			panel3.setBorder(null);
			panel3.setBorder(border);
			panel3.setBounds(50,490,900,130);
			
				JLabel txtHome = añadirLabel("Home collection", 10, 10, 100, 20, panel3);
				JTextField home = añadirTextField("", 115, 10, 45, 20, panel3);
				
				JLabel txtpaid = añadirLabel("Paid", 170, 10, 30, 20, panel3);
				JTextField paid = añadirTextField("0", 205, 10, 45, 20, panel3);
				
				JLabel txtPayType = añadirLabel("Pay type", 260, 10, 50, 20, panel3);
				JComboBox<String> payType = new JComboBox<String>();
				payType.addItem("Cash");
				payType.addItem("Card");
				payType.setBounds(310, 10, 80, 20);
				panel3.add(payType);
			
				JLabel txtRecipt = añadirLabel("Recipt No.", 400, 10, 60, 20, panel3);
				JTextField recipt = añadirTextField("", 475, 10, 45, 20, panel3);
				
			IFLab.add(panel3);
		
		add(IFLab);
	}
	
	
	
	
	public JLabel añadirLabel(String txt,int x,int y, int width,int height, JPanel panel) {
		JLabel label = new JLabel(txt);
		label.setBounds(x,y,width,height);
		panel.add(label);
		return label;
	}
	
	public JTextField añadirTextField(String txt,int x,int y, int width,int height, JPanel panel) {
		JTextField txtfld = new JTextField(txt);
		txtfld.setBounds(x,y,width,height);
		panel.add(txtfld);
		return txtfld;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==accederLab) {
			System.out.println("Sirve talvez");
			IFLab.setVisible(true);
		}
		
	}
	
}

public class prueba {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicial();
			}
		});
	}
}
