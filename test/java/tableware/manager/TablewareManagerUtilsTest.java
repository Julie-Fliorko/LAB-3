package tableware.manager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tableware.model.SortType;

public class TablewareManagerUtilsTest extends BaseTablewareManagerTest {
	
	@Test
	public void testSortingTablewareByColour() {
		TablewareManagerUtils.sortingTablewareByClolour(tableware, SortType.ACS);
		assertEquals("Black", tableware.get(0).getColour());	
		assertEquals("Black", tableware.get(1).getColour());	
		assertEquals("Grey", tableware.get(2).getColour());
		assertEquals("Grey", tableware.get(3).getColour());
		assertEquals("White", tableware.get(4).getColour());
		} 
	
	@Test
	public void testSortingTablewareByPrice() {
		TablewareManagerUtils.sortingTablewareByPrice(tableware, SortType.ACS);
		assertEquals(100.0, tableware.get(0).getPrice(), 99.99);
        assertEquals(200.0, tableware.get(1).getPrice(), 199.99);
        assertEquals(200.0, tableware.get(2).getPrice(), 199.99);
        assertEquals(300.0, tableware.get(3).getPrice(), 299.99);
        assertEquals(300, tableware.get(4).getPrice(), 399.99);
    }
	
	@Test
	public void testSortingByType() {
		TablewareManagerUtils.sortingTablewareByType(tableware, SortType.ACS);
		assertEquals("DrinkingEquipment", tableware.get(0).getTablewareType());
		assertEquals("DrinkingEquipment", tableware.get(1).getTablewareType());
		assertEquals("Knife", tableware.get(2).getTablewareType());
        assertEquals("Plate", tableware.get(3).getTablewareType());
        assertEquals("Plate", tableware.get(4).getTablewareType());       
	}
	
	@Test
	public void testSortingByWeight() {
		TablewareManagerUtils.sortTablewareByWeight(tableware, SortType.ACS);
		assertEquals(300, tableware.get(0).getWeightInGrams());
		assertEquals(300, tableware.get(1).getWeightInGrams());
		assertEquals(350, tableware.get(2).getWeightInGrams());
		assertEquals(360, tableware.get(3).getWeightInGrams());
		assertEquals(390, tableware.get(4).getWeightInGrams());
	}
	}

