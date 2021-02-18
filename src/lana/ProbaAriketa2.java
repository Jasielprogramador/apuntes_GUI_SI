package lana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

public class ProbaAriketa2 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbaAriketa2 frame = new ProbaAriketa2();
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
	public ProbaAriketa2() {
		setTitle("Erabiltzailea sartu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getRdbtnNewRadioButton_2());
		
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		
		contentPane.add(getLblNewLabel());
		
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getChckbxNewCheckBox_1());
		
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(6, 68,  110, 50);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(6, 131,  110, 50);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(6, 195,  110, 50);
		}
		return rdbtnNewRadioButton_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(136, 63,  110, 60);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
			btnNewButton_1.setBounds(250, 63,  110, 60);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B1");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_2.setBounds(136, 126,  110, 60);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("B2");
			btnNewButton_3.setBounds(250, 126,  110, 60);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("C1");
			btnNewButton_4.setBounds(136, 189, 110, 60);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C2");
			btnNewButton_5.setBounds(250, 189, 110, 60);
		}
		return btnNewButton_5;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Botoi bat sakatu");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(136, 10, 1300, 25);
		}
		return lblNewLabel;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("1. aukera");
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxNewCheckBox.setBounds(136, 272, 110, 21);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("2. aukera");
			chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxNewCheckBox_1.setBounds(250, 272, 110, 21);
		}
		return chckbxNewCheckBox_1;
	}
}
