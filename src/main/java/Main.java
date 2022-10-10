import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob");

        PhoneNumber phoneNumber = new PhoneNumber(80887);


        HashMap<Person, PhoneNumber> personPhoneNumberHashMap = new HashMap<>();
        personPhoneNumberHashMap.put(person, phoneNumber);


        for (var entry : personPhoneNumberHashMap.entrySet()) {
            System.out.println(entry.getValue());

            //looping through values

            for (var entries : personPhoneNumberHashMap.entrySet()) {
                System.out.println(entries.getKey());

                //looping through keys


                personPhoneNumberHashMap.forEach((k, v) -> System.out.println(k + " " + v));

                //looping through key and values


                //Printing methods
                HashMapMethods.PrintKey(personPhoneNumberHashMap);

                HashMapMethods.PrintValues(personPhoneNumberHashMap);

                HashMapMethods.PrintKeysandValues(personPhoneNumberHashMap);



            }
        }
    }
}





