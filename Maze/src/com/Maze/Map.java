package com.Maze;

import javax.swing.*;
import java.awt.*;

public class Map {
    private int Map[][]  ;
    private Image grass , wall , block;
    public Map(){
        ImageIcon img = new ImageIcon("/Users/amol/Documents/University/Current/COMP2511/Assignment/Project/Research/Maze/Grass.png");
        grass = img.getImage();
        img = new ImageIcon("/Users/amol/Documents/University/Current/COMP2511/Assignment/Project/Research/Maze/Wall.jpg");
        wall = img.getImage();
        img = new ImageIcon("/Users/amol/Documents/University/Current/COMP2511/Assignment/Project/Research/Maze/Block.jpg");
        block = img.getImage();
        readMap();
    }

    public void readMap(){
        Map = new int[][]{
                {1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,2,0,0,0,0,1},
                {1,0,2,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,2,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,2,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,2,0,2,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,2,0,0,0,0,1},
                {1,0,0,2,0,0,0,0,0,0,0,0,1},
                {1,0,0,2,0,0,0,0,0,0,0,0,1},
                {1,0,0,2,0,0,0,0,0,0,0,0,1},
                {1,0,0,2,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
    }

    public int getMapValue(int y , int x){
        return Map[x][y];
    }
    public Image getGrass(){
        return grass;
    }
    public Image getWall(){
        return wall;
    }

    public Image getBlock() {
        return block;
    }
}
