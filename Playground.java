/**
 *  Class to represent a playground (Implementation for Lab08)
 *
 *  Initial implementation from Lab 07 solution
 *
 *  @author Gary Tong
 *  @modifiedBy Krzysztof Szczurowski
 *  @since 11/20/2016
 *  @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2122563/View
 */
public class Playground
{
    // instance variable for a Person reference
    private Person p1;
    private Person p2;
    private Person[] people;
    
    /**
     * Run method to play with available classes for this lab
     */
    public void run()
    {
        // create a new instance of the Person class
        // the default ctor will set the default fields
        p1 = new Person();    // Gary Tong 30 185
        p2 = new Person();
        people = new Person[5];
        addPeople();
        int totalAge = 0;
        
        //for(Person p : people)
        //{
        //    totalAge = totalAge + p.getAge();
        //}
        int counter  = 0;
        while(counter < people.length)
        {
            totalAge = totalAge + people[counter].getAge();
            counter++;
        }
        
        // print default fields
        System.out.println("Initial setup");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());        
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println();
        
        // mutate the fields for P1
        p1.setFirstName("John");
        p1.setLastName("Doe");
        p1.setAge(50);
        p1.setHeight(170.5);
        
        //mutate the fields for P2
        p2.setFirstName("John");
        p2.setLastName("Doe");
        p2.setAge(71);
        p2.setHeight(165.5);

        // print newly mutated fields P1
        System.out.println("First persion object mutated: ");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println();
        
        //print newly mutated fields for P2
        System.out.println("Second person object mutated: ");
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        System.out.println(p2.getAge());
        System.out.println(p2.getHeight());
        System.out.println();
        
        System.out.println("What about their first names?");
        if(p1.getFirstName().equals(p2.getFirstName()))
        {
            System.out.println("Same names !");
        }
        else
        {
            System.out.println("Different names !");
        }
        System.out.println();
        
        int licznik = 0;
        for(Person p : people)
        {
            System.out.println("Person " + licznik + " age is: " + p.getAge());
            licznik++;
        }
        //Display Average Age in People Array
        System.out.println();
        System.out.println("Total Age: " + totalAge);
        System.out.println("Average Age in People Array is: " + totalAge / people.length);
    }
    
    public void addPeople()
    {
        SimpleRandom rand = new SimpleRandom(50);
        int counter = 0;
        for(Person p : people)
        {
            people[counter] = new Person();
            people[counter].setAge(people[counter].getAge() + rand.nextInt());
            counter++;
        }
    }
}