package com.Maze;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maze extends JFrame implements ActionListener{
    public static Maze game;
    public Screen screen;
    JFrame frame;
    public static String title = "MazeGame by Amol";
    public static int width = 650;
    public static int length = 675;

    public Maze(){
        frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(width,length);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
//        JButton but1  = new JButton("Refresh Maze");
//        JPanel Panel1 = new JPanel();
//        Panel1.setBackground(Color.black);
//        Panel1.add(but1);
//        but1.addActionListener(this);
//        frame.add(Panel1, BorderLayout.PAGE_START);

        screen = new Screen();
        screen.setBackground(Color.black);
        JButton but1 = new JButton("Refresh");
        but1.setBounds(30,20 , 30 ,10);

        frame.add(but1);
        frame.add(screen, BorderLayout.CENTER);
        frame.setLocationRelativeTo(screen);

        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
