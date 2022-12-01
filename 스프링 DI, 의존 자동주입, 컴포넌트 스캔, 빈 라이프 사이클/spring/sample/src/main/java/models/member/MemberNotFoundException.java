package models.member;

public class MemberNotFoundException extends RuntimeException{
	
	public MemberNotFoundException() {
		this("등록 된 회원이 아닙니다.");
	}
	public MemberNotFoundException(String message) {
		super(message);
	}

}
