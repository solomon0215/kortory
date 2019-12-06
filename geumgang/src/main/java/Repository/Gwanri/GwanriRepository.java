package Repository.Gwanri;

import org.apache.ibatis.session.SqlSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.GwanriDTO;

@Repository
public class GwanriRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "GwanriSelectMapper";
	
	public GwanriDTO gwanriCheck(GwanriDTO gwanri) {
		String statement =  namespace + ".gwanriCheck";
		return sqlSession.selectOne(statement, gwanri);
	}

}
