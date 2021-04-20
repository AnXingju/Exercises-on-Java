package chapter2;
/**
 * p63,打印99乘法表
 * @author 29250
 *
 */
public class Example01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		// 外层循环,变量i控制输出1~9行
				for (int i = 1; i <= 9; i++) {  
					// 内层循环，变量j控制输出1~9列
					for (int j = 1; j <= i; j++) {  
						//使用字符串拼接的形式，打印每个内层循环的执行语句
						System.out.print(j+"*"+i +"="+ j*i +"\t");  
					}
					// 使用println()方法控制外层循环进行换行
					System.out.println("");    
				}

	}

}
