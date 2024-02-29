package HashSet;
  import java.util.*;
public class intersectionANDunion {

    public static int Intersection(int arr1[],int arr2[]){
        Set<Integer> set  = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
    int cnt =0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                cnt++;
                set.remove(arr2[i]);
            }
        }
        return cnt;
    }

    public static int Union(int arr1[],int arr2[]){
        Set<Integer> set  = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        return set.size();
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

      System.out.println( Intersection(arr1,arr2));
      System.out.print(Union(arr1,arr2));
    }
}
