package Repository.Company;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.CompanyDTO.CompanyDTO;

@Repository
public class CompanyInsertRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "companyInsertMapper";
	
	//Company(업체등록신청서) 테이블 인설트
	public Integer companyInsert(CompanyDTO dto) {
		String statement = namespace + ".companyInsert";
		return sqlSession.insert(statement, dto);
	}
}
