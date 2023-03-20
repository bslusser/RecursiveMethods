public class SampleGrader6 {
    public static void main(String[] args) {
        RecursiveMethods p6 = new RecursiveMethods();
        
        int partI = p6.byLeapsAndBounds(3);
        System.out.println("Part I answer: " + partI); //should print Part I answer: 3

        int partII = p6.subCount("aaaa","a");
        System.out.println("Part II answer: " + partII); //should print Part II answer: 4

        int[]sampleArr = {};
        int partIII = p6.binarySearch(sampleArr,12,0,-1); 
        System.out.println("Part III answer: " + partIII); //should print Part III answer: 2
    }
}