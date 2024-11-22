package org.project;

public class Main {
    public static void main(String[] args) {
    int [] array = {10,0,22,13,7,9,5,0,0,9,11};
        System.out.println("Четные числа кол-во: " + countEvents(array));
        System.out.println("Разница между максимальным и минимальным числом: " + subOfMinMax(array));
        System.out.println("Результат нахождения соседних нулевых чисел: " + zeroNeighbors(array));
    }

    /**
     * Метод возвращает количество четных чисел в массиве
     * @param array - массив с числами
     * @return - количество четных чисел в массиве
     */
    public static int countEvents(int [] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @param array - Массив с числами
     * @min - минимальное значение
     * @max - максимальное значение
     * @return результат разницы между min и max
     */
    private static int subOfMinMax(int [] array){
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i]<min) min = array[i];
            if(array[i]>max) max = array[i];
        }
        return max-min;
    }

    /**
     * Функция возвращает рузультат сравнения соседних элементов на наличие нулевого значения
     * @param array - массив с числами
     * @return результат нахождения соседних нулевых значений
     */
    private static boolean zeroNeighbors(int [] array){
        for(int i = 1; i < 10; i++){
            if (array[i]==0 && array[i+1]==0) return true;
        }
        return false;
    }


}