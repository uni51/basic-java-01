import java.io.*;
class Sample10 {
	public static void main (String args[]) throws IOException {
		System.out.print("あなたの年齢は20才以上ですか？");
		System.out.print("YまたはNを入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // コンソールに入力した内容を文字列として取得する
		char res = str.charAt(0);
		if(res == 'Y' || res =='y' ){
			System.out.println("あなたは成人しています。");
		}else if(res == 'N' || res == 'n'){
			System.out.println("あなたは未成年です。");
		}else{
			System.out.println("YかNを入力して下さい。");
		}
	}
}
