import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Practice {

    //  есть массив с положительными целыми числами. Написать метод, который находит
    // элемент ( если он есть ), который встречается в массиве  > length/2 (доминантный).
    // если такого нет, метод возвращает -1

    public int findDominant( int[] ints){
        Map<Integer,Integer> occurencesByNumber = new HashMap<>();

        for ( int i = 0; i< ints.length; i++){
            if( occurencesByNumber.containsKey(ints[i]))
                occurencesByNumber.put(ints[i],occurencesByNumber.get(ints[i])+1);
            else occurencesByNumber.put( ints[i],1);
        }

        int counter = 0;
        int dominant = 0;

        for ( int key: occurencesByNumber.keySet()){
            if(occurencesByNumber.get(key) > counter){
                counter = occurencesByNumber.get(key);
                dominant = key;
            }
        }

        if( counter > ints.length/2)
            return dominant;
        return -1;
    }


    public  int findDominantElement(int[] arr) {
        int length = arr.length;
        if (length == 0) {
            return -1; // Пустой массив, доминантного элемента нет
        }

        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого элемента массива
        for (int i : arr) {
            elementCountMap.put(i, elementCountMap.getOrDefault(i, 0) + 1);
        }

        // Находим доминантный элемент
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > length / 2) {
                return entry.getKey();
            }
        }

        return -1; // Доминантного элемента нет
    }


    //В ресторан периодически попадает заказ. У заказа есть время когда он был сделан ( milliseconds from 1970 1 Jan)
    // Для каждого заказа нужно определить количество заказов, сделанных за 15 ( 20, N) минут до него
    // @param orderTimes - массив отсортированных по времение моментов, когда происходили заказы.
    // @param minutes
    //@return для соответствующего заказа - количество заказов, сделанных в предыдущие minutes минут
// long[] array = {1000000, 1200000, 1250000,1300000,1600000,1700000,1800000,1850000,1890000};
    public int[] countOrdersNumber(long[] orderTimes, int minutes){
        int[] res = new int[orderTimes.length];
        long millis = minutes *60L*1000; // 300 000
        Deque<Long> queue = new ArrayDeque<>();
        //     1600000 1700000 1800000 1850000 1890000
        int i = 0;
        for(long orderTime : orderTimes){
            queue.addLast(orderTime);
            while (orderTime -queue.getFirst() > millis)
                queue.removeFirst();

            res[i++] = queue.size() -1 ;  //0 1 2 3 1 1 2 3 4
        }
        return res;


    }

    // Написать метод,  который принимает лист имен и их анаграмм и имя , по которому он возвращает лист
    // всех имеющихся в исходном листе  анаграмм этого имени, включая само имя
  //  [john, nhoj, ann, nan, nhjo, evgeny], john  ->  john,nhoj,nhjo
  //  [john, nhoj, ann, nan, nhjo, evgeny], ann  ->  ann, nan

    // вначале целесообразно решить для себя более простую задачу - написать метод, определяющий являются ли два слова
    // анаграммами.
  //  public List<String> findAnagrams(String name, List<String>names){
        //  создать вспомогательную мапу, где ключ - это имя? а значение - это список анаграмм этого имени
      //  Map<String,List<String>> anagrams = new HashMap<>();
    }


