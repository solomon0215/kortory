package Repository.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.UserDTO.UserDTO;

@Repository
public class UserInsertRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "userInsertMapper";
	
	public Integer userInsert(UserDTO dto) {
		String statement = namespace + ".userInsert";
		return sqlSession.insert(statement, dto);
	}
}
