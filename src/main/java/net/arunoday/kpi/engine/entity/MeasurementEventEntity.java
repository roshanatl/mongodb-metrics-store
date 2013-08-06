/**
 * 
 */
package net.arunoday.kpi.engine.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Measurement Event Entity.
 * 
 * @author Aparna
 * 
 */
@Document(collection = "measurement")
public class MeasurementEventEntity {

	@Id
	private String id;
	private Date occuredOn;
	private String name;
	private ContextData contextData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getOccuredOn() {
		return occuredOn;
	}

	public void setOccuredOn(Date occuredOn) {
		this.occuredOn = occuredOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContextData getContextData() {
		return contextData;
	}

	public void setContextData(ContextData contextData) {
		this.contextData = contextData;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !getClass().equals(obj.getClass())) {
			return false;
		}
		MeasurementEventEntity that = (MeasurementEventEntity) obj;
		return this.getId().equals(that.getId());
	}

	@Override
	public int hashCode() {

		return getId().hashCode();
	}

	@Override
	public String toString() {
		return "MeasurementEventEntity [id=" + id + ", occuredOn=" + occuredOn + ", name=" + name + ", contextData="
				+ contextData + "]";
	}

}
