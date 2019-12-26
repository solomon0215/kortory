package Repository.Kihoek;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import Model.KihoekDTO.ConceptDTO;

@Repository
public class KihoekInsertRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "KihoekInsertMapper";
	
	public Integer insertConcept(Model model) {
		String statement = namespace + ".conceptInsert";
		Integer result = sqlSession.insert(statement, model);
		return result;
	}
}
