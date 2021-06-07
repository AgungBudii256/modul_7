package Queue;
public class mainQueue {
    public static void main(String[] args) {
        queue newQueue = new queue(10);
        newQueue.enqueue(40); //berfungsi untuk memasukkan data
        newQueue.show(); //berfungsi untuk menampilkan data
        newQueue.enqueue(33);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek()); //menampilkan data elemen paling terdepan
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue()); //menghapus data terdepan
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        newQueue.enqueue(54);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
    }
}
