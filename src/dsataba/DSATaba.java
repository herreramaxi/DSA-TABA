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
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        printComparisonsFromOneTo(10);
        printComparisonsFromOneTo(30);
        printComparisonsFromOneTo(50);
    }

    private static void printComparisonsFromOneTo(int topNumber) throws Exception {
        SearchArrayList<Integer> list = getListFromOneTo(topNumber);
        int searchedElement = list.size() + 1;

        System.out.println("List: " + list);
        System.out.println("Searching for: " + searchedElement);
        
        int index = list.linearSearch(searchedElement);

        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);

        index = list.binarySearch(searchedElement);
        if (index >= 0)
            throw new Exception("Item was found: " + searchedElement);
        
         System.out.println("");
    }

    private static SearchArrayList<Integer> getListFromOneTo(int elements) {
        SearchArrayList<Integer> list = new SearchArrayList<>();
        for (int i = 1; i <= elements; i++) {
            list.add(i);
        }

        return list;
    }
}
