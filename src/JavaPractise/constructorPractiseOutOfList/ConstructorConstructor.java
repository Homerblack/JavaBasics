package src.JavaPractise.constructorPractiseOutOfList;

public class ConstructorConstructor {

    //setting name
    private final String name;
    //setting age
    private final int age;
    //setting age
    private final boolean isStudent;

    private ConstructorConstructor(Homer homer) {
        this.name = homer.name;
        this.age = homer.age;
        this.isStudent = homer.isStudent;
    }

    // creating getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsStudent() {
        return isStudent;
    }

    // creating setter
    public static class Homer {
        //setting name
        private String name;
        //setting age
        private int age;
        //setting age
        private boolean isStudent;

        public Homer name(String name) {
            this.name = name;
            return this;
        }

        public Homer age(int age) {
            this.age = age;
            return this;
        }

        public Homer isStudent(boolean isStudent) {
            this.isStudent = isStudent;
            return this;
        }

        public ConstructorConstructor build() {
            return new ConstructorConstructor(this);  // calls private constructor
        }


    }


}
