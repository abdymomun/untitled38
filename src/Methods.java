import java.util.ArrayList;

public class Methods implements S {

    @Override
    public void methos1(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().startsWith("A") || student.getName().startsWith("B")) {
                System.out.println(students.remove(i));
                i--;
            }
        }

    }

    @Override
    public void methos2(ArrayList<Student> students) {
        for (Student s: students) {
            if (s.getAge() > 15 && s.getMoney() > 2000){
                System.out.println(s);
            }
        }
    }

    @Override
    public void methos3(ArrayList<Student> students) {
        Student r = students.get(0);
        for (Student s: students) {
            if (s.getMoney() > r.getMoney()) {
                r = s;
        }


            }
        System.out.println(r +"rich man");
        }


    @Override
    public void methos4(ArrayList<Student> students) {
        Student r = students.get(0);
        for (Student s: students) {
            if (s.getGender().equals("F")) {
                if (s.getMoney() > r.getMoney()) {
                    r = s;
                }

            }
        }
        System.out.println(r +"rich man");
    }

    @Override
    public void methos5(ArrayList<Student> students) {
        for (Student s:students) {
            System.out.println(s.getName());
        }
    }

    @Override
    public void methos6(ArrayList<Student> students) {

        for (Student student : students) {
            student.setMoney(student.getMoney() + 1000);
        }
        System.out.println(students);
    }

    @Override
    public void methos7(ArrayList<Student> students) {
        System.out.println(students.get(0));
    }

    @Override
    public void methos8(ArrayList<Student> students) {
        System.out.println(students.size()+"students");
    }

    @Override
    public void methos9(ArrayList<Student> students) {
        ArrayList <Student>students1= new ArrayList<>();
        for (Student a: students) {
            if (a.getGender().equals("F")) {
                students1.add(a);
            }

        }
        System.out.println(students1);
    }
}

