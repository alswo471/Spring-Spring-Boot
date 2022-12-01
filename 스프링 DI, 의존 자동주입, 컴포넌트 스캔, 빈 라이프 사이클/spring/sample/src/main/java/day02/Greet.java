package day02;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Greet {
	
	@Autowired
	@Qualifier("mperson2")
	private Optional<Person> opt;
		
	public void print() {
		if (opt.isEmpty()) {
			System.out.println("이름 없음!");
		} else {
			System.out.printf("%s(%d)님 안녕하세요.", opt.get().getName(), opt.get().getAge());
		}
	}
	/**
	@Autowired
	public void setPerson(Optional<Person> opt) {
		if (opt.isPresent()) {
			this.person = opt.get();
		} else {
			this.person = null;
		}
	}
	*/
	/**
	@Autowired(required=false)
	public void setPerson(Person person) {
		this.person = person;
	}
	*/
	
}
