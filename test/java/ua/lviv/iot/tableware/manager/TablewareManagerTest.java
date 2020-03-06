package ua.lviv.iot.tableware.manager;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.tableware.manager.TablewareManager;
import ua.lviv.iot.tableware.model.*;

class TablewareManagerTest extends BaseTablewareManagerTest {

	private TablewareManager tablewareManager;

	@BeforeEach
	public void setUp() {
		tablewareManager = new TablewareManager();
		tablewareManager.addTableware(plate);
	}

	@Test
	void testSortingAscending() {
		tablewareManager.sortTablewareByPriceASC(plate, SortType.ASCENDING);
	}

	@Test
	void testSortingDescending() {
		tablewareManager.sortTablewareByPriceDESC(plate, SortType.DESCENDING);
	}
	@Test
	void testFindGoodsByType() {
		List<AbstractTableware> foundGoods = TablewareManager.findGoodsBy(TablewareType.PLATE);
		assertEquals(null, plate.get(0).getTablewareType());
	}
}
