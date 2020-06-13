package first;

public class Persoana {
    static Integer wage;
    String name;
    String job;
    int age;
    String ageTo="5";

    public static void main(String[] args) {
        this.age = age;
        this.name = name;
        this.job=job;
    }

    public Persoana (Integer wage) {
    }

    static void main(String[] args) {
        Persoana persoana = new Persoana(age: 30, name:"Anna", job:"QA");
        Integer newAge = Integer.parseInt(persoana.ageTo);
        System.out.println(newAge+persoana.age);
        System.out.println(newAge);
        System.out.println(persoana.toString());
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "age=" + age +
                ", name='" + name + '\''+
                ", job='" +job + '\''+
                '}';
    }

    public static void main(String[] args) {
        Persoana persoana = new Persoana(age: 30, name: "Anna", job: "QA");
        int total=persoana.age;
        System.out.println(persoana.age.(20));
        System.out.println(persoana.toString(20));
}

