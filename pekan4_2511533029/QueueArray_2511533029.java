package pekan4_2511533029;

public class QueueArray_2511533029 {
	int front_3029, rear_3029, size_3029;
	int capacity_3029;
	int array_3029[];
	
	public QueueArray_2511533029 (int capacity_3029) {
		this.capacity_3029 = capacity_3029;
		front_3029 = this.size_3029 = 0;
		rear_3029 = capacity_3029 - 1 ;
		array_3029 = new int [this.capacity_3029];
	}
	
	boolean isFull_2511533029 (QueueArray_2511533029 queue) {
		return (queue.size_3029 == queue.capacity_3029);
	}
	
	boolean isEmpty_2511533029 (QueueArray_2511533029 queue) {
		return (queue.size_3029 == 0);
	}
	void enqueue_2511533029 (int item_3029) {
		if  (isFull_2511533029(this))
			return;
		this.rear_3029 = (this.rear_3029 + 1) % this.capacity_3029;
		this.array_3029 [this.rear_3029] = item_3029;
		this.size_3029 = this.size_3029 + 1;
		System.out.println(item_3029 + " enqueued to queue");
	}
	
	int dequeue_3029() {
		if (isEmpty_2511533029(this))
			return Integer.MIN_VALUE;
		int item_3029 = this.array_3029[this.front_3029];
		this.front_3029 = (this.front_3029 + 1) % this.capacity_3029;
		this.size_3029 = this.size_3029 - 1;
		return item_3029;
	}
	int front_3029 () {
		if (isEmpty_2511533029(this))
			return Integer.MIN_VALUE;
		
		return this.array_3029[this.front_3029];
	}
	int rear_3029 () {
		if (isEmpty_2511533029(this))
			return Integer.MIN_VALUE;
		return this.array_3029[this.rear_3029];
	}
       //mencetak elemen antrian
	void display_3029() {
		int i_3029;
		if (front_3029 == rear_3029) {
			System.out.println("\n antrian kosong\n");
		}
		// kunjungidari belakang dan cetak
		for (i_3029 = front_3029; i_3029 < rear_3029; i_3029++) {
			System.out.printf(" %d <-- ", array_3029[i_3029]);
		}
		return;
	}
}
