package Repository.Youngup;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.YoungupDTO.ExplorationDTO;

@Repository
public class YoungupInsertRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupInsertMapper";
	
	public Integer insertExplor(List<ExplorationDTO> dto) {
		String statement = namespace + ".insertExplor";
		return null;
	}
}
