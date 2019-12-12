package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.RecruitDTO;
@Repository
public class RecruitRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "RecruitMapper";

	public Integer recruitInsert(RecruitDTO recruit) {
		Integer result = null;
		String statement = namespace + ".insertRecruit";
		result = sqlSession.insert(statement, recruit);
		return result;
	}

}
