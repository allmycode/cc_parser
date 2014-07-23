import configuration.analysis.DepthFirstAdapter;
import configuration.node.AInstanceDef;
import configuration.node.ASimpleFieldDef;
import configuration.node.ATypeDef;
import configuration.parser.ParserException;

import java.util.ArrayList;
import java.util.List;

public class CTranslation extends DepthFirstAdapter {
    String typeName;
    List<FieldDefinition> fields;

    public List<PCOInstance> instances = new ArrayList<PCOInstance>();
    PCOInstance instance;

    @Override
    public void inATypeDef(ATypeDef node) {
        super.inATypeDef(node);
        typeName = node.getI().getText();
        System.out.println("type: " + typeName);
        fields = new ArrayList<FieldDefinition>();
    }

    @Override
    public void outATypeDef(ATypeDef node) {
        COType type = new COType(typeName, fields);
        COType.types.put(typeName, type);
    }

    @Override
    public void inAInstanceDef(AInstanceDef node) {
        super.inAInstanceDef(node);
        instance = new PCOInstance();
        instance.name = node.getO().getText();
        instance.type = node.getT().getText();
    }

    @Override
    public void outAInstanceDef(AInstanceDef node) {
        super.outAInstanceDef(node);
        instances.add(instance);
    }

    @Override
    public void caseASimpleFieldDef(ASimpleFieldDef node) {
        super.caseASimpleFieldDef(node);
        final String type = node.getType().getText();
        final String name = node.getName().getText();

        if (!FieldDefinition.isValidType(type))
            throw new RuntimeException(new ParserException(node.getType(),
                    "[" + node.getType().getLine() + "," + node.getType().getPos() + "] " + "Unknown type: " + type));

        System.out.println("\tfield: '" + name + "' of type: "+ type);

        fields.add(new FieldDefinition(name, type));
    }


}
