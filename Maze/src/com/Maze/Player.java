package com.Maze;

import javax.swing.*;
import java.awt.*;

public class Player {

    private int x , y , tileX , tileY;
    private Image playerImage;
    public Player(){
        tileX = 1;
        tileY = 1;
        x = 32;
        y = 32;
        ImageIcon img = new ImageIcon("/Users/amol/Documents/University/Current/COMP2511/Assignment/Project/Research/Maze/Player.png");
        playerImage = img.getImage();
    }

    public void move(int dx , int dy , int tx , int ty){
        y+= dy;
        x+= dx;

        tileX += tx;
        tileY += ty;


    }

    public Image getPlayerImage() {
        return playerImage;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
         return tileY;
    }
}
