package Validator.Youngup;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import Command.Youngup.ExplorIncomWriteCommand;

public class ExplorIncomWriteCommandValidator implements Validator{
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ExplorIncomWriteCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ExplorIncomWriteCommand com = (ExplorIncomWriteCommand) target;
		if(com.getChoise() == 0) {
			errors.rejectValue("choise", "explorChoise");
		}
		if(com.getExplorationType().equals("0")) {
			errors.rejectValue("explorationType", "required");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "explorationManaName", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationEffect", "required");
		ValidationUtils.rejectIfEmpty(errors, "startTime", "required");
		ValidationUtils.rejectIfEmpty(errors, "endTime", "required");
		ValidationUtils.rejectIfEmpty(errors, "startDate", "required");
		ValidationUtils.rejectIfEmpty(errors, "endDate", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationAvailHoli", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationLimitAge", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationLimitPer", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationCondition", "required");
		if(!com.getStartDate().trim().isEmpty() && !com.getEndDate().trim().isEmpty() ) { //날짜 검사 
			java.util.Date now = new java.util.Date(); //현재 날자
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date start;
			java.util.Date end;
			try {
				 start = sdf.parse(com.getStartDate());
				 end = sdf.parse(com.getEndDate());
				 int nowResult = now.compareTo(start);
					if(nowResult > 0) {
						errors.rejectValue("startDate","startDateNow");
					}else {
						int startResult = start.compareTo(end);
						if(startResult > 0) {
							errors.rejectValue("startDate","startDate");
						}
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!com.getStartTime().trim().isEmpty() && !com.getEndTime().trim().isEmpty() ) {//시간검사
			Integer startTime = Integer.parseInt(com.getStartTime()); 
			Integer endTime = Integer.parseInt(com.getEndTime());
			if(startTime >= endTime) {
				errors.rejectValue("startTime","startTime");
			}
		}
		
	}

}
