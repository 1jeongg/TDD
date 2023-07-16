
## Todo-List

- [ ] $5 + 10CHF = $10 (환율이 2:1인 경우)
- [ ] $5 + $5 = $10
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
- 큰 테스트를 작은 테스트($5 + 10CHF 에서 $5 + $5)로 줄여서 발전을 나타낼 수 있도록 했다.
- 우리에게 필요한 계산에 대한 가능한 메타포들을 신중히 생각해봤다.
- 새 메타포에 기반하여 기존의 테스트를 재작성했다.
- 테스트를 빠르게 컴파일했다.
- 테스트 실행했다.
- 진짜 구현을 만들기 위해 필요한 리팩토링을 약간의 전율과 함께 기대했다.