package models.member;

import java.time.LocalDateTime;

public class MemberRegisterService {
	
	private MemberDao memberDao;
	
public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

public void regist(MemberRequest request) {
	
	MemberDto member = memberDao.get(request.getMemId());
	
	if(member != null) {
		throw new DuplicateMemberException();
	}
	
	MemberDto newMember = new MemberDto(1, request.getMemId(), request.getMemPw() , request.getMemNm() , request.getMobile() , LocalDateTime.now()); 
	memberDao.register(newMember);
}
}
