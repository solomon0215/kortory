package Service.Gwanri;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import Command.Gwanri.BoardCommand;


public class BudgetBillWriteService {
@Autowired

public void boardWrite(BoardCommand boardCommand,
		HttpServletRequest request, HttpSession session) {
}

}
