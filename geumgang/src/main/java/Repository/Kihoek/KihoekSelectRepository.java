package Repository.Kihoek;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.KihoekDTO.ConceptDTO;
import Model.KihoekDTO.CoopComDTO;
import Model.KihoekDTO.KihoekDTO;

@Repository
public class KihoekSelectRepository {
	
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "KihoekSelectMapper";
	
	public KihoekDTO logConfirm(KihoekDTO kDto) {
		String statement = namespace + ".logConfirm";
		return sqlSession.selectOne(statement, kDto);
	}
	
	public List<ConceptDTO> conceptAllList(){ 
		String statement = namespace + ".conceptAllList";
		List<ConceptDTO> list = sqlSession.selectList(statement);
		return list;
	}
	
	public ConceptDTO conceptDetail(ConceptDTO dto){ 
		String statement =  namespace + ".conceptDetail";
		return sqlSession.selectOne(statement, dto);
	}
	
	public List<ConceptDTO> stateSelect(ConceptDTO dto){ 
		String statement = namespace + ".conceptState";
		return sqlSession.selectList(statement, dto);
	}
	
	public List<CoopComDTO> tourPlaceSelect(CoopComDTO ccDto) {
		String statement = namespace + ".tourPlaceSelect";
		return sqlSession.selectList(statement, ccDto);
	}
}
