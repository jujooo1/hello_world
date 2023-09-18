
public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Idontknow") ;
            int i;
            double f = 2.5;
            boolean flag = true;
            i = 10;
            f += i;
            flag = !flag;
            i++;
            System.out.println(i);
            System.out.println(f);
            System.out.println(flag);
            String str1 = "I am a string";
            String str2 = str1;
            String str3 = "I am also a string";
            boolean stringsEqual = str1.equals(str3);
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            String[] array = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
            for (int iterate = 0; iterate < array.length; iterate++) {
                System.out.println(array[iterate]);
            }
            for (String value : array) { 
                System.out.print(value + " ");
            }
            System.out.println (" ");
            for (int iterate = 0; iterate < array.length; iterate++) { 
                System.out.print(array[iterate]);
                if (iterate < array.length - 1) { 
                    System.out.print("-");
                } 
            }
        }
}