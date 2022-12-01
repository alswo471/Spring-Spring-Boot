package ch01;

import java.time.LocalDateTime;

import models.member.*;
public class Main {
	public static void main(String[] args) {
		
		
		MemberRequest request = new MemberRequest(1, "유저지민재", "471", "지민재1", "01012347891", LocalDateTime.now()); 
		MemberDao memberDao = new MemberDao();
		MemberRegisterService service = new MemberRegisterService(memberDao);
		service.regist(request);
		
		
		
		ChangePasswordService changePasswordService = new ChangePasswordService();
		changePasswordService.setMemberDao(memberDao);
		request.setMemPw("77777777");
		changePasswordService.change(request);
		System.out.println(memberDao.get(request.getMemId()));
	}
}
