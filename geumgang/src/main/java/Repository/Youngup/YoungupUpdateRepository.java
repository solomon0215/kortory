package Repository.Youngup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.YoungupDTO.ExplorationDTO;

public class YoungupUpdateRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupUpdateMapper";
	
	public Integer explorSchedule(ExplorationDTO dto) {
		String statement = namespace + ".scheduleUpdate";
		return sqlSession.update(statement, dto);
	}
}
