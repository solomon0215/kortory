package Repository.Youngup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.YoungupDTO.ExplorationDTO;

@Repository
public class YoungupInsertRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupInsertMapper";
	
	public Integer insertExplor(List<ExplorationDTO> list) { //신규 업체(여러개) 자기 담당으로 옮기기
		String statement = namespace + ".insertExplor";
		Integer result=0;
		for(ExplorationDTO dto : list) {
			result +=  sqlSession.insert(statement, dto);
		}
		return result;
	}
}
