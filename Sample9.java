import java.io.*;
class Sample9 {
	public static void main (String args[]) throws IOException {
		System.out.println("整数を入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // コンソールに入力した内容を文字列として取得する
		int res = Integer.parseInt(str);
		if(res == 7){
			System.out.println("7が入力されました。");
		}else{
			System.out.println("7以外の数値が入力されました。");
		}
	}
}
