public class Person {
    private String name;
    private String surname;
    public Person(String name, String surname) throws IllegalAccessException {
        if((name==null)&&(surname==null)){
            throw new IllegalAccessException();
        }
        this.name = name;
        this.surname = surname;
    }
    public  String setFullName() throws IllegalAccessException {
        Person persoana1 = new Person("razv", "bine");

        //System.out.println(name + " " + surname);
        return  name + " " + surname;
    }

    public static void main(String[] args) {

    }
}
