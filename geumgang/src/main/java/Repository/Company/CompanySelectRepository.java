package Repository.Company;

import java.awt.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanySelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "CompanySelectMapper";
	
	public Integer idConfirm(String userId) {
		String statement = namespace + ".idConfirm";
		String id = sqlSession.selectOne(statement, userId) ;
		if(id != null) {
			return 1;
		}
		return 0;
	}
}
