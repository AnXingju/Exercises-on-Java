package chapter2;
/**
 * p63,��ӡ99�˷���
 * @author 29250
 *
 */
public class Example01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		// ���ѭ��,����i�������1~9��
				for (int i = 1; i <= 9; i++) {  
					// �ڲ�ѭ��������j�������1~9��
					for (int j = 1; j <= i; j++) {  
						//ʹ���ַ���ƴ�ӵ���ʽ����ӡÿ���ڲ�ѭ����ִ�����
						System.out.print(j+"*"+i +"="+ j*i +"\t");  
					}
					// ʹ��println()�����������ѭ�����л���
					System.out.println("");    
				}

	}

}
