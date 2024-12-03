// app/App.java
package app;
import login.Login;
import menu.Menu;
public class App {
        public static void main(String[] args) {
            Login login = new Login("MoiDurito", "1234");
    
            if (!login.autenticar("MoiDurito", "1234")) {
                System.out.println("Error en el usernament o password");
                return;
            }
    
            System.out.println("Login exitoso");
    
            Menu menu = new Menu();
            menu.mostrarMenu();
            menu.gestionarOpciones(); 
        }
    }
    

