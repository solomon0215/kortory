package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.EvaluationDTO;

@Repository
public class EvaluationRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "evaluationMapper";
	
	public Integer evaluationInsert(EvaluationDTO dto) {
		Integer result = null;
		String statement = namespace + ".insertEvaluation";
		return sqlSession.insert(statement, dto);
	}

}
