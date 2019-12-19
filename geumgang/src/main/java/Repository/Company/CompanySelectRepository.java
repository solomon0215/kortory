package Repository.Company;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Command.Company.CompanyLogCommand;
import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;

@Repository
public class CompanySelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "companySelectMapper";
	
	public Integer idConfirm(String userId) {//중복확인
		String statement = namespace + ".idConfirm";
		String id = sqlSession.selectOne(statement, userId) ;
		if(id != null) {
			return 1;
		}
		return 0;
	}
	public CompanyDTO comlogin(CompanyDTO dto1) { //업체 로그인 하기 
		String statement = namespace + ".companyLogin";
		return sqlSession.selectOne(statement, dto1);
	}
	
	public List<CompanyDTO> selectNewCom(List<ExplorListDTO> expList){//신규업체 불러오기
		String statement = namespace + ".newComList";
		Map< String, Object> param = new HashMap<String, Object>();
		param.put("exp",expList);
		return sqlSession.selectList(statement, param);
	}
}
