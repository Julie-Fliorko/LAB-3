package ua.lviv.iot.tableware.controller;

import java.util.HashMap;
//import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.tableware.business.TablewareService;
import ua.lviv.iot.tableware.model.Tableware;


@RequestMapping("/tableware")
@RestController
public class TablewareController {
	@Autowired
	private TablewareService tablewareService;

	@GetMapping
	public List<Tableware> getTablewares() {
		return tablewareService.findAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Tableware> getTableware(final @PathVariable("id") Integer id) {
		return tablewareService.findById(id);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })

	public Tableware createTableware(@RequestBody Tableware tablewareObj) {
		tablewareService.createTableware(tablewareObj);
		return tablewareObj;
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Tableware> deleteById(@PathVariable("id") Integer tablewareObj) {
		HttpStatus status = tablewareService.deleteById(tablewareObj);
		return ResponseEntity.status(status).build();
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Tableware> updateTableware(final @PathVariable("id") Integer id,
			final @RequestBody Tableware tablewareObj) {
		tablewareObj.setId(id);
		return tablewareService.updateById(id, tablewareObj);

	}
}
