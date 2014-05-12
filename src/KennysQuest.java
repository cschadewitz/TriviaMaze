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
import javax.swing.JTextArea;

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
//=====================================================================
		
		
//=====================================================================
		JButton btnNewGame = new JButton("New Game");
		JButton btnSave = new JButton("SAVE");
		JButton btnHelp = new JButton("HELP");
		JButton btnQuitGame = new JButton("Quit Game");
		
		
		btnQuitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.out.println("NEW GAME!!!");
				
				//btnSave.setVisible(false);
				
			}
			
		});
		
		JButton btnTest = new JButton("TEST");
		
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, btnNewGame, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnTest, 6, SpringLayout.SOUTH, btnQuitGame);
		springLayout.putConstraint(SpringLayout.EAST, btnTest, 0, SpringLayout.EAST, btnNewGame);
		springLayout.putConstraint(SpringLayout.NORTH, btnQuitGame, 6, SpringLayout.SOUTH, btnHelp);
		springLayout.putConstraint(SpringLayout.EAST, btnQuitGame, 0, SpringLayout.EAST, btnNewGame);
		springLayout.putConstraint(SpringLayout.NORTH, btnHelp, 6, SpringLayout.SOUTH, btnSave);
		springLayout.putConstraint(SpringLayout.EAST, btnHelp, 0, SpringLayout.EAST, btnNewGame);
		springLayout.putConstraint(SpringLayout.EAST, btnSave, 0, SpringLayout.EAST, btnNewGame);
		springLayout.putConstraint(SpringLayout.WEST, btnTest, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnQuitGame, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnHelp, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnSave, 6, SpringLayout.SOUTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.WEST, btnSave, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewGame, 35, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().setLayout(springLayout);
		frame.getContentPane().add(btnNewGame);
		frame.getContentPane().add(btnSave);
		frame.getContentPane().add(btnHelp);
		frame.getContentPane().add(btnQuitGame);
		frame.getContentPane().add(btnTest);
		
		JPanel panel = new JPanel();
		
		//========================================================================
		// panel.add(picLabel);
		 
		 final JTextArea txtrTest = new JTextArea();
		 
		 txtrTest.setEditable(false);
		 txtrTest.setText("test");
		 txtrTest.setBounds(37, 31, 555, 302);
		 panel.add(txtrTest);
		
		
		//========================================================================

		
		//panel.setVisible(false);
		
		

		  
//		JPanel ne = new PanelImage("7128-south-park-wallpaper-94376.jpg");
//		panel.paintComponents(null);
		
		springLayout.putConstraint(SpringLayout.EAST, btnNewGame, -21, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 119, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -26, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnMoveUp = new JButton("UP");
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -17, SpringLayout.NORTH, btnMoveUp);
		springLayout.putConstraint(SpringLayout.EAST, btnMoveUp, -97, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnMoveUp, -182, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnMoveUp, -67, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnMoveUp);
		
		JButton btnMoveLeft = new JButton("LEFT");
		frame.getContentPane().add(btnMoveLeft);
		
		JButton btnMoveRight = new JButton("RIGHT");
		springLayout.putConstraint(SpringLayout.WEST, btnMoveLeft, -93, SpringLayout.WEST, btnMoveRight);
		springLayout.putConstraint(SpringLayout.EAST, btnMoveLeft, -8, SpringLayout.WEST, btnMoveRight);
		springLayout.putConstraint(SpringLayout.EAST, btnMoveRight, -50, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnMoveRight, -135, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnMoveRight);
		
		JButton btnMoveDown = new JButton("DOWN");
		springLayout.putConstraint(SpringLayout.SOUTH, btnMoveRight, -5, SpringLayout.NORTH, btnMoveDown);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMoveLeft, -5, SpringLayout.NORTH, btnMoveDown);
		springLayout.putConstraint(SpringLayout.EAST, btnMoveDown, 0, SpringLayout.EAST, btnMoveUp);
		springLayout.putConstraint(SpringLayout.WEST, btnMoveDown, -182, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnMoveDown, -33, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnMoveDown, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnMoveDown);
		
		JLabel lblKennysQuest = new JLabel("Kenny's Quest");
		lblKennysQuest.setForeground(new Color(128, 128, 0));
		springLayout.putConstraint(SpringLayout.WEST, lblKennysQuest, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblKennysQuest, -1, SpringLayout.NORTH, btnNewGame);
		lblKennysQuest.setFont(new Font("Pristina", Font.BOLD, 24));
		frame.getContentPane().add(lblKennysQuest);
		
		//=======================================================
		try//working on loading a picture here for startup 
		{
		BufferedImage image = ImageIO.read(new File("testpic.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(image));
//		 panel.add(picLabel);
//		 
//		 JTextArea txtrTest = new JTextArea();
//		 
//		 txtrTest.setEditable(false);
//		 txtrTest.setText("test");
//		 txtrTest.setBounds(37, 31, 555, 302);
//		 panel.add(txtrTest);
		//panel.repaint();

		}
		catch(Exception e)
		{
			System.out.println("Failed to load picture");
			panel.setBackground(new Color(103, 245, 34));
		}
		panel.repaint();
		//=======================================================
		
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("test button still works!!!");	
				
				txtrTest.setText("testwerqerqer");
				
				}
		});

	}
}


