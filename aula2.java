import java.util.HashMap;

public class aula2 {
    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();

        produtos.put(101, "Notebook");
        produtos.put(102, "Mouse");
        produtos.put(103, "Teclado");
        produtos.put(999, "Fone de ouvido");
        produtos.put(200, "Monitor");
        if (produtos.containsKey(999)) {
           System.out.println("Produto: " + produtos.get(999));
          } else {
           System.out.println("Produto não encontrado!");
        }
        produtos.remove(102);
        produtos.remove(200);
        System.out.println("Depois de remover: " + produtos);
        System.out.println("Depois de remover: " + produtos);        
    }
}