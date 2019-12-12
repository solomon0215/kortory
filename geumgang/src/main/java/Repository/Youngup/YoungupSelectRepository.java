package Repository.Youngup;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.YoungupDTO.YoungupDTO;

@Repository
public class YoungupSelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupSelectMapper";
	
	public YoungupDTO youngupLog( YoungupDTO dto1) {
		String statement = namespace + ".youngupLog";
		return sqlSession.selectOne(statement, dto1);
	}
}
