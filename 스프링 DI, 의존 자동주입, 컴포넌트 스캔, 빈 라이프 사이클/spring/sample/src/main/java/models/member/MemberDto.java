package models.member;

import java.time.LocalDateTime;

public class MemberDto {
	private long memNo;
	private String memId;
	private String memPw;
	private String memNm;
	private String mobile;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
	
	
	
	public MemberDto(long memNo, String memId, String memPw, String memNm, String mobile, LocalDateTime regDt) {

		this.memNo = memNo;
		this.memId = memId;
		this.memPw = memPw;
		this.memNm = memNm;
		this.mobile = mobile;
		this.regDt = regDt;
	}
	public long getMemNo() {
		return memNo;
	}
	public void setMemNo(long memNo) {
		this.memNo = memNo;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
	public LocalDateTime getModDt() {
		return modDt;
	}
	public void setModDt(LocalDateTime modDt) {
		this.modDt = modDt;
	}
	@Override
	public String toString() {
		return "MemberDto [memNo=" + memNo + ", memId=" + memId + ", memPw=" + memPw + ", memNm=" + memNm + ", mobile="
				+ mobile + ", regDt=" + regDt + ", modDt=" + modDt + "]";
	}
	
	
}
