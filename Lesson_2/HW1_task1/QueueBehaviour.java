package Lesson_2.HW1_task1;

interface QueueBehaviour {
    void enqueue(java.lang.String s);

    java.lang.String dequeue();

    int size();
}