package tableware.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import tableware.model.AbstractTableware;
import tableware.model.SortType;

public class TablewareManagerUtils {

//inner class ( colour )
	public class SortingTablewareByColour implements Comparator<AbstractTableware> {

		@Override
		public int compare(AbstractTableware firstItem, AbstractTableware secondItem) {
			return firstItem.getColour().compareTo(secondItem.getColour());
		}

	}

	public final static SortingTablewareByColour SORTING_TABLEWARE_BY_COLOUR = new TablewareManagerUtils().new SortingTablewareByColour();

	public static void sortingTablewareByClolour(List<AbstractTableware> tableware, SortType sortType) {
		tableware.sort(sortType == SortType.ACS ? SORTING_TABLEWARE_BY_COLOUR : SORTING_TABLEWARE_BY_COLOUR.reversed());
	}

//static inner class ( price )
	private static class SortingTablewareByPrice implements Comparator<AbstractTableware>, Serializable {
		//private static final long serialVersionUID = 1L;


		private static final long serialVersionUID = 1L;

		@Override
		public int compare(AbstractTableware firstItem, AbstractTableware secondItem) {
			return (int) (firstItem.getPrice() - secondItem.getPrice());
		}
	}
	private static SortingTablewareByPrice SORTING_TABLEWARE_BY_PRICE = new SortingTablewareByPrice();
	public static void sortingTablewareByPrice(List<AbstractTableware> tableware, SortType sortType){
		tableware.sort(sortType == SortType.ACS ? SORTING_TABLEWARE_BY_PRICE : SORTING_TABLEWARE_BY_PRICE.reversed());} 

	//anonymous inner class
	public static void sortingTablewareByType(List <AbstractTableware> tableware, SortType sortType) {
	Comparator<AbstractTableware> comparator = new Comparator<AbstractTableware>() {

		@Override
		public int compare(AbstractTableware firstItem, AbstractTableware secondItem) {
			return firstItem.getTablewareType().compareTo(secondItem.getTablewareType());//
		}
	};
	tableware.sort(sortType == SortType.ACS ? comparator : comparator.reversed());}
	
//sorting with lambda expressions ( by weight )
		public static void sortTablewareByWeight(List<AbstractTableware> goods, SortType sortType) {
			if (sortType == SortType.ACS) {
				goods.sort((firstItem, secondItem) -> firstItem.getWeightInGrams() - secondItem.getWeightInGrams());
			} else {
				goods.sort((firstItem, secondItem) -> secondItem.getWeightInGrams() - firstItem.getWeightInGrams());
			}
		}

}
