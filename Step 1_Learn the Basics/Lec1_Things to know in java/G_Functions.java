/*
🧠 First, what is a function?

A function is a block of code that:

-takes input,
-does some work,
-returns a result.

static int add(int a, int b) 
{
    return a + b;
}

Call:

int sum = add(3, 4);
sout(sum)
*/

/*
🎯 Now the BIG Question

When we pass something to a function,
does Java pass the original data or a copy of it?

🔥 Important Truth

Java is ALWAYS Pass by Value.
(There is no real pass by reference in Java.)
*/

// 1️⃣ Pass by Value (Primitive types)

public class G_Functions {

    static void change(int a)
    {
        a = 100;
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);   // Output is 10
        // Rule:
        //  - For primitives (int, double, char, etc.), Java sends a copy of the value.
    }
}


/*
Java is strictly pass by value.
When objects are passed, the value of the reference is copied,
so object data can be changed, but the original reference itself cannot be reassigned.
*/

/*
🧠 Why this proves Java is NOT pass by reference

Because if it were pass by reference, the function would have the power to:

reassign your original variable,

and change where it points.

Java does not allow this.

Instead, Java does this:

It makes a copy of the reference value and passes that copy.
*/