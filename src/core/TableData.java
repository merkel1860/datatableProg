package core;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "tableData")
@SessionScoped

public class TableData implements Serializable {
    private static final Name[] names = new Name[] {
            new Name("William", "Dupont"),
            new Name("Anna", "Keeney"),
            new Name("Mariko", "Randor"),
            new Name("John", "Wilson")
    };

    public Name[] getNames() { return names;}
}
