## JdbcTemplate
* 장점
* 설정의 편리함
* JdbcTemplate은 spring-jdbc 라이브러리에 포함되어 있는데, 이 라이브러리는 스프링으로 JDBC를
사용할 때 기본으로 사용되는 라이브러리이다. 그리고 별도의 복잡한 설정 없이 바로 사용할 수 있다.
* 반복 문제 해결
  * JdbcTemplate은 템플릿 콜백 패턴을 사용해서, JDBC를 직접 사용할 때 발생하는 대부분의 반복 작업을
  대신 처리해준다.
  * 개발자는 SQL을 작성하고, 전달할 파리미터를 정의하고, 응답 값을 매핑하기만 하면 된다.
  * 우리가 생각할 수 있는 대부분의 반복 작업을 대신 처리해준다.
    * 커넥션 획득
    * statement 를 준비하고 실행
    * 결과를 반복하도록 루프를 실행
    * 커넥션 종료, statement , resultset 종료
    * 트랜잭션 다루기 위한 커넥션 동기화
    * 예외 발생시 스프링 예외 변환기 실행
* 단점
  * 동적 SQL을 해결하기 어렵다

## JdbcTemplate 주요 기능
* JdbcTemplate
  * 순서 기반 파라미터 바인딩을 지원한다.
* NamedParameterJdbcTemplate
  * 이름 기반 파라미터 바인딩을 지원한다. (권장)
* SimpleJdbcInsert
  * INSERT SQL을 편리하게 사용할 수 있다.
* SimpleJdbcCall
  * 스토어드 프로시저를 편리하게 호출할 수 있다.