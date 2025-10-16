package record.learning.record;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*
		//基礎文法の学習
		//変数、計算、値の取り扱い
		//文字列結合と数値計算結果の結合をして「自分の名前　＋　自分の年齢　＋　歳です。　」が出力されるようにする
		String name = "小久井杏奈";
		int age = 31;
		System.out.println(name + age + "歳です。");

		//文字列型を使って、変数を２つ用意する。その変数には名字と名前を入れる。
		//条件は名字の文字数が２文字以上の場合、かつ名前の文字数が２文字以上の場合はtrue
		//条件がtrueの場合はその名前を表示する。
		//条件がfalseの場合は「条件に一致しませんでした。」という文言を表示する。
		String surname = "小久井";
		String name = "杏奈";
		if (surname.length()>2 && name.length()>2){
			System.out.println(surname + name);
		}else {
			System.out.println("条件に一致しませんでした。");
		}

		//生徒名の文字列リストを作成、リストの数は10個以上
		//リストに入ってる文字数が3文字以上のものを表示する
		//このリストをループさせて繰り返し処理を実装し、その中で上記の条件を満たすものだけを表示する
		List<String> students = new ArrayList<>();
		students.add("田中小太郎");
		students.add("佐藤花子");
		students.add("鈴木一郎");
		students.add("高橋美咲");
		students.add("伊藤健");
		students.add("中村優子");
		students.add("小林翔");
		students.add("加藤直子");
		students.add("吉田光");
		students.add("山本蓮");

		for(String name : students){
			if(name.length() > 3){
				System.out.println(name);
			}
	}
	//Mapを作る。生徒名と番号の組み合わせ。（１、小久井）みたいな。Mapの要素は10個以上
	//Mapの中の番号が偶数のものをMapから削除する
	//上記の処理を行う、繰り返し処理を実装
	//削除した状態のものを出力して表示してください
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "小久井");
		studentMap.put(2, "田中");
		studentMap.put(3, "佐藤");
		studentMap.put(4, "鈴木");
		studentMap.put(5, "高橋");
		studentMap.put(6, "伊藤");
		studentMap.put(7, "中村");
		studentMap.put(8, "小林");
		studentMap.put(9, "加藤");
		studentMap.put(10, "吉田");
		studentMap.put(11, "山本");
		studentMap.put(12, "松本");

		//キーセットを使って、偶数キーを削除
		studentMap.keySet().removeIf(key -> key % 2 == 0);
		System.out.println(studentMap);

		//文字列のリストを作成、要素数は10個
		// その文字列に対して、文字数が5文字以上のものを抽出して文字列に変換する
		//  区切り文字はカンマ（,）で行う。その文字列を出力してください
		List<String> fruitsList = new ArrayList<>();

		fruitsList.add("Apple");
		fruitsList.add("Banana");
		fruitsList.add("Orange");
		fruitsList.add("Grape");
		fruitsList.add("Mango");
		fruitsList.add("Peach");
		fruitsList.add("Cherry");
		fruitsList.add("Pineapple");
		fruitsList.add("Strawberry");
		fruitsList.add("Watermelon");

		System.out.println(fruitsList.stream()
				.filter(v -> v.length() >= 6)
				.collect(Collectors.joining(","))); //カンマ区切りの文字列に変換　
		     //.collect →　別の物に変換を掛ける

		//数値のリストを作成、要素数は10個
		//  その数値の中の奇数のものだけを抽出して、平均値を出して出力してください。
		List<Integer> num = List.of(1,2,3,4,5,7,8,9,10);

		System.out.println(num.stream()
				.filter(v -> v %2==1) //奇数にフィルター
				.mapToInt(v -> v) //参照型からプリミティブ型へ変換
				.average() //平均値を出す
				.orElse(0));  //もし空でも0を返す

		//① 変数xに10を代入し、xに5を足した結果を表示するプログラムを書いてください。
		int x = 10;
		System.out.println(x + 5);

		//② 文字列nameに「Java」を代入し、「こんにちは、Javaさん」と表示するにはどう書きますか？
		String name = "Java";
		System.out.println("こんにちは" + name + "さん。");

		//③ int age = 20; のとき、もし age が18以上なら「成人です」と表示する if 文を書いてください。
		int age = 20;
		if (age >= 18) {
			System.out.println("成人です");
		} else {
			System.out.println("未成年です");
		}

		//④ 0〜4までの数字を順に表示する for 文を書いてください。
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//int i = 0;　を外で定義してもOKだけど、その場合は(; i < 5 ; i++)と書く。
		//最初の ; を忘れずに。for文の基本形 for(初期化; 条件; 更新){ だよ

		//⑤ 配列int[] scores = {80, 90, 70};の2番目の要素を表示するコードを書いてください。
		int[] scores = {80, 90, 70};
		System.out.println(scores[1]);
		//要素は0から数える為１

		//⑥ 1〜10までの合計を求めて表示するプログラムを書いてください
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i; //毎回sumにiを足していく
		}
		System.out.println(sum); //合計結果を表示

		//⑦ 文字列配列 {"りんご", "みかん", "バナナ"} を拡張for文で1つずつ表示してください。
		String[] fruit = {"りんご", "みかん", "バナナ"};
		for (String fruitName : fruit) {
			System.out.println(fruitName);
		}

		//⑧ switch文を使って、変数colorが"red"なら「赤です」、"blue"なら「青です」
		// それ以外は「その他の色です」と表示するプログラムを書いてください。
		String color = "blue";
		switch (color) {
			case "red" -> System.out.println("赤です");
			case "blue" -> System.out.println("青です");
			default -> System.out.println("その他の色です");
		}

		//変数 score に 80 が入っています。
		//switch文を使って、次のように表示してください（ただし、点数を10で割った値を使って判定してください）
		//10または9 → 「A評価」,/8または7 → 「B評価」,それ以外 → 「C評価」
		int score = 80;
		switch (score / 10) {
			case 10, 9 -> System.out.println("A評価");
			case 8, 7 -> System.out.println("B評価");
			default -> System.out.println("C評価");
		}

		//⑪ List<Integer>を使って、1〜10の中から偶数だけを表示するコードを書いてください。
		List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
		for (int number : num){
			if (number %2==0){
				System.out.println(number);
			}
		}

		//⑫ Map<Integer, String>を作成して、(1,"Java")、(2,"Python")、(3,"C++")を登録し、キーが2の値を表示してください。
		Map<Integer, String> language = new HashMap<>();
		language.put(1, "Java");
		language.put(2, "Python");
		language.put(3, "C++");

		System.out.println(language.get(2));

	 */
		//⑬ コンストラクタを使って、Personクラスをnew Person("田中", 25)で作成できるようにしてください。
		//⑭ if文とfor文を組み合わせて、1〜10の中で3の倍数だけを表示するコードを書いてください。
		//⑮ 例外処理を使って、int result = 10 / 0; のようなコードがエラーになっても「エラーが発生しました」と表示するようにしてください。
	}
}
