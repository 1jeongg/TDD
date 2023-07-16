
## Todo-List

- [ ] $5 + 10CHF = $10 (환율이 2:1인 경우)
  - [ ] $5 + $5 = $10
  - [ ] $5 + $5 에서 Money 반환하기
  - [x] Bank.reduce(Money)
  - [ ] Noney에 대한 통화 변환을 수행하는 Reduce
  - [ ] Reduce(Bank, String)
- [x] $5 x 2 = $10
- [x] amount를 private으로 만들기
- [x] Dollar 부작용(side effect) ?
- [ ] Money 반올림? 
- [x] equals()
- [ ] hashCode()
- [ ] Equal null
- [ ] Equal object
- [x] 5CHF x 2 = 10CHF
- [x] Dollar/Franc 중복
- [x] 공용 equals
- [x] 공용 times
- [x] Franc와 Dollar 비교하기
- [x] 통화?
- [ ] testFrancMultiplication 제거


## Review
- 모든 중복이 제거되기 전까지는 테스트를 통과한 것으로 치지 않았다.
- 구현하기 위해 역방향이 아닌 **순방향**으로 작업했다.
- 앞으로 필요할 것으로 예상되는 객체(`Sum`)의 생성을 강요하기 위한 테스트를 작성했다.
- 빠른 속도로 구현하기 시작했다.(`Sum`의 생성자)
- 일단 한 곳에 캐스팅을 이용해서 코드를 구현했다가, 테스트가 돌아가자 그 코드를 적당한 자리로 옮겼다.
- 명시적인 클래스 검사를 제거하기 위해 다형성을 사용했다.