package tableware.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;

import tableware.model.AbstractTableware;
import tableware.model.Bowl;
import tableware.model.Cup;
import tableware.model.Glass;
import tableware.model.HowToWash;
import tableware.model.Knife;
import tableware.model.PlanePlate;

public class BaseTablewareManagerTest {
	protected List<AbstractTableware> tableware;

	@Before
	public void createTaleware() {
		tableware = new LinkedList<AbstractTableware>();
		tableware.add( new Bowl(120, "Minimalism", HowToWash.IN_WASHING_MACHINE, 300, true, "Luminark", "Black", "Soup", "Ceramics", "Plate",  (float) 100, 15, 7));
		tableware.add(new PlanePlate(120, "Minimalism", HowToWash.IN_WASHING_MACHINE, 350, true, "Luminark", "Grey", "Basic", "Ceramics", "Plate",  (float) 200, 15, "Round"));
		tableware.add( new Glass(120, "Minimalism", HowToWash.IN_WASHING_MACHINE, 360, false, "Luminark", "Grey", "Whine", "Ceramics", "DrinkingEquipment",  (float) 300, 15, 7, false, 0));
		tableware.add( new Cup(150, "Minimalism", HowToWash.IN_WASHING_MACHINE, 390, true, "Luminark", "Black", "Tea", "Ceramics", "DrinkingEquipment", (float) 200, "Two-sided"));
		tableware.add( new Knife(80, "Minimalism", HowToWash.IN_WASHING_MACHINE, 300, true, "Luminark", "White", "Tea", "Ceramics", "Knife", (float) 300, "Dessert","Low", 8));
	}
}
