package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((x)->(x%2!=0)),
    CHECK_IF_EVEN((x)->(x%2==0)),
    CHECK_IF_NEGATIVE((x-> x < 0)),
    CHECK_IF_POSITIVE(x-> x > 0);

    private final Predicate<Integer> integerPredicate;
     CheckInteger(Predicate<Integer> integerPredicate){
        this.integerPredicate=integerPredicate;
    }

    public Predicate<Integer> getIntegerPredicate() {
        return integerPredicate;
    }
}
