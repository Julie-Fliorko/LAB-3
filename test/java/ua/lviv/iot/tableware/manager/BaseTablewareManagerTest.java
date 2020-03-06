package ua.lviv.iot.tableware.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.tableware.model.AbstractPlate;
import ua.lviv.iot.tableware.model.TablewareType;
import ua.lviv.iot.tableware.model.AbstractTableware;
import ua.lviv.iot.tableware.model.HowToWash;


public abstract class BaseTablewareManagerTest {

	public List <AbstractTableware> plate;
	public void createPlate() {
		plate = new LinkedList<AbstractTableware>();
		plate.add(new AbstractPlate(90, 100, 0, "modern", HowToWash.LIGHT_HAND_WASH, 150, false, "cersanit", "white", "salads", "ceramics",0, TablewareType.PLATE));
		plate.add(new AbstractPlate(14, 150, 0, "minimalism", HowToWash.DISHWASHER, 150, true, "cersanit", "black", null, "ceramics", 0, TablewareType.PLATE));
	}
}