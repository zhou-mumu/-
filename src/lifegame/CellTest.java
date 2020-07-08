package lifegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CellTest {
   private static Cell cell = new Cell();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Ï¸°ûÀà²âÊÔ¿ªÊ¼");  
	}

	@Before
	public void setUp() throws Exception {
		cell.clear();
	}

	@Test
	public void testUpdateStatus() {
		cell.setStatus(0);
		cell.setAmount(3);
		cell.updateStatus();
		assertEquals(1,cell.getStatus());
	}

	@Test
	public void testUpdateStatus2() {
		cell.setStatus(1);
		cell.setAmount(2);
		cell.updateStatus(); 
		assertEquals(1,cell.getStatus());
	}
	
	@Test
	public void testUpdateStatus3() {
		cell.setStatus(1);
		cell.setAmount(5);
		cell.updateStatus();
		assertEquals(0,cell.getStatus());
	}
}
