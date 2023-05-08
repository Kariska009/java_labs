package students.model;

public final class YearOfBirth{
    private final int id;
    private final String name;

    private static int innerId;

    public YearOfBirth(String name) {
        this.id = innerId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

