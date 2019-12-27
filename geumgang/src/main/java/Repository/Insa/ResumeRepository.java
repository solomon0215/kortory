package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.ResumeDTO;
@Repository
public class ResumeRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ResumeMapper";

	public Integer resumeInsert1(ResumeDTO resume) {
		Integer result = null;
		String statement = namespace + ".insertResume1";
		result = sqlSession.insert(statement,resume);
		return result;
	}

}
