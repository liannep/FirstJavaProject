public class HelloWorld {

//NOTES:
//static - means you cannot change the attribute of the variable
//public - means you can see this beyond the class
//main - every class needs a main method
//shortcut = psvm
//case sensitive;  Reference must be capitalized and next character would be small letters (Camel Case)
//void means class is not returning anything
//only one main;
//Class Names capitalize
//Functions start with small letter
//public Integer means its returning something, a shape etc
//i ++ means add 1 to i


    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        MyMatchClass myMatchClass = new MyMatchClass();

        int numb1 = 2;
        int numb2 = 4;
        String name = "LianneChow";


        System.out.println("hello lianne and chow");
        secondClass.printsomething();
        System.out.println(myMatchClass.addTwoNumbers(numb1, numb2));

        for (int i=0; i<6; i++) {
            System.out.println(i);
            System.out.println("Hello " + name);
        }



    }
}
