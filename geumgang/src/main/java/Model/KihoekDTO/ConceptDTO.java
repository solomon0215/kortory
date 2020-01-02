package Model.KihoekDTO;

import java.io.Serializable;

public class ConceptDTO implements Serializable{
	Long conceptNum;
	String conceptSubject;
	String conceptHistory;
	String conceptQuarter;
	String conceptPlace;
	Long conceptScale;
	String conceptTargetAge;
	String conceptState;
	String kiHoekNum;
	
	public Long getConceptNum() {
		return conceptNum;
	}
	public void setConceptNum(Long conceptNum) {
		this.conceptNum = conceptNum;
	}
	public String getConceptSubject() {
		return conceptSubject;
	}
	public void setConceptSubject(String conceptSubject) {
		this.conceptSubject = conceptSubject;
	}
	public String getConceptHistory() {
		return conceptHistory;
	}
	public void setConceptHistory(String conceptHistory) {
		this.conceptHistory = conceptHistory;
	}
	public String getConceptQuarter() {
		return conceptQuarter;
	}
	public void setConceptQuarter(String conceptQuarter) {
		this.conceptQuarter = conceptQuarter;
	}
	public String getConceptPlace() {
		return conceptPlace;
	}
	public void setConceptPlace(String conceptPlace) {
		this.conceptPlace = conceptPlace;
	}
	public Long getConceptScale() {
		return conceptScale;
	}
	public void setConceptScale(Long conceptScale) {
		this.conceptScale = conceptScale;
	}
	public String getConceptTargetAge() {
		return conceptTargetAge;
	}
	public void setConceptTargetAge(String conceptTargetAge) {
		this.conceptTargetAge = conceptTargetAge;
	}
	public String getConceptState() {
		return conceptState;
	}
	public void setConceptState(String conceptState) {
		this.conceptState = conceptState;
	}
	public String getKiHoekNum() {
		return kiHoekNum;
	}
	public void setKiHoekNum(String kiHoekNum) {
		this.kiHoekNum = kiHoekNum;
	}
	
}
