package Repository.Insa;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.InsaDTO.EmployeeDTO;

public class EmployeeRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "EmployeeMapper";

	public Integer insertEmployee(EmployeeDTO dto) {
		String statement = namespace + ".insertEmployee";
		Integer result = sqlSession.insert(statement, dto);
		return result;
	}

}
