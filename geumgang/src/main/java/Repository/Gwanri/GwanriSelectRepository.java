package Repository.Gwanri;

import java.util.List;



import org.apache.ibatis.session.SqlSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.GwanriDTO;
import Model.InsaDTO.RecruitDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;

@Repository
public class GwanriSelectRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriSelectMapper";
	
	public GwanriDTO gwanriLog(GwanriDTO dto) { 
		String statement = namespace + ".gwanriLog";
		GwanriDTO result = sqlSession.selectOne(statement, dto); 
		
		return result;
	}	
	/** 예산안 보고서 게시판 - 리스트  */
    public List<BudgetBillDTO> budgetAllSelect() {
    	String statement =  namespace + ".budgetList";
    	List<BudgetBillDTO> list = sqlSession.selectList(statement);
		return list;
    }
	/** 예산안 보고서 게시판 - 디테일  */
    public BudgetBillDTO budgetDetail(BudgetBillDTO dto){ 
    	String statement =  namespace + ".budgetDetail";
        return sqlSession.selectOne(statement, dto);
    }
    
    /** 협약 조건안 게시판 - 상세 보기 */    
    
    public AgreementConditionDTO agreeDetail(AgreementConditionDTO dto){ 
    	System.out.println(dto.getAgreementConditionNum()+"-------------------------------");
    	String statement =  namespace + ".agreeDetail";
        return sqlSession.selectOne(statement, dto);
    }
    /** 협약 조건안 게시판 - 리스트  */
    public List<AgreementConditionDTO> agreeAllSelect() {
		String statement = namespace + ".agreeAllSelect";
		List<AgreementConditionDTO> list = sqlSession.selectList(statement);
		return list;
	}
    public List<ExplorListDTO> expAllSelect() {
		String statement = namespace + ".expAllSelect";
		List<ExplorListDTO> list = sqlSession.selectList(statement);
		return list;
	}
	public ExplorListDTO selectExpDetail(ExplorationDTO dto) {//���� ��ȣ�� �ϳ��� ��������
		String statement = namespace + ".expDetail";
		return sqlSession.selectOne(statement,dto);
	}
	public ExplorListDTO selectExpDetail2(ExplorationDTO dto) {//���� ��ȣ�� �ϳ��� ��������
		String statement = namespace + ".expDetail2";
		return sqlSession.selectOne(statement,dto);
	}
    
    
}
	


