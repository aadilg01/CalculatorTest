package com.nttdata.cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 16, 413, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn7.setBounds(25, 96, 50, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
	
			}
		});
		btn8.setBounds(90, 96, 50, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
	
			}
		});
		btn9.setBounds(155, 96, 50, 53);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "+";  
				
			}
		});
		btnPlus.setBounds(220, 96, 50, 53);
		frame.getContentPane().add(btnPlus);
		
		//Row 2
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(25, 165, 50, 53);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(90, 165, 50, 53);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(155, 165, 50, 53);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "-";
			}
		});
		btnSub.setBounds(220, 165, 50, 53);
		frame.getContentPane().add(btnSub);
		
		
		//row 3
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(25, 234, 50, 53);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(90, 234, 50, 53);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(155, 234, 50, 53);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText(null);
				operations = "*";
			}
		});
		btnMult.setBounds(220, 234, 50, 53);
		frame.getContentPane().add(btnMult);
		
		//row 4
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber = textField.getText() + btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setBounds(25, 303, 50, 53);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setBounds(90, 303, 50, 53);
				frame.getContentPane().add(btnDot);
				
				JButton btnNeg = new JButton("+-");
				btnNeg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Double num = Double.parseDouble(String.valueOf(textField.getText()));
						num = num * (-1);
						textField.setText(String.valueOf(num));						
					}
				});
				btnNeg.setBounds(155, 303, 50, 53);
				frame.getContentPane().add(btnNeg);
				
				JButton btnEq = new JButton("=");
				btnEq.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondNum = Double.parseDouble(textField.getText());
						
						if (operations == "+") {
							result = firstNum + secondNum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "-") {
							result = firstNum - secondNum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "*") {
							result = firstNum * secondNum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "%") {
							result = firstNum / secondNum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
					
					}
				});
				btnEq.setBounds(220, 303, 50, 53);
				frame.getContentPane().add(btnEq);
		
			//row 5
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(null);
					}
				});
				btnClear.setBounds(25, 372, 50, 53);
				frame.getContentPane().add(btnClear);
				
				JButton btnBack = new JButton("D");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String backSpace = null;
						
						if (textField.getText().length() > 0) {
							StringBuilder strb = new StringBuilder(textField.getText());
							strb.deleteCharAt(textField.getText().length()-1);
							backSpace = strb.toString();
							textField.setText(backSpace);
						}
						
					}
				});
				btnBack.setBounds(90, 372, 50, 53);
				frame.getContentPane().add(btnBack);
				
				JButton btnDiv = new JButton("%");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum = Double.parseDouble(textField.getText());
						textField.setText(null);
						operations = "%";
					}
				});
				btnDiv.setBounds(155, 372, 50, 53);
				frame.getContentPane().add(btnDiv);
				
				JButton btnE = new JButton("E");
				btnE.setBounds(220, 372, 50, 53);
				frame.getContentPane().add(btnE);
		
	}
}
