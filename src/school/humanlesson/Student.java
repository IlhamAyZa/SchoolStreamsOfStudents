package school.humanlesson;

public class Student {

    int age;
    String name;
    int mark;
     Lesson lesson;


    public Student(int age, String name, int mark, Lesson lesson) {
        this.age = age;
        this.name = name;
        this.mark = mark;
         this.lesson = lesson;
    }

    // Getter and Setter
    public void setAge(int mark) {
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

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
    
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Lesson getLesson() {
        return lesson;
    }
}
