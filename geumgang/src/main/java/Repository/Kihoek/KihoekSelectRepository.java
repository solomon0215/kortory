package Repository.Kihoek;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.KihoekDTO.KihoekDTO;

@Repository
public class KihoekSelectRepository {
	
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "KihoekSelectMapper";
	
	public KihoekDTO logConfirm(KihoekDTO kDto) {
		String statement = namespace + ".logConfirm";
		return sqlSession.selectOne(statement, kDto) ;
	}
}
