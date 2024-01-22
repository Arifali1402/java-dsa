import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{ // generics
        private class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n -> nodes
        private int N; // N -> buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode(); // returns any integer value
           return Math.abs(bi) % N; // the bucket index must be positive and in between the value [0,N-1] inclusively
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> li = buckets[bi];
           
            for(int i = 0;i<li.size();i++){
                if(li.get(i).key == key){
                    return i; //di
                }
            }
            return -1; // key not exist
        }
        // Time Complexity = O(N)
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0;i<oldBucket.length;i++){
                LinkedList<Node> li = oldBucket[i];
                for(int j =0;j<li.size();j++){
                    Node node = li.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // data index, di
            if(di == -1) // key not exist
            {
                // add new node in the LL
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else// key exist
            {
                // update the node value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // check for threshold
            double lambda = (double) n/N;
            if(lambda > 2.0){
                //Rehashing
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // data index, di
            if(di == -1) // key not exist
            {
                return null;
            }
            else// key exist
            {  
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // data index, di
            if(di == -1) // key not exist
            {
                return false;
            }
            else// key exist
            {  
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // data index, di
            if(di == -1) // key not exist
            {
                return null;
            }
            else// key exist
            {  
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){ // bi
                LinkedList<Node> li = buckets[i];
                for(int j = 0;j<li.size();j++){ // di
                    Node node = li.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("China", 300);
        map.put("USA", 150);
        ArrayList<String> keys = map.keySet();
        for(int i = 0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
