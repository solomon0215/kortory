package Repository.Gwanri;


import org.apache.ibatis.session.SqlSession;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.CoopContractDTO;
import Model.GwanriDTO.ExpagreeDTO;
import Model.GwanriDTO.GwanriDTO;
import Model.GwanriDTO.TaxDTO;
import Model.YoungupDTO.ExplorListDTO;

@Repository
public class GwanriInsertRepository {
	@Autowired
	private SqlSession sqlSession;	
	private final String namespace = "gwanriInsertMapper";
		
	/** 예산안 보고서 - 등록  */    
    public Integer budgetInsert(BudgetBillDTO dto){
    	System.out.println(dto.getBudgetBillSubject());
    	System.out.println(dto.getGwanRiNum());
    	System.out.println(dto.getBudgetBillDate());
    	System.out.println(dto.getBudgetBillGoodsPrice());
    	System.out.println(dto.getBudgetBillLaborPrice());
    	System.out.println(dto.getBudgetBillLaborRatio());
    	String statement = namespace + ".insertBudget";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;    	
    }
	/** 협약조건안 게시판 - 등록  
	 * @param expdto */    
    public Integer coopInsert(CoopContractDTO dto){
    	
    	String statement = namespace + ".insertCoop";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;    	
    }
    public Integer taxInsert(TaxDTO dto){
    	System.out.println(dto.getGwanRiNum());
    	System.out.println(dto.getTaxProofFile());
    	System.out.println(dto.getTaxSubject());
    	System.out.println(dto.getTaxCost());
    	System.out.println(dto.getTaxDate());
    	System.out.println(dto.getTaxNum());
    	System.out.println(dto.getTaxPeriod());
    	System.out.println(dto.getTaxProofDate());
    	String statement = namespace + ".insertTax";    	
    	Integer result = sqlSession.insert(statement, dto);
    	
		return result;    	
    }
   
}
