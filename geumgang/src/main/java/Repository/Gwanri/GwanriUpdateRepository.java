package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.BudgetBillDTO;

@Repository
public class GwanriUpdateRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriUpdateMapper";
	

    /** 게시판 - 수정  */
    public int agreeModify(AgreementConditionDTO dto){
    	String statement = namespace + ".agreeModify";
		return sqlSession.update(statement, dto);
		
    }	

}
