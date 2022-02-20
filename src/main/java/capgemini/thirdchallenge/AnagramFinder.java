package capgemini.thirdchallenge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Algorithm that finds all the pair anagram in a String.
 */
public class AnagramFinder {
    /**
     * Method that find the pair anagrams in a String.
     *
     * With the follow steps:
     * 1 - Find all the subStrings in the original String with two for loops.
     * 2 - Convert the string in subsStrings and put then in an Array.
     * 3 - Sort the subStrings inside the Array to be easier to compare with another subString.
     * 4 - Convert the Array in a String again to put as key in the HashMap.
     * @param s
     * @return tue number of pair anagrams in the String.
     */
    public static int findAnagrams(String s){
        HashMap<String, Integer> map= new HashMap<>();
        //Acha todas as subStrings
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                //Transforma as subStrings em um array.
                char[] subStringArray = s.substring(i, j + 1).toCharArray();
                //Ordena os elementos do Array
                Arrays.sort(subStringArray);
                //Transforma o Array em String novamente
                String sortedArray = new String(subStringArray);
                //Verifica as ocrrências das subStrings
                if (map.containsKey(sortedArray))
                    map.put(sortedArray, map.get(sortedArray)+1);
                else
                    map.put(sortedArray, 0);
            }
        }
        int anagramPairCount = 0;
        //Soma os anagramas possíveis
        for(String key: map.keySet()){
            anagramPairCount += map.get(key);
        }
        return anagramPairCount;

        //mostra todas as substrings ordenadas
        //map.entrySet().forEach(entry -> {System.out.println(entry.getKey() + " " + entry.getValue());});

    }
}
