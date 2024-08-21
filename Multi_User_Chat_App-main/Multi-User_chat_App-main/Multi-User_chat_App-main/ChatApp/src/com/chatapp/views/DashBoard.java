package com.chatapp.views;

//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.chatapp.dao.ClientChatScreen;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DashBoard extends JFrame {

	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
/*
	public static void main(String[] args) {
		
		DashBoard frame = new DashBoard();
		frame.setVisible(true);
	}
*/	
	public DashBoard(String message) {
		setBackground(new Color(0, 0, 64));
		setForeground(new Color(0, 0, 64));
		setExtendedState(JFrame.MAXIMIZED_BOTH); // so that our DashBoard will be in full Screen...
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 748);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu ChatMenu = new JMenu("Chat");
		ChatMenu.setBackground(Color.WHITE);
		menuBar.add(ChatMenu);
		
		JMenuItem StartChat = new JMenuItem("Start Chat");
		StartChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					new ClientChatScreen();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ChatMenu.add(StartChat);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("CONNECTit");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 64));
		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/images/connit.jpg")));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
