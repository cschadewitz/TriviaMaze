//package screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;

import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

////////////////////////////////
//import java.io.*;
//import javax.imageio.*;
//import java.awt.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

///////////////////////////////

public class KennysQuest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KennysQuest window = new KennysQuest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KennysQuest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Kenny's Quest");
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		
		frame.setBounds(0, 0, 772, 508);	//default size
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //sets window to full screen
		frame.setUndecorated(true);	//removes the title bar
		
		frame.setResizable(false);	//prevents resizing the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
		//==========================================================================
		//Background picture needs to be resized
		JLabel temp;
		try{
			
		ImageIcon image = new ImageIcon(ImageIO.read(new File("testpic1.jpg")));
		JLabel imag = new JLabel(image);
		temp = imag;
		
		
		frame.setContentPane(imag);
		///frame.pack();
		
		//frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("testpic.jpg")))));
		//frame.;
		}
		catch(Exception e)
		{
			System.out.println("HELLO");
		}
		//frame.pack();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//========================================================================
		JButton btnNewButton = new JButton("New Game");
		JButton btnSave = new JButton("SAVE");
		JButton btnNewButton_1 = new JButton("HELP");
		JButton btnNewButton_2 = new JButton("Quit Game");
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.out.println("NEW GAME!!!");
				//btnSave.setVisible(false);
				
			}
			
		});
		
		JButton btnNewButton_3 = new JButton("TEST");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 6, SpringLayout.SOUTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnSave);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnSave, 0, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnSave, 6, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnSave, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 35, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().setLayout(springLayout);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnSave);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_2);
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel = new JPanel();

		
		panel.setVisible(false);
		
		

		  
//		JPanel ne = new PanelImage("7128-south-park-wallpaper-94376.jpg");
//		panel.paintComponents(null);
		
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -21, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 119, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -26, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("UP");
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -17, SpringLayout.NORTH, btnNewButton_4);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_4, -97, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, -182, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_4, -67, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("LEFT");
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("RIGHT");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_5, -93, SpringLayout.WEST, btnNewButton_6);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_5, -8, SpringLayout.WEST, btnNewButton_6);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_6, -50, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_6, -135, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("DOWN");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_6, -5, SpringLayout.NORTH, btnNewButton_7);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_5, -5, SpringLayout.NORTH, btnNewButton_7);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_7, 0, SpringLayout.EAST, btnNewButton_4);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_7, -182, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_7, -33, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_7, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblKennysQuest = new JLabel("Kenny's Quest");
		lblKennysQuest.setForeground(new Color(128, 128, 0));
		springLayout.putConstraint(SpringLayout.WEST, lblKennysQuest, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblKennysQuest, -1, SpringLayout.NORTH, btnNewButton);
		lblKennysQuest.setFont(new Font("Pristina", Font.BOLD, 24));
		frame.getContentPane().add(lblKennysQuest);
		
		//=======================================================
		try//working on loading a picture here for startup 
		{
		BufferedImage image = ImageIO.read(new File("testpic.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(image));
		 panel.add(picLabel);
		panel.repaint();

		}
		catch(Exception e)
		{
			System.out.println("Failed to load picture");
			panel.setBackground(new Color(103, 245, 34));
		}
		panel.repaint();
		//=======================================================

	}
}


