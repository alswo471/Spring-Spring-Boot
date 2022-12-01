package models.member;

public class DuplicateMemberException extends RuntimeException{

	public DuplicateMemberException() {
		this("이미 가입된 회원 아이디 입니다.");
	}
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}
