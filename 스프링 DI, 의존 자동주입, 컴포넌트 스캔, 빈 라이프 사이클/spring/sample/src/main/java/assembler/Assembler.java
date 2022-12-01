package assembler;

import models.member.ChangePasswordService;
import models.member.MemberDao;
import models.member.MemberRegisterService;

public class Assembler {

	private MemberDao memberDao;
	private MemberRegisterService registerService;
	private ChangePasswordService passwordService;

	public Assembler() {
		memberDao = new MemberDao();
		registerService = new MemberRegisterService(memberDao);
		passwordService = new ChangePasswordService();
		passwordService.setMemberDao(memberDao);
		
		
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getRegisterService() {
		return registerService; 
	}

	public ChangePasswordService getPasswordService() {
		return passwordService;
	}
	
	
}
