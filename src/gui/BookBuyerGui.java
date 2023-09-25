/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author antto
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import agents.BookBuyerAgent;

public class BookBuyerGui extends JFrame {
	private BookBuyerAgent myAgente;
	
	private JTextField titleField;
        private JButton buscarButton;
	
	public BookBuyerGui(BookBuyerAgent e) {
		super(e.getLocalName());
		
		myAgente = e;
		
		JPanel j = new JPanel();
		j.setLayout(new GridLayout(2, 2));
		j.add(new JLabel("Book title:"));
		titleField = new JTextField(15);
		j.add(titleField);
                
		buscarButton= new JButton("Search");
		j.add(buscarButton);
                buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = titleField.getText();
                myAgente.metodoMostrar(nom);
            }
        });
		getContentPane().add(j, BorderLayout.CENTER);
		
		j = new JPanel();
		getContentPane().add(j, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
		    myAgente.doDelete();
		  }
		});
		
		setResizable(false);
	}
	
	public void shoowGui() {
	  pack();
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int centerX = (int)screenSize.getWidth() / 2;
	  int centerY = (int)screenSize.getHeight() / 2;
	  
	  setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
	  super.setVisible(true);
	}
}