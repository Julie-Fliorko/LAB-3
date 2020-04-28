package ua.lviv.iot.tableware.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.tableware.dataaccess.TablewareRepository;
import ua.lviv.iot.tableware.model.Tableware;

@Service
public class TablewareService {

	@Autowired
	private TablewareRepository tablewareRepository;
	
	public Tableware createTableware(Tableware tablewareObj) {
		return tablewareRepository.save(tablewareObj);
		
	}
	public List<Tableware> findAll() {
		return tablewareRepository.findAll();
	}

	public ResponseEntity<Tableware> findById(Integer id) {
		if (tablewareRepository.findById(id).isPresent()) {
			return new ResponseEntity<>(tablewareRepository.getOne(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	public ResponseEntity<Tableware> updateById(Integer id, Tableware updateTableware) {
		if (tablewareRepository.findById(id).isPresent()) {
			Tableware tablewareObj = tablewareRepository.getOne(id);
			tablewareObj = updateTableware;
			tablewareRepository.save(tablewareObj);

			return new ResponseEntity<>(tablewareObj, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public HttpStatus deleteById(Integer id) {
		if (tablewareRepository.existsById(id)) {
			tablewareRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
}