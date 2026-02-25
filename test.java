import java.lang.Math.*;   import java.io.*;   import java.text.*; import java.random.*; import java.util.Scanner;


public class timeMethods{
public static int N = ....;
public static void main(String args[]){

DecimalFormat twoD = new DecimalFormat("0.00");
DecimalFormat fourD = new DecimalFormat("0.0000");
DecimalFormat fiveD = new DecimalFormat("0.00000");

long start, finish;
double runTime = 0, runTime2 = 0, time;
double totalTime = 0.0;
int n = N;
int repetition, repetitions = 30;
// import all data from text file and sort data into a nodes with int keys and String values, then place the nodes in an array
import java.io.ulysses-1.numbered.txt;
import java.io.FileNotFoundException;
try {
    File file = new File("ulysses-1.numbered.txt");
    Scanner scanner = new Scanner(file);
    Node[] nodes = new Node[32654]; 
    int index = 0;

    while (scanner.hasNextLine() && index < nodes.length) {
        String line = scanner.nextLine();
        String[] parts = line.split(" ");  separated by a space
        if (parts.length == 2) {
            int key = Integer.parseInt(parts[0].trim());
            String value = parts[1].trim();
            nodes[index] = NodeUtil.createNode(key, value);
            index++;
        }
    }
    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
}


// generate keys form 0000 to 32654 and place them in an array of size 30
      int[] keys = new int[30];
      for (int i = 0; i < 30; i++) {
          int key = (int)(Math.random() * 32655);
          // store the key in an array
      }
   runTime = 0;
   for(repetition = 0; repetition < repetitions; repetition++) {
      start = System.currentTimeMillis();
	
// use the keys generated to search in the array of nodes use linear search and binary  search
      for (int i = 0; i < 30; i++) {
         linearSearch(n, keys[i],nodes);
         binarySearch(n, keys[i],nodes);
      }
    // Figure out how to alter this guideline here,
		
      finish = System.currentTimeMillis();
			
      time = (double)(finish - start);
      runTime += time;
      runTime2 += (time*time); }
// 
   double aveRuntime = runTime/repetitions;
   double stdDeviation = 
      Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

   System.out.printf("\n\n\fStatistics\n");
   System.out.println("________________________________________________");
   System.out.println("Total time   =           " + runTime/1000 + "s.");
   System.out.println("Total time\u00b2  =           " + runTime2);
   System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                     + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
   System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
   System.out.println("n            =           " + n);
   System.out.println("Average time / run =     " + fiveD.format(aveRuntime/n*1000) 
                     + '\u00B5' + "s. "); 

   System.out.println("Repetitions  =             " + repetitions);
   System.out.println("________________________________________________");
   System.out.println();
   System.out.println(); }	} 

static void binarySearch(int n,  int key, int[]a) {
    int left = 0,right = n-1, middle;
    while (left <= right){
        middle = (left + right) / 2;

        if (a[middle] ==key) {
            return;
        } else if (a[middle ] < key) {
             left= middle + 1;
        } else {

            right= middle - 1;
        }
        return -1;
    }
}

static void  linearearch(int n, int key, int[]a) {
    for (int i = 0;i <  n;i++){
        if (a[i] ==key) {
             return;
         }
    }
    return -1;
}

class Node {

    private int key;
    private String value;

    public Node(int key, String value) {
    this.key = key;

    this.value = value;
}
    public int getKey() { return key; }
    public String getValue() { return value; }
    public void setKey(int key) { this.key = key; }
    public void setValue(String value) { this.value = value; }

public String toString() {

    return "Node{key=" + key + ", value='" + value + "'}";
    }
}



class NodeUtil {
    public static Node createNode(int key, String value) {
    return new Node(key, value);
}

}