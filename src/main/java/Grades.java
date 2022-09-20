import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] pupils = grades.split(";");

        String studetn = "";
            for (String pupil : pupils) {
                String[] p = pupil.split(",");
                for (int i = 0; i < p.length; i++) {
                    String name = p[0];
                    String surname = p[1];
                    String subject = p[2];
                    String grade = p[3];
                    studetn = (capitalize(name) + " " + capitalize(surname) + " " + subject + " — " + gradeToString(grade));

                }
                System.out.println(studetn);
            }

    }

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "— Безупречно": {
                return "5";
            }
            case "— Потрясающе": {
                return "4";
            }
            case "— Восхитительно": {
                return "3";
            }
            case "— Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        String students = "";
        String student = "";
        List<String> list = new ArrayList<>();
        for (String pupil : grades) {
            String[] p = pupil.split(" ");
                String name = p[0];
                String surname = p[1];
                String subject = p[2];
                String grade = p[4];
                name = name.toLowerCase();
                surname = surname.toLowerCase();
                grade = gradeStringToInt(grade);
                student = String.join(",", name, surname, subject, grade);
                list.add(student);
        }

        students = String.join(";", list);

        return students;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        String[] grade = {"Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"};
        System.out.println(grades.serializeGrades(grade));
       // grades.gradeBeautifier("вероника,чехова,физика,5;анна,строкова,математика,4;иван,петров,геометрия,5");
    }
}