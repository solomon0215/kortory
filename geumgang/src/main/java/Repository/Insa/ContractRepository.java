package Repository.Insa;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.ContractDTO;
import Model.InsaDTO.UserContractDTO;
import Model.UserDTO.UserDTO;
@Repository
public class ContractRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ContractMapper";
	

	public Integer contractInsert(ContractDTO contract) {
		System.out.println("contractInsert : " + contract.getUserId());
		Integer result = null;
		String statement = namespace + ".insertContract";
		result = sqlSession.insert(statement, contract);
		return result;
	}


	public List<UserContractDTO> contractAllSelect() {
		String statement = namespace + ".contractAllSelect";
		List<UserContractDTO> list = sqlSession.selectList(statement);
		return list;
	}


	public ContractDTO contractDetail(UserDTO dto) {
		System.out.println("--------------------------Á¦¹ß---------------------------------");
		String statement = namespace + ".contractDetail";
		return sqlSession.selectOne(statement,dto);
	}


}
