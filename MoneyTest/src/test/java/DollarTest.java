
import org.example.Bank;
import org.example.Expression;
import org.example.Money;
import org.example.Sum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DollarTest {
    @Test
    @DisplayName("$5 x 2 = $10")
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),  five.times(3));
    }
    @Test
    @DisplayName("equals")
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
    }
    @Test
    @DisplayName("5CHF x 2 = 10CHF")
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    @Test
    @DisplayName("통화")
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    @Test
    @DisplayName("$5 + $5 = $10")
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
    @Test
    @DisplayName("$5 + $5 = $10 - Sum 반환")
    public void testPlusReturnsSum(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend); // 피가산수
        assertEquals(five, sum.addend);
    }
    @Test
    @DisplayName("$3 + $4 = $7")
    public void testReduceSum(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
    @Test
    @DisplayName("Money에 대한 통한 변화를 수행하는 Reduce")
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }
    @Test
    @DisplayName("동일한 통화에 대해 환율이 같은가?")
    public void testIdentityRate(){
        assertEquals(1, new Bank().rate("USD", "USD") );
    }

    @Test
    @DisplayName("$5 + 10CHF = $10(환율이 2:1인 경우)")
    public void testMixedAddition(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }
}
