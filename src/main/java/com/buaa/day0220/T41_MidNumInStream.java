package com.buaa.day0220;


import java.util.PriorityQueue;

public class T41_MidNumInStream {

    //小顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //大顶堆
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2 - o1);

    private int count;
    public void Insert(Integer num) {
        if (count % 2 == 0) {
            //插入左边
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        } else {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if (count % 2 == 1) {
            return (double) maxHeap.peek();
        } else {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }

}
