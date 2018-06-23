/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leonardo
 */
public abstract class Validate {

    public static boolean isValidEmail(String email) {
        boolean isValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static boolean isCPF(String CPF) {
        return (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999") || CPF.length() != 11 || CPF.trim().isEmpty());
    }

    public static String showCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."+ CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

}
