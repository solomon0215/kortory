package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;

@Repository
public class GwanriUpdateRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriUpdateMapper";
	
	 /** 게시판 - 조회 수 수정  */
    public Integer updateBoardHits(BudgetBillDTO dto){
    	String statement = namespace + ".updateBoardHits";
		Integer result = sqlSession.update(statement, dto);
		return result;
    }
    /** 게시판 - 수정  */
    public Integer updateBoard(BudgetBillDTO dto){
    	String statement = namespace + ".updateBoard";
		Integer result = sqlSession.update(statement, dto);
		return result;
    }
	

}
