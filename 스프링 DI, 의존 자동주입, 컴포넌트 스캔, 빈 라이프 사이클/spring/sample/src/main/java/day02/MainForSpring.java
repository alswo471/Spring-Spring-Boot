package day02;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.member.ChangePasswordService;
import models.member.MemberListPrinterService;
import models.member.MemberRegisterService;
import models.member.MemberRequest;

public class MainForSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
		
		MemberRequest request = new MemberRequest(1, "user01", "123456", "이름1", "이메일", "010-0000-0000", LocalDateTime.now());
		MemberRegisterService regService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		regService.register(request);
		
		ChangePasswordService pwdService = ctx.getBean(ChangePasswordService.class);
		request.setMemPw("234567");
		pwdService.change(request);
		
		MemberListPrinterService listPrinter = ctx.getBean(MemberListPrinterService.class);
		listPrinter.print();
		
		ctx.close();
	}

}
