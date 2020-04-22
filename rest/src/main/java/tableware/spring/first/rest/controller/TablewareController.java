package tableware.spring.first.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tableware.spring.first.rest.model.Tableware;

@RequestMapping(path = "/tableware")
@RestController
public class TablewareController {
	
	static private Map<Integer, Tableware> tableware = new HashMap<>();
	static private AtomicInteger idCounter = new AtomicInteger();
	
	//@Autowired
	//public TablewareService tablewareService;//
	
	@GetMapping
	public List<Tableware> getTableware(){
		return new LinkedList<Tableware>(tableware.values());
	}

	@GetMapping(path = "/{id}")//
	public Tableware getTableware(final @PathVariable("id") Integer id) {
		return tableware.get(id);
	}
	
	@PostMapping(produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
	public Tableware createTableware(final @RequestBody Tableware tablewareObj) {
		//System.out.println(tablewareService.createTableware(tablewareObj)); 
		tablewareObj.setId(idCounter.incrementAndGet());
		tableware.put(tablewareObj.getId(), tablewareObj);
		return tablewareObj;
	}
	
	@DeleteMapping(path = "/{id}")//
	public ResponseEntity<Tableware> deleteTableware(@PathVariable Integer id){
		HttpStatus status = tableware.remove(id)== null ? HttpStatus.NOT_FOUND :  HttpStatus.OK;
		return ResponseEntity.status(status).build();
	}
	
	@PutMapping
	public Tableware  updateTableware(final @PathVariable("id") Integer id, final @RequestBody Tableware tablewareObj ) {
		tablewareObj.setId(id);
		return tableware.put(id, tablewareObj);
		
		}
}
