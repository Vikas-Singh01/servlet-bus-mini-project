package servlet_bus_project.dto;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus 
{	
	@Id
	private	int busId;
	private String busName;
	private String busSource;
	private String busDestination;
	private Date busDate;
	
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busSource=" + busSource + ", busDestination="
				+ busDestination + ", busDate=" + busDate + "]";
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusSource() {
		return busSource;
	}
	public void setBusSource(String busSource) {
		this.busSource = busSource;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public Date getBusDate() {
		return busDate;
	}
	public void setBusDate(Date busDate) {
		this.busDate = busDate;
	}
	
	
}
