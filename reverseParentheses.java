// You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
//
// Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
//
// Example
//
// For string s = "a(bc)de", the output should be
// reverseParentheses(s) = "acbde".

String reverseParentheses(String s) {

    char[] arr = s.toCharArray();
    Stack<Integer> stackPosition = new Stack<Integer>();

    //loop through string
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == '(') {
            stackPosition.push(i); //if open bracket, push position on to stack
        }
        else if (arr[i] == ')') {
            int start = stackPosition.pop() + 1; //record position after open bracket
            int end = i - 1; //record position before close bracket

            //reverse chars
            while(start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    s = new String(arr);
    s = s.replace("(", "");
    s = s.replace(")", "");

    return s;
}
