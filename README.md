# Java ladder

## 계획
### 3월 6일 월요일

<details>

- 학습 키워드 : 자바 문자열, 클래스, 메서드
  - [ ] 클래스, 메서드 > `금요일`로...
  - [x] naming convention
  - [x] [랜덤 데이터를 위한 테스트 코드 예시](https://nbalance97.tistory.com/m/315)
- 구현
  - [x] 1단계 사다리 1차 구현
  - [x] 2단계 리팩토링

</details>

### 3월 7일 화요일

<details>

- 리뷰/마스터클래스 관련 학습
  - [x] [`EOL`을 넣는 이유](https://coderifleman.tumblr.com/post/115464362564/%ED%8C%8C%EC%9D%BC-%EB%81%9D%EC%97%90-%EA%B0%9C%ED%96%89%EC%9D%84-%EC%B6%94%EA%B0%80%ED%95%B4%EC%95%BC-%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0)
  - [x] [`Enum` 활용법](https://jojoldu.tistory.com/137)
  - [ ] JCF가 뭐지?
- 학습 키워드 : 클린 코딩, List, ArrayList
  - [ ] 클린코딩과 리팩토링의 필요성
  - [x] `StringBuilder`, `StringBuffer`의 차이점
  - [ ] `List`, `ArrayList`와 제네릭
- 코드 개선
  - [x] 커밋 메시지 신경쓰기
  - [x] Ladder 클래스 `run()` 다른 클래스로 분리해보기.
    - 메인 함수의 역할을 더 주거나 / `Controller` 를 만들까?
- 구현
  - [x] 3단계 구현
- 기록
  - [x] 학습스택

</details>

### 3월 8일 수요일
- [x] JCF가 뭐지?
	- [자바 콜렉션 프레임워크](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/doc-files/coll-overview.html)
	- [JCF의 계층 구조](https://steady-coding.tistory.com/356)
	- [프레임워크와 라이브러리의 차이점](https://webclub.tistory.com/458) : 제어 흐름에 대한 주도성이 어디에 있는가에 따라 다르다. (제어의 역전)
	- [콜렉션 프레임워크](http://www.tcpschool.com/java/java_collectionFramework_concept)
- [x] [인텔리제이 EOL 자동화](https://velog.io/@d-h-k/intellij-%ED%8C%8C%EC%9D%BC%EB%81%9D%EC%97%90-%EA%B0%9C%ED%96%89%EC%9D%84-%EC%9E%90%EB%8F%99%EC%9C%BC%EB%A1%9C-%EC%B6%94%EA%B0%80%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95)
- [ ] 배열 대신 `ArrayList`를 사용하는 이유는 뭘까?
- [x] `List`, `ArrayList`와 제네릭 : lucas 참조
- [ ] 객체지향생활체조 원칙
- [ ] 단위테스트를 하는 방법
- [ ] 접근제어자와 객체지향
- 구현
  - [ ] 4단계 리팩토링
### 3월 9일 목요일
- 학습 키워드 : OOP, getter, setter, `UIEvent`, 비동기 이벤트
  - [ ] `Setter` 사용을 지양하는 이유? `Getter`는 괜찮은가?
  - [ ] `DTO`의 역할
- 구현
  - 5단계 실행결과 출력
  - 6단계 GUI 구현하기 (선택)
### 3월 10일 금요일
- [ ] 클래스와 메서드
- [ ] 복습 및 회고 관련 블로깅

---
## 구현
### 1단계 : 기본 기능 구현
- 기능 요구사항
  - [x] n명의 사람과 m개의 사다리 개수를 입력할 수 있어야 한다.
  - [x] 사다리의 라인은 랜덤 값에 따라 있거나 없을 수도 있다.
  - [x] 사다리가 있으면 -를 표시하고 없으면 " " (공백문자)를 표시한다. 양옆에는 |로 세로를 표시한다.
  - [x] 사다리 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 2단계 : 리팩토링
- 프로그래밍 요구사항
  - [x] 메서드의 크기가 최대 10라인을 넘지 않도록 구현한다.
  - [x] 메서드가 한 가지 일만 하도록 최대한 작게 만들어라.
  - [x] 들여쓰기(indent) depth를 2단계에서 1단계로 줄여라.
    - depth의 경우 if 문을 사용하는 경우 1단계의 depth가 증가한다. if 문 안에 while 문을 사용한다면 depth가 2단계가 된다.
  - [x] else를 사용하지 마라.
  - [x] 구현 순서를 고려하면서 프로그래밍한다.
  - [x] `naming convention`을 지키면서 프로그래밍한다.

### 3단계 : 사다리 모양 개선
- 기능 요구사항 
  - [x] 사다리 게임에 참여하는 플레이어의 이름을 최대 5글자까지 부여한다.
  - [x] 사다리 출력시 이름도 같이 출력한다. 
  - [x] 사람 이름은 쉼표(,)를 기준으로 구분한다. 
  - [x] 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다. 
- 프로그래밍 요청사항
  - [x] 배열 대신 `ArrayList`와 `Generic`을 활용해 구현한다.

### 4단계 : 리팩토링2
- 프로그래밍 요구사항
	- [ ] 로직을 구현하는 코드에 단위 테스트가 존재해야 한다. 단, UI 처리 로직(System.in, System.out)은 테스트에서 제외한다.
	- [x] 각각의 역할에 맞도록 패키지를 분리하고 접근 제어자를 적절히 사용하도록 리팩토링한다.

### 5단계 : 실행결과 출력

### 6단계 : (선택) GUI 구현하기
