package Pembelajaran_01;

public class Students {

    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    public Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    public String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    public String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    public Integer getSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    public Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }
}
