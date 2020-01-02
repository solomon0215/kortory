package Repository.User;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.RecruitDTO;
@Repository
public class UserRecruitRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "UserRecruitMapper";

	public List<RecruitDTO> recruitAllSelect() {
		String statement = namespace + ".allSelect";
		List<RecruitDTO> list = sqlSession.selectOne(statement);
		return list;
	}

}
