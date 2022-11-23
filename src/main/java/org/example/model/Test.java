package org.example.model;

public class Test {

    public static void main(String[] args) {
        Person amin1 = new Person(1,"ff","t","tt",new AppUser("asTTT","er",AppRole.ROLE_APP_USER));
        Person amin2 = new Person(1,"ff","t","tt",new AppUser("as","er",AppRole.ROLE_APP_USER));
        //System.out.println(amin1.equals(amin2)); // true
        System.out.println(amin1.hashCode());
        System.out.println(amin2.hashCode());
        System.out.println(amin1.hashCode() == amin2.hashCode());





        /*Person amin = new Person();
        amin.setFirstName("Amin");
        amin.setLastName("Ranjbar");
        amin.getId();
        amin.setEmail("m.amin.ranjbar@gmail.com");
        System.out.println(amin.getSummary());

        TodoItem item1 = new TodoItem();
        item1.setTitle("activity 1");
        item1.setCreator(amin);
        item1.setDeadLine();

         */
        


    }

}
