
## Todo-List

- [x] $5 + 10CHF = $10 (환율이 2:1인 경우)
  - [x] $5 + $5 = $10
  - [ ] $5 + $5 에서 Money 반환하기
  - [x] Bank.reduce(Money)
  - [x] Noney에 대한 통화 변환을 수행하는 Reduce
  - [x] Reduce(Bank, String)
  - [ ] Sum.plus
  - [ ] Expression.times
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
- 원하는 테스트를 작성하고, 한 단계에 달성할 수 있도록 뒤로 물렀다.\
- 좀 더 추상화된 선언을 통해 가지에서 뿌리로 일반화했다.
- 변경 후, 그 영향을 받은 다른 부분들을 변경하기 위해 컴파일러의 지시에 따랐다. (Expression에 `plus()`를 추가하기 등)