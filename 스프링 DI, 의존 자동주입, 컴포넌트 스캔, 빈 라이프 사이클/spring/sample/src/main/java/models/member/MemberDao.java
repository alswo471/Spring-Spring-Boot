package models.member;

import java.util.Map;
import java.util.HashMap;

public class MemberDao {
	
	private Map<String, MemberDto> members = new HashMap<>();
	
	public MemberDto get(String memId) {
		MemberDto member = members.get(memId);
		return member;
	}
	
	public Map<String, MemberDto> gets(){
		return members; 
	}
	
	public void register(MemberDto member) {
		members.put(member.getMemId(), member);
		
		System.out.println(members);
	}
 
	public void update(MemberDto member) {
		members.put(member.getMemId(), member);
	}
	
public void delete(String memId) {
	members.remove(memId);
	} 
}
