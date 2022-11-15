#REVERSE VOWELS IN STRINGS

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left]))
                left++;
            while (left < right && !isVowel(chars[right]))
                right--;

            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

#############################################################################################

#ADDING OR UPDATING ELEMENTS IN AN ARRAY

class OneDArray {
public static void main(String args[]) {
 // Initialization and Declaration in one step
 int[] myArray = new int [4];
 // Adding elements in an array
 myArray[0] = 10;
 myArray[1] = 20;
 myArray[2] = 30;
 myArray[3] = 40;
 // Accessing elements in an array
 for (int i = 0; i < myArray.length; i++){
 System.out.println(myArray[i]);
 }
 // Updating value of element at index 3
 myArray[3] = 900;
 // Accessing elements in the updated array
 System.out.println("Updated Array:");
 for (int i = 0; i < myArray.length; i++){
 System.out.println(myArray[i]);

 } 
 
 ##############################################################################################
 
 #USING ARRAY LITERALS
 
 class OneDArray {
public static void main(String args[]) {
 // Initialization, Declaration and Adding Elements in one step
 int[] myArray = {10,20,30,40};
 // Accessing elements in an array
 for (int i = 0; i < myArray.length; i++){
 System.out.println(myArray[i]);
 }
 // Updating value of element at index 3
 myArray[3] = 900;
 // Accessing elements in the updated array
 System.out.println("Updated Array:");
 for (int i = 0; i < myArray.length; i++){
 System.out.println(myArray[i]);

 }
}
}

#############################################################################################

#ADDING TWO DIMENSIONAL ARRAYS

class TwoDArray {
 public static void main( String args[] ) {

 int[][] myArray = new int[10][] ;
 for (int i = 0; i < 10; i++)
 {
 myArray[i] = new int [10];
 for (int j = 0; j < 10; j++){
 myArray[i][j] = i + j;
 System.out.println(myArray[i][j]);
 }
 }
 }
}

#############################################################################################

#REMOVING DEPLICATES FROM SORTED ARRAY

class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 1;
        for(int i = 0 ; i < nums.length -1 ; i++ ){
            if(nums[i] != nums[i + 1]){         //When we get unique No.
                nums[ptr] = nums[i+1];          //update previous pointer with new element
                ptr++;
            }
        }
        return ptr ;
    }
}

##############################################################################################

#SUBARRAY SUM K

class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int c=0;
        int pre=-1;
        int st=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                c++;
            }
            if(k%nums[i]==0){
                if(pre!=-1 && lcm(pre,nums[i])==k ){
                     c+=i-st;
                }
               pre=nums[i];
            }else {
                st=i+1;
            }
        }
        return c;
    }
    public int lcm(int a,int b){
        int p=a,q=b;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return (p*q)/a;
    }
}

###########################################################################################

#CHECK DISTANCE BETWEEN SAME LETTERS

class Solution {
    public boolean checkDistances(String s, int[] distance) {
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i = 0; i < s.length(); i ++) {
          if(! map.containsKey(s.charAt(i)))
           map.put(s.charAt(i), i + 1);

          else if(distance[s.charAt(i)-'a'] != i-map.get(s.charAt(i)))
           return false; 
      }
      return true;  
    }
}

############################################################################################

#FIND ORIGINAL ARRAY OF PREFIX XOR

class Solution {
    public int[] findArray(int[] pref) {
      for(int i = pref.length - 1; i > 0; i --) {
          pref[i] ^= pref[i - 1]; 
      }  
      return pref;
    }
}

###########################################################################################

#LARGEST PALINDROME BY CONCATENATING TWO LETTER WORDS

class Solution {
    public int longestPalindrome(String[] words) {
        int[][] counting = new int[26][26];
        int max = 0;
        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (counting[b][a] > 0) {
                max += 4;
                counting[b][a]--;
            } else {
                counting[a][b]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counting[i][i] > 0) {
                max += 2;
                break;
            }
        }
        return max;
    }
}

#################################################################################

#CLASS LINKED LIST
public class SinglyLinkedList<T> {
 //Node inner class for SLL
 public class Node{
 public T data; //Data to store (could be int, string, Object etc)
 public Node nextNode; //Pointer to next node in list
 }
 public Node headNode; //head node of the linked list
 public int size; //size of the list
 //constructor
 public SinglyLinkedList() {
 headNode = null;
 size = 0;
 }
}
