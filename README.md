## Member Project

1. 프로젝트 기본 정보
   - project name: member_20230905
   - package: com.icia.member
2. Class
   - HomeController
   - MemberController
   - MemberService
   - MemberRepository
   - MemberDTO
3. jsp
   - index.jsp: 시작페이지(회원가입, 로그인 페이지, 목록출력을 위한 링크 있음)
   - memberSave.jsp: 회원가입 페이지
     - 회원가입정보: 이메일(memberEmail), 비밀번호(memberPassword), 이름
     (memberName), 생년월일(memberBirth), 전화번호(memberMobile)
   - memberLogin.jsp: 로그인 페이지
   - memberList.jsp: 회원목록 출력 페이지
   - memberMain.jsp: 로그인 후 메인 페이지
   - memberDetail.jsp: 회원 상세 페이지
     - 정보수정버튼, 로그아웃 버튼 있음
   - memberUpdate.jsp: 회원 정보 수정 페이지
4. urls
   - 주소값 http method 역할 파라미터 처리 후 결과 페이지
   - /get 시작페이지 - index.jsp
   - /save get
   - 회원가입 페이지
   - 출력
- memberSave.jsp
  /save post 회원가입 처리 MemberDTO memberLogin.jsp
  /login get 로그인 페이지 출
  력
- memberLogin.jsp
  Member Project 2
  /login post 로그인 처리
  memberEmail,
  memberPassword
  memberMain.jsp
  /members get 회원목록 출력 - memberList.jsp
  /member get 상세조회 id memberDetail.jsp
  /member-ajax get 상세조회(ajax) id
  /delete get 회원삭제 id memberList.jsp
  /update get 수정화면 출력 id memberUpdate.jsp
  /update post 수정처리 MemberDTO memberDetail.jsp
  /duplicate-check post
  이메일 중복체크
  (ajax)
  memberEmail
  /logout get 로그아웃 처리 - index.jsp
5. table
   - table name: member_table
   - column
   - id(pk): bigint, auto_increment
   - memberEmail: varchar(50), unique
   - memberPassword: varchar(20), not null
   - memberName: varchar(20), not null
   - memberBirth: date, not null
   - memberMobile: varchar(30), not null

## database 
```sql
create table member_table(
    id int primary key auto_increment,
    memberEmail varchar(30) unique,
    memberPassword varchar(20) not null,
    memberName varchar(20) not null,
    memberBirth date not null,
    memberMobile varchar(30) not null
);
```

# 만들어보자
- 회원가입시 입력하지 않은 항목이 있다면 회원가입 진행하지 않고 alert 출력
- 회원가입시 비밀번호 정규식 체크
- 영문소문자, 숫자, 특수문자(!#$%) 하나 이상 입력하고 8~16자로