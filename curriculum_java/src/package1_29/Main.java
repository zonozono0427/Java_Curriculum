package package1_29;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Prefecture> prefectures = Arrays.asList(
            new Prefecture("北海道", "札幌市", 83424.0),
            new Prefecture("青森県", "青森市", 9646.0),
            new Prefecture("岩手県", "盛岡市", 15275.0),
            new Prefecture("宮城県", "仙台市", 7282.0),
            new Prefecture("秋田県", "秋田市", 11638.0),
            new Prefecture("山形県", "山形市", 9323.0),
            new Prefecture("福島県", "福島市", 13784.0),
            new Prefecture("茨城県", "水戸市", 6097.0),
            new Prefecture("栃木県", "宇都宮市", 6408.0),
            new Prefecture("群馬県", "前橋市", 6362.0),
            new Prefecture("埼玉県", "さいたま市", 3798.0)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください（例: 8,5,9,...）: ");
        String[] input = scanner.nextLine().split(",");

        System.out.print("昇順なら1、降順なら0を入力してください: ");
        int order = scanner.nextInt();

        List<Prefecture> selectedPrefectures = new ArrayList<>();
        for (String index : input) {
            int i = Integer.parseInt(index.trim());
            if (i >= 0 && i < prefectures.size()) {
                selectedPrefectures.add(prefectures.get(i));
            }
        }

        selectedPrefectures.sort((p1, p2) -> order == 1 ?
            Double.compare(p1.getArea(), p2.getArea()) :
            Double.compare(p2.getArea(), p1.getArea()));

        for (Prefecture p : selectedPrefectures) {
            System.out.println(p);
        }
    }
}