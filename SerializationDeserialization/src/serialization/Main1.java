package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main1 {

	public static void main(String[] args) {

		employee emp=new employee(101,"narasimha","gurram");
		
		serializeobj(emp);
		
		employee deserialized=deserializeObj();
		
		if(deserialized!=null) {
			System.out.println(deserialized);
		}
		
	}
	
	
	private static void serializeobj(employee  empl) {
		
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
			oos.writeObject(empl);
			System.out.println("serialzed success"+empl);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private static employee deserializeObj()
	{
		try {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.ser"));
		
			return (employee) ois.readObject();
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

}
