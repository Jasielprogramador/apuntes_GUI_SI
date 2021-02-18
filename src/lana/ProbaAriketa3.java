package lana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;

public class ProbaAriketa3 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JRadioButton rdbtnNewRadioButton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JRadioButton rdbtnNewRadioButton_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbaAriketa3 frame = new ProbaAriketa3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProbaAriketa3() {
		setTitle("Erabiltzailea sartu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getLblNewLabel(),BorderLayout.NORTH);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Botoi bat sakatu");
			lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
			
			
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(4, 0, 0, 3));
			panel.add(getRdbtnNewRadioButton());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getRdbtnNewRadioButton_1());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton_3());
			panel.add(getRadioButton_1());
			panel.add(getBtnNewButton_4());
			panel.add(getBtnNewButton_5());
			panel.add(getLblNewLabel_1());
			panel.add(getChckbxNewCheckBox_1());
			panel.add(getChckbxNewCheckBox());
		}
		return panel;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
		}
		return rdbtnNewRadioButton;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
		}
		return btnNewButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
		}
		return rdbtnNewRadioButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B1");
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("B2");
		}
		return btnNewButton_3;
	}
	private JRadioButton getRadioButton_1() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
		}
		return rdbtnNewRadioButton_2;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("C1");
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C2");
		}
		return btnNewButton_5;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("2. aukera");
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("1. aukera");
		}
		return chckbxNewCheckBox_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel(" ");
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getChckbxNewCheckBox_2());
			panel_1.add(getChckbxNewCheckBox_3());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Gustuko duzu?");
		}
		return lblNewLabel_2;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("Bai");
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("Ez");
		}
		return chckbxNewCheckBox_3;
	}
}

