import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyHeap {
    int[] elem;
    int usedSize;

    MyHeap(int[] array) {
        this.elem = Arrays.copyOf(array,array.length);
        this.usedSize = array.length;
    }

    public void createMinHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            siftDown(arr,i);
        }
    }

    private void siftDown(int[] arr, int parent) {
        int child = 2*parent+1;
        while(child< usedSize) {
            if(child+1< arr.length && arr[child] > arr[child+1]) {
                child++;
            }
            if(arr[parent] <=arr[child]) {
                break;
            }
            else {
                swap(arr,parent,child);
                parent = child;
                child = parent*2+1;
            }
        }
    }

    private void siftUp(int[]arr,int child) {
        int parent = (child-1)/2;
        while(child>0) {
            if(child+1<usedSize && arr[child+1] < arr[child]) {
                child++;
            }

        }

    }

    private void swap(int[] arr, int parent, int child) {
        int tmp = arr[child];
        arr[child] = arr[parent];
        arr[parent] = tmp;
    }
}

class Test {
    public static void main(String[] args) {
       int[] array = {27,15,19,18,28,34,65,49,25,37};
       MyHeap myHeap = new MyHeap(array);
       myHeap.createMinHeap(array);
    }
}

