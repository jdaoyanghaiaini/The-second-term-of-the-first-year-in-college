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

    /**
     * 希尔排序
     *时间复杂度：不确定，一般认为是O(N^1.2~N^1,5)
     *空间复杂度:O(1)
     * @param array
     */
    public void sheelSort(int[] array) {
       int gap = array.length;
       while(gap!=0) {
           gap = gap/2;
           sheel(array,gap);
       }
    }
    private void sheel(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp =array[i];
            int j=i-gap;
            for(;j>=0;j-=gap) {
                if(array[j]>tmp){
                    array[j+gap] = array[j];
                }
                else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 堆排序
     * 时间复杂度：O(N*logN)
     * 空间复杂度:O(1)
     * @param array
     */
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

    /**
     * 霍尔版快速排序
     * 时间复杂度:O(NlogN)
     * 空间复杂度：O(logN)一般认为
     * @param array
     */
    public void hoareQuickSort(int[] array) {
        quick(array,0, array.length-1);
    }

    private void quick(int[] array, int left, int right) {
        if(left>=right) {
            return;
        }
        int end = right;
        int start = left;
        while(left<right) {
            while( left<right && array[right]>=array[start]) {
                right--;
            }
            while(left<right && array[left]<=array[start]) {
                left++;
            }
            swap(array,right,left);
        }
        swap(array,start,left);

        quick(array,start,left-1);
        quick(array,right+1,end);
    }

    public void hoolingQuickSort(int arr[]) {
        int left = 0,right = arr.length-1;
        hollingQuick(arr,left,right);
    }

    private void hollingQuick(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int start = left,end = right;
        int tmp = arr[start];
        int tmpIndex = start;
        while(left<right) {
            while(right>left && arr[right]>=tmp) {
                right--;
            }
            if(left<right) {
                arr[tmpIndex] = arr[right];
                tmpIndex = right;
            }else {
                arr[tmpIndex] = tmp;
            }
            while(right>left && arr[left]<=tmp) {
                left++;
            }
            if(left<right) {
                arr[tmpIndex] = arr[left];
                tmpIndex = left;
            }else {
                arr[tmpIndex] = tmp;
            }
        }
        hollingQuick(arr,start,left-1);
        hollingQuick(arr,right+1,end);
    }

    /**
     * 归并排序
     * 空间复杂度：O(N)
     * 时间复杂度:O(N*logN)
     * @param array
     */
    public void mergeSort(int[] array) {
        merge(array,0,array.length-1);
    }

    private void merge(int[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        //递归到最左边或最右边，先分后治
        merge(array, start, mid);
        merge(array, mid + 1, end);

        int s1 = start,s2 = mid+1,e1 = mid,e2 = end;
        int[] tmp = new int[e2-s1+1];
        int k = 0;
        while(s1<=e1 && s2<=e2) {
           if(array[s1]<=array[s2]) {
               tmp[k++] = array[s1++];
           }else {
               tmp[k++] = array[s2++];
           }
        }
        while(s1<=e1) {
            tmp[k++] = array[s1++];
        }
        while(s2<=e2) {
            tmp[k++] = array[s2++];
        }
        for (int i = 0; i < tmp.length; i++) {
            array[i+start] = tmp[i];
        }
    }

    private void insMerge(int[] array, int left, int right) {
        int tmp = array[right];
        while(right!=left) {
            array[right+1] = array[right];
            right--;
        }
        array[left] = tmp;
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
//        sort.heapSort(arr);
//        sort.sheelSort(arr);
//        sort.hoareQuickSort(arr);`
//        sort.hoareQuickSort(arr);
//        sort.hoolingQuickSort(arr);
        sort.mergeSort(arr);

    }
}