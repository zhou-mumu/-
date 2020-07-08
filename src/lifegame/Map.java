package lifegame;

import java.util.Random;

import lifegame.Cell;

/*ÆåÅÌÀà*/
public class Map {
       private static int height = 20;
       private static int weight = 20;
       public static Cell[][] initial(){ //³õÊ¼»¯Ï¸°û
    	   Cell[][] cell = new Cell[height][weight];
    	   for(int i=0;i<height;i++) {
       		for(int j=0;j<weight;j++) {
       			cell[i][j]=new Cell();
       			cell[i][j]=new Cell();
    			Random random=new Random();
    			cell[i][j].setStatus(random.nextInt(2));
       		}
       }
       return cell; 	   
    }
       public static void getAmount(Cell[][] cell) {
    	   for(int i = 0;i<height;i++) {
    		   for(int j = 0;j<weight;j++) {
    			   int num = 0;
    			   if(i>0&&j>0) num+=cell[i-1][j-1].getStatus();
       			if(i>0) num+=cell[i-1][j].getStatus();
       			if(j>0) num+=cell[i][j-1].getStatus();
       			if(i<height-1&&j<weight-1) num+=cell[i+1][j+1].getStatus();
       			if(i<height-1) num+=cell[i+1][j].getStatus();
       			if(j<weight-1) num+=cell[i][j+1].getStatus();
       			if(i<height-1&&j>0) num+=cell[i+1][j-1].getStatus();
       			if(i>0&&j<weight-1) num+=cell[i-1][j+1].getStatus();
       			cell[i][j].setAmount(num);
    		   }
    	   }
       }
       public static int updata(Cell [][]cell) {
    	   int count=0;
       	for(int i=0;i<weight;i++) {
       		for(int j=0;j<height;j++) {
       			int status=cell[i][j].getStatus();
       			cell[i][j].updateStatus();
       			if(status==cell[i][j].getStatus()) 
       				count++;
       		}
       	}
       	return count;
       }
       public static void printMap(Cell [][]cell) {
       	for(int i=0;i<weight;i++) {
       		for(int j=0;j<height;j++) {
       			System.out.print(cell[i][j].getStatus()+" ");
       		}
       		System.out.println();
       	}
       }
}