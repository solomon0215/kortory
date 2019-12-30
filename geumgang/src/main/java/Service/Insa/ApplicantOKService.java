package Service.Insa;

import org.springframework.beans.factory.annotation.Autowired;

import Repository.Insa.ResumeRepository;

public class ApplicantOKService {
	@Autowired
	ResumeRepository resumeRepository;

	public Integer updateCheck(String num, String applicant, String name) {
		Integer result = resumeRepository.updateCheck(num, applicant, name);
		return result;
	}

}
