package Repository.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.UserDTO.UserDTO;

@Repository
public class UserSelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "userSelectMapper";
			
	public Integer idConfirm(String userId) {
		String statement = namespace + ".idConfirm";
		String id = sqlSession.selectOne(statement, userId);
		if(id != null) {
			return 1;
		}
		return 0;
	}
		public UserDTO userlogin(UserDTO dto1) { 
			String statement = namespace + ".userLogin";
			return sqlSession.selectOne(statement, dto1);
		}

	}


