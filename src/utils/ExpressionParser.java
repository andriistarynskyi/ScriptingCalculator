package utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionParser {
    public static String get(String str) {
        Object result = null;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("JavaScript");
        try {
            result = se.eval(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}