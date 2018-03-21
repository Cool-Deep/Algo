package algo;

public class BubbleSort {
		public static void main(String[] args) {
			 BubbleSort ob = new BubbleSort();
		        int A[] = {64, 34, 25, 12, 22, 11, 90};
		        ob.bubbleSort(A);
		        System.out.println("Sorted array");
		        ob.printBubbleSort(A);
	System.out.println("Hello");
		}

		void bubbleSort(int A[]) {
			int n = A.length;
			for (int i = 0; i < A.length - 1; i++) {
				for (int j = 0; j < A.length - i - 1; j++) {

					if (A[j] > A[j + 1]) {

						// swap temp and arr[i]
						int temp = A[j];
						A[j] = A[j + 1];
						A[j + 1] = temp;
					}

				}

			}

		}
		
		void printBubbleSort(int A[]) {
			int n=A.length;
			for (int i=0; i<n; ++i)
	            System.out.print(A[i] + " ");
	        System.out.println();
			
		}

		
		
	}

	
	
	
	