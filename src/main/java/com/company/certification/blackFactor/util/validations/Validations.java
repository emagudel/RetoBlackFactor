package com.company.certification.blackFactor.util.validations;

public class Validations {

    private Validations() {
    }

    public static boolean isEmptyOrNull(String value){
        return value == null || value.isEmpty();
    }
}
