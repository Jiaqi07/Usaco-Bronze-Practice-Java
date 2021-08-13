public class KevinTAARRAYSTORE {
    public static void main(String...args){
        int[] arr = new int[260];
        String s = "akdnajdkna";
        arr['a']++;
        for(int i = 0; i < s.length(); ++i){
            arr[s.charAt(i)]++;
        }
        for(int i = 'a'; i <= 'z'; ++i){
            System.out.println(arr[i]);
        }
    }
}
//        int[] arr = new int[260];
//        String s = "akdnajdkna";
//        arr['a']++;
//        for(int i = 0; i < s.length(); ++i){
//            arr[s.charAt(i)]++;
//        }Important!!!!!!!!