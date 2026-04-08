package pekan3_2511533029;
import java.util.ArrayList;
class Siswa_2511533029 {
	String nama_3029;
	int nim_3029;
	
	public Siswa_2511533029 (String nama_3029, int nim_3029) {
		this.nama_3029= nama_3029;
		this.nim_3029= nim_3029;
		
	}
	
	@Override
	public String toString () {
		return "NIM: " + nim_3029 + ", Nama : " +nama_3029;
	}
}
public class SiswaStack_2511533029 {
	private ArrayList<Siswa_2511533029> stack_3029;
	
	public SiswaStack_2511533029() {
		stack_3029 = new ArrayList<>();
	}
	public void push (Siswa_2511533029 mhs) {
		stack_3029.add(mhs);
	}

public Siswa_2511533029 pop() {
	if (!isEmpty()) {
		return stack_3029.remove(stack_3029.size() -1);
	 }
	 return null;
    }
 public Siswa_2511533029 peek() {
	 if (!isEmpty()) {
		 return stack_3029.get(stack_3029.size() -1 );
	 }
	 return null;
 }
 
 public boolean isEmpty () {
	 return stack_3029.isEmpty();
	 }
  public void tampilkanSiswa_3029() {
	  for (int i= stack_3029.size() -1; i>=0; i--) {
		  System.out.println(stack_3029.get(i));
	  }
  }
  public static void main (String [] args) {
	  SiswaStack_2511533029 studentstack = new SiswaStack_2511533029();
	  
	  Siswa_2511533029 mhs1 = new Siswa_2511533029 ("Ali ", 1);
	  Siswa_2511533029 mhs2 = new Siswa_2511533029 ("Boby ", 2);
	  Siswa_2511533029 mhs3 = new Siswa_2511533029 ("Charles ", 3);
	  
	  studentstack.push(mhs1);
	  studentstack.push(mhs2);
	  studentstack.push(mhs3);
	  
	  System.out.println("siswa di dalam stack : ");
	  studentstack.tampilkanSiswa_3029();
	  
	  System.out.println("siswa teratas " + studentstack.peek());
	  System.out.println("mengeluarkan siswa teratas dari stack " + studentstack.pop());
	  System.out.println("daftar siswa setelah di pop : ");
	  studentstack.tampilkanSiswa_3029();
  }
 
}