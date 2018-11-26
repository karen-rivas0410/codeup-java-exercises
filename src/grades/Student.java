package grades;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String _name;
    private List<Integer> _grades;


    public Student() {}

    public Student(String _name, int _grades) {
        this._name = _name;
        this._grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this._name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this._grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int average = 0;
        for (int i = 0; i < this._grades.size(); i += 1) {
            average += this._grades.get(i);
        }

        ///alternative is to use the enhanced loop
        for (int grade : this._grades) {
            average += grade;
        }
        return (double) average / this._grades.size();
    }

    public static void main(String[] arg){

        Student s1 = new Student();
        s1.addGrade(88);
        s1.addGrade(50);
        System.out.println(s1.getGradeAverage());


    }

}
