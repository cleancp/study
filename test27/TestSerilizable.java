package test27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 
 * @author cleancp
 * 2017年2月8日下午1:52:26
 * 序列化练习
 */
public class TestSerilizable {

	/**
	 * 存储序列化数据
	 * @throws IOException 
	 */
	public static void writeData(Person p , File f) throws IOException{
		
//		File f = new File("seri.txt");
		
//		FileInputStream fio = new FileInputStream(f); 
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(p);
		os.flush();
		os.close();
		System.out.println("写入完成");
	}
	
	public static Object readData(File f) throws IOException, ClassNotFoundException{
		
		FileInputStream fio = new FileInputStream(f); 
		ObjectInputStream is = new ObjectInputStream(fio);
		Object object = is.readObject();
		is.close();
		System.out.println("读取完成");
		return object;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("seri.txt");
		FileInputStream fis = new FileInputStream("seri2.txt");
		System.out.println(fis.read());
		Person p1 = new Person("张三", "男", 19, fis);
//		Person p2 = new Person("李四", "女", 18);
				
		writeData(p1,f);
//		writeData(p2,f);
		Person p = (Person) readData(f);
		System.out.println(p.toString());
		System.out.println(p.getIs());
	}
}
