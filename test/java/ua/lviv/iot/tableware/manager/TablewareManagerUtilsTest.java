package ua.lviv.iot.tableware.manager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.lviv.iot.tableware.model.SortType;

public class TablewareManagerUtilsTest extends BaseTablewareManagerTest  {
	
	@BeforeEach
	public void setUp() {
		
	}
	
	@Test
	public void testSortingDescending() {
		TablewareManagerUtils.SortTablewareByPrice(plate, SortType.DESCENDING);;
		assertEquals(540, plate.get(0).priceInUAH());
        assertEquals(450, plate.get(1).priceInUAH());
        assertEquals(390, plate.get(2).priceInUAH());
        assertEquals(260, plate.get(3).priceInUAH());
	}
}
