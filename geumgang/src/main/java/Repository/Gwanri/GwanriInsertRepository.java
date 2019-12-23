package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.GwanriDTO;

@Repository
public class GwanriInsertRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriInsertMapper";
		
	/** 협약조건안 게시판 - 등록  */    
    public Integer agreeInsert(AgreementConditionDTO dto){
    	System.out.println(dto.getGwanRiNum());
    	System.out.println(dto.getAgreementConditionRatio());
    	System.out.println(dto.getAgreementConditionDate());
    	System.out.println(dto.getAgreementConditionSett());
    	String statement = namespace + ".insertAgreement";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;
    	
    }
	
}
