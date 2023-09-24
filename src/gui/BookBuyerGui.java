/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author antto
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import agents.BookBuyerAgent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
public class BookBuyerGui extends JFrame {
    private JTextField bookTitleField;
    private JButton searchButton;

    public BookBuyerGui() {
        setTitle("Book Buyer Agent");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel bookTitleLabel = new JLabel("Ingrese el nombre del libro:");
        bookTitleField = new JTextField(20);
        searchButton = new JButton("Buscar");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookTitle = bookTitleField.getText();
            }
        });

        panel.add(bookTitleLabel);
        panel.add(bookTitleField);
        panel.add(searchButton);

        getContentPane().add(panel);
        setVisible(true);
    }

}
