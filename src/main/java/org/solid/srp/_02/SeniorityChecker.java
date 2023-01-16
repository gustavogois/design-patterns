package org.solid.srp._02;

public class SeniorityChecker {
    public String checkSeniority(double experienceInYears){
        return  experienceInYears > 5 ?"senior":"junior";
    }
}
