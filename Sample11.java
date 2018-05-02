import java.io.*;
class Sample11 {
	public static void main (String args[]) throws IOException {
		System.out.print("あなたの年齢は20才以上ですか？");
		System.out.print("YまたはNを入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // コンソールに入力した内容を文字列として取得する
		char res = str.charAt(0);
		switch(res){
		case 'Y':
		case 'y':	// Yまたはyの場合
			System.out.println("あなたは成人しています。");
			break;
		case 'N':
		case 'n':	// Nまたはnの場合
			System.out.println("あなたは未成年です。");
			break;
		default:	// 上記以外の場合（if文のelseに該当します）
			System.out.println("YかNを入力して下さい。");
		}
	}
}
