import java.io.*;
class Sample10 {
	public static void main (String args[]) throws IOException {
		System.out.print("���Ȃ��̔N���20�ˈȏ�ł����H");
		System.out.print("Y�܂���N����͂��ĉ������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // �R���\�[���ɓ��͂������e�𕶎���Ƃ��Ď擾����
		char res = str.charAt(0);
		if(res == 'Y' || res =='y' ){
			System.out.println("���Ȃ��͐��l���Ă��܂��B");
		}else if(res == 'N' || res == 'n'){
			System.out.println("���Ȃ��͖����N�ł��B");
		}else{
			System.out.println("Y��N����͂��ĉ������B");
		}
	}
}
