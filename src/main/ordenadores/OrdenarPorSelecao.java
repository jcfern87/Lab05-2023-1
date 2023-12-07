package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        for(int i = 0; i < array.length; i++){
            int x = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[x]){
                    x = j;
                }
            }
            int menor = array[x];
            array[x] = array[i];
            array[i] = menor;
        }
        return array;
    }
    
}
