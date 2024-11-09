/**
 * @author Bishal Bhandari
 *
 * Interface-based IDM test cases for binary search implementation.
 * These test cases examine each parameter (array and key) in isolation,
 * focusing on their characteristics rather than relationships.
 *
 * The blocks are sufficient because they cover:
 * 1. Array parameter characteristics:
 *    - Null array (invalid input)
 *    - Empty array (boundary case)
 *    - Single element array (minimal case)
 *    - Multiple element array (normal case)
 *    - Sorted array with duplicates (special case)
 *
 * 2. Key parameter characteristics:
 *    - Key less than all elements
 *    - Key greater than all elements
 *    - Key equal to existing element
 *    - Key between elements but not present
 *    - Key at array boundaries
 *
 * This coverage ensures complete testing of both parameters' domains independently.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchInterfaceTest {
    
	/**
	 * Block 1: Testing null array input
	 * Insight: This is a critical boundary case that tests robustness.
	 * - Tests system behavior with invalid input
	 * - Verifies proper exception handling
	 * - Essential for defensive programming
	 */
	@Test(expected = NullPointerException.class)
	public void testNullArray() {
	    int[] arr = null;
	    BinarySearch.binarySearch(arr, 5);
	}

	/**
	 * Block 2: Testing empty array
	 * Insight: Represents minimum valid input state.
	 * - Tests immediate exit condition
	 * - Verifies base case handling
	 * - Important for preventing array access errors
	 */
	@Test
	public void testEmptyArray() {
	    int[] arr = {};
	    assertEquals(-1, BinarySearch.binarySearch(arr, 5));
	}

	/**
	 * Block 3: Testing single element array
	 * Insight: Tests minimal non-empty case.
	 * - Verifies both success and failure paths
	 * - Tests simplest valid search scenario
	 * - Checks boundary between empty and multiple elements
	 */
	@Test
	public void testSingleElement() {
	    int[] arr = {1};
	    assertEquals(0, BinarySearch.binarySearch(arr, 1));  // Found case
	    assertEquals(-1, BinarySearch.binarySearch(arr, 2)); // Not found case
	}

	/**
	 * Block 4: Testing multiple elements
	 * Insight: Tests standard use case scenarios.
	 * - Verifies core algorithm functionality
	 * - Tests different positions (start, middle, end)
	 * - Ensures proper index calculation
	 */
	@Test
	public void testMultipleElements() {
	    int[] arr = {1, 3, 5, 7, 9};
	    assertEquals(0, BinarySearch.binarySearch(arr, 1));  // First position
	    assertEquals(4, BinarySearch.binarySearch(arr, 9));  // Last position
	    assertEquals(2, BinarySearch.binarySearch(arr, 5));  // Middle position
	}

	/**
	 * Block 5: Testing key less than all elements
	 * Insight: Tests lower boundary of search space.
	 * - Verifies correct handling of out-of-range values
	 * - Tests early termination condition
	 * - Checks lower bound comparison logic
	 */
	@Test
	public void testKeyLessThanAll() {
	    int[] arr = {1, 3, 5, 7, 9};
	    assertEquals(-1, BinarySearch.binarySearch(arr, 0));
	}

	/**
	 * Block 6: Testing key greater than all elements
	 * Insight: Tests upper boundary of search space.
	 * - Verifies behavior at upper limit
	 * - Tests proper loop termination
	 * - Checks upper bound comparison logic
	 */
	@Test
	public void testKeyGreaterThanAll() {
	    int[] arr = {1, 3, 5, 7, 9};
	    assertEquals(-1, BinarySearch.binarySearch(arr, 10));
	}

	/**
	 * Block 7: Testing key between elements
	 * Insight: Tests internal boundary conditions.
	 * - Verifies precise comparison behavior
	 * - Tests non-existent but valid range values
	 * - Checks mid-point calculation accuracy
	 */
	@Test
	public void testKeyBetweenElements() {
	    int[] arr = {1, 3, 5, 7, 9};
	    assertEquals(-1, BinarySearch.binarySearch(arr, 4));
	    assertEquals(-1, BinarySearch.binarySearch(arr, 6));
	}

	/**
	 * Block 8: Testing duplicate elements
	 * Insight: Tests special case handling.
	 * - Verifies behavior with non-unique elements
	 * - Tests first occurrence finding
	 * - Checks equality comparison consistency
	 */
	@Test
	public void testDuplicateElements() {
	    int[] arr = {1, 2, 2, 2, 3};
	    assertEquals(1, BinarySearch.binarySearch(arr, 2));
	}

	/**
	 * Block 9: Testing extreme values
	 * Insight: Tests system limits.
	 * - Verifies handling of integer bounds
	 * - Tests edge cases of data type
	 * - Checks computational accuracy at extremes
	 */
	@Test
	public void testExtremeValues() {
	    int[] arr = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
	    assertEquals(0, BinarySearch.binarySearch(arr, Integer.MIN_VALUE));
	    assertEquals(4, BinarySearch.binarySearch(arr, Integer.MAX_VALUE));
	}
}

