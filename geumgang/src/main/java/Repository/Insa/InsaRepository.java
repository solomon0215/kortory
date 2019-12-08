package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.InsaDTO;
@Repository
public class InsaRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "InsaMapper";

	public InsaDTO userCheck(InsaDTO insa) {
		String statement = namespace + ".insaCheck";
				return sqlSession.selectOne(statement, insa);
	}
	
	
	
}
