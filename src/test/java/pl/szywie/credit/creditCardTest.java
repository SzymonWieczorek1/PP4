package pl.szywie.credit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class creditCardTest {
    @Test
    void itAllowsToAssignCreditLimit(){
        //a arrange / given
        CreditCard creditCard = new CreditCard();
        //a act / when
        creditCard.assignCreditCardLimit(BigDecimal.valueOf(1000));
        //a assert / then / expected
        assertEquals(BigDecimal.valueOf(1000), creditCard.getBalance());

    }
    @Test
    void TwiceLimit(){
        //a arrange / given
        CreditCard creditCard = new CreditCard();
        //a act / when
        creditCard.assignCreditCardLimit(BigDecimal.valueOf(2000));
        //a assert / then / expected
        assertThrows(CantAssignLimitTwiceException.class, () -> {
            creditCard.assignCreditCardLimit(BigDecimal.valueOf(2000));
        });

    }
}
