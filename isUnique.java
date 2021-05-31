// "static void main" must be defined in a public class.
public class Main {

    /*Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures? -- Will need to step through each char in the string input and compare if there are any similarities. Could use a bubble sort technique if no additional data structures can be used.
    Could use a hashtable to implement */

    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(allUnique("vanessa")){
            System.out.println("the string has all unique characters");
        }else{
            System.out.println("the string does not have all unique characters");
        }
    }

    private static Boolean allUnique(String stringInput){
        char firstChar;
        Boolean isTrue;
        int strLen = stringInput.length();
        for(int i=0; i < strLen; i++){
            firstChar = stringInput.charAt(i);
            if(!compareCharToStringIter(firstChar, stringInput, i+1)){
                return false;
            };
        }
        return true;
    }

    private static Boolean compareCharToStringIter(char ch, String str, int index){
        for(int i = index; i < str.length(); i++){
            if(ch == str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}