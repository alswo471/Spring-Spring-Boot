package day02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration

/**
@ComponentScan(basePackages= {"models.member", "models.member2"},
excludeFilters=@Filter(type = FilterType.ASPECTJ, pattern="models.member2.*Dao"))
*/
/**
@ComponentScan(basePackages= {"models.member", "models.member2"},
		excludeFilters=@Filter(type = FilterType.REGEX, pattern="models\\.member2\\..*Dao"))
*/
/**
@ComponentScan(basePackages= {"models.member", "models.member2"},
excludeFilters=@Filter(type = FilterType.ASSIGNABLE_TYPE, classes= { models.member2.MemberDao.class }))
*/
@ComponentScan(basePackages= {"models.member", "models.member2"},
excludeFilters= { 
			@Filter(type = FilterType.ANNOTATION, classes= {ExceptBean.class}),
			@Filter(type = FilterType.ASSIGNABLE_TYPE, classes= { models.member2.MemberDao.class })
})

public class AppCtx2 {
	
}
