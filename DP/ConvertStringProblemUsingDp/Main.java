public class Main {
    public static void main(String[] args) {
        ConvertString convertString = new ConvertString();
        int minOpTD = convertString.findMinOperationsTD("table", "tbres");
        System.out.println("using top down : "+minOpTD);
        int minOpBU = convertString.findMinOperationsBU("table", "tbres");
        System.out.println("using bottom up : "+minOpBU);

    }
}