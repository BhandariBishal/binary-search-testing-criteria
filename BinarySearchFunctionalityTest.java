/**
 * @author Bishal Bhandari
 * Functionality-based IDM test cases for binary search implementation.
 * These test cases examine the core functionalities and behaviors of binary search,
 * focusing on the method's primary operations and outcomes.
 *
 * The blocks are sufficient because they cover:
 * 1. Search Result Categories:
 *    - Successful search (element found)
 *    - Unsuccessful search (element not found)
 *    - Special cases (empty array, single element)
 * 
 * 2. Search Position Categories:
 *    - Beginning of array
 *    - Middle of array
 *    - End of array
 *
 * 3. Algorithm Behavior Categories:
 *    - Single iteration cases
 *    - Multiple iteration cases
 *    - Loop termination conditions
 *
 * This coverage ensures testing of all functional aspects of binary search algorithm.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchFunctionalityTest {
    
    /**
     * Block 1: Testing successful search scenarios
     * Functionality-based approach focuses on core search behavior:
     * - Element found in first iteration
     * - Element found after multiple iterations
     * Insight: Verifies primary success path of the algorithm
     */
    @Test
    public void testSuccessfulSearch() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(0, BinarySearch.binarySearch(arr, 1));  // First element
        assertEquals(7, BinarySearch.binarySearch(arr, 15)); // Last element
        assertEquals(3, BinarySearch.binarySearch(arr, 7));  // Middle element
    }
    
    /**
     * Block 2: Testing unsuccessful search scenarios
     * Functionality-based approach examines search failures:
     * - Element not in array but within range
     * - Element outside array range
     * Insight: Verifies correct handling of non-existent elements
     */
    @Test
    public void testUnsuccessfulSearch() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 4));  // Value between elements
        assertEquals(-1, BinarySearch.binarySearch(arr, 0));  // Value below range
        assertEquals(-1, BinarySearch.binarySearch(arr, 10)); // Value above range
    }
    
    /**
     * Block 3: Testing search iterations
     * Functionality-based approach examines algorithm progression:
     * - Single iteration to find element
     * - Multiple iterations required
     * Insight: Verifies search efficiency and iteration behavior
     */
    @Test
    public void testSearchIterations() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(3, BinarySearch.binarySearch(arr, 7));  // Middle (one iteration)
        assertEquals(1, BinarySearch.binarySearch(arr, 3));  // Multiple iterations left
        assertEquals(6, BinarySearch.binarySearch(arr, 13)); // Multiple iterations right
    }
    
    /**
     * Block 4: Testing boundary search conditions
     * Functionality-based approach examines edge cases:
     * - Empty array handling
     * - Single element array
     * Insight: Verifies algorithm behavior at minimum input conditions
     */
    @Test
    public void testBoundaryConditions() {
        int[] emptyArr = {};
        int[] singleArr = {5};
        assertEquals(-1, BinarySearch.binarySearch(emptyArr, 1));
        assertEquals(0, BinarySearch.binarySearch(singleArr, 5));
        assertEquals(-1, BinarySearch.binarySearch(singleArr, 3));
    }
    
    /**
     * Block 5: Testing search position impact
     * Functionality-based approach examines position-based behavior:
     * - First position search
     * - Last position search
     * - Middle position search
     * Insight: Verifies consistent behavior across array positions
     */
    @Test
    public void testSearchPositions() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(0, BinarySearch.binarySearch(arr, 2));  // First position
        assertEquals(4, BinarySearch.binarySearch(arr, 10)); // Last position
        assertEquals(2, BinarySearch.binarySearch(arr, 6));  // Middle position
    }
    
    /**
     * Block 6: Testing algorithm termination
     * Functionality-based approach examines stopping conditions:
     * - Immediate termination cases
     * - Multiple iteration termination
     * Insight: Verifies proper loop termination in all scenarios
     */
    @Test
    public void testSearchTermination() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(-1, BinarySearch.binarySearch(arr, 0));  // Early termination
        assertEquals(-1, BinarySearch.binarySearch(arr, 8));  // Mid-search termination
        assertEquals(-1, BinarySearch.binarySearch(arr, 16)); // Late termination
    }
    
    /**
     * Block 7: Testing large dataset behavior
     * Functionality-based approach examines scale handling:
     * - Large array search efficiency
     * - Multiple iterations with large dataset
     * Insight: Verifies algorithm performance with larger inputs
     */
    @Test
    public void testLargeDataset() {
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i * 2;
        }
        assertEquals(25, BinarySearch.binarySearch(arr, 50));   // Middle search
        assertEquals(0, BinarySearch.binarySearch(arr, 0));     // Start search
        assertEquals(99, BinarySearch.binarySearch(arr, 198));  // End search
        assertEquals(-1, BinarySearch.binarySearch(arr, 199));  // Not found
    }
}