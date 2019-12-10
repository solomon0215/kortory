package Repository.Gwanri;

import java.util.List;

import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.GwanriDTO;

@Repository
public class GwanriSelectRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "GwanriSelectMapper";
	
	public Integer idConfirm(String gwanRiId) {
		String statement = namespace + ".idConfirm";
		String id = sqlSession.selectOne(statement, gwanRiId) ;
		if(id != null) {
			return 1;
		}
		return 0;
		
	}		
	
	/** 예산안 보고서 게시판 - 목록 조회  */
    public List<BudgetBillDTO> boardList(BudgetBillDTO dto){
    	String statement =  namespace + ".boardList";
		return sqlSession.selectList(statement, dto);
    }
    /** 예산안 보고서 게시판 - 상세 조회  */
    public BudgetBillDTO boardDetail(BudgetBillDTO dto){   
    	String statement =  namespace + ".boardDetail";
        return sqlSession.selectOne(statement, dto);
    }
}
	


