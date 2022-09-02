# 스프링 프레임워크란?
스프링(Spring)은 매우 방대한 기능을 제공하고 있어서 스프링을 한마디로 정의하기는 힘들다. 흔히 스프링이라고 하면 스프링 프레임워크를 말한다.<br>

스프링 프레임워크의 주요 특징<br>

- <b>의존 주입(Dependency Inject : DI)</b> 지원
- <b>AOP(Aspect-Oriented Programming)</b> 지원
- <b>MVC 웹 프레임워크</b> 제공
- <b>JDBC, JPA 연동, 선언적 트랜잭션 처리 등 DB 연동</b> 지원<br><br>

>이 외에도 스케줄링, 메시지 연동(JMS), 이메일 발송, 테스트 지원 등 자바 기반 어플리케이션을 개발하는데 필요한 다양한 기능을 제공한다.<br><br>

실제로 스프링 프레임워크를 이용해서 웹 어플리케이션을 개발할 때에는 스프링 프레임워크만 단독으로 사용하기 보다는 여러 스프링 관련 프로젝트를 함께 사용함<br>

현재 스프링을 주도적으로 개발하고 있는 피보탈(Pivotal)은 스프링 프레임워크뿐만 아니라 어플리케이션 개발에 필요한 다양한 프로젝트를 진행하고 있음<br>


자주 사용되는 프로젝트<br>

- <b>스프링 데이터</b> : 적은 양의 코드로 데이터 연동을 처리할 수 있도록 도와주는 프레임워크이다. JPA, 몽고DB, 레디스 등 다양한 저장소 기술을 지원함

- <b>스프링 시큐리티</b> : 인증/인가와 관련된 프레임워크로서 웹 접근 제어, 객체 접근 제어, DB - 오픈 ID - LDAP 등 다양한 인증 방식, 암호화 기능을 제공함

- <b>스프링 배치</b> : 로깅/추적, 작업 통계, 실패 처리 등 배치 처리에 필요한 기본 기능을 제공함 <br><br>
이 외에도 스프링 인티그레이션, 스프링 하둡, 스프링 소셜 등 다양한 프로젝트가 존재함 <br>

> 각 프로젝트에 대한 내용 참고 사이트 : [https://spring.io](https://spring.io) 

* * *
# 메이븐 설치 및 사용방법 알아보기

### 메이븐 설치

- [http://maven.apache.org/](http://maven.apache.org/) 사이트에 방문한 뒤 \[Download\] 메뉴를 클릭하여 메이븐 최신 버전을 다운로드<br>

- 압축을 풀면bin 폴더에 mvn.bat 파일이 있다.<br>

- 명령 프롬프트에서 메이븐을 실행 할 수 있도록 PATH 환경변수를 설정<br>


<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven1.png?raw=true" width="400" height="400"><br>


<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven2.png?raw=true" width="400" height="400"><br>


<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven3.png?raw=true" width="400" height="400"><br>

### 메이븐 아키타입을 이용한 프로젝트 생성하기

메이븐이 제공하는 아키타입을 사용하면 미리 정의된 폴더 구조와 기반이 되는 pom.xml 파일을 사용해서 메이븐 프로젝트를 생성할 수도 있다.

```
cmd 켜서 명령어 입력 >> mvn -version 
```

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven4.png?raw=true" width="400" height="400"><br>

### 메이븐 아키타입을 이용한 프로젝트 생성하기

메이븐이 제공하는 아키타입을 사용하면 미리 정의된 폴더 구조와 기반이 되는 pom.xml 파일을 사용해서 메이븐 프로젝트를 생성할 수도 있다.

```
명령어 입력 >> mvn archetype:generate
```

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven5.png?raw=true" width="400" height="400"><br>

- **groupId** : 프로젝트가 속하는 그룹 식별자. 회사, 본부, 또는 단체를 의미하는 값을 입력한다. 패키지 형식으로 계층을 표현한다. 위에서는 kr.codefty를 groupId로 입력했다.
- **artifactId** : 프로젝트 결과물의 식별자. 프로젝트나 모듈을 의미하는 값이 온다. 위에서는 sample을 artifactId로 입력했다.
- **version** : 결과물의 버전을 입력한다. 위에서는 기본 값인 1.0-SNAPSHOT을 사용했다.
- **package** : 생성할 패키지를 입력한다. 별도로 입력하지 않을 경우 groupId와 동일한 구조의 패키지를 생성한다.


### 메이븐 프로젝트의 기본 디렉토리 구조
archetype:generate이 성공적으로 실행되면 artifactId에 입력한 값과 동일한 이름의 폴더가 생성된다. 위 경우는 sample이라는 하위 폴더가 생성<br><br>

메이븐 프로젝트의 주요 폴더

- **src/main/java** : 자바 소스 파일이 위치한다.
- **src/main/resources** : 프로퍼티나 XML 등 리소스 파일이 위치한다. 클래스패스에 포함된다.
- **src/main/webapp** : 웹 어플리케이션 관련 파일이 위치한다. (WEB-INF 폴더, JSP 파일 등)
- **src/test/java** : 테스트 자바 소스 파일이 위치한다.
- **src/test/resources** : 테스트 과정에서 사용되는 리소스 파일이 위치한다. 테스트에 사용되는 클래스패스에 포함된다. <br>

### 자바 버전 수정
```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>
```

### 컴파일 하기
```
mvn compile
```
컴파일 된 결과는 target/classes 폴더에 생성된다.

### 테스트 실행
```
mvn test
```
mvn test 명령어를 실행하면 테스트 코드를 컴파일하고 실핼한 뒤 테스트 성공 여부를 출력한다. 컴파일된 테스트 클래스들은 target/test-classes 폴더에 생성되고 테스트 결과 리포트는 target-reports 폴더에 저장된다.

### 배포가능한 파일 만들기(패키징)
다음 명령어를 실행하면 프로젝트를 패키징해서 결과물을 생성한다.
```
mvn package
```
mvn package가 성공적으로 실행되면 target폴더에 프로젝트 이름과 버전에 따라 알맞은 이름을 갖는 jar 파일이 생성된다.

### POM 파일 기본
메이븐 프로젝트를 생성하면 pom.xml 파일이 프로젝트 루트 폴더에 생성된다. 이 pom.xml 파일은 Project Object Model 정보를 담고 있는 파일이다. 이 파일에서 다루는 주요 설정 정보는 다음과 같다.
- **프로젝트 정보** : 프로젝트 이름, 개발자 목록, 라이센스 등의 정보를 기술
- **빌드 설정** : 소스, 리소스, 라이프 사이클별 실행할 플러그인 등 빌드와 관련된 설정을 기술
- **POM 연관 정보** : 의존 프로젝트(모듈), 상위 프로젝트, 포함하고 있는 하위 모듈 등을 기술

archetype:generate 실행시 maven-archetype-quickstart-Archetype을 선택한 경우 생성되는 pom.xml 파일은

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>kr.codefty</groupId>
  <artifactId>sample</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>sample</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    ... 
  </build>
</project>
```

위 POM 파일에서 프로젝트 정보를 기술하는 태그
- \<name\> : 프로젝트 이름
- \<url\> : 프로젝트 사이트 URL

POM 연관 정보는 프로젝트간 연관 정보를 기술하며 관련 태그
- \<groupId\> : 프로젝트와 그룹 ID 설정
- \<artifactId\> : 프로젝트와 Artifact ID 설정
- \<version\> : 버전 설정 
- \<packaging\> : 패키징 타입 설정, 위 코드는 프로젝트의 결과가 jar 파일로 생성됨을 의미함. jar뿐만 아니라 웹 어플리케이션을 위한 war 타입이 존재
- \<dependencies\> : 이 프로젝트에서 의존하는 다른 프로젝트 정보를 기술
	- \<dependency\> : 의존하는 프로젝트 POM 정보를 기술
		- \<groupId\> : 의존하는 프로젝트의 그룹 ID
		- \<artifactId\> : 의존하는 프로젝트의 artifact ID
		- \<version\> : 의존하는 프로젝트의 버전
		- \<scope\> : 의존하는 범위를 설정

#### 의존의 scope: compile, runtime, provided, test

- **compile** : 컴파일할 때 필요. 테스트 및 런타임에도 클래스패스에 포함된다. \<scope\>를 설정하지 않을 경우 기본 값은 compile이다.
- **runtime** : 런타임에 필요. JDBC 드라이버 등이 예가 된다. 프로젝트 코드를 컴파일 할 때는 필요하지 않지만 실행할 때 필요하다는 것을 의미한다. 배포시 포함된다.
- **provided** : 컴파일 할 때 필요하지만 실제 런타임 때에는 컨테이너 같은 것에서 기본으로 제공되는 모듈임을 의미한다. 예를 들어 서블릿이나 JSP API 등이 이에 해당한다. 배포시 제외된다.
- **test** : 테스트 코드를 컴파일 할 때 필요. Mock 테스트를 위한 모듈이 예이다. 테스트 시에 클래스패스에 포함된다. 배포시 제외된다.

# 스프링 프로젝트 생성하기
### 메이븐 프로젝트 생성
- 명령 프롬프트 입력
```
mvn archetype:generate
```
- 생성된 스프링 프로젝트 폴더에서 pom.xml의 자바 버전을 변경한다(아래 코드는 자바를 17버전으로 변경).
```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
 </properties>
```

### 메이븐 프로젝트 임포트

\[File\]->\[Import]메뉴를 사용

Maven/Existsing Maven Projects를 선택 -> Next -> \[Browse\] 버튼을 눌러 생성한 메이븐 프로젝트 선택한다.

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven6.png?raw=true" width="400" height="400"><br>

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven7.png?raw=true" width="400" height="400"><br>

[Finish] 버튼을 클릭<br><br>

임포트가 완료되면 다음 처럼 이클립스 프로젝트가 생성

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven8.png?raw=true" width="400" height="400"><br>

### 메이븐 의존 설정
pom.xml 파일의 \<dependencies\> 하위 요소로 추가
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.20</version>
</dependency>
```

>메이븐은 한 개의 모듈을 아티팩트라는 단위로 관리한다. 위 설정은 spring-context라는 식별자를 가진 5.3.20 버전의 아티팩트에 대한 의존(dependency)를 추가한 것이다. 여기에 의존을 추가한다는 것은 일반적인 자바 애플리케이션에서 클래스 패스에 spring-context 모듈을 추가한다는 것을 뜻한다. 각 아티팩트의 완전한 이름은 "아티팩트-버전.jar"이므로, 위 설정은 메이븐 프로젝트의 소스 코드를 컴파일하고 실행할 때 사용할 클래스 패스에 spring-context-5.3.20.jar 파일을 추가한다는 것을 의미한다.

<img src="https://github.com/alswo471/Spring-Spring-Boot/blob/main/%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95,%20%EB%A9%94%EC%9D%B4%EB%B8%90%20,%20%EC%8A%A4%ED%94%84%EB%A7%81DI%20-%201/images/maven9.png?raw=true" width="400" height="400"><br>














