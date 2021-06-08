package a.identifiers;

public class Demo1 {

	public static void main(String[] args) { //block start
		/** Documentation comments.*/
		System.out.println(10 + 5); //expression => 10 + 5.
		System.out.println(12 + 7); //statement => System.out.println(12 + 7);
		
		{//block start
			System.out.println();
		}//block end
		
		int /* a => identifier. */ a = 5; 
		
	} //block end

}
