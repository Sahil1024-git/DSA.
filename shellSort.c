#include<stdio.h>
void shellSort(int a[], int n) {
    // Outer loop for the gap
    for (int gap = n / 2; gap >= 1; gap /= 2) {
        
        // Middle loop: i will be incremented till j (as per your note)
        for (int j = gap; j < n; j++) {
            
            // Inner loop: moving backward from j by gap
            for (int i = j - gap; i >= 0; i -= gap) {
                
                // If the element on the left is greater, swap them
                if (a[i + gap] < a[i]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                } else {
                    // If no swap is needed, this "sub-list" is sorted
                    break; 
                }
            }
        }
    }
}


int main(){
    int n;
    printf("Enter the no. of elments: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the %d elements : ",n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    shellSort(arr,n);

    printf("Sorted Array : ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }printf("\n");

    return 0;

}