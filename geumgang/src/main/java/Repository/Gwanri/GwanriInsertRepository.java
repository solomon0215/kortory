package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.GwanriDTO;

@Repository
public class GwanriInsertRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "GwanriInsertMapper";
	
	public Integer insertMember(GwanriDTO dto) {
		String statement = namespace + ".gwanriInsert";
		Integer result = sqlSession.insert(statement, dto);
		return result;
	}
	/** 게시판 - 등록  */    
    public Integer insertBoard(BudgetBillDTO dto){
    	String statement = namespace + ".insertBoard";
    	Integer result = sqlSession.insert(statement, dto);
		return result;
    	
    }	
}
