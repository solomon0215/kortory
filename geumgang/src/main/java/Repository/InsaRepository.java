package Repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class InsaRepository {
	@Autowired
	private SqlSession sqlSession;
	
}
