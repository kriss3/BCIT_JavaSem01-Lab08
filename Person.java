/**
 * A class to model a Person. 
 * This is implementation for Lab08
 * 
 * @author Gary Tong (Original creator)
 * @modifiedBy Krzysztof Szczurowski
 * @version 1.1
 * @date 2016-10-28
 * @since 11/20/2016
 */
public class Person
{
    // these are instance variables.
    // every instance of this Person class has their own instance variable
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    // static fields are shared across all instances
    // in other words, every object created from this Person class will share the same counter variable
    public static int counter = 0;
    
    // constants are declared with the final keyword
    // this means these variables are immutable; they can not be changed
    // by convention, they are in all uppercase with _ denoting spaces
    public static final double PI = 3.14159;
    public static final int NUMBER_OF_SECONDS_IN_MINUTES = 60;

    /**
     * Default constructor.
     */
    public Person()
    {
        this.firstName = "Gary";
        this.lastName = "Tong";
        this.age = 30;
        this.height = 185;
        counter++;
    }    

    // overloaded constructors look at the parameter lists
    // this change in signature allows more than one constructor to be defined
    // this is known as overloading
    // provides the programmer a few options to instantiate a Person object


    /**
     * New instance of a Person, with first name and last name
     *
     * @param firstName Sets the first name of the Person.
     * @param lastName Sets the last name of the Person.
     */
    public Person(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
        counter++;
    }

    /**
     * New instance of the Person, with age, first name, last name, and height.

     * This is an overload ctor from String, String, int, double
     *
     * @param age Sets the age of the Person.
     * @param firstName Sets the first name of the Person.
     * @param lastName Sets the last name of the Person.
     * @param height Sets the height of the Person.
     */
    public Person(int age, String firstName, String lastName, double height)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);
        counter++;
    }

    /**
     * New instance of the Person, with first name, last name, age and height.
     *
     * This is an overload ctor from int, String, String, double
     *
     * @param firstName Sets the first name of the Person.
     * @param lastName Sets the last name of the Person.
     * @param age Sets the age of the Person.
     * @param height Sets the height of the Person.
     */
    public Person(String firstName, String lastName, int age, double height)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);

        // every time we create a Person object, increase the counter
        counter++;
    }

    /**
     * Mutator method for the counter.
     * @param _counter Set the counter to this value.
     */
    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    /**
     * Accessor method for the counter
     * @return The counter representing the number of Person objects created.
     */
    public int getCounter()
    {
        return counter;
    }

    /**
     * Gets the first name of the Person.
     * @return the first name of the Person.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the last name of the Person.
     * @return The last name.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the age of the Person.
     * @return The age in years.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Gets the height of the person.
     * @return The height in cm.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Determines the age group of this Person based on the age field.
     */
    public void printAgeGroup()
    {
        // use a switch statement to test the variable age against the different cases
        switch(age)
        {
            // if age is 30, execute the following
            case 30:
                //
                System.out.println("Thirty!");
                // break means to break out of the switch
                // if break isn't here, it would test to see if age is 40
                break;
            case 40:
                System.out.println("Forty!");
                break;            
            default:
                System.out.println("Not found!");           
        }
    }


    /**
     * Sets the first name of the new Person; <br>
     * Verifies passed parameter against null and an empty string; <br>
     * calls displayError(<String>) if any above is true;
     * @param firstName The new first name of the person.
     */
    public void setFirstName(String firstName)
    {
        if(firstName == null || firstName.equals(""))
        {
            displayError(firstName);
            this.firstName  = "Ed";
        }
        else
        {
            this.firstName = firstName;
        }
    }

    /**
     * Sets the last name of the Person.
     * Verifies passed parameter against null and an empty string; <br>
     * calls displayError(<String>) if any above is true;
     * @param lastName The new last name of the Person.
     */
    public void setLastName(String lastName)
    {
       if(lastName == null || lastName.equals(""))
        {
            displayError(lastName);
            this.lastName  = "Gein";
        }
        else
        {
            this.lastName = lastName;
        }
    }

    /**
     * Sets the age of the Person
     * @param age The new age of the Person if it's positive.
     */
    public void setAge(int age)
    {
        if(age > 0)
        {
            this.age = age;            
        }
    }

    /**
     * Sets the height of the Person
     * @param height The new height of the Person if it's positive.
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Returns a String with the full name
     * @return a String with full name and brief introduction.
     */
    public String getNameTag()
    {
        return "Hello, my name is " + firstName + " " + lastName;
    }

    /**
     * Print details of this person.
     */
    public void printNameTag()
    {
        // some examples of string concatenation
        System.out.println(30 + 30);
        System.out.println("30" + 30);
        System.out.println(30 + "30" + 30);
        System.out.println(30 + 30 + "30" + 30); 

        // 30 will be added to age because both 30 and age integers; arithmetic is performed
        // then it will be concatenated with the following string
        // at the end we are in a String and integer situation, so String concatenation takes place over arithmetic
        System.out.println(30 + age + "Hello, my name is " + firstName + " " + lastName + ". And my age is " + 30 + age  );
    }

    /**
     * Returns a boolean indicating if this person qualifies for a discount, based on their age.
     *
     * @return true if they qualify for discount, false if they don't
     */
    public boolean qualifiesForDiscount()
    {
        boolean qualifies = false;
        
        if(age < 19)
        {
           qualifies = true;
        }
        // both age >= 19 AND age <= 65 have to be true in order for the code below to run
        // try || and !=
        // || means EITHER side can be true, not both
        else if(age >= 19 && age <= 65)
        {
            qualifies = false;
        }
        
        return qualifies;
    }
    
    /**
     * @return The number of times a Person object was instantiated.
     */
    public String getNumberOfTimesCreated()
    {
        String howMany = "too many times!";
        
        switch(counter)
        {
            case 0:
                howMany = "none";
                break;
            case 1:
                howMany = "once";
                break;
            case 2:
                howMany = "twice";
                break;
        }
        
        return howMany;
    }
    
    private void displayError(String value)
    {
        String result = "";
        result = value == null ? "null" : "<Empty String>";
        
        System.out.println("This is crazy! Why? Why? Why !!!\n" +
                           "Wrong value passed to the class !!! \n" +
                           "You have entered: " + result);
    }
}















