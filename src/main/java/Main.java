import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob");

        PhoneNumber phoneNumber = new PhoneNumber(986);

        Person person1 = new Person("Johnny");

        PhoneNumber phoneNumbere = new PhoneNumber(80696887);


        HashMap<Person, PhoneNumber> personPhoneNumberHashMap = new HashMap<>();
        personPhoneNumberHashMap.put(person, phoneNumber);

        personPhoneNumberHashMap.put(person1,phoneNumbere);


        for (PhoneNumber i : personPhoneNumberHashMap.values()) {
            System.out.println(i);
        }

            System.out.println("=====================");
            //looping through values

        for (Person i : personPhoneNumberHashMap.keySet()) {
            System.out.println(i);
        }
                System.out.println("=====================");

                //looping through keys


                personPhoneNumberHashMap.forEach((k, v) -> System.out.println(k + " " + v));
                System.out.println("=====================");
                //looping through key and values


                //Printing methods
                HashMapMethods.PrintKey(personPhoneNumberHashMap);
                System.out.println("=====================");

                HashMapMethods.PrintValues(personPhoneNumberHashMap);
                System.out.println("=====================");

                HashMapMethods.PrintKeysandValues(personPhoneNumberHashMap);





            }
        }


