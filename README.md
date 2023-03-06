# Java Ladder

- Last Update: 2023-03-06

## 코드 리뷰

* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)

* [동영상으로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://youtube.com/watch?v=lFinZfu3QO0&si=EnSIkaIECMiOmarE)

## 학습 계획

1. 월 오후
- [O] Step.2-1 프로그래밍 학습이 어려운 이유
- Step.2-3 자바 문자열 학습
- 사다리 게임 1단계 구현
- Step.2-2 리팩토링 맛보기 학습
- 사다리 게임 2단계 구현

2. 화 오전
- Step.2-4 리스트와 제네릭 학습
- Step.2-5 JCF 학습
- 사다리 게임 3단계 구현

3. 화 오후
- 객체 지향 생활체조 원칙 학습
- Step.2-6 단위 테스트 학습(Junit5, AssertJ)
- 단위 테스트 구현
- 사다리 게임 4단계 구현

3. 수
- Step.2-7 Java Exception 실습
- Step.2-8 Java Enum 실습
- DTO 학습
- 사다리 게임 5단계 구현

4. 목
- Step.2-9 SparkJava 학습
- Step.2-10 JVM 학습
- 사다리 게임 6단계 구현 시작

5. 금
- 학습 내용 정리

### 1단계

#### String Literal vs new 생성자
- 리터럴로 생성 시 String pool에 생성
- String pool에 생성된 스트링과 동일한 스트링을 생성 시 참조 변수가 이미 존재하는 문자열을 참조하게 된다.
- new로 생성하면 객체 생성과 동일하게 heap 메모리 공간에 생성된다. 동일한 스트링을 생성해도 다른 객체로 생성된다.
  https://hs-archive.tistory.com/28

#### String + String vs StringBuilder vs StringBuffer
- String은 Immutable이므로 객체 간 더하면 새로운 객체가 생성되야하므로, 메모리 할당과 해제가 발생한다.
- StringBuilder는 Immutable이 아닌 mutable로 기존 데이터에 새 데이터를 추가하는 방식으로 속도가 빠르다.
- StringBuffer는 Synchronized 키워드를 지원하여, 여러 스레드가 한 개의 자원에 접근하려고 할 때, 현재 데이터를 사용하고 있는 스레드를 제외하고 나머지 스레드의 접근을 막는다.
비교
- String :  문자열 연산이 적고 멀티쓰레드 환경일 경우
- StringBuffer :  문자열 연산이 많고 멀티쓰레드 환경일 경우
- StringBuilder :  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우  
