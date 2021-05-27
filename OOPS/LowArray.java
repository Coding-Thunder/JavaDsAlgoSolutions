package OOPS;

class LowArray {
    private long[] a; // ref to a array

    public LowArray(int size) { // constructor
        a = new long[size]; // create array
    }

    public void setElement(int index, long value) { // set value
        a[index] = value;
    }

    public long getElement(int index) { // get value
        return a[index];
    }
} // end class LowArray

class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr; // reference
        arr = new LowArray(100); // create LowArray object
        int nElems = 0; // number of items in array
        int j; // loop variable

        arr.setElement(0, 77); // insert 10 items
        arr.setElement(1, 94);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 00);
        arr.setElement(8, 66);
        arr.setElement(9, 33);

        nElems = 10; // now 10 items in array;

        for (j = 0; j < nElems; j++) { // display items
            System.out.print(arr.getElement(j) + " ");
        }
        System.out.println();

        int searchKey = 66; // data item to be searched
        for (j = 0; j < nElems; j++) { // for loop to iterate
            if (arr.getElement(j) == searchKey) // found item ?
                break;
        }
        if (j == nElems) { // no
            System.out.println("Can't find search key " + searchKey);
        } else { // yes
            System.out.println("Found " + searchKey);
        }
        // delete value 55
        for (j = 0; j < nElems; j++) { // look for it
            if (arr.getElement(j) == 55)
                break;
        }
        for (int k = j; k < nElems; k++) { // higher ones down
            arr.setElement(k, arr.getElement(k + 1));
        }
        nElems--; // decrement size

        for (j = 0; j < nElems; j++) { // display items
            System.out.print(arr.getElement(j) + " ");
        }
    } // end main()

} // end class LowArrayApp