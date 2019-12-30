package Repository.Insa;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.InsaDTO.RecruitDTO;
@Repository
public class RecruitRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "RecruitMapper";

	public Integer recruitInsert(RecruitDTO recruit) { //채용공고 등록
		Integer result = null;
		String statement = namespace + ".insertRecruit";
		result = sqlSession.insert(statement, recruit);
		return result;
	}

	public List<RecruitDTO> recruitAllSelect() { //채용공고 리스트에 출력
		String statement = namespace + ".recruitAllSelect";
		List<RecruitDTO> list = sqlSession.selectList(statement);
		return list;
	}

	public RecruitDTO recruitDetail(RecruitDTO dto) { //채용공고 상세보기
		String statement = namespace + ".recruitDetail";
		return sqlSession.selectOne(statement,dto);
	}

}
