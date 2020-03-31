package tableware.manager;

import java.util.LinkedList;
import java.util.List;
import tableware.model.AbstractTableware;

public class TablewareManager {
public List<AbstractTableware> tableware = new LinkedList<AbstractTableware>();

protected void addTableware(List<AbstractTableware> cart) {
	this.tableware.addAll(cart);
}

protected void addSingleItem(AbstractTableware item) {
	this.tableware.add(item);
}

public List<AbstractTableware> findTablewareBy(String tablewareType) {
	List<AbstractTableware> result = new LinkedList<AbstractTableware>();

	for (int itemFromTheList = 0; itemFromTheList < tableware.size(); itemFromTheList++) {

		if (tableware.get(itemFromTheList).getTablewareType().equals(tablewareType)) {
			result.add(tableware.get(itemFromTheList));
			System.out.println("#" + (itemFromTheList + 1) + " matching the criteria" + " with tableware type "
					+ tableware.get(itemFromTheList).getTablewareType());

		} else {
			System.out.println(" #" + (itemFromTheList + 1) + " does not match the criteria");
		}
	}
	return result;

}
}

