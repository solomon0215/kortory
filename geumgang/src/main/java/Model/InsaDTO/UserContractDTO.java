package Model.InsaDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserContractDTO implements Serializable {
	ApplicantDTO applicantDTO;
	ContractDTO contractDTO;
	public ApplicantDTO getApplicantDTO() {
		return applicantDTO;
	}
	public void setApplicantDTO(ApplicantDTO applicantDTO) {
		this.applicantDTO = applicantDTO;
	}
	public ContractDTO getContractDTO() {
		return contractDTO;
	}
	public void setContractDTO(ContractDTO contractDTO) {
		this.contractDTO = contractDTO;
	}
	
	
}
