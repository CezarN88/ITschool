package session15.challenges.equals_hashcode;

import java.util.Objects;

public class DatabaseEntity {

    private int id;
    private String name;
    private long timestamp;

    public DatabaseEntity(int id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatabaseEntity that = (DatabaseEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        DatabaseEntity entity1 = new DatabaseEntity(1, "name1", 1697914451);
        DatabaseEntity entity2 = new DatabaseEntity(2, "name2", 1697914451);

        System.out.println("entity1 equals entity2: " + entity1.equals(entity2));
    }
}