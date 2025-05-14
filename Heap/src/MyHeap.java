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
    //这样写效率太慢了
//    public void createMinHeap() {
//        for (int i = 0; i < this.elem.length; i++) {
//            siftDown(elem,i);
//        }
//    }
    public void createMinHeap() {
        for (int i = (usedSize-1-1)/2; i>=0; i--) {
            siftDown(elem,i);
        }
    }
    public void offer(int val) {
        grow();
        this.elem[usedSize] = val;
        siftUp(elem,usedSize);
        usedSize++;
    }

    public void poll() {
        usedSize--;
        swap(elem,0,usedSize);
        siftDown(this.elem,0);
    }
    private void siftDown(int[] arr, int parent) {
        int child = 2*parent+1;
        while(child< usedSize) {
            if(child+1< usedSize && arr[child] > arr[child+1]) {
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
        //为什么不用考虑左孩子和有孩子呢？
        //它已经是一个堆了，所以原来的孩子一定满足堆的性质，如果新增加的小于父亲，那必然成立，相反也必然不成立；
        int parent = (child-1)/2;
        while(child>0) {
            parent = (child-1)/2;
            if(arr[parent]<arr[child]) {
                break;
            }
            else {
                swap(arr,parent,child);
                child = parent;
            }
        }
    }

    private void swap(int[] arr, int parent, int child) {
        int tmp = arr[child];
        arr[child] = arr[parent];
        arr[parent] = tmp;
    }

    private void grow() {
        if(this.elem.length<=usedSize) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
    }
}

class Test {
    public static void main(String[] args) {
       int[] array = {27,15,19,18,28,34,65,49,25,37};
       MyHeap myHeap = new MyHeap(array);
       myHeap.createMinHeap();
        myHeap.offer(27);
        myHeap.poll();
    }
}

