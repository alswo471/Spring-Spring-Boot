package day01;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import models.member.MemberDao;
import models.member.MemberInfoPrintService;
import models.member.MemberListPrinterService;

@Configuration
public class AppCtx3 {

	@Autowired
	private MemberDao memberDao;
	
	
	
	@Bean
	public MemberInfoPrintService infoPrintService () {
		return new MemberInfoPrintService();
	}
	
	@Bean
	public MemberListPrinterService listPrintService () {
		MemberListPrinterService listPrinter= new MemberListPrinterService();
		listPrinter.setInfoPrintService(infoPrintService());
		listPrinter.setMemberDao(memberDao);
		
		return listPrinter;
	}
	
//	@Bean
//	public DateTimeFormatter getFormatter() {
//		return DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
//	}
	
	
}
