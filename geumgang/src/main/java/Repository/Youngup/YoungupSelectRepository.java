package Repository.Youngup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Model.YoungupDTO.YoungupDTO;

@Repository
public class YoungupSelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupSelectMapper";
	
	public YoungupDTO youngupLog( YoungupDTO dto1) { //로그인 
		String statement = namespace + ".youngupLog";
		return sqlSession.selectOne(statement, dto1);
	}
	
	public List<ExplorListDTO> selectExplorList(){ //모든  종류의 사전답사 보고서
		String statement = namespace + ".explorList";
		return sqlSession.selectList(statement);
	}
	
	public List<ExplorListDTO> selectKindExp(ExplorListDTO dto){ //신규 담당 업체  사전답사 보고서 가져오기
		String statement = namespace + ".kindExp";
		return sqlSession.selectList(statement, dto);
	}
	
	public ExplorListDTO selectExpDetail(ExplorationDTO dto) {//보고서 번호로 하나만 가져오기
		String statement = namespace + ".expDetail";
		return sqlSession.selectOne(statement,dto);
	}
}
