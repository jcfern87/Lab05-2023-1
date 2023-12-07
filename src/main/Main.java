import ordenadores.OrdenarPorSelecao;

public class Main {
    public static void main(String[] args) {
    int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
    OrdenarPorSelecao o = new OrdenarPorSelecao();
    int[] array2 = o.ordene(array);
    for(int i : array2){
        System.out.println(i);
    }
    }
}
