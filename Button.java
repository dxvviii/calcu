import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;


public class Button {
    static int num1,num2;
	static char ope;
	        /**
         * @param args
         */
        public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
		frame.setSize(317,355);
	    frame.setDefaultCloseOperation(3);
		frame.getContentPane().setBackground(Color.BLACK);
	    frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		JPanel panel1 = new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		panel1.setBounds(1,10,5000,355);
		panel1.setBackground(Color.BLACK);
		panel1.setLayout(null);
		final JTextField jtf = new JTextField();
		jtf.setBounds(1,1,295,40);
		jtf.setBackground(Color.black);
		jtf.setForeground(Color.WHITE);
		jtf.setFont(new Font("Calibri", Font.BOLD, 20));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setBorder(new LineBorder(Color.black,1));
		panel1.add(jtf);
		panel2.setBounds(1,120,300,200);
		panel2.setBackground(Color.BLACK);
		panel2.setLayout(new GridLayout(5,5,1,1));
		frame.add(panel2);

		JButton c = new JButton("C");
		c.setFont(new Font("Calibri", Font.BOLD, 20));
		c.setRolloverEnabled(false);
		c.setFocusable(false);
		c.setBorderPainted(false);
		c.setBackground(Color.BLACK);
		c.setForeground(Color.ORANGE);
		c.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText("");
            }
		});

	

		JButton div = new JButton("");
		div.setFont(new Font("Calibri", Font.BOLD, 25));
		div.setBackground(Color.BLACK);
		div.setRolloverEnabled(false);
		div.setFocusable(false);
		div.setBorderPainted(false);
		div.setForeground(Color.ORANGE);
		div.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"");
            }
		});

		JButton zero = new JButton("0");
		zero.setFont(new Font("Calibri", Font.BOLD, 20));
		zero.setBackground(Color.BLACK);
		zero.setRolloverEnabled(false);
		zero.setFocusable(false);
		zero.setBorderPainted(false);
		zero.setForeground(Color.white);
		zero.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
			    if(st.equals("0"))
					st="";
			    jtf.setText(st+"0");
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"0");
            }
		});
 
		JButton one = new JButton("1");
		one.setFont(new Font("Calibri", Font.BOLD, 20));
		one.setRolloverEnabled(false);
		one.setFocusable(false);
		one.setBorderPainted(false);
		one.setBackground(Color.BLACK);
		one.setForeground(Color.white);
		one.addActionListener(new ActionListener(){
            public void actionperformed(ActionEvent e){
	    	  	                String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText(st+"1");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    			st="";
	    	  	jtf.setText(st+"1");
        	}
		});

		JButton two = new JButton("2");
		two.setFont(new Font("Calibri", Font.BOLD, 20));
		two.setRolloverEnabled(false);
		two.setFocusable(false);
		two.setBorderPainted(false);
		two.setBackground(Color.BLACK);
		two.setForeground(Color.white);
		two.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"2");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"2");   
        	}
		});

		JButton three = new JButton("3");
		three.setFont(new Font("Calibri", Font.BOLD, 20));
		three.setRolloverEnabled(false);
		three.setFocusable(false);
		three.setBorderPainted(false);
		three.setBackground(Color.BLACK);
		three.setForeground(Color.white);
		three.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"3");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"3");
            
        	}
        });

		JButton four = new JButton("4");
		four.setFont(new Font("Calibri", Font.BOLD, 20));
		four.setRolloverEnabled(false);
		four.setFocusable(false);
		four.setBorderPainted(false);
		four.setBackground(Color.BLACK);
		four.setForeground(Color.white);
		four.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"4");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"4");
            
        	}
        });

		JButton five = new JButton("5");
		five.setFont(new Font("Calibri", Font.BOLD, 20));
		five.setRolloverEnabled(false);
		five.setFocusable(false);
		five.setBorderPainted(false);
		five.setBackground(Color.BLACK);
		five.setForeground(Color.white);
		five.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"5");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"5");
            
        	}
        });

		JButton six = new JButton("6");
		six.setFont(new Font("Calibri", Font.BOLD, 20));
		six.setRolloverEnabled(false);
		six.setFocusable(false);
		six.setBorderPainted(false);
		six.setBackground(Color.BLACK);
		six.setForeground(Color.white);
		six.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"6");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"6");
            
        	}
        });

		JButton seven = new JButton("7");
		seven.setFont(new Font("Calibri", Font.BOLD, 20));
		seven.setRolloverEnabled(false);
		seven.setFocusable(false);
		seven.setBorderPainted(false);
		seven.setBackground(Color.BLACK);
		seven.setForeground(Color.white);
		seven.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"7");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"7");
            
        	}
        });

		JButton eight = new JButton("8");
		eight.setFont(new Font("Calibri", Font.BOLD, 20));
		eight.setRolloverEnabled(false);
		eight.setFocusable(false);
		eight.setBorderPainted(false);
		eight.setBackground(Color.BLACK);
		eight.setForeground(Color.white);
		eight.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"8");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"8");
            
        	}
        });

		JButton nine = new JButton("9");
		nine.setFont(new Font("Calibri", Font.BOLD, 20));
		nine.setRolloverEnabled(false);
		nine.setFocusable(false);
		nine.setBorderPainted(false);
		nine.setBackground(Color.BLACK);
		nine.setForeground(Color.white);
		nine.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"9");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"9");
            
        	}
        });

		JButton multiply = new JButton("x");
		multiply.setFont(new Font("Calibri", Font.BOLD, 23));
		multiply.setRolloverEnabled(false);
		multiply.setFocusable(false);
		multiply.setBorderPainted(false);
		multiply.setBackground(Color.BLACK);
		multiply.setForeground(Color.ORANGE);
		multiply.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"x");
					      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"x");
            
        	}
        });

		JButton minus = new JButton("-");
		minus.setFont(new Font("Calibri", Font.BOLD, 23));
		minus.setRolloverEnabled(false);
		minus.setFocusable(false);
		minus.setBorderPainted(false);
		minus.setBackground(Color.BLACK);
		minus.setForeground(Color.ORANGE);
		minus.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"-");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"-");
            
        	}
        });
        	JButton percent = new JButton("%");
		percent.setFont(new Font("Calibri", Font.BOLD, 23));
		percent.setRolloverEnabled(false);
		percent.setFocusable(false);
		percent.setBorderPainted(false);
		percent.setBackground(Color.BLACK);
		percent.setForeground(Color.ORANGE);
		percent.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"%"); 
            }
		});

		JButton plus = new JButton("+");

		plus.setFont(new Font("Calibri", Font.BOLD, 23));
plus.setRolloverEnabled(false);
plus.setFocusable(false);
plus.setBorderPainted(false);
plus.setBackground(Color.BLACK);
plus.setForeground(Color.ORANGE);
plus.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"+");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"+");
            
        	}
        });
    
		JButton divi = new JButton("/");
		divi.setFont(new Font("Calibri", Font.BOLD, 23));
		divi.setRolloverEnabled(false);
		divi.setFocusable(false);
		divi.setBorderPainted(false);
		divi.setBackground(Color.BLACK);
		divi.setForeground(new Color(239, 188, 2));
		divi.addActionListener(new ActionListener(){
	      	public void actionperformed(ActionEvent e){
	    	  	String st = jtf.getText();
	    	  	if(st.equals("0"))
	    		  	st="";
	    	  	jtf.setText(st+"/ ");
	      	}@Override
        	public void actionPerformed(ActionEvent e) {
            	String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+"/");
            
        	}
        });
		
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        JButton dot = new JButton(".");
        dot.setFont(new Font("Calibri", Font.BOLD, 23));
        dot.setRolloverEnabled(false);
        dot.setFocusable(false);
        dot.setBorderPainted(false);
        dot.setBackground(Color.BLACK);
        dot.setForeground(Color.white);
        dot.addActionListener(new ActionListener(){
          	public void actionperformed(ActionEvent e){
            	String st = jtf.getText();
            	if(st.equals("0"))
            	  	st="";
            	jtf.setText(st+".");
          	}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				if(st.equals("0"))
				  	jtf.setText(st+"0");
				else
				 	jtf.setText(st+".");
                    
        	}
        });

		
		JButton cc = new JButton("+/-");
		cc.setFont(new Font("Calibri", Font.BOLD, 23));
				cc.setRolloverEnabled(false);
		cc.setFocusable(false);
		cc.setBorderPainted(false);
		cc.setBackground(Color.BLACK);
		cc.setForeground(new Color(239, 188, 2));
		cc.addActionListener(new ActionListener(){
			public void actionperformed(ActionEvent e){
				String st = jtf.getText();
					st="";
			}@Override
            public void actionPerformed(ActionEvent e) {
                String st = jtf.getText();
				int number = Integer.parseInt(st);
	    	  	if(number>0)
	    	  		jtf.setText("-"+st);
				else if(number<0)
					jtf.setText("+"+st);
				else
					jtf.setText("0");
            }
		});

		
    JButton equal = new JButton("=");
equal.setFont(new Font("Calibri", Font.BOLD, 23));
equal.setRolloverEnabled(false);
equal.setFocusable(false);
equal.setBorderPainted(false);
equal.setBackground(Color.BLACK);
equal.setForeground(new Color(239, 188, 2));
equal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String st = jtf.getText();
				if (st.equals("0")) {
					st = "";
				}
		        // Assuming you want to perform some calculation when the equal button is pressed
        try {
            double result = evaluateExpression(st);
            jtf.setText(String.valueOf(result));
        } catch (Exception ex) {
            jtf.setText("Error");
        }
    }
    protected static double evaluateExpression(String st) {
        try {
            // Check for the presence of operators (+, -, *, %)
            if (st.contains("+")) {
                String[] operands = st.split("\\+");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[1]);
                return num1 + num2;
            } else if (st.contains("-")) {
                String[] operands = st.split("-");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[1]);
                return num1 - num2;
            } else if (st.contains("*") || st.contains("x")) {
                String[] operands = st.split("[*x]");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[1]);
                return num1 * num2;
            }
			 else if (st.contains("/") || st.contains("/")) {
                String[] operands = st.split("/");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[1]);
                return num1 / num2;
			 }

            
            else if (st.contains("%")) {
                // Remove the percentage symbol and convert the remaining string to a double
                double value = Double.parseDouble(st.replace("%", ""));
                // Calculate the percentage value
                return value * 0.01; // Divide by 100 to get the percentage value
            } else {
                // If no operators, just parse the double value
                return Double.parseDouble(st);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            throw new RuntimeException("Invalid input");
        }
    }

});

        // Create a custom action to display the current calculation
                AbstractAction customAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                source.setText(jtf.getText());
            }
        };


        // Get the ActionMap and InputMap of the equal button
        ActionMap actionMap = equal.getActionMap();
        InputMap inputMap = equal.getInputMap();

        // Add the custom action to the ActionMap
        actionMap.put("customAction", customAction);

        // Add a mousePressed binding to the InputMap to trigger the custom action
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "customAction");
        equal.setBounds(50, 400, 300, 50);
        frame.add(equal);
        frame.setVisible(true);
        equal.setBounds(50, 400, 300, 50);
        frame.add(equal);
        frame.setVisible(true);
		panel2.add(c);
		panel2.add(cc);
        panel2.add(percent);
		panel2.add(divi);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(multiply);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
        panel2.add(minus);
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
        panel2.add(plus);
		panel2.add(div);
		panel2.add(zero);
		panel2.add(dot);
		panel2.add(equal);
		frame.add(panel1);
		frame.setVisible(true);
    }
	protected static double evaluateExpression(String st) {
				return 0;
			}
	private static void setBorder(Border createEmptyBorder) {
	}
}

