package org.javaDSA.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap); // Return a copy of the heap
    }

    private int leftChildIndex(int index){
        return 2 * index + 1;
    }
    private int rightChildIndex(int index){
        return 2 * index + 2;
    }
    private int parentIndex(int index){
        return (index - 1) / 2;
    }
    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int currentValueIndex = heap.size() - 1;
        while(currentValueIndex > 0 && heap.get(currentValueIndex) > heap.get(parentIndex(currentValueIndex))){
            swap(currentValueIndex, parentIndex(currentValueIndex));
            currentValueIndex = parentIndex(currentValueIndex);
        }
    }

    public Integer removeMax(){
        if(heap.isEmpty()){
            return null;
        }
        if(heap.size() == 1){
            return heap.remove(0);
        }
        int maxValue = heap.get(0) ;
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int i) {
        int largest = i;
        int leftChildIndex = leftChildIndex(i);
        int rightChildIndex = rightChildIndex(i);

        if(leftChildIndex <heap.size() && heap.get(leftChildIndex) > heap.get(largest)){
            largest = leftChildIndex;
        }
        if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(largest)){
            largest = rightChildIndex;
        }
        if(largest != i){
            swap(i, largest);
            sinkDown(largest);
        }
    }

}
