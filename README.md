# 자바 사다리 게임 만들기

## To-Do List
### 미션1 - 기본 기능 구현
- [x] 출력 화면 구현
- [x] n명의 사람을 입력 받는 기능
- [x] m개의 사람을 입력 받는 기능
- [x] 랜덤한 사다리 랜덤 값 구하는 기능
- [x] 입력값을 바탕으로 2차원 배열을 생성하는 기능
- [x] 만들어진 2차원 배열을 화면에 출력하는 기능
- [x] n과 m 입력값에 대한 예외처리 기능

## 학습 키워드
### 1. 자바 문자열
- 왜 String 문자열은 불변 객체일까? (불변 객체의 장점과 단점)
- `StringBuilder`과 `StringBuffer`의 차이점
- `new String` 과 `String a = "abc"` 의 차이


### 코드 설명
- 입력만 받는 `InputView` 클래스를 만들어 입력값을 받도록 함
- `OutputView` Enum 클래스로 만들어 해당 타입의 문자열이 출력될 수 있도록 함
- 입력값을 바탕으로 사다리 생성, 사다리 출력 기능은 `LadderGame`에서 담당

---
## 미션2 - 리팩토링 맛보기
- [x] 리팩토링에 대한 개념 학습 및 정리
- [x] 리팩토링의 필요성 학습 및 정리
- [ ] 리팩토링 실행
  - 메소드 크기 조정
  - 들여쓰기 depth를 1단계로 수정
  - else 삭제
  - naming convention 지키기

## 학습 키워드
### 1. 클린코딩
- 클린 코딩이란 무엇인가?
  - 모든 팀원이 이해하기 쉽도록 작성한 코드
- 클린 코딩의 원칙
  - 코딩 표준, 아키텍처 표준 및 설계 가이드 준수
  - 단순한 것이 효율적
  - 참조되거나 수정되는 코드는 원래보다 클린해야 함
  - 항상 근본적인 원인을 찾아라
  - 하나의 파일은 하나의 언어로 작성
- 클린 코드 고려사항
  - 의미와 의도가 분명한 변수명
  - 명확하고 간결한 주석
  - 읽기 쉽게 흐름 제어 만들기
    - 삼항 연산자는 자제
    - do-while 문 피하기
    - 부정이 아닌 긍정문 사용
    - 함수는 가급적 작게, 하나의 작업만 수행
### 2. 리팩토링
- 리팩토링의 개념은 무엇인가?
  - 클린 코드를 수행하기 위한 기술
  - 결과의 변경 없이 코드의 구조를 재조장하는 것
  - 가독성을 높이고 유지보수를 편하게 하기 위해 사용
  - 버그를 없애거나 새로운 기능을 추가하는 행위가 아님
  - 사용자가 보는 외부 화면은 그대로 두고, 내부 로직적인 부분의 구조를 변경하거나 개선하는 유지보수 행위
- 리팩토링은 어떤 상황에 사용하는가?
  - The Rule of Three : 유사한 내용이 세 번 이상 반복될 때
  - 새로운 기능을 추가할 때
  - 코드리뷰를 할 때
  - 소프트웨어의 유지 보수를 하는 과정이 간단해짐
  - 협업을 하면서 소스 공유 과정을 수월하게 만듬
  - 코드 중복을 제거
  - 직관성 있는 네이밍으로 분석 가능

### 코드 설명


---
### 미션3 - 사다리 모양 개선
- [ ] 참여하는 플레이어 이름 입력 기능
- [ ] 사다리 출력시 이름 출력 기능
- [ ] 사다리 높이 입력 기능
- [ ] 사다리를 배열에서 ArrayList로 변경
- [ ] 사다리 폭 변경 (곂치지 않게)
- [ ] 플레이어 이름 입력 예외처리 기능

## 학습 키워드
### 1. 

### 코드 설명

---
### 미션4 - 리팩토링 2
- [ ] 객체지향생활체조 원칙 개념 정리
- [ ] 단위테스트 학습
- [ ] 리팩토링 실행
    - 메소드 크기 조정
    - 단위 테스트 실시

## 학습 키워드
### 1.객체지향생활체조 원칙이란 무엇인가?

### 2. 단위 테스트란 무엇인가?

### 3. JUnit은 어떻게 사용할 수 있는가?


### 코드 설명

---
### 실행결과 출력
- [ ] 사다리 실행 결과 출력
- [ ] 실행 출력 결과물 2개로 분리
- [ ] 프로그램 종료 기능

## 학습 키워드
### 1. DTO란 무엇인가?


### 코드 설명

---
### GUI 구현하기
- [ ] 콘솔 GUI 구현하기
- [ ] 웹 프로젝트 구현

### 예상 스케줄 테이블
| 월 | 화 | 수 | 목 | 금 |
|---|---|---|---|---|
|미션1, 미션2|미션3|미션4|미션5|미션6|