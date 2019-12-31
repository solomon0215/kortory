package Model.InsaDTO;

import java.io.Serializable;

import Model.UserDTO.*;
@SuppressWarnings("serial")
public class ApplicantDTO implements Serializable {
	ResumeDTO resumeDTO;
	UserDTO userDTO;
	public ResumeDTO getResumeDTO() {
		return resumeDTO;
	}
	public void setResumeDTO(ResumeDTO resumeDTO) {
		this.resumeDTO = resumeDTO;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
}
