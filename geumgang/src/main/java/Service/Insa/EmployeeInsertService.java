package Service.Insa;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Insa.EmployeeCommand;
import Encrypt.Encrypt;
import Model.InsaDTO.EmployeeDTO;
import Repository.Insa.EmployeeRepository;

@Service
public class EmployeeInsertService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Integer Insert(EmployeeCommand ec) { //command瑜� dto�뿉 ���옣
		EmployeeDTO dto = new EmployeeDTO(); 
		dto.setEmployeeEmail(ec.getEmployeeEmail());
		dto.setEmployeeGender(ec.getEmployeeGender());
		dto.setEmployeeId(ec.getEmployeeId());
		dto.setEmployeeName(ec.getEmployeeName());
		dto.setEmployeeNum(ec.getEmployeeNum());
		dto.setEmployeePh(ec.getEmployeePh());
		dto.setEmployeePw(Encrypt.getEncryption(ec.getEmployeePw()));
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(ec.getEmployeeBirth());
			java.sql.Date birth = new java.sql.Date(date.getDate());
			dto.setEmployeeBirth(birth);
			date=dt.parse(ec.getEmployeeRegist());
			java.sql.Date regi = new java.sql.Date(date.getDate());
			dto.setEmployeeRegist(regi);
		} catch(Exception e) {
			e.printStackTrace();
		}
		Integer result = employeeRepository.insertEmployee(dto);
				return result;
		
	}

}