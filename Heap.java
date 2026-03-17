public class Heap {

//the actual storage structure for your heap
private int[] arr;
private int length;

//constructor for your heap - feel free to make one that takes in an array if you prefer for your testing purposes.
//note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing the array

public Heap() {
    arr = new int[100];
    length = 0;
}

//create this function to add elements to your heap - all heap properties must be preserved
//5 points
public void add(int toAdd) {
    arr[length] = toAdd;
    length++;
    siftUp(length - 1);
}

//remove the largest element of the heap (the root) and re-heapafy
//5 points
public void removeMax() {
    arr[0] = arr[length - 1];
    arr[length - 1] = 0;
    length--;
    siftDown(0);
}

 

//this should check and alter the tree after an item is inserted
//3 points
private void siftUp(int index) {
    while(index > 0){
        int parentIndex = (index-1)/2;
        if(arr[index] > arr[parentIndex]){
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[index];
            arr[index] = temp;
            index = parentIndex;
        }
        else{
            break;
        }
    }
}

//this should check and alter the tree after an item is deleted.
//3 points
private void siftDown(int index) {
    while(true){
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;
        int replace = index;

        if(leftChildIndex < length && arr[leftChildIndex] > arr[replace]){
            replace = leftChildIndex;
        }
        if(rightChildIndex < length && arr[rightChildIndex] > arr[replace]){
            replace = rightChildIndex;
        }
        if(index == replace){
            break;
        }
        int temp = arr[index];
        arr[index] = arr[replace];
        arr[replace] = temp;
        
        index = replace;
    }
}

//print function for testing
public void printArray(){
    System.out.println("Array: ");
    for(int i = 0; i < length; i++){
        System.out.println(" " + arr[i]);
    }
}

//4 points for syntax conventions.
}