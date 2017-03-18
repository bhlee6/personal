public class Age {
    public int age;

    public Age(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
            this.age = initialAge;
    }


    public void amIOld() {
        String s ="";
        if (this.age < 13) {
           s = "You are young";
       }
        // REMEMBER IF STATEMENT SKIPS TO ELSE IF NO ELSE IF HERE
       else if (this.age >= 13 && this.age <18) {
           s = "You are a teenager.";
       }
       else {
           s= "You are old.";
       }

        System.out.println(s);
    }

    public void yearPasses() {
        this.age = ++age;
    }

    public static void main(String args[]) {
        Age p1 = new Age(1);
        p1.amIOld();
    }
}