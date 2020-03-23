package harvestingFields;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
		String command;


//		    • private - print all private fields
//    • protected - print all protected fields
//    • public - print all public fields
//    • all - print ALL declared fields


		while (!"HARVEST".equals(command = scanner.nextLine())){
			switch (command){
				case "private":
					privateFields(richSoilLandClass);
					break;
				case "protected":
					protectedFields(richSoilLandClass);
					break;
				case "public":
					publicFields(richSoilLandClass);
					break;
				case "all":
					allFields(richSoilLandClass);
					break;


			}
		}

	}

	public static <T> void privateFields(Class<T> richSoilLandClass){
		Arrays.stream(richSoilLandClass.getDeclaredFields())
				.filter(field -> Modifier.isPrivate(field.getModifiers()))
				.forEach(f -> System.out.printf("private %s %s%n",f.getType().getSimpleName(),f.getName()));
	}

	public static <T> void protectedFields(Class<T> richSoilLandClass){
		Arrays.stream(richSoilLandClass.getDeclaredFields())
				.filter(field -> Modifier.isProtected(field.getModifiers()))
				.forEach(f -> System.out.printf("protected %s %s%n",f.getType().getSimpleName(),f.getName()));
	}
	public static <T> void publicFields(Class<T> richSoilLandClass){
		Arrays.stream(richSoilLandClass.getDeclaredFields())
				.filter(field -> Modifier.isPublic(field.getModifiers()))
				.forEach(f -> System.out.printf("public %s %s%n",f.getType().getSimpleName(),f.getName()));
	}

	public static <T> void allFields(Class<T> richSoilLandClass){
		Arrays.stream(richSoilLandClass.getDeclaredFields())
				.forEach(s -> System.out.printf("%s %s %s%n",
						Modifier.toString(s.getModifiers())
						,s.getType().getSimpleName()
						,s.getName()));
	}
}
