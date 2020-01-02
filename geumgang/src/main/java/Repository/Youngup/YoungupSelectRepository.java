package Repository.Youngup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Model.YoungupDTO.YoungupDTO;

@Repository
public class YoungupSelectRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "youngupSelectMapper";
	
	public YoungupDTO youngupLog( YoungupDTO dto1) { //�α��� 
		String statement = namespace + ".youngupLog";
		return sqlSession.selectOne(statement, dto1);
	}
	
	public List<ExplorListDTO> selectExplorList(){ //���  ������ ������� ����
		String statement = namespace + ".explorList";
		return sqlSession.selectList(statement);
	}
	
	public List<ExplorListDTO> selectKindExp(ExplorListDTO dto){ //�ű� ��� ��ü  ������� ���� ��������
		String statement = namespace + ".kindExp";
		return sqlSession.selectList(statement, dto);
	}
	
	public ExplorListDTO selectExpDetail(ExplorationDTO dto) {//���� ��ȣ�� �ϳ��� ��������
		String statement = namespace + ".expDetail";
		return sqlSession.selectOne(statement,dto);
	}
	public Integer selectToday(ExplorationDTO searchDto) {//오늘의 업무량 조회 메소드
		String statement = namespace + ".workingCount";
		System.out.println(searchDto.getExplorationSubmit());
		return sqlSession.selectOne(statement, searchDto);
	}
	
}
