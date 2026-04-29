package pekan4_2511533029;

public class AntrianLoket_2511533029 {
    int front_3029;
    int rear_3029;
    int max_3029;
    String queue_3029[];

    public AntrianLoket_2511533029(int max_3029) {
        this.max_3029 = max_3029;
        this.front_3029 = 0;
        this.rear_3029 = -1;
        queue_3029 = new String[this.max_3029];
    }

    boolean isFull_3029(AntrianLoket_2511533029 queue) {
        return (queue.rear_3029 == queue.max_3029 - 1);
    }

    boolean isEmpty_3029(AntrianLoket_2511533029 queue) {
        return (queue.rear_3029 == -1);
    }

    void enqueue_3029(String pelanggan_3029) {
        if (isFull_3029(this)) {
            System.out.println("Antrian penuh");
            return;
        }

        this.rear_3029 = this.rear_3029 + 1;
        this.queue_3029[this.rear_3029] = pelanggan_3029;
        System.out.println(pelanggan_3029 + " berhasil masuk antrian");
    }

    String dequeue_3029() {
        if (isEmpty_3029(this))
            return null;

        String pelanggan_3029 = this.queue_3029[this.front_3029];
        this.front_3029++;

        if (this.front_3029 > this.rear_3029) {
            this.front_3029 = 0;
            this.rear_3029 = -1;
        }

        return pelanggan_3029;
    }

    String front_3029() {
        if (isEmpty_3029(this))
            return null;

        return this.queue_3029[this.front_3029];
    }

    String rear_3029() {
        if (isEmpty_3029(this))
            return null;

        return this.queue_3029[this.rear_3029];
    }

    void display_3029() {
        int i_3029;
        int nomor_3029 = 1;

        if (isEmpty_3029(this)) {
            System.out.println("\nAntrian kosong\n");
            return;
        }

        System.out.println("Isi antrian:");
        for (i_3029 = front_3029; i_3029 <= rear_3029; i_3029++) {
            System.out.println(nomor_3029 + ". " + queue_3029[i_3029]);
            nomor_3029++;
        }
    }

    void reverse_3029() {
        if (isEmpty_3029(this)) {
            System.out.println("\nAntrian kosong\n");
            return;
        }

        int kiri_3029 = front_3029;
        int kanan_3029 = rear_3029;

        while (kiri_3029 < kanan_3029) {
            String temp_3029 = queue_3029[kiri_3029];
            queue_3029[kiri_3029] = queue_3029[kanan_3029];
            queue_3029[kanan_3029] = temp_3029;

            kiri_3029++;
            kanan_3029--;
        }

        System.out.println("Antrian berhasil dibalik");
    }
}