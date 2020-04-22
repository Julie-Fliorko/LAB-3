package tableware.rest.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tableware {
	private String tablewareType;
	private String tablewareStyle;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;

	public Tableware() {}
	
	public Tableware(String tablewareType, String tablewareStyle, Integer id) {
		this.tablewareType = tablewareType;
		this.tablewareStyle = tablewareStyle;
		this.id = id;
	}

	public String getTablewareType() {
		return tablewareType;
	}

	public void setTablewareType(String tablewareType) {
		this.tablewareType = tablewareType;
	}

	public String getTablewareStyle() {
		return tablewareStyle;
	}

	public void setTablewareStyle(String tablewareStyle) {
		this.tablewareStyle = tablewareStyle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
