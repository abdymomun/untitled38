
    public class Student {
        private String name;
        private int age;
        private String gender;
        private double money;
        private String surname;
        public Student(){}

        public Student(String name, int age, String gender, double money, String surname) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.money = money;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public double getMoney() {
            return money;
        }

        public String getSurname() {
            return surname;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public String toString() {
            return name + " " + surname + ", " + age + " years old, " + gender + ", $" + money;
        }
    }