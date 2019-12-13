package Repository.Kihoek;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KihoekSelectRepository {
	
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "KihoekSelectMapper";
	
	public Integer logConfirm(String kiHoekId) {
		String statement = namespace + ".logConfirm";
		String id = sqlSession.selectOne(statement, kiHoekId) ;
		if(id != null) {
			return 1;
		}
		return 0;
		
	}		
}
