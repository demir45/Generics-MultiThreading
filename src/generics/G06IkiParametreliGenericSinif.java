package generics;

public class G06IkiParametreliGenericSinif {
    public static void main(String[] args) {
        Kisi<Integer, String> k1 = new Kisi<>(101, "Ahmet Yilmaz");
        Kisi<Long, String> k2 = new Kisi<>(102L, "Mustafa Can");

        //Comple-time hatasi
//        Kisi<Boolean, String> k3 = new Kisi<>(true, "Hakki Can");

        // Erisim
        System.out.println(k1.getKey());
        System.out.println(k2.getValue());
    }
}

// K: Key
// V: Value
// 2 parametreli Generic class oluşuturulmasi
// Parametreler istenirse kisitlanabilir. Bunun icin ilgili veri tipinde extends edilebilir.
// Bu isleme Parameter bounding denilmektedir.
// Bu druumda yanlış veritipi girildiginde Comple-time hatasi alinir.
class Kisi<K extends Number,V extends String> {
    //    class Kisi<K,V> {
    private K key;
    private V value;

    public Kisi(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}