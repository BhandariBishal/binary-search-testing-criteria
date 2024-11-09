
public class BinarySearch {
	public static int binarySearch( int[] a, int key ) {
		int result = -1, high = a.length, low = 0, mid;
		while ( low <= high && result == -1 ) {
		mid = ( high + low) / 2;
		if ( a[mid] == key ) {
		result = mid;
		} else if ( a[mid] > key ) {
		high = mid -1;
		} else {
		low = mid + 1;
		}
		}
		return result;
		}

}
