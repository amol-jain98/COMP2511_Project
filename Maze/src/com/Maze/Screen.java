package com.Maze;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements ActionListener{

    private Timer timer;
    private Map m ;
    private Player p;
    public Screen(){
        m = new Map();
        p = new Player();
        addKeyListener(new A1());
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();

    }

    public void paint(Graphics g){
        super.paint(g);
        for(int y = 0 ; y < 13 ; y++){
            for(int x = 0 ; x < 13 ; x++){
                if(m.getMapValue(y,x) == 0){
                    g.drawImage(m.getGrass(),x*50, y*50, null);
                }else if(m.getMapValue(x,y) == 1){
                    g.drawImage(m.getWall(),x*50, y*50, null);
                }else{
                    g.drawImage(m.getBlock(),x*50, y*50, null);
                }
            }
        }
        g.drawImage(p.getPlayerImage(),p.getTileX()*50 + 10,p.getTileY()*50+10,null);
    }

    public Player getP() {
        return p;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public class A1 extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            int x = p.getTileX();
            int y = p.getTileY();
            if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP){
                if(m.getMapValue(y-1,x) == 0)
                    p.move(0,-50 , 0,-1 );
            }
            if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT){
                if(m.getMapValue(y,x-1) == 0)
                    p.move(-50,0 , -1,0 );
            }
            if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN){
                if(m.getMapValue(y+1,x) == 0)
                    p.move(0,50 , 0,1 );
            }
            if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT){
                if(m.getMapValue(y,x+1) == 0)
                     p.move(50,0 , 1,0 );
            }
            if(p.getTileX() == 11 && p.getTileY()==11){
                Main g = new Main();
            }

        }
        @Override
        public void keyReleased(KeyEvent e){

        }

        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
        }
    }
}

