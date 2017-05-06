// Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
//
// Example
//
// For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
// sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

int[] sortByHeight(int[] a) {

    int[] sorted = new int[a.length];
    ArrayList<Integer> al = new ArrayList<>();

    //add tree positions to "sorted" array
    //add remaining elements to arraylist
    for(int i=0; i<a.length; i++){
        if(a[i] == -1){
            sorted[i] = -1;
        }else{
            al.add(a[i]);
        }
    }

    //sort arraylist
    Collections.sort(al);

    int k = 0;

    //add the remaining sorted elements to "sorted"
    //array
    for(int i =0; i<sorted.length; i++){
        if(sorted[i] == -1){
            continue;
        }
        else{
            sorted[i] = al.get(k);
            k = k+1;
        }
    }

    return sorted;
}
