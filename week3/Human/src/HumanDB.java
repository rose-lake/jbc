/**
 * Singleton Demo!
 */

import java.util.HashMap;

public class HumanDB {

    private static HumanDB single_instance = null;

    private HashMap<Integer, Human> dbHashMap;

    private HumanDB(){
        Human h1 = new Human("Blue", "Blond", 56, 140);
        Human h2 = new Human("Black", "Silver", 68, 165);
        Human h3 = new Human("Brown", "Red", 75, 190);
        Human h4 = new Human("Green", "Platinum", 84, 210);
        dbHashMap = new HashMap<Integer, Human>();
        dbHashMap.put(1, h1);
        dbHashMap.put(2, h2);
        dbHashMap.put(3, h3);
        dbHashMap.put(4, h4);
    }

    public static HumanDB getInstance(){

        if (single_instance == null) {
            single_instance = new HumanDB();
        }

        return single_instance;

    }

    public HashMap<Integer, Human> getHumanDB() {
        return dbHashMap;
    }

    public void setHumanDB(HashMap<Integer, Human> humanDB) {
        this.dbHashMap = humanDB;
    }

    @Override
    public String toString() {
        return "HumanDB{" +
                "dbHashMap=" + dbHashMap +
                '}';
    }

}
