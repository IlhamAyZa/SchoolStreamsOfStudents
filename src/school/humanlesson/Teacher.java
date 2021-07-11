package school.humanlesson;

public class Teacher {
    
    int age;
    String name;
    Lesson lesson;
    Student[] students ;

    public Teacher(int age, String name, Lesson lesson) {
        this.age = age;
        this.name = name;
        this.lesson = lesson;
    }

    // Getter and Setter
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Lesson getLesson() {
        return lesson;
    }
    
}
