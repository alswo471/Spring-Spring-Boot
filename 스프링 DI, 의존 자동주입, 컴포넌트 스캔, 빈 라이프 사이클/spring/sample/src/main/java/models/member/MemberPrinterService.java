package models.member;

public class MemberPrinterService {
	MemberDao memberDao;

	public MemberPrinterService(MemberDao memberDao) {
		this.memberDao = memberDao;
		
	}
	
	public void print(String memId) {
		MemberDto member = memberDao.get(memId);
		System.out.println(member);
	}
}
