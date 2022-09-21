
public class ArrayDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "Hello world. This is me.";
char[] characters = word.toCharArray();



//Approach--1
for(int i = 0; i<characters.length; i++) {
	char c= characters[i];
	for(int j =i +1; j <characters.length; j++) {
		if (characters[j]==c) {
			characters[j]='@';
		}
	}
}

String newValue = String.valueOf(characters);
System.out.println(newValue);
System.out.println(word);

newValue=newValue.replace("@","");
System.out.println(newValue);
 //Approach--2
System.out.println("------------------------\n\n\n\n\n\n");
String filteredString = "";
for(int i = 0; i<characters.length; i++) {
	if (characters[i] =='l') {
		System.out.println(characters[i]);
	//	filterString += characters[i]
	}
	System.out.println(filteredString);
}
}
}