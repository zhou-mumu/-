package lifegame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {
    GUI(){
    	JFrame jframe = new JFrame();
    	jframe.setSize(500,500);
    	JPanel jpanel = new JPanel();
    	jpanel.setBackground(Color.cyan);
    	jpanel.setBounds(0,0,500,500);
    	int num = 0;
    	Cell[][]cell = new Cell[25][25];
    	cell = Map.initial();
    	Map.getAmount(cell);
    	jframe.setTitle("生命游戏");
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jframe.setLocationRelativeTo(null);
    	jframe.add(jpanel);
    	jframe.setVisible(true);
    	Graphics g=jpanel.getGraphics();
    	for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++) {
    			g.drawRect(i*25, j*25, 25, 25);//左上角定点，矩形长宽
    		}
    	}
    	for(int i=0;i<16;i++) {
    		for(int j=0;j<16;j++) {
    			if(cell[i][j].getStatus()==1) {
    				g.fillRect(i*25, j*25, 25, 25);//填充矩形
    			}
    			else {
    				g.drawRect(i*25, j*25, 25, 25);
    			}
    		}
    	}
    	long t1 = System.currentTimeMillis();
    	while(true) {
    		long t2 = System.currentTimeMillis();
    		if(t2-t1>5000){
    			int change;
    			t1=t2;
    			jframe.repaint();
    			change = Map.updata(cell);
    			Map.getAmount(cell);
    			for(int i=0;i<16;i++) {
    				for(int j=0;j<16;j++) {
    					g.drawRect(i*25, j*25, 25, 25);
    				}
    			}
    			for(int i=0;i<16;i++) {
    				for(int j=0;j<16;j++) {
    					if(cell[i][j].getStatus()==1) {
    	    				g.fillRect(i*25, j*25, 25, 25);
    	    			}
    	    			else {
    	    				g.drawRect(i*25, j*25, 25, 25);
    		}
    	}
    }
    			 num++;
     		    jframe.setTitle("生命游戏");
     			if(change==16*16) break;
     			if(num>1000) break;
     	    }	    	
       }
     }
 }