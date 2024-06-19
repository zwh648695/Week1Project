package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class MenuUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lcd;
	private JTextField ram;
	private JTextField mouse;
	private JRadioButton ismember;
	private JRadioButton notmember;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUI frame = new MenuUI();
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
	public MenuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea show = new JTextArea();
		show.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		show.setForeground(new Color(255, 255, 255));
		show.setBackground(new Color(0, 0, 0));
		show.setBounds(0, 308, 500, 164);
		contentPane.add(show);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(213, 213, 213));
		panel.setBounds(0, 0, 500, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("電腦零件購買系統");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(148, 6, 210, 53);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(183, 244, 239));
		panel_1.setBounds(0, 69, 500, 238);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LCD：");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(19, 16, 88, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RAM：");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(19, 92, 88, 40);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOUSE：");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(9, 174, 98, 40);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("¥4999/個");
		lblNewLabel_4.setForeground(new Color(242, 165, 22));
		lblNewLabel_4.setBounds(19, 46, 61, 16);
		panel_1.add(lblNewLabel_4);
		
		lcd = new JTextField();
		lcd.setBounds(97, 16, 117, 46);
		panel_1.add(lcd);
		lcd.setColumns(10);
		
		ram = new JTextField();
		ram.setBounds(97, 92, 117, 46);
		panel_1.add(ram);
		ram.setColumns(10);
		
		mouse = new JTextField();
		mouse.setBounds(97, 174, 117, 46);
		panel_1.add(mouse);
		mouse.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("¥1280/個");
		lblNewLabel_5.setForeground(new Color(242, 165, 22));
		lblNewLabel_5.setBounds(19, 122, 61, 16);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("¥799/個");
		lblNewLabel_6.setForeground(new Color(242, 165, 22));
		lblNewLabel_6.setBounds(19, 204, 61, 16);
		panel_1.add(lblNewLabel_6);
		
		notmember = new JRadioButton("非會員");
		notmember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(notmember.isSelected())
				{
					ismember.setSelected(false);
				}
			}
		});
		notmember.setBounds(341, 103, 141, 23);
		panel_1.add(notmember);
		
		ismember = new JRadioButton("會員");
		ismember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ismember.isSelected())
				{
					notmember.setSelected(false);
				}
				
			}
		});
		ismember.setBounds(341, 78, 141, 23);
		panel_1.add(ismember);
		
		
		/****Button 計算*****/
		JButton btnNewButton = new JButton("試算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.擷取name裡的內容 --> name.getText()
				 * 2.顯示在show的界面 --> show.setText()
				 */
				Integer Ram=Integer.parseInt(ram.getText());
				Integer Lcd=Integer.parseInt(lcd.getText());
				Integer Mouse=Integer.parseInt(mouse.getText());
				
				Menu m=new Menu(Ram,Lcd,Mouse);
				
				if(ismember.isSelected())
				{
					show.setText(m.discount());
				}
				else if(notmember.isSelected())
				{
					show.setText(m.show());
				}
				else
				{
					show.setText(m.show());
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(331, 31, 117, 49);
		panel_1.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("清除");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lcd.setText("");
				ram.setText("");
				mouse.setText("");
				show.setText("");
				ismember.setSelected(false);
				notmember.setSelected(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(331, 153, 117, 49);
		panel_1.add(btnNewButton_1);
	}
}
