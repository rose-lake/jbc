/**
* Source: https://github.com/dave45678/HashmapExample/blob/master/HashmapExample/src/HashmapApp.java
* Thank you, dave45678!
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

public class HashMapExample
{
    public static void main( String[] args )
    {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put( "cat", "Meow" );
        map.put( "ape", "Squeak" );
        map.put( "dog", "Woof" );
        map.put( "bat", "Squeak" );
        System.out.println( "map = " + map );

        System.out.println("A cat says... " + map.get("cat"));
        System.out.println("A dog says... " + map.get("dog"));

        //iterating over values only
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }
        //iterating over keys only
        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
        }
        System.out.println();
        System.out.println("iterating over keys and values");
        //iterating over keys and values
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println();

        //writing keys and values to a file
        System.out.println("writing keys and values to a file");
        String filename = (System.getProperty("user.dir") + File.separatorChar +"animalNoises.txt");
        System.out.println(filename);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }

        //print both the key and the value on same line
        // for each key in the key set write the key, a tab and the value
        for (String key : map.keySet()) {
            System.out.println("write this line: " + key);
            writer.println(key + "\t" + map.get(key));
        }
        writer.close();

        //read from a file
        System.out.println("read from a file");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] key_value_pair = line.split("\t");
                System.out.println("KV Pair:" + key_value_pair[0] + " " + key_value_pair[1]);
                //the key is in key_value_pair[0]
                //the value is in key_value_pair[1]
                // now you could add it back to the hash map if it isn't there already

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }finally{

        }



    }
}
