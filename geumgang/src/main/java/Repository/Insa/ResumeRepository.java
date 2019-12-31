package Repository.Insa;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.*;
import Model.UserDTO.*;
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

	public List<ApplicantDTO> resumeAllSelect() {
		String statement = namespace + ".resumeAllSelect";
		List<ApplicantDTO> list = sqlSession.selectList(statement);
		return list;
	}

	public ResumeDTO resumeDetail(ResumeDTO dto) {
		String statement = namespace + ".resumeDetail";
		return sqlSession.selectOne(statement,dto);
	}

	public String findMemberId(Integer resumeNum) {
		String statement = namespace + ".findMemberId";
		return sqlSession.selectOne(statement, resumeNum);
	}

	public String findMemberEmail(UserDTO dto) {
		String statement = namespace + ".findMemberEmail";
		return sqlSession.selectOne(statement, dto);
	}

}
