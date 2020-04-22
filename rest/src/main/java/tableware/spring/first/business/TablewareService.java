package tableware.spring.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tableware.spring.first.dataaccess.TablewareRepository;
import tableware.spring.first.rest.model.Tableware;

@Service
public class TablewareService {

	@Autowired
	private TablewareRepository tablewareRepository;
	
	public Tableware createTableware(Tableware tablewareObj) {
		return tablewareRepository.save(tablewareObj);
		
	}
}