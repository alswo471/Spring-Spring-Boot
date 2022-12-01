package models.member;

public class ChangePasswordService {
	private MemberDao memberDao;

	public void change(MemberRequest request) {
		MemberDto member = memberDao.get (request.getMemId());
		if(member == null) {
			throw new MemberNotFoundException();
		}

		member.setMemPw(request.getMemPw());
		memberDao.update(member);
	}
	
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
