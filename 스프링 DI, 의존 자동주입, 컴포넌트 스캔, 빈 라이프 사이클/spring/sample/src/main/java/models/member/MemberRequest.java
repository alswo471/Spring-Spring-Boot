package models.member;

import java.time.LocalDateTime;

public class MemberRequest extends MemberDto {

	public MemberRequest(long memNo, String memId, String memPw, String memNm, String mobile, LocalDateTime regDt) {
		super(memNo, memId, memPw, memNm, mobile, regDt); 
		// TODO Auto-generated constructor stub
	}


}
