package exercises.technology;

public abstract class AbstractEntity {
    private int id;
    private static int count = 0;

    public AbstractEntity() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }
}
