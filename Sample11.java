import java.io.*;
class Sample11 {
	public static void main (String args[]) throws IOException {
		System.out.print("���Ȃ��̔N���20�ˈȏ�ł����H");
		System.out.print("Y�܂���N����͂��ĉ������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // �R���\�[���ɓ��͂������e�𕶎���Ƃ��Ď擾����
		char res = str.charAt(0);
		switch(res){
		case 'Y':
		case 'y':	// Y�܂���y�̏ꍇ
			System.out.println("���Ȃ��͐��l���Ă��܂��B");
			break;
		case 'N':
		case 'n':	// N�܂���n�̏ꍇ
			System.out.println("���Ȃ��͖����N�ł��B");
			break;
		default:	// ��L�ȊO�̏ꍇ�iif����else�ɊY�����܂��j
			System.out.println("Y��N����͂��ĉ������B");
		}
	}
}
