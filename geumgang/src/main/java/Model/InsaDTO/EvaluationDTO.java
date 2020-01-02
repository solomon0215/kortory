package Model.InsaDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EvaluationDTO implements Serializable {
	private Integer evalNum;
	private Integer conNum;
	private Integer achive;
	private Integer quality;
	private Integer improve;
	private Integer knowledge;
	private Integer creativity;
	private Integer judgement;
	private Integer practical;
	private Integer responsibility;
	private Integer coop;
	private Integer atti;
	private Integer dili;
	private String graduate;
	private String inSaNum;
	
	public EvaluationDTO() {}

	public EvaluationDTO(Integer evalNum, Integer conNum, Integer achive, Integer quality, Integer improve,
			Integer knowledge, Integer creativity, Integer judgement, Integer practical, Integer responsibility,
			Integer coop, Integer atti, Integer dili, String graduate, String inSaNum) {
		super();
		this.evalNum = evalNum;
		this.conNum = conNum;
		this.achive = achive;
		this.quality = quality;
		this.improve = improve;
		this.knowledge = knowledge;
		this.creativity = creativity;
		this.judgement = judgement;
		this.practical = practical;
		this.responsibility = responsibility;
		this.coop = coop;
		this.atti = atti;
		this.dili = dili;
		this.graduate = graduate;
		this.inSaNum = inSaNum;
	}

	public Integer getEvalNum() {
		return evalNum;
	}

	public void setEvalNum(Integer evalNum) {
		this.evalNum = evalNum;
	}

	public Integer getConNum() {
		return conNum;
	}

	public void setConNum(Integer conNum) {
		this.conNum = conNum;
	}

	public Integer getAchive() {
		return achive;
	}

	public void setAchive(Integer achive) {
		this.achive = achive;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public Integer getImprove() {
		return improve;
	}

	public void setImprove(Integer improve) {
		this.improve = improve;
	}

	public Integer getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Integer knowledge) {
		this.knowledge = knowledge;
	}

	public Integer getCreativity() {
		return creativity;
	}

	public void setCreativity(Integer creativity) {
		this.creativity = creativity;
	}

	public Integer getJudgement() {
		return judgement;
	}

	public void setJudgement(Integer judgement) {
		this.judgement = judgement;
	}

	public Integer getPractical() {
		return practical;
	}

	public void setPractical(Integer practical) {
		this.practical = practical;
	}

	public Integer getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(Integer responsibility) {
		this.responsibility = responsibility;
	}

	public Integer getCoop() {
		return coop;
	}

	public void setCoop(Integer coop) {
		this.coop = coop;
	}

	public Integer getAtti() {
		return atti;
	}

	public void setAtti(Integer atti) {
		this.atti = atti;
	}

	public Integer getDili() {
		return dili;
	}

	public void setDili(Integer dili) {
		this.dili = dili;
	}

	public String getGraduate() {
		return graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public String getInSaNum() {
		return inSaNum;
	}

	public void setInSaNum(String inSaNum) {
		this.inSaNum = inSaNum;
	}
	
	
	

}
