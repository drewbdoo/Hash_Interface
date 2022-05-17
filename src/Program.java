import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

//        //Print me my hash map
//        HashMap<String, String> hashmap = new HashMap<>();
//        hashmap.put("f.e", "for example");
//        hashmap.put("etc.", "and so on");
//        hashmap.put("i.e.", "more precisely");
//
//        printKeys(hashmap);
//        System.out.println("-----------");
//        printKeysWhere(hashmap, "i");
//        System.out.println("-----------");
//        printValueOfKeysWhere(hashmap, ".e");

        //Print me another hash
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "..."));

        printValues(hashmap);
        System.out.println("-------");
        printValueIfNameContains(hashmap, "prejud");



    }
    //prints all the values in the hashmap given as a param using the toString method of the Book objects
    public static void printValues(HashMap<String, Book> hashmap){
        for(String S : hashmap.keySet()){
            System.out.println(hashmap.get(S).toString());
        }

    }
    //prints only the Books in the given hashmap which name contains the given string using getname()
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
          for(Book S: hashmap.values()){
            if(S.getName().contains(text)){
                System.out.println(S);
            }
        }

    }
    //prints all the keys in the hashmap give as a parameter
    public static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());
    }

    //prints the keys in the hashmap given as a parameter, which contain the string given as a parameter
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String S : hashmap.keySet()) {
            if (S.contains(text)) {
                System.out.println(S);
            }
        }
    }

//prints the values in the given hashmap which contains the given string
        public static void printValueOfKeysWhere(HashMap < String, String > hashmap, String text){
        for (String S: hashmap.keySet()){
            if(S.contains(text)){
                System.out.println(hashmap.get(S));
            }
        }

        }

    }








