package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import models.member.ChangePasswordService;
import models.member.*;
import models.member.MemberRegisterService;


@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePasswordService() {
		ChangePasswordService changePasswordService = new ChangePasswordService();
		changePasswordService.setMemberDao(memberDao());
		
		return changePasswordService;
	}
	
	public MemberPrinterService memberPrinterService() {
		return new MemberPrinterService(memberDao());
	}
	
	@Bean
	public MemberPrintListService memberPrintListService() {
		MemberPrintListService service = new MemberPrintListService();
		service.setMemberDao(memberDao());
		service.setMemberPrinterService(memberPrinterService());
		
		return service;
	}
}
