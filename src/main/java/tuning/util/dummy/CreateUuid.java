package tuning.util.dummy;

import java.util.UUID;

public class CreateUuid {

    public String getUuid() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        CreateUuid createUuid = new CreateUuid();
        System.out.println(createUuid.getUuid());
        System.out.println(createUuid.getUuid());
    }
}
