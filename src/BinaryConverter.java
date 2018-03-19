import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener 
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	
	public static void main(String[] args)
	{
		BinaryConverter bc = new BinaryConverter();
		bc.createUI();
	}
	
	public void createUI()
	{
		label.setText("-");
		JButton button = new JButton();
		button.setText("Convert");
		panel.add(answer);
		panel.add(button);
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		
		button.addActionListener(this);
	}

	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("button pressed");
		label.setText(convert(answer.getText()));
		frame.pack();
	}
	
}
