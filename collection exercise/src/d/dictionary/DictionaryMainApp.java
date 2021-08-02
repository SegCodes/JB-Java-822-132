package d.dictionary;

public class DictionaryMainApp {

	public static void main(String[] args) {
		
		DictionarySystem.start();
		
		while(DictionarySystem.isSystemOn()) {
			DictionarySystem.printMenu();
			int input = Integer.parseInt(DictionarySystem.sc.nextLine());
			System.out.println();
			
			String word;
			String def;
			switch (input) {
			
			case 1:
				System.out.print("Enter the word you like to see: ");
				word = DictionarySystem.sc.nextLine();
				
				if(DictionarySystem.getDictionary().getDefiniton(word) != null) {
					System.out.println(DictionarySystem.getDictionary().getDefiniton(word));
				} else {
					System.out.println("Error: word not found.");
				}
				System.out.println();
				continue;
			
			case 2:
				System.out.print("Enter the word you would like to add: ");
				word = DictionarySystem.sc.nextLine();
				System.out.print("Enter the definition of the word: ");
				def = DictionarySystem.sc.nextLine();
				System.out.println();
				
				try {
					DictionarySystem.getDictionary().addEntry(word, def);
					System.out.println();
				} catch (DictionaryException e) {
					System.out.println(e.getMessage());
					System.out.println();
				}
				continue;
			
			case 3:
				System.out.print("Enter the word you would like to edit: ");
				word = DictionarySystem.sc.nextLine();
				System.out.print("Enter the new definition of the word: ");
				def = DictionarySystem.sc.nextLine();
				System.out.println();
				
				try {
					DictionarySystem.getDictionary().editEntry(word, def);
					System.out.println();
				} catch (DictionaryException e) {
					System.out.println(e.getMessage());
					System.out.println();
				}
				continue;
				
			case 4:
				System.out.print("Enter the word you like to delete: ");
				word = DictionarySystem.sc.nextLine();
				
				try {
					DictionarySystem.getDictionary().deleteEntry(word);
				} catch (DictionaryException e) {
					System.out.println(e.getMessage());
					System.out.println();
				}
				System.out.println();
				continue;
			
			case 5:
				System.out.println(DictionarySystem.getDictionary().getAllExistingEntries());
				System.out.println();
				continue;
				
			case 6:
				DictionarySystem.close();
				break;
			}
				
		}
	}
}