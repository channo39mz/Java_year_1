package pack10_CSMovie;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MovieCounter {
    ArrayList<CSMovie> mList = new ArrayList<>();
    Set<String> uniqueTitle = new HashSet<>();
    public MovieCounter() {
        String row;
        int rowCount = 1;
        int incompleteCount = 0;
        String title;
        String rating;
        String genre;
        Integer year;
        String skipped_released;
        Double score;
        Integer votes;
        String director;
        String skipped_writer;
        String star;
        String country;
        Integer budget;
        long gross;
        String company;
        Integer runtime;

        try(Scanner input = new Scanner(Paths.get("pack10_CSMovie/movies.csv"))) {
            input.nextLine(); //skip header row
            while (input.hasNext()) {
                row = input.nextLine();
                rowCount++;
                String[] tokens = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (tokens.length < 15) {
                    incompleteCount++;
                    System.out.println(rowCount + " " + incompleteCount + " is incompleted");
                    continue; //skip this row
                } 
                title = tokens[0];   
                rating = tokens[1];
                genre = tokens[2];
                year = Integer.parseInt(tokens[3]);
                score = Double.parseDouble(parseDouble(tokens[5]));
                votes = (int) (Double.parseDouble(parseDouble(tokens[6])));
                director = tokens[7];
                star = tokens[9];
                country = tokens[10];
                budget = (int) (Double.parseDouble(parseDouble(tokens[11])));
                gross = (long) (Double.parseDouble(parseDouble(tokens[12])));
                company = tokens[13];
                runtime =  (int) (Double.parseDouble(parseDouble(tokens[14])));
                if (!uniqueTitle.contains(title)) {
                    mList.add(new CSMovie(title, rating, genre, 
                    year, score, votes, 
                    director, star, country, 
                    budget, gross, company, 
                    runtime));
                }   
                uniqueTitle.add(title);
            }
            System.out.print("There are " + incompleteCount + " rows of incompleted data ");
            System.out.println("from " + rowCount + " rows. (" + uniqueTitle.size()+ ") unique titles.");
            System.out.println("list size is " + mList.size());
        } catch (IOException e) {
            System.out.println("from IO error");
            e.printStackTrace();
        }
    }
    private static String parseDouble(String str) {
        if (str.isEmpty())
            return ".0";
        return str;
    }

    public Double q1() {
        // System.out.println(mList);
        Double a = mList.stream().mapToDouble(CSMovie::getScore).sum();
        // for(CSMovie L : mList){
        //     a += L.getScore();
        // }
        a =  a/mList.size();
        
        return a;
    }
    public List<CSMovie> q2() {
        return  mList.stream().filter(c -> c.getVotes() > 1900000).toList();
    }
    public CSMovie q3() {
        return mList.stream().max(Comparator.comparing(CSMovie::getGross)).orElseThrow(NoSuchElementException::new);
    }   
    public List<String> q4() {
        return mList.stream().map(CSMovie::getGenre).distinct().collect(Collectors.toList());
    }
    public List<String> q5() { 
        List<CSMovie> a = mList.stream().sorted(Comparator.comparingInt(CSMovie::getRuntime)).collect(Collectors.toList());
        return a.stream().map(e -> String.format("%-55s --> %s",e.getTitle(), e.getRuntime())).limit(5).collect(Collectors.toList());
    }

    public CSMovie[] q6() {
        List<CSMovie> a = mList.stream().sorted(Comparator.comparingInt(CSMovie::getBudget)).collect(Collectors.toList());
        CSMovie arr[] = new CSMovie[2];
        arr[1] = a.get(0);
        arr[0] = a.get(a.size()-1);
        return arr;
    }
    public List<CSMovie> q7(String genre) {
        List<CSMovie> a = mList.stream().filter(c -> c.getGenre().equals(genre)).sorted(Comparator.comparingDouble(CSMovie::getScore)).collect(Collectors.toList());
        List<CSMovie> b = new ArrayList<CSMovie>();
        b.add(a.get(a.size()-1));
        b.add(a.get(a.size()-2));
        b.add(a.get(a.size()-3));
        return b;
    }
    public List<CSMovie> q8() {
        List<CSMovie> a = mList.stream().filter(c -> c.getGenre().equals("Action"))
        .sorted(Comparator.comparingDouble(CSMovie::getScore)
        .thenComparing(CSMovie::getTitle).reversed()).limit(3).collect(Collectors.toList());

        return a;
    }
    public Map<String,Long> q9() {
        List<String> a = mList.stream().map(CSMovie::getGenre).distinct().collect(Collectors.toList());
        // System.out.println(a);
        Map<String,Long> b = new HashMap<String,Long>();  
        for(String i : a){
            Long k = mList.stream().filter(c -> c.getGenre().equals(i)).mapToLong(CSMovie::getGross).sum();
            b.put(i, k);
        }
        return b;
    }
    public Map<String,Long> q10() {
        List<String> a = mList.stream().map(CSMovie::getCompany).distinct().collect(Collectors.toList());
        // System.out.println(a);
        Map<String,Long> b = new HashMap<String,Long>(); 
        for(String i : a){
            List<CSMovie> w = mList.stream().filter(c -> c.getCompany().equals(i)).collect(Collectors.toList());
            long ans = w.size();
           
            b.put(i, ans);
        }
        Map<String,Long> c = new HashMap<String,Long>(); 
        c = b.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue(Long::compareTo))).limit(10)
                                      .collect(Collectors.toMap(
                                        Entry::getKey, Entry::getValue,
                                        (e1,e2) -> e1, LinkedHashMap::new
                                      ));  
        return c;
    }
    public CSMovie q11() {
        // Function most 'a' 
        // List<String> a = mList.stream().map(CSMovie::getTitle).collect(Collectors.toList());
        Function<CSMovie, Integer> countVowel = m -> {
            int cnt = 0;
            for (int i = 0; i < m.getTitle().length(); i++) {
                if (m.getTitle().charAt(i) == 'a'){
                    cnt++;
                }
            }
            return cnt;
        };

        CSMovie m = mList.get(0);
        int max = Integer.MIN_VALUE;
        for(CSMovie j : mList){
            int r = countVowel.apply(j);
            if (r > max){
                max = r;
                m = j;
            }
            // System.out.println(r);
        }
        // return m.get();
        return m;
    }
}
// https://www.baeldung.com/java-split-string-commas