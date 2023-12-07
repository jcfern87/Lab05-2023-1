package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        for(int i = 1; i < array.length; i++){
            int f = array[i];
            int x = i;
            while((x > 0) && (array[x-1] > f)){
                array[x] = array[x - 1];
                x--;
            }
            array[x] = f;
        }
        return array;
    }
    
}
