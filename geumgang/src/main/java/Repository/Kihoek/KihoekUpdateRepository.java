package Repository.Kihoek;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.KihoekDTO.ConceptDTO;


@Repository
public class KihoekUpdateRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "kihoekUpdateMapper";
	
	public int conceptModify(ConceptDTO dto){
    	String statement = namespace + ".conceptModify";
		return sqlSession.update(statement, dto);
		
    }	
}
