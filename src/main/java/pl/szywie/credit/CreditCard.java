package pl.szywie.credit;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal creditLimit;
    public void assignCreditCardLimit(BigDecimal creditLimit) {
        if (creditLimit != null) {
            throw new CantAssignLimitTwiceException();
        }
        this.creditLimit = creditLimit;
    }

    public Object getBalance() {
        return creditLimit;
    }
}
