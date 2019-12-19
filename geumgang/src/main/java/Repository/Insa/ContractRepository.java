package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.ContractDTO;
@Repository
public class ContractRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ContractMapper";
	

	public Integer contractInsert(ContractDTO contract) {
		Integer result = null;
		String statement = namespace + ".insertContract";
		result = sqlSession.insert(statement, contract);
		return result;
	}

}
