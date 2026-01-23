package unit_tests;

import problematic_discount.Discount;
import problematic_discount.Money;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscountTest {

    @Test
    public void fix_me() {
        var discount = new Discount();

        var net = Money.amount(110);
        var total = discount.discountFor(net);

        assertThat(total).isEqualTo(Money.amount(104.5));
    }
}

