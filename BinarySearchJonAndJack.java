/**
 * Project created by Jonathan Marcantonio
 * 2019-05-23
 */
import java.util.ArrayList;

class BinarySearchJonAndJack {
    public static void main(String [ ] arg) {
        DatabaseJonAndJack info = new DatabaseJonAndJack();
        info.display();

    }
}

class SingleRecordMrA {

    private String name;
    private int height;
    SingleRecordMrA() { name = null; height = -1; }
    SingleRecordMrA(String name, int height) { this.name = name; this.height = height; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public int getHeight() { return this. height; }
    public void setHeight(int height) { this.height = height; }
}

class DatabaseJonAndJack {
    private ArrayList<SingleRecordMrA> obj1;
    DatabaseJonAndJack() {
        obj1= new ArrayList<SingleRecordMrA>(12);
        obj1.add(new SingleRecordMrA("Rohan", 185));
        obj1.add(new SingleRecordMrA("Januston", 173));
        obj1.add(new SingleRecordMrA("Gerald", 180));
        obj1.add(new SingleRecordMrA("Belinda", 160));
        obj1.add(new SingleRecordMrA("Johnathon", 178));
        obj1.add(new SingleRecordMrA("John", 175));
        obj1.add(new SingleRecordMrA("Jackson", 177));
        obj1.add(new SingleRecordMrA("Ken", 181));
        obj1.add(new SingleRecordMrA("Jacob", 175));
        obj1.add(new SingleRecordMrA("Agostini", 170));
        obj1.add(new SingleRecordMrA("Max", 176));
        obj1.add(new SingleRecordMrA("Ryan", 178));
    }

    // Recursive Binary Search
    private int binarySearch(ArrayList<SingleRecordMrA> arr, int l, int r, int x)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;

                // If the element is present at the
                // middle itself
                if (arr.get(mid).getHeight() == x)
                    return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr.get(mid).getHeight() > x)
                    return binarySearch(arr, l, mid - 1, x);

                // Else the element can only be present
                // in right subarray
                return binarySearch(arr, mid + 1, r, x);
            }

            // We reach here when element is not present
            // in array
            return -1;
        }

        // Driver method to test above
    /* This code is contributed by Rajat Mishra */


    public void display() {
        int searchValue = 175;
        int result = binarySearch(obj1, 0, obj1.size()-1, searchValue);
        if(result == -1)
            System.out.println("Element not present in dataset");
        else
            System.out.println("Element found at index " + result);
        System.out.println("============RECORDS================");
        for (int i=0; i< obj1.size(); i++)
        {
            System.out.printf("Name: %-15sHeight: %6s \n", obj1.get(i).getName(), obj1.get(i).getHeight());
            System.out.println("-----------------------------------------------------------------------");
        }

    }
}
