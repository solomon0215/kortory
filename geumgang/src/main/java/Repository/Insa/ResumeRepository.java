package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.ResumeDTO;
import Model.UserDTO.UserDTO;
@Repository
public class ResumeRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ResumeMapper";
	Integer result = null;

	public Integer resumeInsert1(ResumeDTO resume) { //이력서 1
		
		String statement = namespace + ".insertResume1";
		result = sqlSession.insert(statement,resume);
		return result;
	}

	public Integer resumeInsert2(ResumeDTO resume) { //이력서2
		String statement = namespace + ".insertResume2";
		result = sqlSession.insert(statement,resume);
		return result;
	}

	public Integer updateCheck(String num, String applicant, String name) {
		UserDTO dto = new UserDTO();
		dto.setUserEmail(applicant);
		dto.setUserName(name);
		return result;
		
	}

}
