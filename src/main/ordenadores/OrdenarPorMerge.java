package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array, int[] array2) {


        int[] arrayResultante = new int[array.length + array2.length];

        int i = 0, j = 0, k = 0;

        while(i < array.length && j < array2.length){
            if(array[i] <= array2[j]){
                arrayResultante[k++] = array[i++];
            } 
            else{
                arrayResultante[k++] = array2[j++];
            }
        }
        while(i < array.length){
            arrayResultante[k++] = array[i++];
        }
        while(j < array2.length){
            arrayResultante[k++] = array2[j++];
        }
        return arrayResultante;

    }
    
}
