package Day17;



public class BinarySearch2 {

	public static int binarySearch(int arr[], int target) {

		
			int arr1[] = {4,5,8,3,9,1,2,6};
			
	        int target1 = 8;
			        int left = 0;
			        
			        int right = arr1.length - 1;

			        while (left <= right) {
			            int mid = left + (right - left) / 2;

			          
			            if (arr1[mid] == target1)
			                return mid;

			            if (arr1[mid] < target1)
			                left = mid + 1;
			            else
			                right = mid - 1;
			        }
			        // if we reach here, then element was not present
			        return -1;
			    }

			
	}
	

