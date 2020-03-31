package tableware.manager;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TablewareManagerTest extends BaseTablewareManagerTest{

	
private TablewareManager tablewareManager;
	
@Before //same as BeforeEach
public void setUp() {
	tablewareManager = new TablewareManager();
	tablewareManager.addTableware(tableware);
}

@Test
public void testFindTablewareByType() {
	String tablewareType = "Plate";
	tableware = tablewareManager.findTablewareBy(tablewareType );
		assertEquals("Plate", tableware.get(0).getTablewareType());
		assertEquals("Plate", tableware.get(1).getTablewareType());
		assertEquals(2, tableware.size());
}
}
