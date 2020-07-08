package lifegame;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
    private static Cell[][] cell = new Cell[20][20];
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("地图类测试开始");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("地图类测试结束");
	}
	@Test
	public void testGetAmount() {
		for(int i =0;i<20;i++) 
		{
			for(int j =0;j<20;j++)
			{
				cell[i][j]=new Cell();
       			cell[i][j]=new Cell();
			}
		}
		cell[10][10].setStatus(1);
		cell[10][11].setStatus(1);
		cell[11][10].setStatus(1);
		cell[11][11].setStatus(1);
		Map.getAmount(cell);
	   for(int i =0;i<20;i++) 
	   {
		   for(int j =0;j<20;j++)
	     	{
			 if((i==10&&j==10)||(i==10&&j==11)||(i==11&&j==10)||(i==11&&j==11))
				assertEquals(3,cell[i][j].getAmount());
			 else if((i==9&&j==9)||(i==9&&j==12)||(i==12&&j==9)||(i==12&&j==12))
				 assertEquals(1,cell[i][j].getAmount());
		    }
	   }
	}

	@Test
	public void testUpdata() {
		 Map.updata(cell);
		 for(int i =0;i<20;i++) 
		   {
			   for(int j =0;j<20;j++)
		     	{
				 if((i==10&&j==10)||(i==10&&j==11)||(i==11&&j==10)||(i==11&&j==11))
					assertEquals(1,cell[i][j].getStatus());
				 else 
					 assertEquals(0,cell[i][j].getStatus());
			    }
		   }
	}

}
