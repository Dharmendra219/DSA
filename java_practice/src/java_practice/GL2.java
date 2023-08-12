package java_practice;


import java.util.LinkedList;
class producerConsumerProblem{
final int bufferSize=15;
LinkedList<Integer> buffer;
producerConsumerProblem(){
buffer=new LinkedList<Integer>();
//Initially making buffer full
//inserting random values
for(int i=0;i<15;i++){
int value=(int)(Math.random()*100+1);
buffer.add(value);
}
}
public void produce(){
synchronized (this){
if(buffer.size()==bufferSize){
System.out.println("\nBuffer is full-------");
System.out.println("Producer cannot produce");
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}
}
public void consume(){
synchronized (this){
if(buffer.size()==0){
System.out.println("\nBuffer is Empty-------");
System.out.println("Consumer cannot consume");
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
else{
int value=this.buffer.poll();
System.out.println("\nConsumer consumed item-->"+value);
notifyAll();
}
}
}
}
public class GL2 {
public static void main(String[] args) {
producerConsumerProblem obj=new producerConsumerProblem();
System.out.println("\nInitial values in Buffer:-"+obj.buffer);
Thread producer=new Thread(new Runnable() {
@Override
public void run() {
while(true){
obj.produce();
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
});
Thread consumer=new Thread(new Runnable() {
@Override
public void run() {
while(true){
obj.consume();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
});
producer.start();
consumer.start();
}
}