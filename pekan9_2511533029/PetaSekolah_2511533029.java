package pekan9_2511533029;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PetaSekolah_2511533029 extends JFrame {

    // ===== 10 NODE, 15 EDGE =====
    private final String[] nodes_3029 = {
    		"Gerbang",       // 0
    	    "PosSatpam",     // 1
    	    "Perpustakaan",  // 2
    	    "LabKomputer",   // 3
    	    "Kelas10",       // 4
    	    "Kelas11",       // 5
    	    "Kelas12",       // 6
    	    "Kantin",        // 7
    	    "Lapangan",      // 8
    	    "KantorGuru"     // 9
    };

    // 15 edge
    private final int[][] edges_3029 = {

    	    {0,1},
    	    {0,8},

    	    {1,2},
    	    {1,9},

    	    {2,3},
    	    {2,4},

    	    {3,5},
    	    {3,6},

    	    {4,5},
    	    {5,6},

    	    {8,7},
    	    {7,6},

    	    {9,4},
    	    {9,2},
    	    {7,4}
    };

    private JComboBox<String> cbStart_3029, cbGoal_3029;
    private JTextArea taGraph_3029, taResult_3029;

    public PetaSekolah_2511533029() {
        setTitle("Peta Kampus - BFS & DFS | 2511533029");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(4, 4));

        buildTop_3029();
        buildGraph_3029();
        buildResult_3029();

        setSize(750, 520);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildTop_3029() {
        JPanel north_3029 = new JPanel(new BorderLayout());

        JLabel title_3029 = new JLabel("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS", SwingConstants.CENTER);
        title_3029.setFont(new Font("Dialog", Font.BOLD, 15));
        title_3029.setForeground(Color.WHITE);
        title_3029.setOpaque(true);
        title_3029.setBackground(new Color(50, 80, 130));
        title_3029.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JPanel ctrl_3029 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 6));
        ctrl_3029.setBackground(new Color(230, 230, 230));

        cbStart_3029 = new JComboBox<>(nodes_3029);
        cbStart_3029.setSelectedIndex(0);
        cbGoal_3029  = new JComboBox<>(nodes_3029);
        cbGoal_3029.setSelectedIndex(6);

        JButton btnBFS_3029   = buatTombol_3029("[ BFS ]",   new Color(60, 160, 60));
        JButton btnDFS_3029   = buatTombol_3029("[ DFS ]",   new Color(200, 130, 0));
        JButton btnReset_3029 = buatTombol_3029("[ RESET ]", new Color(190, 40, 40));

        btnBFS_3029.addActionListener(e -> {
            resetGraph_2511533029();
            BFS_2511533029(cbStart_3029.getSelectedIndex(), cbGoal_3029.getSelectedIndex());
        });
        btnDFS_3029.addActionListener(e -> {
            resetGraph_2511533029();
            DFS_2511533029(cbStart_3029.getSelectedIndex(), cbGoal_3029.getSelectedIndex());
        });
        btnReset_3029.addActionListener(e -> resetGraph_2511533029());

        ctrl_3029.add(new JLabel("Lokasi Awal   :"));
        ctrl_3029.add(cbStart_3029);
        ctrl_3029.add(new JLabel("Lokasi Tujuan :"));
        ctrl_3029.add(cbGoal_3029);
        ctrl_3029.add(btnBFS_3029);
        ctrl_3029.add(btnDFS_3029);
        ctrl_3029.add(btnReset_3029);

        north_3029.add(title_3029, BorderLayout.NORTH);
        north_3029.add(ctrl_3029, BorderLayout.SOUTH);
        add(north_3029, BorderLayout.NORTH);
    }

    private JButton buatTombol_3029(String teks_3029, Color warna_3029) {
        JButton btn_3029 = new JButton(teks_3029);
        btn_3029.setBackground(warna_3029);
        btn_3029.setForeground(Color.WHITE);
        btn_3029.setFont(new Font("Dialog", Font.BOLD, 13));
        btn_3029.setFocusPainted(false);
        return btn_3029;
    }

    private void buildGraph_3029() {
        taGraph_3029 = new JTextArea();
        taGraph_3029.setFont(new Font("Monospaced", Font.PLAIN, 13));
        taGraph_3029.setEditable(false);
        taGraph_3029.setBackground(Color.WHITE);
        taGraph_3029.setText(displayGraph_2511533029());

        JScrollPane sp_3029 = new JScrollPane(taGraph_3029);
        sp_3029.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY),
            "VISUALISASI GRAPH", TitledBorder.LEFT, TitledBorder.TOP,
            new Font("Dialog", Font.BOLD, 12)));
        sp_3029.setPreferredSize(new Dimension(750, 240));
        add(sp_3029, BorderLayout.CENTER);
    }

    private void buildResult_3029() {
        taResult_3029 = new JTextArea(6, 70);
        taResult_3029.setFont(new Font("Monospaced", Font.BOLD, 13));
        taResult_3029.setEditable(false);
        taResult_3029.setBackground(Color.WHITE);
        taResult_3029.setText(
            "Hasil Pencarian :\n" +
            "Jalur :\n" +
            "Node Dikunjungi :\n" +
            "Jumlah Node Dikunjungi : 0"
        );
        JScrollPane sp_3029 = new JScrollPane(taResult_3029);
        sp_3029.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(sp_3029, BorderLayout.SOUTH);
    }

    // ===== displayGraph =====
    public String displayGraph_2511533029() {
        return
            "\n" +
            "   Gerbang -------- PosSatpam -------- Perpustakaan -------- LabKomputer\n" +
            "      |                 |                    |                    |\n" +
            "      |                 |                    |                    |\n" +
            "   Lapangan         KantorGuru           Kelas10             Kelas11\n" +
            "      |                 |                    |                    |\n" +
            "      |                 |                    |                    |\n" +
            "    Kantin -----------------------------------------------> Kelas12\n" +
            "\n" +
            "   Total Node: 10  |  Total Edge: 15\n" +
            "   Peta: Jalur Antar Lokasi di Sekolah\n";
    }

    // ===== BFS =====
    public List<Integer> BFS_2511533029(int start_3029, int goal_3029) {
        boolean[] visited_3029  = new boolean[nodes_3029.length];
        int[]     parent_3029   = new int[nodes_3029.length];
        List<Integer> order_3029 = new ArrayList<>();
        Arrays.fill(parent_3029, -1);

        Queue<Integer> queue_3029 = new LinkedList<>();
        queue_3029.add(start_3029);
        visited_3029[start_3029] = true;

        while (!queue_3029.isEmpty()) {
            int curr_3029 = queue_3029.poll();
            order_3029.add(curr_3029);
            if (curr_3029 == goal_3029) break;
            for (int[] e_3029 : edges_3029) {
                int nb_3029 = tetangga_3029(e_3029, curr_3029, visited_3029);
                if (nb_3029 != -1) {
                    visited_3029[nb_3029] = true;
                    parent_3029[nb_3029]  = curr_3029;
                    queue_3029.add(nb_3029);
                }
            }
        }
        displayPath_2511533029(start_3029, goal_3029, parent_3029, order_3029, "BFS");
        return bangunJalur_3029(goal_3029, parent_3029);
    }

    // ===== DFS =====
    public List<Integer> DFS_2511533029(int start_3029, int goal_3029) {
        boolean[] visited_3029  = new boolean[nodes_3029.length];
        int[]     parent_3029   = new int[nodes_3029.length];
        List<Integer> order_3029 = new ArrayList<>();
        Arrays.fill(parent_3029, -1);

        Stack<Integer> stack_3029 = new Stack<>();
        stack_3029.push(start_3029);

        while (!stack_3029.isEmpty()) {
            int curr_3029 = stack_3029.pop();
            if (visited_3029[curr_3029]) continue;
            visited_3029[curr_3029] = true;
            order_3029.add(curr_3029);
            if (curr_3029 == goal_3029) break;
            for (int[] e_3029 : edges_3029) {
                int nb_3029 = tetangga_3029(e_3029, curr_3029, visited_3029);
                if (nb_3029 != -1) {
                    parent_3029[nb_3029] = curr_3029;
                    stack_3029.push(nb_3029);
                }
            }
        }
        displayPath_2511533029(start_3029, goal_3029, parent_3029, order_3029, "DFS");
        return bangunJalur_3029(goal_3029, parent_3029);
    }

    private int tetangga_3029(int[] edge_3029, int curr_3029, boolean[] visited_3029) {
        if (edge_3029[0] == curr_3029 && !visited_3029[edge_3029[1]]) return edge_3029[1];
        if (edge_3029[1] == curr_3029 && !visited_3029[edge_3029[0]]) return edge_3029[0];
        return -1;
    }

    private List<Integer> bangunJalur_3029(int goal_3029, int[] parent_3029) {
        List<Integer> path_3029 = new ArrayList<>();
        for (int at_3029 = goal_3029; at_3029 != -1; at_3029 = parent_3029[at_3029])
            path_3029.add(0, at_3029);
        return path_3029;
    }

    // ===== displayPath =====
    public void displayPath_2511533029(int start_3029, int goal_3029, int[] parent_3029,
                                       List<Integer> order_3029, String algo_3029) {
        List<Integer> path_3029 = bangunJalur_3029(goal_3029, parent_3029);
        boolean found_3029 = !path_3029.isEmpty() && path_3029.get(0) == start_3029;

        StringBuilder sb_3029 = new StringBuilder();
        sb_3029.append("Hasil Pencarian : ").append(algo_3029).append("\n");

        sb_3029.append("Jalur           : ");
        if (found_3029) {
            for (int i_3029 = 0; i_3029 < path_3029.size(); i_3029++) {
                sb_3029.append(nodes_3029[path_3029.get(i_3029)]);
                if (i_3029 < path_3029.size() - 1) sb_3029.append(" -> ");
            }
        } else {
            sb_3029.append("Tidak ditemukan");
        }

        sb_3029.append("\nNode Dikunjungi : ");
        for (int i_3029 = 0; i_3029 < order_3029.size(); i_3029++) {
            sb_3029.append(nodes_3029[order_3029.get(i_3029)]);
            if (i_3029 < order_3029.size() - 1) sb_3029.append(", ");
        }

        sb_3029.append("\nJumlah Node Dikunjungi : ").append(order_3029.size());
        taResult_3029.setText(sb_3029.toString());
    }

    // ===== resetGraph =====
    public void resetGraph_2511533029() {
        taGraph_3029.setText(displayGraph_2511533029());
        taResult_3029.setText(
            "Hasil Pencarian :\n" +
            "Jalur :\n" +
            "Node Dikunjungi :\n" +
            "Jumlah Node Dikunjungi : 0"
        );
    }

    public static void main(String[] args_3029) {
        SwingUtilities.invokeLater(PetaSekolah_2511533029::new);
    }
}