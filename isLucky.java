// Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
//
// Given a ticket number n, determine if it's lucky or not.
//
// Example
//
// For n = 1230, the output should be
// isLucky(n) = true;
// For n = 239017, the output should be
// isLucky(n) = false.

boolean isLucky(int n) {

    String nString = Integer.toString(n);
    String h1 ="";
    String h2 ="";
    int tot1 =0,tot2 =0;

    for(int i=0; i<nString.length()/2; i++){
        int x = Integer.parseInt(Character.toString(nString.charAt(i)));
        tot1 += x;
    }

    for(int i=nString.length()/2; i<nString.length(); i++){
        int c = Integer.parseInt(Character.toString(nString.charAt(i)));
        tot2 += c;
    }

    if(tot1 == tot2){
        return true;
    }else{
        return false;
    }
}
