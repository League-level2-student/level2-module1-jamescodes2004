package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	
	ArrayList<String> names = new ArrayList<String>();
	void run() {
		add.setText("Add name");
		view.setText("View names");
		names.add("Arman Dahi");
		names.add("Graham Winter");
		names.add("James Ward");
		names.add("Bob Banders");
		add.addActionListener(this);
		view.addActionListener(this);
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			String name = JOptionPane.showInputDialog(null, "What name would you like to add?");
			names.add(name);
		}
		else if (e.getSource()==view){
			String nam ="";
			for (String na : names) {
				nam = nam + na + " ";
				
			}
			System.out.println(nam);
			JOptionPane.showMessageDialog(null, nam);
		}
		}
	}
