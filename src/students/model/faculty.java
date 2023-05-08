package students.model;

public final class faculty {
    private final int id;
    private final String name;

   /* private final int course;

    private final String group;*/

    private static int innerId;

    public faculty(String name) {
        this.id = innerId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   /* public int getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }
    */

    @Override
    public String toString() {
        return name;
    }
   /* public int Course() {
        return course;
    }
    public String toGroup() {
        return group;
    } */
}

