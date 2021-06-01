package org.practice;

import javafx.util.Pair;
import org.practice.service.MemoryStoreService;
import org.practice.service.impl.MemoryStoreServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        MemoryStoreService memoryStoreService = new MemoryStoreServiceImpl();

        while(true){

            String input = scanner.next();
            if(input.equals("put")){
                List<Pair<String, String>> pairlist = new ArrayList<>();
                String key = scanner.next();
                int noOfValues = scanner.nextInt();
                while(noOfValues >0 ){
                    pairlist.add(new Pair<String, String>(scanner.next(), scanner.next()));
                    noOfValues--;
                }
                try {
                    memoryStoreService.put(key, pairlist);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("put successful");
                continue;
            }

            if(input.equals("get")){
                String values = memoryStoreService.get(scanner.next());
                System.out.println("get result "+values);
                continue;
            }

            if(input.equals("delete")){
                memoryStoreService.delete(scanner.next());
                System.out.println("delete successfult");
                continue;
            }

            if(input.equals("search")){
                String value = memoryStoreService.search(scanner.next(), scanner.next());
                System.out.println("search result "+ value);
                continue;
            }
        }



    }
}
