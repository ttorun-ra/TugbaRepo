package Day17;

public class BinarySearch {

	public static void main(String[] args) {
		// Returns index of x if it is present in arr[],
	    // else return -1
	    BinarySearch ob = new BinarySearch();
	    int arr[] = {1,2,3,4,5};
        int target = 4;
        
        int size = arr.length;
        
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(int arr[], int x) {

        int left = 0;//start from 0
        
        int right = arr.length - 1;//end position is 9

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;

                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

	}

