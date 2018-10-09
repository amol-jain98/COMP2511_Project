package com.Maze;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener {

    private JFrame homeFrame;
    public Main() {
        homeFrame = new JFrame("MazaGame By Amol");
        homeFrame.setSize(500, 500);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        JLabel background = new JLabel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.ipady = 50;

        JButton playButton = new JButton("Play");
        JButton helpButton = new JButton("Help");
        JButton optionButton = new JButton("Options");
        playButton.addActionListener(this);
        playButton.setBounds(150, 200, 200, 50);
        homeFrame.add(playButton);

        helpButton.setBounds(150, 270, 200, 50);
        homeFrame.add(helpButton);

        optionButton.setBounds(150, 340, 200, 50);
        homeFrame.add(optionButton);

        background.setBounds(0, -20, 500, 500);
        homeFrame.add(background);
        homeFrame.setResizable(false);

        homeFrame.setVisible(true);
    }

    public static void main(String[] args){
        Main g = new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Play")){
            homeFrame.setVisible(false);
            Maze g = new Maze();

        }
    }
}
