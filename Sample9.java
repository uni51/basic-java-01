import java.io.*;
class Sample9 {
	public static void main (String args[]) throws IOException {
		System.out.println("��������͂��ĉ������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // �R���\�[���ɓ��͂������e�𕶎���Ƃ��Ď擾����
		int res = Integer.parseInt(str);
		if(res == 7){
			System.out.println("7�����͂���܂����B");
		}else{
			System.out.println("7�ȊO�̐��l�����͂���܂����B");
		}
	}
}
