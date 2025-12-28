package JSONtoXML;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.databind.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
        public static void main(String[] args)throws Exception{

        File jsonFile = new File("jsonFile.json");
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(jsonFile);
        Iterator<Map.Entry<String,JsonNode>> fields = root.fields();

        while(fields.hasNext()){
            Map.Entry<String,JsonNode> entry = fields.next();
            String key = entry.getKey();
            JsonNode value = entry.getValue();
            System.out.println(key+" : "+ value);

        }

    }
}
