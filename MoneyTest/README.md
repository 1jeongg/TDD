
## Todo-List

- [x] $5 + 10CHF = $10 (환율이 2:1인 경우)
  - [x] $5 + $5 = $10
  - [x] $5 + $5 에서 Money 반환하기
  - [x] Bank.reduce(Money)
  - [x] Noney에 대한 통화 변환을 수행하는 Reduce
  - [x] Reduce(Bank, String)
  - [x] Sum.plus
  - [x] Expression.times
- [x] $5 x 2 = $10
- [x] amount를 private으로 만들기
- [x] Dollar 부작용(side effect) ?
- [x] equals()
- [x] 5CHF x 2 = 10CHF
- [x] Dollar/Franc 중복
- [x] 공용 equals
- [x] 공용 times
- [x] Franc와 Dollar 비교하기
- [x] 통화?
- [x] testFrancMultiplication 제거


## Review
- 미래에 코드를 읽을 다른 사람들을 염두에 둔 테스트 작성
- TDD와 여러분의 현재 개발 스타일을 비교해볼 수 있는 실험 방법을 제시했다.
- 또 한 번 선언부에 대한 수정이 시스템 나머지 부분으로 번져갔고, 문제를 고치기 위해 역시 컴파일러의 조언을 따랐다.
- 잠시 실험을 시도했는데 제대로 되지 않아서 버렸다. 달러 더하기 -> Money 반환