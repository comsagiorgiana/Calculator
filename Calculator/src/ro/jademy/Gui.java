package ro.jademy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
	private JTextField resultField;
	private JButton one, two, three, four, five,six , seven, eight, nine, zero, comma, negative, add, substract, multiply,
			devide, equal, cButton;
	private String temp1, temp2, sresult;
	private double result = 0.00;
	private JPanel content;
	private boolean clickedEquals, opChoose = false;
	char operation = ' ';

	public Gui() {
		super("Calculator");

		resultField = new JTextField(null, 20);
		resultField.setEditable(false);

		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		comma = new JButton(".");
		negative = new JButton("+/-");
		add = new JButton("+");
		substract = new JButton("-");
		multiply = new JButton("*");
		devide = new JButton("/");
		equal = new JButton("=");
		cButton = new JButton("c");

		Dimension dim = new Dimension(75, 35);

		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(225, 25));
		comma.setPreferredSize(new Dimension(113, 25));
		negative.setPreferredSize(new Dimension(113, 25));
		add.setPreferredSize(new Dimension(113, 25));
		substract.setPreferredSize(new Dimension(113, 25));
		multiply.setPreferredSize(new Dimension(113, 25));
		devide.setPreferredSize(new Dimension(113, 25));
		equal.setPreferredSize(new Dimension(225, 25));
		cButton.setPreferredSize(new Dimension(225, 25));

		Numbers n = new Numbers();
		Calc c = new Calc();

		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);
		comma.addActionListener(n);
		negative.addActionListener(n);

		add.addActionListener(c);
		substract.addActionListener(c);
		multiply.addActionListener(c);
		devide.addActionListener(c);
		equal.addActionListener(c);
		cButton.addActionListener(c);

		content = new JPanel();
		content.setBackground(Color.YELLOW);
		content.setLayout(new FlowLayout());

		content.add(resultField, BorderLayout.NORTH);
		content.add(one);
		content.add(two);
		content.add(three);
		content.add(four);
		content.add(five);
		content.add(six);
		content.add(seven);
		content.add(eight);
		content.add(nine);
		content.add(zero);
		content.add(comma);
		content.add(negative);
		content.add(add);
		content.add(substract);
		content.add(multiply);
		content.add(devide);
		content.add(equal);
		content.add(cButton);

		this.setContentPane(content);
	}

	private class Numbers implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();

			if (src.equals(one)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "1";
					} else {
						temp1 = temp1 + "1";
					}
				} else {
					if (temp2 == null) {
						temp2 = "1";
					} else {
						temp2 = temp2 + "1";
					}
				}
			}
			if (src.equals(two)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "2";
					} else {
						temp1 = temp1 + "2";
					}
				} else {
					if (temp2 == null) {
						temp2 = "2";
					} else {
						temp2 = temp2 + "2";
					}
				}
			}
			if (src.equals(three)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "3";
					} else {
						temp1 = temp1 + "3";
					}
				} else {
					if (temp2 == null) {
						temp2 = "3";
					} else {
						temp2 = temp2 + "3";
					}
				}
			}
			if (src.equals(four)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "4";
					} else {
						temp1 = temp1 + "4";
					}
				} else {
					if (temp2 == null) {
						temp2 = "4";
					} else {
						temp2 = temp2 + "4";
					}
				}
			}
			if (src.equals(five)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "5";
					} else {
						temp1 = temp1 + "5";
					}
				} else {
					if (temp2 == null) {
						temp2 = "5";
					} else {
						temp2 = temp2 + "5";
					}
				}
			}
			if (src.equals(six)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "6";
					} else {
						temp1 = temp1 + "6";
					}
				} else {
					if (temp2 == null) {
						temp2 = "6";
					} else {
						temp2 = temp2 + "6";
					}
				}
			}
			if (src.equals(seven)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "7";
					} else {
						temp1 = temp1 + "7";
					}
				} else {
					if (temp2 == null) {
						temp2 = "7";
					} else {
						temp2 = temp2 + "7";
					}
				}
			}
			if (src.equals(eight)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "8";
					} else {
						temp1 = temp1 + "8";
					}
				} else {
					if (temp2 == null) {
						temp2 = "8";
					} else {
						temp2 = temp2 + "8";
					}
				}
			}
			if (src.equals(nine)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "9";
					} else {
						temp1 = temp1 + "9";
					}
				} else {
					if (temp2 == null) {
						temp2 = "9";
					} else {
						temp2 = temp2 + "9";
					}
				}
			}
			if (src.equals(zero)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "0";
					} else {
						temp1 = temp1 + "0";
					}
				} else {
					if (temp2 == null) {
						temp2 = "0";
					} else {
						temp2 = temp2 + "0";
					}
				}
			}
			if (src.equals(comma)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "0.";
					} else if (temp1 != null) {
						if (temp1.contains(".")) {
							System.out.println("Ai adaugat deja o zecimala");
						} else {
							temp1 += ".";
						}

					}
				} else {
					if (temp2 == null) {
						temp2 = "0.";
					} else if (temp2 != null) {
						if (temp2.contains(".")) {
							System.out.println("Ai ales deja o zecimala");
						} else {
							temp2 += ".";
						}
					}
				}
			}
			if (src.equals(negative)) {
				if (opChoose == false) {
					if (temp1 == null) {
						temp1 = "-";
					} else if (temp1 != null && temp1.startsWith("-")) {

						temp1 = temp1.substring(1);
					} else {
						temp1 = "-" + temp1;
					}
				} else {
					if (temp2 == null) {
						temp2 = "-";
					} else if (temp2 != null && temp2.startsWith("-")) {
						temp2 = temp2.substring(1);
					} else {
						temp2 = "-" + temp2;
					}
				}
			}

			if (clickedEquals == false) {
				if (opChoose == false) {

					resultField.setText(temp1);
				} else {
					resultField.setText(temp2);
				}
			}
		}

	}

	private class Calc implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();

			if (src.equals(add)) {
				if (temp1 == null) {
					System.out.println("Alege un numar prima data!");
				} else if (temp1 != null && temp2 == null) {
					opChoose = true;
					operation = '+';
				} else if (temp1 != null && temp2 != null) {
					System.out.println("Doar o singura operatiune!");

				}
			}
			if (src.equals(substract)) {
				if (temp1 == null) {
					System.out.println("Alege un numar prima data!");
				} else if (temp1 != null && temp2 == null) {
					opChoose = true;
					operation = '-';
				} else if (temp1 != null && temp2 != null) {
					System.out.println("Doar o singura operatiune!");

				}
			}
			if (src.equals(multiply)) {
				if (temp1 == null) {
					System.out.println("Alege un numar prima data!");
				} else if (temp1 != null && temp2 == null) {
					opChoose = true;
					operation = '*';
				} else if (temp1 != null && temp2 != null) {
					System.out.println("Doar o singura operatiune!");

				}
			}
			if (src.equals(devide)) {
				if (temp1 == null) {
					System.out.println("Alege un numar prima data!");
				} else if (temp1 != null && temp2 == null) {
					opChoose = true;
					operation = '/';
				} else if (temp1 != null && temp2 != null) {
					System.out.println("Doar o singura operatiune!");

				}
			}

			if (src.equals(equal)) {
				if (temp1 == null) {
					System.out.println("Alege un numar prima data!");
				} else if (temp1 != null && temp2 == null) {
					System.out.println("Alege ambele numere!");
				}

				if (temp1 != null && temp2 != null) {
					double d1 = 0.00, d2 = 0.00;
					d1 = Double.parseDouble(temp1);
					d2 = Double.parseDouble(temp2);

					switch (operation) {
					case '+':
						result = d1 + d2;
						break;
					case '-':
						result = d1 - d2;
						break;
					case '*':
						result = d1 * d2;
						break;
					case '/':
						result = d1 / d2;
						break;
					}
					sresult = Double.toString(result);
					resultField.setText(sresult);
					if (operation == '/' && d2 == 0.0) {
						resultField.setText("Impartirea la zero nu este posibila");
					}
				}
			}

			if (src.equals(cButton)) {
				temp1 = null;
				temp2 = null;
				clickedEquals = false;
				operation = ' ';
				resultField.setText(null);
				sresult = null;
				opChoose = false;
			}
		}
	}
}
