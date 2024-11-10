package btap7;
import java.util.*;
public class Btap7 {

    public static void main(String[] args) {
//        Create and Add Elements to ArrayList
        ArrayList<String> friends = new ArrayList<>();
        friends.add("An");
        friends.add("Do");
        friends.add("Dang");
        friends.add("Hoang");
        friends.add("Vinh");
        System.out.println("Friends list: " + friends);

//        Remove an Element from ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5)); 
        System.out.println("List after removing number 5: " + numbers);

//        Traverse the ArrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("Ha Noi");
        cities.add("TP.HCM");
        cities.add("Hue");
        cities.add("Da Lat");
        System.out.println("Cities list:");
        for (String city : cities) {
            System.out.println(city);
        }

//        Search for an Element in ArrayList
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        boolean containsPython = languages.contains("Python");
        System.out.println("Does the list contain 'Python': " + containsPython);

//        Update an Element in ArrayList
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            integers.add(i);
        }
        integers.set(2, 100); 
        System.out.println("List after updating the 3rd element: " + integers);

//        Sort ArrayList
        ArrayList<Integer> unsortedNumbers = new ArrayList<>();
        unsortedNumbers.add(5);
        unsortedNumbers.add(3);
        unsortedNumbers.add(8);
        unsortedNumbers.add(2);
        unsortedNumbers.add(4);
        Collections.sort(unsortedNumbers); 
        System.out.println("List after sorting: " + unsortedNumbers);

//        Convert ArrayList to Array
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array); 
        System.out.println("Array after converting from ArrayList:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}