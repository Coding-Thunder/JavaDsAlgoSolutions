package OOPS;

class HighArray {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    public HighArray(int max) {
        a = new long[max]; // create the array
        nElems = 0; // no items yeat
    } // constructor

    public boolean find(long searchKey) { // find specified value
        int j;
        for (j = 0; j < nElems; j++) { // iterate through the items
            if (a[j] == searchKey) // found items ?
                break; // exit loop before end
        }

        if (j == nElems) {
            return false; // no, Can't find it
        } else {
            return true; // yes found it
        }

    } // end find()

    public void insert(long value) { // put element into array
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) { // look for it
        int j;
        for (j = 0; j < nElems; j++) { // iterate through the items
            if (value == a[j]) { // fount item ?
                break;
            }
        }
        if (j == nElems) { // no item not found
            return false;
        } else {
            for (int k = j; k < nElems; k++) { // move higher ones down
                a[k] = a[k + 1];
            }
            nElems--; // decrement size
            return true;
        }
    } // end delete

    public void display() { // display array contents
        for (int j = 0; j < nElems; j++) { // iterate through the ist
            System.out.print(a[j] + " "); // display it
        }
        System.out.println();
    } // end display
} // end class HighArray;

class HighArrayApp {
    public static void main(String[] args) { // start main
        int maxSize = 100; // array size
        HighArray arr; // reference to array
        arr = new HighArray(maxSize); // create the array

        arr.insert(77); // insert 10 items
        arr.insert(94);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); // display items

        int searchKey = 35; // search for item
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Not Found" + searchKey);
        }
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    } // end main()
} // end class HighArrayApp
