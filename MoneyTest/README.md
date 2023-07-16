
## Todo-List

- [ ] $5 + 10CHF = $10 (환율이 2:1인 경우)
  - [x] $5 + $5 = $10
  - [ ] $5 + $5 에서 Money 반환하기
  - [x] Bank.reduce(Money)
  - [x] Noney에 대한 통화 변환을 수행하는 Reduce
  - [x] Reduce(Bank, String)
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
- 필요할 거라고 생각한 인자를 빠르게 추가했다.
- 코드와 테스트 사이에 있는 데이터 중복을 끄집어 냈다.
- 별도의 테스트 없이 전용(private) 도우미(helper) 클래스를 만들었다.
- 리팩토링하다가 실수했고, 그 문제를 분리하기 위해 또 하나의 테스를 작성하면서 계속 전진해 가기로 선택했다.