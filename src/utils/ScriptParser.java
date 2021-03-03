package utils;

import java.util.ArrayList;
import java.util.List;

public class ScriptParser {

    public static String getScriptedResult(String str) {
        String numRes = ExpressionParser.get(ScriptParser.getArithmeticExpression(str));
        String res = getScript(numRes);
        return res;
    }

    public static String getArithmeticExpression(String str) {
        String[] tempArray = str.split(" ");
        String res = "";
        for (int i = 0; i < tempArray.length; i++) {
            if (!tempArray[i].contains("-")) {
                res += getSingleDigitValues(tempArray[i]);
            } else if (tempArray[i].contains("-")) {
                String[] t = tempArray[i].split("-");
                for (int j = 0; j < t.length; j++) {
                    res += getSingleDigitValues(t[j]);
                }
            }
        }
        return res;
    }

    public static String getSingleDigitValues(String str) {
        String res = "";
        switch (str) {
            case "one":
                res += "1";
                break;
            case "two":
                res += "2";
                break;
            case "three":
                res += "3";
                break;
            case "four":
                res += "4";
                break;
            case "five":
                res += "5";
                break;
            case "six":
                res += "6";
                break;
            case "seven":
                res += "7";
                break;
            case "eight":
                res += "8";
                break;
            case "nine":
                res += "9";
                break;
            case "zero":
                res += "0";
                break;
            case "plus":
                res += "+";
                break;
            case "minus":
                res += "-";
                break;
            case "multiply":
                res += "*";
                break;
            case "divide":
                res += "/";
                break;
            case "curly-brace-open":
                res += "(";
                break;
            case "curly-brace-close":
                res += ")";
                break;
            default:
                break;
        }
        return res;
    }

    public static String getScript(String str) {
        List<String> res = new ArrayList<>();
        String[] tempArray = str.split("");
        for (int i = 0; i < tempArray.length; i++) {
            switch (tempArray[i]) {
                case "1":
                    res.add("one");
                    break;
                case "2":
                    res.add("two");
                    break;
                case "3":
                    res.add("three");
                    break;
                case "4":
                    res.add("four");
                    break;
                case "5":
                    res.add("five");
                    break;
                case "6":
                    res.add("six");
                    break;
                case "7":
                    res.add("seven");
                    break;
                case "8":
                    res.add("eight");
                    break;
                case "9":
                    res.add("nine");
                    break;
                case "0":
                    res.add("zero");
                    break;
                case ".":
                    res.add("point");
                    break;
                default:
                    break;
            }
        }
        return String.join("-", res);
    }
}