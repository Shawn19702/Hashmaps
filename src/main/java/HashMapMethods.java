import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void PrintKey(HashMap<Person, PhoneNumber> NamesandPhoneNumbers) {
        for (Person i : NamesandPhoneNumbers.keySet()) {
            System.out.println(i);
            //Method printing keys
        }

    }
    public static void PrintValues(HashMap<Person,PhoneNumber> Phonenumbervalues) {
        for (PhoneNumber i : Phonenumbervalues.values()) {
            System.out.println(i);
            //method printing values
        }
    }

        public static void PrintKeysandValues(HashMap<Person,PhoneNumber> Phonenumbervalues){
            Phonenumbervalues.forEach((k, v) -> System.out.println( k + " " + v));
//Method printing key and values

        }

    }

