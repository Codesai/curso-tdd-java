package problematic_discount;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    public static Money oneThousand() {
        return new Money(aValueOf(1000));
    }

    public static Money oneHundred() {
        return new Money(aValueOf(100));
    }

    public static Money amount(double amount) {
        return new Money(aValueOf(amount));
    }

    private final BigDecimal value;

    public Money(BigDecimal value) {
        this.value = value;
    }

    public Money reduceBy(int percentage) {
        BigDecimal newValue = value.multiply(aValueOf(100 - percentage)).divide(aValueOf(100));
        return new Money(newValue);
    }

    public boolean moreThan(Money other) {
        return value.compareTo(other.value) > 0;
    }

    private static BigDecimal aValueOf(int amount) {
        return new BigDecimal(amount);
    }

    private static BigDecimal aValueOf(double amount) {
        return new BigDecimal(amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(value, money.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
