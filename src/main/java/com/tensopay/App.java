package com.tensopay;
import io.javalin.Javalin;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
            Javalin app = Javalin.create().start(7000);
            app.get("/", ctx -> ctx.result("Hello World!"));
          //  app.get("/users", UserController.fetchAllUsernames);
            //app.get("/users/:id", UserController.fetchById);
        }        
    
}
