package pekan4_2511533029;

public class QueueArrayDriver_2511533029 {
	public static void main (String [] args) {
			QueueArray_2511533029 queue_3029 = new QueueArray_2511533029 (1000);
			queue_3029.enqueue_2511533029(10);
			queue_3029.enqueue_2511533029(20);
			queue_3029.enqueue_2511533029(30);
			queue_3029.enqueue_2511533029(40);
			System.out.println("item di depan " + queue_3029.front_3029());
			System.out.println("item paling belakang " + queue_3029.rear_3029());
			System.out.println("tampilan queue ");
			queue_3029.display_3029();
			System.out.println();
			System.out.println(queue_3029.dequeue_3029() + " dihapus dari queue");
			System.out.println("item di depan: " + queue_3029.front_3029());
			System.out.println("item di belakang: " + queue_3029.rear_3029());
			System.out.println("tampilan queue setelah satu data dihapus");
			queue_3029.display_3029();
	}

}
