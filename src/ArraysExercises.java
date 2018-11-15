import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] arg) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));//NEED THE TOSTRING IN ORDER TO LOOK INTO THE ARRAY


//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.
//        String person[] = new String[3];
//        person[0] = "Karen";
//        person[1] = "Bob";
//        person[2] = "David";


        ///OR YOU CAN DO THIS///

//        String person1[] = {"Karen", "Bob", "David"};
//
//
//        for (int i = 0; i < person1.length; i += 1) {
//                System.out.println(person1[i]);
        }

//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person
//        object to add to the passed array. It should return an array whose length is 1 greater than the passed array,
//        with the passed person object at the end of the array.

        Person p1 = new Person("Karen");
        Person p2 = new Person("Bob");
        Person p3 = new Person("David");

        Person[] people = {p1, p2, p3};

//        people[0] = p1;
//        people[1] = p2;
//        people[2] = p3;

        ////REGULAR FOR LOOP///

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i].getName());
        }

        ///ENHANCED FOREACH LOOP////

//        for (Person person : person) {
//            System.out.println(person.getName());
//        }
        public static Person[] addPerson() {  //remember to put the array name and the square brackets almost like

        }







    }
//}
