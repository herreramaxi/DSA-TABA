/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsataba;

import java.util.ArrayList;

/**
 *
 * @author Maximiliano Herrera
 */
public class SearchArrayList<E> extends ArrayList<E> {

    private int _comparisons;

    public int getComparisons() {
        return _comparisons;
    }

    public int linearSearch(E key) {
        _comparisons = 0;
        int k = 0;

        while (k < this.size() && compare(k, key) < 0) {
            k++;
        }

        return k < this.size() && (compare(k, key) == 0) ? k : -1;
    }

    public int binarySearch(E key) {
        _comparisons = 0;
        int start = 0;
        int end = this.size() - 1;
        boolean found = false;
        int middle = 0;

        while ((start <= end) && !found) {
            middle = (start + end) / 2;

            int comparison = compare(middle, key);

            if (comparison == 0) {
                found = true;
            } else if (comparison < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return found ? middle : -1;
    }

    private int compare(int position, E key) {
        _comparisons++;

        return ((Comparable) get(position)).compareTo(key);
    }
}
