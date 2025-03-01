// class LRUCache {
    
//     static Map<Integer, Integer> cache;
//     static int capacity;
//     LRUCache(int cap) {
        
//         cache = new LinkedHashMap();
//         capacity = cap;
//     }

//     public static int get(int key) {
        
//         if(!cache.containsKey(key)){
//             return -1;
//         }
//         int val = cache.get(key);
//         cache.remove(key);
//         cache.put(key, val);
//         return val;
//     }

//     public static void put(int key, int value) {
        
//         if(cache.containsKey(key)){
//             cache.remove(key);
//             cache.put(key, value);
//             return;
//         }
//         if(cache.size() == capacity){
//             int rem = -1;
//             for(int i: cache.keySet()){
//                 rem = i;
//                 break;
//             }
//             cache.remove(rem);
//         }
        
//         cache.put(key, value);
//     }
// }