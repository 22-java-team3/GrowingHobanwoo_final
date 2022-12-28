package GH;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ending_Guaro extends JFrame implements ActionListener{

	public Ending_Guaro() {
		setBounds(400,100,600,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GameOver");
		
		JPanel Back = new JPanel();
		Back.setBackground(Color.WHITE);
		Back.setLayout(new GridLayout(2,1));
		
		ImageIcon go = new ImageIcon("gameover.jpg");
		ImageIcon otl = new ImageIcon("otl.jpg");
		
		JLabel goLabel = new JLabel();
		goLabel.setIcon(go);
		goLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel otlLabel = new JLabel();
		otlLabel.setIcon(otl);
		otlLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JButton end = new JButton("끝내기");
		end.setBorderPainted(false);
		end.setFocusPainted(false);
		end.setContentAreaFilled(false);
		end.setBackground(Color.white);
		end.setBounds(480,500,80,50);
		end.addActionListener(this);
		
		Back.add(goLabel);
		Back.add(otlLabel);
		
		add(end);
		add(Back);
		
	}
	public static void main(String[] args) {
		Ending_Guaro gre = new Ending_Guaro();
		gre.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		
		if(actionCmd.equals("끝내기")) {
			System.exit(0);
		}
		
	}

}
