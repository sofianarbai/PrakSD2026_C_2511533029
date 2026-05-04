package pekan5_2511533029;

public class TambahSLL_2511533029 {
    public static NodeSLL_2511533029 insertAtFront(NodeSLL_2511533029 head_3029, int value_3029) {
        NodeSLL_2511533029 new_node_3029 = new NodeSLL_2511533029(value_3029);
        new_node_3029.next_3029 = head_3029;
        return new_node_3029;
    }
    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533029 insertAtEnd(NodeSLL_2511533029 head_3029, int value_3029) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533029 newNode_3029 = new NodeSLL_2511533029(value_3029);
        // jika list kosong maka node jadi head
        if (head_3029 == null) {
            return newNode_3029;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533029 last_3029 = head_3029;
        // telusuri ke node akhir
        while (last_3029.next_3029 != null) {
            last_3029 = last_3029.next_3029;
        }
        // ubah pointer
        last_3029.next_3029 = newNode_3029;
        return head_3029;
    }
    static NodeSLL_2511533029 GetNode_3029(int data_3029) {
        return new NodeSLL_2511533029(data_3029);
    }
    static NodeSLL_2511533029 insertPos(NodeSLL_2511533029 headNode_3029, int position_3029, int value_3029) {
        NodeSLL_2511533029 head_3029 = headNode_3029;
        if (position_3029 < 1)
            System.out.print("Invalid position");
        if (position_3029 == 1) {
            NodeSLL_2511533029 new_node_3029 = new NodeSLL_2511533029(value_3029);
            new_node_3029.next_3029 = head_3029;
            return new_node_3029;
        } else {
            while (position_3029-- != 0) {
                if (position_3029 == 1) {
                    NodeSLL_2511533029 newNode_3029 = GetNode_3029(value_3029);
                    newNode_3029.next_3029 = headNode_3029.next_3029;
                    headNode_3029.next_3029 = newNode_3029;
                    break;
                }
                headNode_3029 = headNode_3029.next_3029;
            }
            if (position_3029 != 1)
                System.out.print("Posisi di luar jangkauan");   }
        return head_3029;
    }
    public static void printList(NodeSLL_2511533029 head_3029) {
        NodeSLL_2511533029 curr_3029 = head_3029;
        while (curr_3029.next_3029 != null) {
            System.out.print(curr_3029.data_3029 + "-->");
            curr_3029 = curr_3029.next_3029;
        }
        if (curr_3029.next_3029 == null) {
            System.out.print(curr_3029.data_3029);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533029 head_3029 = new NodeSLL_2511533029(2);
        head_3029.next_3029 = new NodeSLL_2511533029(3);
        head_3029.next_3029.next_3029 = new NodeSLL_2511533029(5);
        head_3029.next_3029.next_3029.next_3029 = new NodeSLL_2511533029(6);

        // cetak list asli
        System.out.print("Senarai berantai awal: ");
        printList(head_3029);

        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data_3029 = 1;
        head_3029 = insertAtFront(head_3029, data_3029);

        // cetak update list
        printList(head_3029);

        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2_3029 = 7;
        head_3029 = insertAtEnd(head_3029, data2_3029);

        // cetak update list
        printList(head_3029);

        System.out.print("tambah 1 simpul ke data 4: ");
        int data3_3029 = 4;
        int pos_3029 = 4;
        head_3029 = insertPos(head_3029, pos_3029, data3_3029);

        // cetak update list
        printList(head_3029);
    }
}