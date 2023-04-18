package lesson06;

import static lesson06.BloodType.A;
import static lesson06.BloodType.B;
import static lesson06.BloodType.AB;
import static lesson06.BloodType.O;

public enum CompatibleBloodTypes {
    FIRST(new BloodType[]{A, B, AB, O}),
    SECOND(new BloodType[]{A, B}),
    THIRD(new BloodType[]{A, AB}),
    FOURTH(new BloodType[]{A, O});

    private final BloodType[] types;

    CompatibleBloodTypes(BloodType[] types) {
        this.types = types;
    }
}
