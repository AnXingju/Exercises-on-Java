package chapter2;

public class Example07_TwoDimensionalArray {

	/**
	 * @param args  ��ά�����ʹ�ã�p74 ����2-25
	 * 
	 * ��һ������С��2�ˣ����۶�ֱ�Ϊ11��12
	 * �ڶ�������С��3�ˣ����۶�ֱ�Ϊ21��22��23
	 * ����������С��4�ˡ����۶�ֱ�Ϊ31��32��33��34
	 * ���������ö�ά�����֪ʶͳ�ƹ�˾��������С��������ܶ��������˾�����۶�
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//int[][] arr=new int[3][4];//�������������һά����ĸ�������������ÿ��һλ������Ԫ�صĸ���
		
		int[][] arr = new int[3][];           // ����һ������Ϊ3�Ķ�ά����
		arr[0] = new int[] { 11, 12 };        // Ϊ�����Ԫ�ظ�ֵ
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };
		
		//int[][] arr= {{11,12},{21,22,23},{31,32,33,34}};
		
		int sum = 0;                          // ���������¼�����۶�
		for (int i = 0; i < arr.length; i++) {// ��������Ԫ��
			int groupSum = 0;                 // ���������¼С�������ܶ�
			for (int j = 0; j < arr[i].length; j++) { 
				groupSum = groupSum+arr[i][j];
			}
			System.out.println("��" + (i + 1) + "С�����۶�Ϊ��" + groupSum + " ��Ԫ��");
			
			sum =sum+groupSum;				      // �ۼ�С�����۶�
		}
		
		System.out.println("�����۶�Ϊ: " + sum + " ��Ԫ��");

	}

}
