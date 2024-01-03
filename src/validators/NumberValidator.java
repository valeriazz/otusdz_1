package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

//    public boolean isNumber(String numberStr) {
//        try {
//            Integer.parseInt(numberStr);
//            return true;
//        } catch (NumberFormatException ignore) {
//            return false;
//        }
//    }

    public boolean isNumber(String numberStr, Pattern pattern) {
        //Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher = pattern.matcher(numberStr);
        return  matcher.find();
    }
}

