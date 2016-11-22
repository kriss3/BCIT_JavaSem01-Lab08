/**
 *  Class to represent a playground (Implementation for Lab08)
 *
 *  Initial implementation from Lab 07 solution
 *
 *  @author Gary Tong;<br> 
 *  Modified by Krzysztof Szczurowski
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
     * Run method to play with available classes for this lab;<br>
     * Uses number of private method calls for calculates and display purposes.
     */
    public void run()
    {
        // create a new instance of the Person class
        // the default ctor will set the default fields
        p1 = new Person();    // Gary Tong 30 185
        p2 = new Person();
        people = new Person[5];
        
        addPeople();
        double totalAge = calculateTotalAge();
        
        System.out.println("Initial setup");
        displayPerson(p1);
    
        p1.setFirstName("John");
        p1.setLastName("Doe");
        p1.setAge(50);
        p1.setHeight(170.5);
        
        System.out.println();
        System.out.println("First person object mutated: ");
        displayPerson(p1);
        
        p2.setFirstName("Maria");
        p2.setLastName("Sklodowska-Curie");
        p2.setAge(71);
        p2.setHeight(165.5);
        
        System.out.println();
        System.out.println("Second person object mutated: ");
        displayPerson(p2);
        
        System.out.println();
        System.out.println("What about their first names?");
        checkNames(p1, p2);
        
        System.out.println();
        displayPersonAge();
        
        System.out.println();
        displayResults(totalAge, people.length);
    }
    
    
    /**
     * Public method to add Person objects to people array;<br>
     * It takes no prameter, it returns no value;<br>
     * It uses SimpleRandom class to randomise age for each Person object added to people array; <br>
     */
    public void addPeople()
    {
        SimpleRandom rand = new SimpleRandom(50);
        int counter = 0;
        if(people != null)
        {
            for(Person p : people)
            {
                people[counter] = new Person();
                people[counter].setAge(people[counter].getAge() + rand.nextInt());
                counter++;
            }
        }
        else
        {
            System.out.println("... And the rest is history ... \nYou ran a public addPeople() method" + 
            " first. !WRONG!\nRun Playground's run() method first...");
        }
    }
    
    //Private helper methods to make run() method less messy;
    private double calculateTotalAge()
    {
        double totalAge = 0.0;
        int counter  = 0;
        while(counter < people.length)
        {
            totalAge = totalAge + people[counter].getAge();
            counter++;
        }
        //or 
        //for(Person p : people)
        //{
        //    totalAge = totalAge + p.getAge();
        //}
        return totalAge;
    }
    
    private void displayPerson(Person myPerson)
    {
        // print default fields
        System.out.println("Name Tag: " + myPerson.getFirstName() + " " + myPerson.getLastName());        
        System.out.println("Age: " + myPerson.getAge());
        System.out.println("Height: " + myPerson.getHeight());
    }
    
    private void checkNames(Person firstPerson, Person secondPerson)
    {
        if(firstPerson.getFirstName().equals(secondPerson.getFirstName()))
        {
            System.out.println("Same names !");
        }
        else
        {
            System.out.println("Different names !");
        }
    }
    
    private void displayPersonAge()
    {
        int licznik = 0;
        for(Person p : people)
        {
            System.out.println("Person " + licznik + " age is: " + p.getAge());
            licznik++;
        }
    }
    
    private void displayResults(double totalAge, int elementCount)
    {
       //Display Average Age in People Array
        System.out.println("Total Age: " + totalAge);
        System.out.printf("Average Age in People Array is: " + totalAge / elementCount); 
    }
}