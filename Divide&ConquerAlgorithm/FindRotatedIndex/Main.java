public class Main {
    public static void main(String[] args) {
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{3, 4, 1, 2},4)); //# 1
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{4, 6, 7, 8, 9, 1, 2, 3, 4}, 8)); //# 3
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 3)); //# 6
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{37, 44, 66, 102, 10, 22}, 14)); //# -1
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 12)); //# -1
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{11}, 11)); //# 0
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{}, 11)); //# -1
        System.out.println(FindRotatedIndex.findRotatedIndex(new int[]{4, 4, 4, 4, 4}, 5)); //# -1
    }
}
