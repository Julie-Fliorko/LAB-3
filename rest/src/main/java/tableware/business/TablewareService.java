package tableware.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tableware.dataccess.TablewareRepository;
import tableware.rest.model.Tableware;

@Service
public class TablewareService {

	@Autowired
	private TablewareRepository tablewareRepository;
	
	public Tableware createTableware(Tableware tablewareObj) {
		return tablewareRepository.save(tablewareObj);
		
	}
}
