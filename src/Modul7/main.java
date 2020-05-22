package Modul7;
/**
 *
 * @author Andy
 */
public class main {
    public static void main(String[] args) {
        stack stack = new stack();//membuat instance stack dari class stack
        
        //menambahkan data pada stackdata menggunakan method push
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        
        System.out.println("Data Dalam Stack : "+stack);
        System.out.println("Jumlah Data Pada Stack : "+stack.size());
        System.out.println("Data yang Akan POP : "+stack.pop());
        System.out.println("Data Dalam Stack Setelah di POP : "+stack);
        System.out.println("Apakah Data Stack Kosong : "+stack.isEmpty());       
    }
   
}

