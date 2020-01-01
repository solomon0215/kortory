package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.CoopContractDTO;

@Repository
public class GwanriUpdateRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriUpdateMapper";
	
	

    /** 게시판 - 수정  */
    public int coopModify(CoopContractDTO dto){
    	String statement = namespace + ".coopModify";
		return sqlSession.update(statement, dto);
		
    }	

}
