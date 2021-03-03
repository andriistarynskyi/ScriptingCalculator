import utils.FileReader;
import utils.ScriptParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\astar\\IdeaProjects\\ScriptiingCalculator\\data.txt";
        List<String> dataList = FileReader.read(path);

        dataList.forEach(d -> System.out.println(d + " = " + ScriptParser.getScriptedResult(d) + "."));
    }
}