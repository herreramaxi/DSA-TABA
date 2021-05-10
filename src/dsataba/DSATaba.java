/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsataba;

/**
 *
 * @author Maximiliano Herrera
 */
public class DSATaba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        boolean printResultsForThreeCollections = false;

        if (printResultsForThreeCollections) {
            printComparisonsFromOneTo(10);
            printComparisonsFromOneTo(30);
            printComparisonsFromOneTo(50);
            
            return;
        }

        for (int i = 1; i <= 20; i++) {
               printComparisonsFromOneTo2(i*100);
        }     
    }

    private static void printComparisonsFromOneTo(int topNumber) throws Exception {
        SearchArrayList<Integer> list = getListFromOneTo(topNumber);
        int searchedElement = list.size() + 1;

        System.out.println("List: " + list);
        int index = list.linearSearch(searchedElement);

        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);

        index = list.binarySearch(searchedElement);
        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);
    }

    private static SearchArrayList<Integer> getListFromOneTo(int elements) {
        SearchArrayList<Integer> list = new SearchArrayList<>();
        for (int i = 1; i <= elements; i++) {
            list.add(i);
        }

        return list;
    }
    
      private static void printComparisonsFromOneTo2(int topNumber) throws Exception {
        SearchArrayList<Integer> list = getListFromOneTo(topNumber);
        int searchedElement = list.size() + 1;
     
        int index = list.linearSearch(searchedElement);

        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);

        index = list.binarySearch(searchedElement);
        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);
    }

}
