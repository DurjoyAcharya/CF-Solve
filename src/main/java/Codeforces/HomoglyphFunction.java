package Codeforces;

public class HomoglyphFunction {
//    public static void sayHello() {
//        System.out.println("Hello, World!");
//    }
//
//    public static void sayНello() {
//        System.out.println("Goodbye, World!");
//    }
    public static void CommentingOut()
    {
        boolean isAdmin = false;
        /*‮ } ⁦if (isAdmin)⁩ ⁦ begin admins only */
        System.out.println("You are an admin.");
        /* end admins only ‮ { ⁦*/
        System.out.println("After That");
    }
    public static void main(String[] args) {
        CommentingOut();
    }
}
