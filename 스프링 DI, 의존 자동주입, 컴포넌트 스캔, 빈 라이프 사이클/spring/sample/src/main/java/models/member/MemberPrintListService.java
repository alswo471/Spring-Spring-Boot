package models.member;

import java.util.Map;

public class MemberPrintListService {
private MemberDao memberDao;
private MemberPrinterService memberPrinterService;

public void setMemberDao(MemberDao memberDao) {
	this.memberDao = memberDao;
}

public void setMemberPrinterService(MemberPrinterService memberPrinterService) {	
	this.memberPrinterService = memberPrinterService;
	
}

public void print() {
	Map<String, MemberDto> members = memberDao.gets();
	for(MemberDto member : members.values()) {
		memberPrinterService.print(member.getMemId());
	}
}
}
