package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorListDTO implements Serializable{ //������纸�� ���̺�(exploration) + ��ü���̺�(company)
	private String COMPANY_ID; 				//��ü ���̵�
	private String COMPANY_REG_NUM; 		//��ü ����ڹ�ȣ
	private String COMPANY_PW;				//��ü ��й�ȣ
	private String COMPANY_NAME;			//��ü ��
	private String COMPANY_ADDR;			//��ü �ּ�
	private String COMPANY_PH;				//��ü ��ȣ
	private String COMPANY_TYPE;			//��ü ����
	private String COMPANY_EMAIL;			//��ü �̸���
	private Integer exploration_num;		//��� ���� ��ȣ(PK)	������ȣ	NUMBER	
	private String exploration_type; 		//��ü ����	����	VARCHAR2(20)	
	private Date exploration_schedule;		//������� ������	������	DATE	
	private Date exploration_effect;		//������� �ǽ���	�ǽ���	DATE	
	private String exploration_mana_name;	//��ü����� �̸�	�̸�	VARCHAR2(50)	
	private String exploration_avail_time;	//��ü �湮 ���ɽð�	���ɽð�	VARCHAR2(1000)
	private String exploration_avail_date;	//��ü ��밡�� ��¥	���ɳ�¥	VARCHAR2(2000)
	private String exploration_avail_holi;	//������ ��� ���� ����	����	VARCHAR2(10)	
	private Integer exploration_limit_age;	//��ü �湮 ���� ����	����	NUMBER	
	private Integer exploration_limit_per;	//��ü �湫�� ���� �ο�	�ο�	NUMBER	
	private String exploration_condition;	//��ü �湮 ���� ����	����	VARCHAR2(1000)
	private String exploration_file	;		//�����ڷ�	�ڷ�	VARCHAR2(2000)	
	private String exploration_submit;		//���⿩��	����	VARCHAR2(10)	
	private String young_up_num	;			//������ ������ȣ(FK)	������ȣ	VARCHAR2(30)	
}

