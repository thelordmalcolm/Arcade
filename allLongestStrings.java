// Given an array of strings, return another array containing all of its longest strings.
//
// Example
//
// For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
// allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

String[] allLongestStrings(String[] inputArray) {

    ArrayList<String> al = new ArrayList<>();
    int max=0;

    for(String s: inputArray){
        if(s.length() >= max){
            max = s.length();
        }
    }

    for(String s: inputArray){
        if(s.length() == max){
            al.add(s);
        }else{
            continue;
        }
    }

    String[] maxArray = new String[al.size()];

    maxArray = al.toArray(maxArray);

    return maxArray;


}
