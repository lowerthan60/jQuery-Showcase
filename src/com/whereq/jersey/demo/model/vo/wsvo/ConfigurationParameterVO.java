package com.whereq.jersey.demo.model.vo.wsvo;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "configurationParameter")
public class ConfigurationParameterVO implements Identifiable {

	Long id;
	String category;
	String property;
	String value;
	String updateable;
	
	public ConfigurationParameterVO() {
	}

	@JsonCreator
	public ConfigurationParameterVO(String input) {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUpdateable() {
		return updateable;
	}

	public void setUpdateable(String updateable) {
		this.updateable = updateable;
	}
}
