package com.company.certification.blackFactor.exceptions;

public class BlackFactorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BlackFactorException(Exception e) {
        super(e);
    }

}
