package com.company.certification.blankFactor.exceptions;

public class BlankFactorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BlankFactorException(Exception e) {
        super(e);
    }

}
