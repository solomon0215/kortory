package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;

@Repository
public class GwanriDeleteRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriDeleteMapper";
	
		   /** 게시판 - 삭제  */
    public Integer budgetDelete(BudgetBillDTO dto) {
    	String statement = namespace + ".budgetDelete";
		Integer result = sqlSession.insert(statement, dto);
		return result;
        
       
    }
	

}
