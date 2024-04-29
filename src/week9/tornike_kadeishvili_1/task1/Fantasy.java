package week9.tornike_kadeishvili_1.task1;

import java.util.List;
public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String TornikeKadeishvili;

    // TODO must be implemented
    @Override
    public String toString() {
        return "Fantasy by " + TornikeKadeishvili;
    }

    @Override
    public String getScratch1() {
        return "Some scratchy fantasy detail";
    }

    @Override
    public String getMeasure2() {
        return "Some measured fantasy detail";
    }

    @Override
    public String methodPierogi3(String argPhysical5) {
        return "Processed Pierogi with " + argPhysical5;
    }

    @Override
    public List<String> methodConnector4(String argCloud6) {
        return List.of("Connected to " + argCloud6);
    }
}
