package chapter2;

/**
 * break��continue���÷�
 * 
 * @author 29250 
 * ��һ����������ע�Ϳ�ݼ���ALT+SHIFT+J��
 * ������ʽ���Ҽ�����Դ�롪����ʽ������ctrl+shift+f
 */
public class Example02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * break���÷�
		 */

		for (int a = 1; a <= 5; a = a + 1) {

			//System.out.print(" I love you");
			if(a==3) {
				break;
			}
			System.out.println(a);
			
		}

	}

}
