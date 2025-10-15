package record.learning.record;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

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
	 */
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

	}

	}
