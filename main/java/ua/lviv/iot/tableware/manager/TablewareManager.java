package ua.lviv.iot.tableware.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.tableware.model.AbstractTableware;
import ua.lviv.iot.tableware.model.SortType;
import ua.lviv.iot.tableware.model.TablewareType;

public class TablewareManager {

	public static List<AbstractTableware> goods = new LinkedList<AbstractTableware>();

	public void addTableware(List<AbstractTableware> tableware) {
		TablewareManager.goods.addAll(goods);
	}

	public void addTablewares(List<AbstractTableware> tableware) {
		TablewareManager.goods.addAll(tableware);
	}

	public List<AbstractTableware> findTablewareBy(TablewareType type) {
		List<AbstractTableware> cartItems = new LinkedList<AbstractTableware>();
		for (AbstractTableware tableware : goods) {
			if (tableware.getTablewareType() == type)
				cartItems.add(tableware);
		}
		return cartItems;
	}

	public void sortTablewareByPriceDESC(List<AbstractTableware> plate, SortType desc) {
		// TODO Auto-generated method stub

	}

	public void sortTablewareByPriceASC(List<AbstractTableware> plate, SortType asc) {
		// TODO Auto-generated method stub

	}

	public static List<AbstractTableware> findGoodsBy(TablewareType type) {
		List<AbstractTableware> foundItems = new LinkedList<AbstractTableware>();
		for (AbstractTableware good : goods) {
			if (good.getTablewareType() == type) {
				foundItems.add(good);
			}
		}
		return goods;

	}
}