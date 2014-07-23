import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FieldDefinition {
    private final String name;
    private final String type;

    public FieldDefinition(String name, String type) {
        this.name = name;
        this.type = type;
    }

    static Set<String> builtinTypes = new HashSet<String>(Arrays.asList("string", "int", "port", "bool"));
    public static boolean isValidType(String type) {
        return builtinTypes.contains(type) || COType.types.containsKey(type);
    }
}
