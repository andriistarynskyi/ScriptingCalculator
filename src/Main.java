import utils.FileReader;
import utils.ScriptParser;

public class Main {
    public static void main(String[] args) {
        FileReader.read().forEach(d -> System.out.println(d + " = " + ScriptParser.getScriptedResult(d) + "."));
    }
}