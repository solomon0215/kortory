package Repository.Gwanri;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GwanriRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "GwanriMapper";

}