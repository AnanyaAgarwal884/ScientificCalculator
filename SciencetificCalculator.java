import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SciencetificCalculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	String t;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SciencetificCalculator window = new SciencetificCalculator();
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
	public SciencetificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 405, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScientificcalculator = new JLabel("         ScientificCalculator");
		lblScientificcalculator.setBackground(Color.PINK);
		lblScientificcalculator.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblScientificcalculator.setBounds(63, 11, 270, 14);
		frame.getContentPane().add(lblScientificcalculator);
		
		textField = new JTextField();
		textField.setBounds(0, 27, 389, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(0, 91, 66, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnx.setBounds(0, 125, 66, 37);
		frame.getContentPane().add(btnx);
		
		JButton btnX_1 = new JButton(" X^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnX_1.setBounds(0, 194, 66, 37);
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton(" x^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnX.setBounds(0, 229, 66, 37);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton(" n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnN.setBounds(0, 264, 66, 37);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton(" +/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnPlusMinus.setBounds(0, 296, 66, 37);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnEx.setBounds(76, 91, 69, 37);
		frame.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLog.setBounds(76, 125, 69, 37);
		frame.getContentPane().add(btnLog);
		
		JButton btn7 = new JButton(" 7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(76, 194, 69, 37);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(76, 229, 69, 37);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton(" 1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(76, 264, 69, 37);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton(" 0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(76, 301, 152, 32);
		frame.getContentPane().add(btn0);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnSin.setBounds(152, 91, 76, 37);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnSinh.setBounds(152, 125, 76, 37);
		frame.getContentPane().add(btnSinh);
		
		JButton btn8 = new JButton(" 8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(152, 194, 76, 37);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton(" 5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(152, 229, 76, 37);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton(" 2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(152, 264, 76, 37);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnCos.setBounds(233, 91, 79, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnCosh.setBounds(233, 125, 79, 37);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 14));
		btnBackSpace.setBounds(233, 160, 79, 37);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton(" 9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(233, 196, 79, 37);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton(" 6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(233, 229, 79, 37);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton(" 3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setBounds(233, 264, 79, 37);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(" .");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(233, 296, 79, 37);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBounds(316, 91, 73, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnTanh.setBounds(316, 125, 73, 37);
		frame.getContentPane().add(btnTanh);
		
		JButton btnSub = new JButton(" -");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				
				//textField.setText(" ");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnSub.setBounds(316, 160, 73, 37);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton(" +");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		btnAdd.setBounds(316, 194, 73, 37);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMultiply = new JButton(" *");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnMultiply.setBounds(316, 229, 73, 37);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton(" /");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			first=Double.parseDouble(textField.getText());
			textField.setText(" ");
			operation="/";
			}
		});
		btnDivide.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnDivide.setBounds(316, 264, 73, 37);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton(" =");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{double resultt=1;
				for(int i=0;i<second;i++)
				{
					resultt=first*resultt;
				}
					answer=String.format("%.2f",resultt);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnEqual.setBounds(316, 296, 73, 37);
		frame.getContentPane().add(btnEqual);
		
		JButton btnModulo = new JButton(" %");
		btnModulo.setEnabled(false);
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		btnModulo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnModulo.setBounds(76, 160, 69, 37);
		frame.getContentPane().add(btnModulo);
		
		JButton btnClear = new JButton(" C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnClear.setBounds(152, 160, 76, 37);
		frame.getContentPane().add(btnClear);
		
		JButton btnX_2 = new JButton(" X^Y");
		btnX_2.setEnabled(false);
		btnX_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="X^Y";
			}
		});
		btnX_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnX_2.setBounds(0, 160, 66, 37);
		frame.getContentPane().add(btnX_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnx.setEnabled(true);
				btnX.setEnabled(true);
				btnX_1.setEnabled(true);
				btnX_2.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnLog.setEnabled(true);
				btnEx.setEnabled(true);
				btnx.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				btnModulo.setEnabled(true);
				btn0.setEnabled(true);
				btnEqual.setEnabled(true);
				textField.setEnabled(true);
			
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(0, 66, 49, 18);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnx.setEnabled(false);
				btnX.setEnabled(false);
				btnX_1.setEnabled(false);
				btnX_2.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnLog.setEnabled(false);
				btnEx.setEnabled(false);
				btnx.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				btnModulo.setEnabled(false);
				btn0.setEnabled(false);
				btnEqual.setEnabled(false);
				textField.setEnabled(false);
			
			
			
			}
			
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(53, 66, 49, 18);
		frame.getContentPane().add(rdbtnOff);
	}
}
