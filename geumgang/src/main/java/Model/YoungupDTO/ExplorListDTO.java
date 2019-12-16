package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorListDTO implements Serializable{ //사전답사보고서 테이블(exploration) + 업체테이블(company)
	private String COMPANY_ID; 				//업체 아이디
	private String COMPANY_REG_NUM; 		//업체 사업자번호
	private String COMPANY_PW;				//업체 비밀번호
	private String COMPANY_NAME;			//업체 명
	private String COMPANY_ADDR;			//업체 주소
	private String COMPANY_PH;				//업체 번호
	private String COMPANY_TYPE;			//업체 유형
	private String COMPANY_EMAIL;			//업체 이메일
	private Integer exploration_num;		//답사 보고서 번호(PK)	서류번호	NUMBER	
	private String exploration_type; 		//업체 유형	유형	VARCHAR2(20)	
	private Date exploration_schedule;		//사전답사 예정일	예정일	DATE	
	private Date exploration_effect;		//사전답사 실시일	실시일	DATE	
	private String exploration_mana_name;	//업체담당자 이름	이름	VARCHAR2(50)	
	private String exploration_avail_time;	//업체 방문 가능시간	가능시간	VARCHAR2(1000)
	private String exploration_avail_date;	//업체 사용가능 날짜	가능날짜	VARCHAR2(2000)
	private String exploration_avail_holi;	//공휴일 사용 가능 여부	여부	VARCHAR2(10)	
	private Integer exploration_limit_age;	//업체 방문 제한 나이	나이	NUMBER	
	private Integer exploration_limit_per;	//업체 방무문 제한 인원	인원	NUMBER	
	private String exploration_condition;	//업체 방문 제한 조건	조건	VARCHAR2(1000)
	private String exploration_file	;		//증빙자료	자료	VARCHAR2(2000)	
	private String exploration_submit;		//제출여부	여부	VARCHAR2(10)	
	private String young_up_num	;			//영업부 직원번호(FK)	직원번호	VARCHAR2(30)	
}

