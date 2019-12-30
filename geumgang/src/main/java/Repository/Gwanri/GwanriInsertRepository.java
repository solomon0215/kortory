package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.ExpagreeDTO;
import Model.GwanriDTO.GwanriDTO;

@Repository
public class GwanriInsertRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriInsertMapper";
		
	/** 협약조건안 게시판 - 등록  */    
    public Integer agreeInsert(ExpagreeDTO dto){
    	String statement = namespace + ".insertAgree";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;    	
    }
    /** 협약조건안 게시판 - 등록  */    
    public Integer expInsert(ExpagreeDTO dto){
    	String statement = namespace + ".insertExp";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;
	
    }
}
