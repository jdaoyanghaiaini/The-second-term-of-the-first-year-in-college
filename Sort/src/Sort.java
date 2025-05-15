import java.util.Comparator;
import java.util.PriorityQueue;

public class Sort {
    /**
     * 时间复杂度：O(N^2)
     * 空间复杂的：O(1)
     * 是一个稳定的排序
     * @param array
     */
    public void insertSort(int[]array) {
        for (int i = 1; i < array.length; i++) {
            int tmp =array[i];
            int j=i-1;
            for(;j>=0;j--) {
                if(array[j]>tmp)/*这里如果改为>=就不稳定*/ {
                    array[j+1] = array[j];
                }
                else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            //如果这个元素比前面的所有元素都要小，那么j=0时停止循环，代码将j=0这里的值往前移动一个位置
            //j变为-1，然后将tmp赋值给最后一个元素
            array[j+1] = tmp;
        }
    }

    /**
     * 选择排序
     * 时间复杂度：O(N^2)
     * 空间复杂度:O(1)
     * @param array
     */
    public void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j=i+1;j<array.length;j++) {
                if(array[j]<array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array,minIndex,i);
        }
    }

    public void heapSort(int[] array) {
        //创建大根堆
        createMaxHeap(array);
        int end = array.length-1;
        while(end!=0) {
            swap(array,0,end);
            siftDown(array,0,end);
            end--;
        }
    }

    private void createMaxHeap(int[] array) {
        for(int parent=(array.length-1-1);parent>=0;parent--) {
            siftDown(array,parent, array.length);
        }
    }

    private void siftDown(int[] array, int parent, int usedSize) {
        int child = 2*parent+1;
        while(child<usedSize) {
            if(child+1<usedSize && array[child]<array[child+1]){
                child++;
            }
            if(array[parent] < array[child]) {
                swap(array,parent,child);
                parent = child;
                child = 2*parent+1;
            }
            else {
                break;
            }
        }
    }

    private void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
class Test {
    public static void main(String[] args) {
        int[] arr = {56,24,56,23,567,124,53,76,86,59};
        Sort sort = new Sort();
//        sort.insertSort(arr);
//        sort.selectSort(arr);
        sort.heapSort(arr);
    }
}