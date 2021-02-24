package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class BookReader {
     private TreeMap<String ,Integer > mostCommon = new TreeMap<String, Integer>();
    File f ;
    private int numberOfRows=0;
    private int numberOfWords=0;
    private int numberOfCommas = 0;
    private int counterPeace = 0;
    private int counterWar = 0;

    public BookReader(String name) {
        this.f = new File(name);
    }

    public  void readBook(){
        try(
        Scanner sc = new Scanner(f);){
        while(sc.hasNextLine()){
            String row = sc.nextLine();
            System.out.println(row);
            row = row.replaceAll("\\s{2}", "").trim();
            row = row.toLowerCase();

            for (int i = 0; i < row.length(); i++) {
                if(row.charAt(i)==','){
                    numberOfCommas++;
                }
            }
            //  System.out.println(numberOfRows + " " + row);

            String[] wordsInRow = row.split("([^a-zA-Zа-яА-Я']+)'*\\1*");
            for (int i = 0; i < wordsInRow.length; i++) {
                counterPeace += countPeace(wordsInRow[i]);
                counterWar += countWar(wordsInRow[i]);
            }

            numberOfWords+= fillTreeMapWithWords(wordsInRow,mostCommon);
            numberOfRows++;
        }

        System.out.println("Броят редове е " + numberOfRows);
        System.out.println("Броят думи е " + numberOfWords);
        System.out.println("Броят запетайки е " + numberOfCommas);
        printTopTenWords(mostCommon);
        System.out.println("Война се среща " + counterWar );
        System.out.println("Мир се среща " + counterPeace);

        writeAllWordsToFiles(mostCommon);

    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    }

}

     int fillTreeMapWithWords(String[] wordsInRow,TreeMap<String,Integer> mostCommon){
        int countWord = 0;
        for (int i = 0; i < wordsInRow.length; i++) {
            if(wordsInRow[i] == "") {
                continue;
            }

            if(!mostCommon.containsKey(wordsInRow[i])){
                mostCommon.put(wordsInRow[i],1);
                countWord++;
            }else{
                mostCommon.put(wordsInRow[i],mostCommon.get(wordsInRow[i]) + 1);
                countWord++;
            }
        }


        return countWord;
    }

     void printTopTenWords(TreeMap<String,Integer> treeMap){
        int i = 1;
        for (Map.Entry<String,Integer > entry:entriesSortedByValues(treeMap)
        ) {
            i++;
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(i==11){
                break;
            }
        }

    }

     int countPeace(String word){
        if(word.equals("мир") || word.equals("мирът") || word.equals("мира")|| word.equals("мирния")|| word.equals("мирните")|| word.equals("мирно")){
            return 1;
        }else {
            return 0;
        }
    }

     int countWar(String word){
        if(word.startsWith("война")){
            return 1;
        }else{
            return 0;
        }
    }

     void writeAllWordsToFiles(TreeMap<String,Integer> treeMap) {

        TreeMap<String,ArrayList<String>> allWords = new TreeMap<>();
         for (Map.Entry<String,Integer> entry : entriesSortedByValues(treeMap)
              ) {
                    String name = entry.getKey().length()  + ".txt";
                if(!allWords.containsKey(name)){
                    allWords.put(name,new ArrayList<>());
                }
                allWords.get(name).add(entry.getKey());
        }

         for (Map.Entry<String,ArrayList<String>> a :allWords.entrySet()
              ) {
                File file = new File(a.getKey());
                try(PrintStream ps = new PrintStream(file)) {
                    for (Iterator it = a.getValue().iterator();it.hasNext();){
                        ps.println(it.next());
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

         }



         //        ArrayList<String> words;
//        int i = 1;
//        while(true){
//            words = new ArrayList<>();
//            for (Map.Entry<String, Integer> entry : entriesSortedByValues(treeMap)
//                 ) {
//                if(entry.getKey().length()==i){
//                    words.add(entry.getKey());
//                    mostCommon.remove(entry.getKey());
//
//                }
//            }
//            String name = i + "letters.txt";
//            File f =new File(name);
//            try(PrintStream ps = new PrintStream(f)){
//
//                for (Iterator it = words.iterator() ; it.hasNext();
//                     ) {
//                    ps.println(it.next());
//                }
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//                i++;
//            if(mostCommon.size()==0){
//                break;
//            }




    }





    static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1; // Special fix to preserve items with equal values
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
