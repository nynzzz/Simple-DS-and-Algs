import java.util.Hashtable;

public class HashTable {

    // hashtable = a data structure that stores unique keys to values ex.<Integer, String>
    //             each key/value pair is known as an Entry
    //             FAST insertion, look up, deletion of key/value pairs
    //             good with big data sets

    public static void main(String[] args){
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //table.remove(777);

        for(Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
