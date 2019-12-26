package Repository.Youngup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.YoungupDTO.ExplorationDTO;

public class YoungupUpdateRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupUpdateMapper";
	
	public Integer explorSchedule(ExplorationDTO dto) {//방문일 정하기 또는 수정 
		String statement = namespace + ".scheduleUpdate";
		return sqlSession.update(statement, dto);
	}
	public Integer explorUpdate(ExplorationDTO dto) { //작성후 제출 또는 임시 보관
		String statement = namespace + ".explorUpdate";
		return sqlSession.update(statement, dto);
	}
}
