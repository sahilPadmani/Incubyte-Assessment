package org.learning.Exceptions;

import lombok.Getter;

@Getter
public class ContainsNegativeNumbersException  extends RuntimeException {
    public ContainsNegativeNumbersException (String message) {
        super(message);
    }
}
