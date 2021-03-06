/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
package com.epam.ta.reportportal.ws.model.externalsystem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Allowed field value instance class
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class AllowedValue implements Serializable {

	@JsonProperty(value = "valueId")
	private String valueId;

	@JsonProperty(value = "valueName")
	private String valueName;
	
	public AllowedValue() {
	}

	public AllowedValue(String id, String name) {
		this.valueId = id;
		this.valueName = name;
	}

	public void setValueId(String id) {
		this.valueId = id;
	}

	public String getValueId() {
		return valueId;
	}

	public void setValueName(String value) {
		this.valueName = value;
	}

	public String getValueName() {
		return valueName;
	}
}