package exercises.technology;

public class AbstractEntity {
    private int id;
    private static int idKeeper = 1;

    public AbstractEntity() {
        this.id =idKeeper;
        idKeeper++;
    }

    public int getId() {
        return id;
    }
}
