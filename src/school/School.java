package school;

import java.util.*;
import school.humanlesson.*;

public class School {

    public static void main(String[] args) {        
        
        Lesson[] lessons = {
            new Lesson("Sport", Hardness.EASY),
            new Lesson("Math", Hardness.MODERATE),
            new Lesson("Physycs", Hardness.HARD),
            new Lesson("Chemistry", Hardness.HARD),
            new Lesson("Biology", Hardness.HARD),
            new Lesson("Litriture", Hardness.MODERATE),
            new Lesson("Ana dili", Hardness.MODERATE),
            new Lesson("Alman dili", Hardness.MODERATE),
            new Lesson("Rus dili", Hardness.MODERATE),
            new Lesson("Music", Hardness.EASY),
            new Lesson("History", Hardness.MODERATE)
        };
                
        List<Student> students = Arrays.asList(
            new Student ( 14 , "Islam", 5, lessons[3]),
            new Student ( 13 , "Ramin", 4, lessons[1]),
            new Student ( 12 , "Nargiz", 5, lessons[4]),
            new Student ( 13 , "Aslan", 3, lessons[5]),
            new Student ( 14 , "Lamiya", 5, lessons[0]),
            new Student ( 12 , "Huseyn", 4, lessons[10]),
            new Student ( 14 , "Taleh", 4, lessons[2]),
            new Student ( 15 , "Perviz", 5, lessons[1]),
            new Student ( 13 , "Kamale", 5, lessons[0]),
            new Student ( 15 , "Gundar", 3, lessons[2]),            
            new Student ( 14 , "Saleh", 4, lessons[9]),
            new Student ( 14 , "Osman", 4, lessons[8]),
            new Student ( 11 , "Nasib", 5, lessons[7]),
            new Student ( 11 , "Jamal", 4, lessons[9]),
            new Student ( 13 , "Rafael", 5, lessons[11]),
            new Student ( 12 , "Gunay", 4, lessons[5]),
            new Student ( 15 , "Mehin", 5, lessons[6]));
                
                
        List<Teacher> teachers = Arrays.asList(
            new Teacher(32, "Mehriban", lessons[0]),
            new Teacher(40, "Letefet", lessons[1]),
            new Teacher(29, "Vugar", lessons[2]),
            new Teacher(51, "Elmire", lessons[3]),
            new Teacher(44, "Vusal", lessons[4]),
            new Teacher(35, "Zulfugar", lessons[5]),
            new Teacher(39, "Natiq", lessons[6]),
            new Teacher(47, "Sevindik", lessons[7]),
            new Teacher(26, "Ismira", lessons[8]),
            new Teacher(52, "Hasan", lessons[9]),
            new Teacher(48, "Mehmud", lessons[10]),
            new Teacher(36, "Aysel", lessons[11]));
        
        
        
        System.out.println("Students that get 5 for their lessons: ");

        students.stream().filter(x -> x.getMark() == 5).forEach(System.out::print);
        
        System.out.println("Teachers that have EASY lessons: ");

        teachers.stream().filter(x -> x.getLesson().getHardness() == Hardness.EASY).forEach(System.out::print);
        
        System.out.println("Students that got good mark (4 or 5) for hard lessons: ");
        
        students.stream().filter(x -> x.getLesson().getHardness() == Hardness.HARD).filter(x -> x.getMark() > 3).forEach(System.out::print);
        
    }
    
}
