import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class COType {
    public final static Map<String, COType> types = new HashMap<String, COType>();

    private final String name;
    private final List<FieldDefinition> fields;

    public COType(String name, List<FieldDefinition> fields) {
        this.name = name;
        this.fields = fields;
    }
}
